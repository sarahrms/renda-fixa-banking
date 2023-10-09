package rendafixa.service;

import io.micronaut.http.uri.UriBuilder;
import jakarta.inject.Singleton;
import micronaut.model.AplicacaoResponse;

import io.micronaut.http.client.HttpClient;

import java.util.List;
import java.net.URI;

@Singleton
public class AplicacoesService {

    private final HttpClient httpClient;
    private final URI uri;

    public AplicacoesService(HttpClient httpClientParam) {
        this.httpClient = httpClientParam;
        this.uri = UriBuilder.of("/repos")
                .path("releases")
                .build();
    }


    public List<AplicacaoResponse> listarAplicacoes(String contaCorrente){
        return List.of(new AplicacaoResponse());
    }
}
