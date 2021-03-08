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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricDataSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * A formula and functions metrics query.
 */
@ApiModel(description = "A formula and functions metrics query.")
@JsonPropertyOrder({
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_AGGREGATOR,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionMetricQueryDefinition.JSON_PROPERTY_QUERY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FormulaAndFunctionMetricQueryDefinition {
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private FormulaAndFunctionMetricAggregation aggregator;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionMetricDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;


  public FormulaAndFunctionMetricQueryDefinition aggregator(FormulaAndFunctionMetricAggregation aggregator) {
    this.aggregator = aggregator;
    return this;
  }

   /**
   * Get aggregator
   * @return aggregator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormulaAndFunctionMetricAggregation getAggregator() {
    return aggregator;
  }


  public void setAggregator(FormulaAndFunctionMetricAggregation aggregator) {
    this.aggregator = aggregator;
  }


  public FormulaAndFunctionMetricQueryDefinition dataSource(FormulaAndFunctionMetricDataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FormulaAndFunctionMetricDataSource getDataSource() {
    return dataSource;
  }


  public void setDataSource(FormulaAndFunctionMetricDataSource dataSource) {
    this.dataSource = dataSource;
  }


  public FormulaAndFunctionMetricQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the query for use in formulas.
   * @return name
  **/
  @ApiModelProperty(example = "my_query", required = true, value = "Name of the query for use in formulas.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FormulaAndFunctionMetricQueryDefinition query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Metrics query definition.
   * @return query
  **/
  @ApiModelProperty(example = "avg:system.cpu.user{*}", required = true, value = "Metrics query definition.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Return true if this FormulaAndFunctionMetricQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionMetricQueryDefinition formulaAndFunctionMetricQueryDefinition = (FormulaAndFunctionMetricQueryDefinition) o;
    return Objects.equals(this.aggregator, formulaAndFunctionMetricQueryDefinition.aggregator) &&
        Objects.equals(this.dataSource, formulaAndFunctionMetricQueryDefinition.dataSource) &&
        Objects.equals(this.name, formulaAndFunctionMetricQueryDefinition.name) &&
        Objects.equals(this.query, formulaAndFunctionMetricQueryDefinition.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, dataSource, name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionMetricQueryDefinition {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

