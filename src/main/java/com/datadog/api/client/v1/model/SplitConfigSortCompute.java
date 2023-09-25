/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Defines the metric and aggregation used as the sort value. */
@JsonPropertyOrder({
  SplitConfigSortCompute.JSON_PROPERTY_AGGREGATION,
  SplitConfigSortCompute.JSON_PROPERTY_METRIC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitConfigSortCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private String aggregation;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public SplitConfigSortCompute() {}

  @JsonCreator
  public SplitConfigSortCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION) String aggregation,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric) {
    this.aggregation = aggregation;
    this.metric = metric;
  }

  public SplitConfigSortCompute aggregation(String aggregation) {
    this.aggregation = aggregation;
    return this;
  }

  /**
   * How to aggregate the sort metric for the purposes of ordering.
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAggregation() {
    return aggregation;
  }

  public void setAggregation(String aggregation) {
    this.aggregation = aggregation;
  }

  public SplitConfigSortCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The metric to use for sorting graphs.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SplitConfigSortCompute
   */
  @JsonAnySetter
  public SplitConfigSortCompute putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SplitConfigSortCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitConfigSortCompute splitConfigSortCompute = (SplitConfigSortCompute) o;
    return Objects.equals(this.aggregation, splitConfigSortCompute.aggregation)
        && Objects.equals(this.metric, splitConfigSortCompute.metric)
        && Objects.equals(this.additionalProperties, splitConfigSortCompute.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, metric, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitConfigSortCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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