/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Paging attributes for listing events. */
@ApiModel(description = "Paging attributes for listing events.")
@JsonPropertyOrder({
  RUMQueryPageOptions.JSON_PROPERTY_CURSOR,
  RUMQueryPageOptions.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RUMQueryPageOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURSOR = "cursor";
  private String cursor;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;

  public RUMQueryPageOptions cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * List following results with a cursor provided in the previous query.
   *
   * @return cursor
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example =
          "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==",
      value = "List following results with a cursor provided in the previous query.")
  @JsonProperty(JSON_PROPERTY_CURSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public RUMQueryPageOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of events in the response. maximum: 1000
   *
   * @return limit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Maximum number of events in the response.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /** Return true if this RUMQueryPageOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMQueryPageOptions ruMQueryPageOptions = (RUMQueryPageOptions) o;
    return Objects.equals(this.cursor, ruMQueryPageOptions.cursor)
        && Objects.equals(this.limit, ruMQueryPageOptions.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMQueryPageOptions {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
