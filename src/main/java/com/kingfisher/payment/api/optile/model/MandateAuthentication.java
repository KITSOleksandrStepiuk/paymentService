package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * MandateAuthentication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class MandateAuthentication   {
  @JsonProperty("time")
//  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private DateTime time = null;

  @JsonProperty("city")
  private String city = null;

  public MandateAuthentication time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * The date when the authentication took place, e.g. when the customer granted his/her mandate
   * @return time
  **/
  @ApiModelProperty(example = "2017-10-12T13:28:28+0000", required = true, value = "The date when the authentication took place, e.g. when the customer granted his/her mandate")
  @NotNull

  @Valid

  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }

  public MandateAuthentication city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city where the authentication took place, e.g. the city where the customer granted his/her mandate; rarely checked by PSPs
   * @return city
  **/
  @ApiModelProperty(example = "Berlin", value = "The city where the authentication took place, e.g. the city where the customer granted his/her mandate; rarely checked by PSPs")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateAuthentication mandateAuthentication = (MandateAuthentication) o;
    return Objects.equals(this.time, mandateAuthentication.time) &&
        Objects.equals(this.city, mandateAuthentication.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateAuthentication {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

