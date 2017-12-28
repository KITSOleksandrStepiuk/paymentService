package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Networks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Networks   {
  @JsonProperty("applicable")
  private List<ApplicableNetwork> applicable = new ArrayList<ApplicableNetwork>();

  @JsonProperty("resourcesLastUpdate")
  private DateTime resourcesLastUpdate = null;

  public Networks applicable(List<ApplicableNetwork> applicable) {
    this.applicable = applicable;
    return this;
  }

  public Networks addApplicableItem(ApplicableNetwork applicableItem) {
    this.applicable.add(applicableItem);
    return this;
  }

   /**
   * Collection of applicable payment networks that could be used by a customer to complete the payment in scope of this `LIST` session
   * @return applicable
  **/
  @ApiModelProperty(required = true, value = "Collection of applicable payment networks that could be used by a customer to complete the payment in scope of this `LIST` session")
  @NotNull

  @Valid

  public List<ApplicableNetwork> getApplicable() {
    return applicable;
  }

  public void setApplicable(List<ApplicableNetwork> applicable) {
    this.applicable = applicable;
  }

  public Networks resourcesLastUpdate(DateTime resourcesLastUpdate) {
    this.resourcesLastUpdate = resourcesLastUpdate;
    return this;
  }

   /**
   * n/a at the moment, timestamp of the last update of hosted payment page resources
   * @return resourcesLastUpdate
  **/
  @ApiModelProperty(value = "n/a at the moment, timestamp of the last update of hosted payment page resources")

  @Valid

  public DateTime getResourcesLastUpdate() {
    return resourcesLastUpdate;
  }

  public void setResourcesLastUpdate(DateTime resourcesLastUpdate) {
    this.resourcesLastUpdate = resourcesLastUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Networks networks = (Networks) o;
    return Objects.equals(this.applicable, networks.applicable) &&
        Objects.equals(this.resourcesLastUpdate, networks.resourcesLastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicable, resourcesLastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Networks {\n");
    
    sb.append("    applicable: ").append(toIndentedString(applicable)).append("\n");
    sb.append("    resourcesLastUpdate: ").append(toIndentedString(resourcesLastUpdate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

