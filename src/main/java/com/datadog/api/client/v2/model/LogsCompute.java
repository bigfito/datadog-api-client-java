/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A compute rule to compute metrics or timeseries */
@JsonPropertyOrder({
  LogsCompute.JSON_PROPERTY_AGGREGATION,
  LogsCompute.JSON_PROPERTY_INTERVAL,
  LogsCompute.JSON_PROPERTY_METRIC,
  LogsCompute.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsCompute {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private LogsAggregationFunction aggregation;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private String interval;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogsComputeType type = LogsComputeType.TOTAL;

  public LogsCompute() {}

  @JsonCreator
  public LogsCompute(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION)
          LogsAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
  }

  public LogsCompute aggregation(LogsAggregationFunction aggregation) {
    this.aggregation = aggregation;
    this.unparsed |= !aggregation.isValid();
    return this;
  }

  /**
   * An aggregation function
   *
   * @return aggregation
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogsAggregationFunction getAggregation() {
    return aggregation;
  }

  public void setAggregation(LogsAggregationFunction aggregation) {
    if (!aggregation.isValid()) {
      this.unparsed = true;
    }
    this.aggregation = aggregation;
  }

  public LogsCompute interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time buckets' size (only used for type=timeseries) Defaults to a resolution of 150 points
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public LogsCompute metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The metric to use
   *
   * @return metric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public LogsCompute type(LogsComputeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of compute
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsComputeType getType() {
    return type;
  }

  public void setType(LogsComputeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogsCompute object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsCompute logsCompute = (LogsCompute) o;
    return Objects.equals(this.aggregation, logsCompute.aggregation)
        && Objects.equals(this.interval, logsCompute.interval)
        && Objects.equals(this.metric, logsCompute.metric)
        && Objects.equals(this.type, logsCompute.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, interval, metric, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsCompute {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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