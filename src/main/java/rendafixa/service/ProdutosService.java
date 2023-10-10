package rendafixa.service;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.server.exceptions.HttpServerException;
import io.micronaut.http.uri.UriBuilder;
import jakarta.inject.Singleton;
import rendafixa.model.ConsultaProdutoResponse;
import rendafixa.model.ConsultaProdutoResponseList;

import java.net.URI;
import java.util.List;

import static rendafixa.AppConstants.CONSULTA_PRODUTOS_ENDPOINT;

@Singleton
public class ProdutosService {

    private final BlockingHttpClient httpClient;

    public ProdutosService(HttpClient httpClient) {
        this.httpClient = httpClient.toBlocking();
    }

    public List<ConsultaProdutoResponse> listarProdutos() {
        try {
            HttpRequest request = HttpRequest.GET(getEndpoint());
            HttpResponse<ConsultaProdutoResponseList> response = httpClient.exchange(request, ConsultaProdutoResponseList.class);
            if (response.status().equals(HttpStatus.OK)) {
                return response.body().getList();
            }
        } catch (Exception ex) {
            throw new HttpServerException(ex.getMessage());
        }
        return List.of();
    }

    private URI getEndpoint() {
        return UriBuilder.of(CONSULTA_PRODUTOS_ENDPOINT).build();
    }
}
