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
import rendafixa.model.ConsultaAplicacaoResponseList;

import java.net.URI;
import java.util.List;

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
                return response.body().getList();
            }

        } catch (Exception ex) {
            throw new HttpServerException(ex.getMessage());
        }
        return List.of();
    }

    private URI getEndpoint(String contaCorrente) {
        return UriBuilder.of(CONSULTA_APLICACOES_ENDPOINT).path(contaCorrente).build();
    }
}
