package rendafixa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import micronaut.invoker.annotation.HardNullable;
import micronaut.model.AplicacaoResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Serdeable
@JsonPropertyOrder({
        ConsultaAplicacaoResponseList.JSON_PROPERTY_LIST
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class ConsultaAplicacaoResponseList {

    public static final String JSON_PROPERTY_LIST = "list";

    @HardNullable
    @Schema(name = "list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_LIST)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private List<ConsultaAplicacaoResponse> _list;

    public ConsultaAplicacaoResponseList() {
    }

    /**
     * @return the _list property value
     */
    public List<ConsultaAplicacaoResponse> getList() {
        return _list;
    }

    /**
     * Set the _list property value
     */
    public void setList(List<ConsultaAplicacaoResponse> _list) {
        this._list = _list;
    }

    /**
     * Set _list in a chainable fashion.
     *
     * @return The same instance of AplicacaoResponseList for chaining.
     */
    public ConsultaAplicacaoResponseList _list(List<ConsultaAplicacaoResponse> _list) {
        this._list = _list;
        return this;
    }

    /**
     * Add an item to the _list property in a chainable fashion.
     *
     * @return The same instance of AplicacaoResponseList for chaining.
     */
    public ConsultaAplicacaoResponseList addListItem(ConsultaAplicacaoResponse _listItem) {
        if (this._list == null) {
            this._list = new ArrayList<>();
        }
        this._list.add(_listItem);
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
        ConsultaAplicacaoResponseList ConsultaAplicacaoResponseList = (ConsultaAplicacaoResponseList) o;
        return Objects.equals(this._list, ConsultaAplicacaoResponseList._list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_list);
    }

    @Override
    public String toString() {
        return "ConsultaAplicacaoResponseList("
                + "_list: " + getList()
                + ")";
    }

}