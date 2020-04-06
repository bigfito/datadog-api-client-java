/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.HistoryServiceLevelObjectiveResponseData;
import com.datadog.api.v1.client.model.SLOHistoryResponseError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A service level objective history response.
 */
@ApiModel(description = "A service level objective history response.")
@JsonPropertyOrder({
  HistoryServiceLevelObjectiveResponse.JSON_PROPERTY_DATA,
  HistoryServiceLevelObjectiveResponse.JSON_PROPERTY_ERRORS
})

public class HistoryServiceLevelObjectiveResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private HistoryServiceLevelObjectiveResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOHistoryResponseError> errors = null;


  public HistoryServiceLevelObjectiveResponse data(HistoryServiceLevelObjectiveResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HistoryServiceLevelObjectiveResponseData getData() {
    return data;
  }


  public void setData(HistoryServiceLevelObjectiveResponseData data) {
    this.data = data;
  }


  public HistoryServiceLevelObjectiveResponse errors(List<SLOHistoryResponseError> errors) {
    
    this.errors = errors;
    return this;
  }

  public HistoryServiceLevelObjectiveResponse addErrorsItem(SLOHistoryResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of errors while querying the history data for the service level obective.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of errors while querying the history data for the service level obective.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SLOHistoryResponseError> getErrors() {
    return errors;
  }


  public void setErrors(List<SLOHistoryResponseError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryServiceLevelObjectiveResponse historyServiceLevelObjectiveResponse = (HistoryServiceLevelObjectiveResponse) o;
    return Objects.equals(this.data, historyServiceLevelObjectiveResponse.data) &&
        Objects.equals(this.errors, historyServiceLevelObjectiveResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryServiceLevelObjectiveResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

