package rendafixa.service;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.server.exceptions.HttpServerException;
import io.micronaut.http.uri.UriBuilder;
import jakarta.inject.Singleton;
import micronaut.model.AplicacaoResponse;
import micronaut.model.AplicacaoResponseAplicacoesInner;
import rendafixa.model.ConsultaAplicacaoResponseList;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import static rendafixa.AppConstants.CONSULTA_APLICACOES_ENDPOINT;

@Singleton
public class AplicacoesService {

    private final BlockingHttpClient httpClient;

    public AplicacoesService(HttpClient httpClient) {
        this.httpClient = httpClient.toBlocking();
    }

    public List<AplicacaoResponse> listarAplicacoes(String contaCorrente) {
        try {
            HttpRequest request = HttpRequest.GET(getEndpoint(contaCorrente));

            HttpResponse<ConsultaAplicacaoResponseList> response = httpClient.exchange(request, ConsultaAplicacaoResponseList.class);

            if (response.status().equals(HttpStatus.OK)) {
                httpClient.close();
                return converterResponse(response.body());
            }
        } catch (Exception ex) {
            throw new HttpServerException(ex.getMessage());
        }
        return List.of();
    }

    private URI getEndpoint(String contaCorrente) {
        return UriBuilder.of(CONSULTA_APLICACOES_ENDPOINT).path(contaCorrente).build();
    }

    private List<AplicacaoResponse> converterResponse(ConsultaAplicacaoResponseList consultaAplicacaoResponseList) {
        return consultaAplicacaoResponseList.getList().stream()
                .map(consultaAplicacaoResponse -> {
                    AplicacaoResponse aplicacaoResponse = new AplicacaoResponse();
                    aplicacaoResponse.setCodigoProduto(consultaAplicacaoResponse.getCodigoProduto());
                    aplicacaoResponse.setAplicacoes(
                            consultaAplicacaoResponse.getAplicacoes()
                                    .stream()
                                    .map(consultaAplicacaoResponseAplicacoesInner -> {
                                        AplicacaoResponseAplicacoesInner aplicacaoResponseAplicacoesInner = new AplicacaoResponseAplicacoesInner();
                                        aplicacaoResponseAplicacoesInner.setData(consultaAplicacaoResponseAplicacoesInner.getData());
                                        aplicacaoResponseAplicacoesInner.setValor(consultaAplicacaoResponseAplicacoesInner.getValor());

                                        return aplicacaoResponseAplicacoesInner;
                                    })
                                    .collect(Collectors.toList()));
                    return aplicacaoResponse;
                })
                .collect(Collectors.toList());
    }
}
