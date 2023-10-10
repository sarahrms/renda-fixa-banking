package rendafixa.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Introspected;
import micronaut.invoker.annotation.HardNullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;
import rendafixa.model.AplicacaoResponseAplicacoesInner;

/**
 * AplicacaoResponse
 */
@Serdeable
@JsonPropertyOrder({
        ConsultaAplicacaoResponse.JSON_PROPERTY_CODIGO_PRODUTO,
        ConsultaAplicacaoResponse.JSON_PROPERTY_APLICACOES
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class ConsultaAplicacaoResponse {

    public static final String JSON_PROPERTY_CODIGO_PRODUTO = "codigoProduto";
    public static final String JSON_PROPERTY_APLICACOES = "aplicacoes";

    /**
     * O código do produto aplicado.
     */
    @HardNullable
    @Schema(name = "codigoProduto", description = "O código do produto aplicado.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CODIGO_PRODUTO)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String codigoProduto;

    @HardNullable
    @Schema(name = "aplicacoes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_APLICACOES)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private List<AplicacaoResponseAplicacoesInner> aplicacoes;

    public ConsultaAplicacaoResponse() {
    }

    /**
     * O código do produto aplicado.
     * @return the codigoProduto property value
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Set the codigoProduto property value
     */
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    /**
     * Set codigoProduto in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public ConsultaAplicacaoResponse codigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
        return this;
    }

    /**
     * @return the aplicacoes property value
     */
    public List<AplicacaoResponseAplicacoesInner> getAplicacoes() {
        return aplicacoes;
    }

    /**
     * Set the aplicacoes property value
     */
    public void setAplicacoes(List<AplicacaoResponseAplicacoesInner> aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    /**
     * Set aplicacoes in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public ConsultaAplicacaoResponse aplicacoes(List<AplicacaoResponseAplicacoesInner> aplicacoes) {
        this.aplicacoes = aplicacoes;
        return this;
    }

    /**
     * Add an item to the aplicacoes property in a chainable fashion.
     * @return The same instance of AplicacaoResponse for chaining.
     */
    public ConsultaAplicacaoResponse addAplicacoesItem(AplicacaoResponseAplicacoesInner aplicacoesItem) {
        if (this.aplicacoes == null) {
            this.aplicacoes = new ArrayList<>();
        }
        this.aplicacoes.add(aplicacoesItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsultaAplicacaoResponse aplicacaoResponse = (ConsultaAplicacaoResponse) o;
        return Objects.equals(this.codigoProduto, aplicacaoResponse.codigoProduto) &&
                Objects.equals(this.aplicacoes, aplicacaoResponse.aplicacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto, aplicacoes);
    }

    @Override
    public String toString() {
        return "ConsultaAplicacaoResponse("
                + "codigoProduto: " + getCodigoProduto() + ", "
                + "aplicacoes: " + getAplicacoes()
                + ")";
    }

}