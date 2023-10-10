package rendafixa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import micronaut.invoker.annotation.HardNullable;

import java.time.LocalDate;
import java.util.Objects;

@Serdeable
@JsonPropertyOrder({
        ConsultaAplicacaoResponseAplicacoesInner.JSON_PROPERTY_VALOR,
        ConsultaAplicacaoResponseAplicacoesInner.JSON_PROPERTY_DATA
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class ConsultaAplicacaoResponseAplicacoesInner {

    public static final String JSON_PROPERTY_VALOR = "valor";
    public static final String JSON_PROPERTY_DATA = "data";

    /**
     * O valor da aplicação.
     */
    @HardNullable
    @Schema(name = "valor", description = "O valor da aplicação.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALOR)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Double valor;

    /**
     * A data da aplicação.
     */
    @HardNullable
    @Schema(name = "data", description = "A data da aplicação.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private LocalDate data;

    public ConsultaAplicacaoResponseAplicacoesInner() {
    }

    /**
     * O valor da aplicação.
     *
     * @return the valor property value
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Set the valor property value
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * Set valor in a chainable fashion.
     *
     * @return The same instance of AplicacaoResponseAplicacoesInner for chaining.
     */
    public ConsultaAplicacaoResponseAplicacoesInner valor(Double valor) {
        this.valor = valor;
        return this;
    }

    /**
     * A data da aplicação.
     *
     * @return the data property value
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Set the data property value
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Set data in a chainable fashion.
     *
     * @return The same instance of AplicacaoResponseAplicacoesInner for chaining.
     */
    public ConsultaAplicacaoResponseAplicacoesInner data(LocalDate data) {
        this.data = data;
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
        ConsultaAplicacaoResponseAplicacoesInner aplicacaoResponseAplicacoesInner = (ConsultaAplicacaoResponseAplicacoesInner) o;
        return Objects.equals(this.valor, aplicacaoResponseAplicacoesInner.valor) &&
                Objects.equals(this.data, aplicacaoResponseAplicacoesInner.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, data);
    }

    @Override
    public String toString() {
        return "ConsultaAplicacaoResponseAplicacoesInner("
                + "valor: " + getValor() + ", "
                + "data: " + getData()
                + ")";
    }

}