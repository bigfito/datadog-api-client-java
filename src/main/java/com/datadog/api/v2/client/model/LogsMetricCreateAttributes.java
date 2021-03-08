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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.LogsMetricCompute;
import com.datadog.api.v2.client.model.LogsMetricFilter;
import com.datadog.api.v2.client.model.LogsMetricGroupBy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * The object describing the Datadog log-based metric to create.
 */
@ApiModel(description = "The object describing the Datadog log-based metric to create.")
@JsonPropertyOrder({
  LogsMetricCreateAttributes.JSON_PROPERTY_COMPUTE,
  LogsMetricCreateAttributes.JSON_PROPERTY_FILTER,
  LogsMetricCreateAttributes.JSON_PROPERTY_GROUP_BY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsMetricCreateAttributes {
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsMetricCompute compute;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsMetricFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogsMetricGroupBy> groupBy = null;


  public LogsMetricCreateAttributes compute(LogsMetricCompute compute) {
    this.compute = compute;
    return this;
  }

   /**
   * Get compute
   * @return compute
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LogsMetricCompute getCompute() {
    return compute;
  }


  public void setCompute(LogsMetricCompute compute) {
    this.compute = compute;
  }


  public LogsMetricCreateAttributes filter(LogsMetricFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsMetricFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsMetricFilter filter) {
    this.filter = filter;
  }


  public LogsMetricCreateAttributes groupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public LogsMetricCreateAttributes addGroupByItem(LogsMetricGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * The rules for the group by.
   * @return groupBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rules for the group by.")
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsMetricGroupBy> getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(List<LogsMetricGroupBy> groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * Return true if this LogsMetricCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsMetricCreateAttributes logsMetricCreateAttributes = (LogsMetricCreateAttributes) o;
    return Objects.equals(this.compute, logsMetricCreateAttributes.compute) &&
        Objects.equals(this.filter, logsMetricCreateAttributes.filter) &&
        Objects.equals(this.groupBy, logsMetricCreateAttributes.groupBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsMetricCreateAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

