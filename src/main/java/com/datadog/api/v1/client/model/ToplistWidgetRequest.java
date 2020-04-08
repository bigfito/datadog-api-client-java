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
import com.datadog.api.v1.client.model.EventQueryDefinition;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequestStyle;
import com.datadog.api.v1.client.model.WidgetConditionalFormat;
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
  ToplistWidgetRequest.JSON_PROPERTY_APM_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_Q,
  ToplistWidgetRequest.JSON_PROPERTY_RUM_QUERY,
  ToplistWidgetRequest.JSON_PROPERTY_STYLE
})

public class ToplistWidgetRequest {
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private EventQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TimeseriesWidgetRequestStyle style;


  public ToplistWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
    
    this.apmQuery = apmQuery;
    return this;
  }

   /**
   * Get apmQuery
   * @return apmQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }


  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }


  public ToplistWidgetRequest conditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    
    this.conditionalFormats = conditionalFormats;
    return this;
  }

  public ToplistWidgetRequest addConditionalFormatsItem(WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    return this;
  }

   /**
   * TODO.
   * @return conditionalFormats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetConditionalFormat> getConditionalFormats() {
    return conditionalFormats;
  }


  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }


  public ToplistWidgetRequest eventQuery(EventQueryDefinition eventQuery) {
    
    this.eventQuery = eventQuery;
    return this;
  }

   /**
   * Get eventQuery
   * @return eventQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventQueryDefinition getEventQuery() {
    return eventQuery;
  }


  public void setEventQuery(EventQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }


  public ToplistWidgetRequest logQuery(LogQueryDefinition logQuery) {
    
    this.logQuery = logQuery;
    return this;
  }

   /**
   * Get logQuery
   * @return logQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getLogQuery() {
    return logQuery;
  }


  public void setLogQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
  }


  public ToplistWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
    
    this.networkQuery = networkQuery;
    return this;
  }

   /**
   * Get networkQuery
   * @return networkQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getNetworkQuery() {
    return networkQuery;
  }


  public void setNetworkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
  }


  public ToplistWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
    
    this.processQuery = processQuery;
    return this;
  }

   /**
   * Get processQuery
   * @return processQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessQueryDefinition getProcessQuery() {
    return processQuery;
  }


  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
  }


  public ToplistWidgetRequest q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * TODO.
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public ToplistWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    
    this.rumQuery = rumQuery;
    return this;
  }

   /**
   * Get rumQuery
   * @return rumQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }


  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
  }


  public ToplistWidgetRequest style(TimeseriesWidgetRequestStyle style) {
    
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimeseriesWidgetRequestStyle getStyle() {
    return style;
  }


  public void setStyle(TimeseriesWidgetRequestStyle style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistWidgetRequest toplistWidgetRequest = (ToplistWidgetRequest) o;
    return Objects.equals(this.apmQuery, toplistWidgetRequest.apmQuery) &&
        Objects.equals(this.conditionalFormats, toplistWidgetRequest.conditionalFormats) &&
        Objects.equals(this.eventQuery, toplistWidgetRequest.eventQuery) &&
        Objects.equals(this.logQuery, toplistWidgetRequest.logQuery) &&
        Objects.equals(this.networkQuery, toplistWidgetRequest.networkQuery) &&
        Objects.equals(this.processQuery, toplistWidgetRequest.processQuery) &&
        Objects.equals(this.q, toplistWidgetRequest.q) &&
        Objects.equals(this.rumQuery, toplistWidgetRequest.rumQuery) &&
        Objects.equals(this.style, toplistWidgetRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmQuery, conditionalFormats, eventQuery, logQuery, networkQuery, processQuery, q, rumQuery, style);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistWidgetRequest {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

