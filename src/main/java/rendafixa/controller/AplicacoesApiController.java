package rendafixa.controller;

import io.micronaut.http.annotation.Controller;
import micronaut.api.AplicacoesApi;
import micronaut.model.AplicacaoResponse;
import micronaut.model.AplicacaoResponseList;
import rendafixa.model.ConsultaProdutoResponse;
import rendafixa.service.AplicacoesService;
import rendafixa.service.ProdutosService;

import java.util.List;
import java.util.Optional;

@Controller("renda-fixa-banking/api")
public class AplicacoesApiController implements AplicacoesApi {

    private final AplicacoesService aplicacoesService;
    private final ProdutosService produtosService;

    public AplicacoesApiController(AplicacoesService aplicacoesService, ProdutosService produtosService) {
        this.aplicacoesService = aplicacoesService;
        this.produtosService = produtosService;
    }

    @Override
    public AplicacaoResponseList listarAplicacoes(String contaCorrente) {
        AplicacaoResponseList aplicacaoResponseList = new AplicacaoResponseList();
        aplicacaoResponseList.setList(aplicacoesService.listarAplicacoes(contaCorrente));

        List<ConsultaProdutoResponse> consultaProdutoResponseList = produtosService.listarProdutos();
        for (AplicacaoResponse aplicacaoResponse : aplicacaoResponseList.getList()) {
            Optional<ConsultaProdutoResponse> consultaProdutoResponse = consultaProdutoResponseList.stream().filter(c -> c.getCodigoProduto().equals(aplicacaoResponse.getCodigoProduto())).findAny();
            if (consultaProdutoResponse.isPresent()) {
                aplicacaoResponse.setNomeProduto(consultaProdutoResponse.get().getNomeProduto());
                aplicacaoResponse.setTipoProduto(consultaProdutoResponse.get().getTipoProduto());
            }
        }
        return aplicacaoResponseList;
    }
}