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
import com.datadog.api.v1.client.model.LogQueryDefinitionGroupBy;
import com.datadog.api.v1.client.model.LogQueryDefinitionSearch;
import com.datadog.api.v1.client.model.LogsQueryCompute;
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
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  LogQueryDefinition.JSON_PROPERTY_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_GROUP_BY,
  LogQueryDefinition.JSON_PROPERTY_INDEX,
  LogQueryDefinition.JSON_PROPERTY_MULTI_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_SEARCH
})

public class LogQueryDefinition {
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsQueryCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogQueryDefinitionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_MULTI_COMPUTE = "multi_compute";
  private List<LogsQueryCompute> multiCompute = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private LogQueryDefinitionSearch search;


  public LogQueryDefinition compute(LogsQueryCompute compute) {
    
    this.compute = compute;
    return this;
  }

   /**
   * Get compute
   * @return compute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsQueryCompute getCompute() {
    return compute;
  }


  public void setCompute(LogsQueryCompute compute) {
    this.compute = compute;
  }


  public LogQueryDefinition groupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

  public LogQueryDefinition addGroupByItem(LogQueryDefinitionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * TODO.
   * @return groupBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogQueryDefinitionGroupBy> getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
  }


  public LogQueryDefinition index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * TODO.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public LogQueryDefinition multiCompute(List<LogsQueryCompute> multiCompute) {
    
    this.multiCompute = multiCompute;
    return this;
  }

  public LogQueryDefinition addMultiComputeItem(LogsQueryCompute multiComputeItem) {
    if (this.multiCompute == null) {
      this.multiCompute = new ArrayList<>();
    }
    this.multiCompute.add(multiComputeItem);
    return this;
  }

   /**
   * This field is mutually exclusive with &#x60;compute&#x60;
   * @return multiCompute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is mutually exclusive with `compute`")
  @JsonProperty(JSON_PROPERTY_MULTI_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsQueryCompute> getMultiCompute() {
    return multiCompute;
  }


  public void setMultiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
  }


  public LogQueryDefinition search(LogQueryDefinitionSearch search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinitionSearch getSearch() {
    return search;
  }


  public void setSearch(LogQueryDefinitionSearch search) {
    this.search = search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinition logQueryDefinition = (LogQueryDefinition) o;
    return Objects.equals(this.compute, logQueryDefinition.compute) &&
        Objects.equals(this.groupBy, logQueryDefinition.groupBy) &&
        Objects.equals(this.index, logQueryDefinition.index) &&
        Objects.equals(this.multiCompute, logQueryDefinition.multiCompute) &&
        Objects.equals(this.search, logQueryDefinition.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, groupBy, index, multiCompute, search);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinition {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    multiCompute: ").append(toIndentedString(multiCompute)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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

