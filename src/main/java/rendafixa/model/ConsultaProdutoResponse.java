package rendafixa.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Introspected;
import micronaut.invoker.annotation.HardNullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

@Serdeable
@JsonPropertyOrder({
        ConsultaProdutoResponse.JSON_PROPERTY_CODIGO_PRODUTO,
        ConsultaProdutoResponse.JSON_PROPERTY_NOME_PRODUTO,
        ConsultaProdutoResponse.JSON_PROPERTY_TIPO_PRODUTO
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class ConsultaProdutoResponse {

    public static final String JSON_PROPERTY_CODIGO_PRODUTO = "codigoProduto";
    public static final String JSON_PROPERTY_NOME_PRODUTO = "nomeProduto";
    public static final String JSON_PROPERTY_TIPO_PRODUTO = "tipoProduto";

    /**
     * O código do produto aplicado.
     */
    @HardNullable
    @Schema(name = "codigoProduto", description = "O código do produto aplicado.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CODIGO_PRODUTO)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String codigoProduto;

    /**
     * O nome do produto aplicado.
     */
    @HardNullable
    @Schema(name = "nomeProduto", description = "O nome do produto aplicado.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_NOME_PRODUTO)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String nomeProduto;

    /**
     * O tipo do produto aplicado.
     */
    @HardNullable
    @Schema(name = "tipoProduto", description = "O tipo do produto aplicado.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TIPO_PRODUTO)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String tipoProduto;

    public ConsultaProdutoResponse() {
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
     * @return The same instance of ProdutoResponse for chaining.
     */
    public ConsultaProdutoResponse codigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
        return this;
    }

    /**
     * O nome do produto aplicado.
     * @return the nomeProduto property value
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Set the nomeProduto property value
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * Set nomeProduto in a chainable fashion.
     * @return The same instance of ProdutoResponse for chaining.
     */
    public ConsultaProdutoResponse nomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return this;
    }

    /**
     * O tipo do produto aplicado.
     * @return the tipoProduto property value
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * Set the tipoProduto property value
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * Set tipoProduto in a chainable fashion.
     * @return The same instance of ProdutoResponse for chaining.
     */
    public ConsultaProdutoResponse tipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
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
        ConsultaProdutoResponse produtoResponse = (ConsultaProdutoResponse) o;
        return Objects.equals(this.codigoProduto, produtoResponse.codigoProduto) &&
                Objects.equals(this.nomeProduto, produtoResponse.nomeProduto) &&
                Objects.equals(this.tipoProduto, produtoResponse.tipoProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProduto, nomeProduto, tipoProduto);
    }

    @Override
    public String toString() {
        return "ConsultaProdutoResponse("
                + "codigoProduto: " + getCodigoProduto() + ", "
                + "nomeProduto: " + getNomeProduto() + ", "
                + "tipoProduto: " + getTipoProduto()
                + ")";
    }

}