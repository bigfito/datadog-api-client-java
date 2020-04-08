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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  MetricMetadata.JSON_PROPERTY_DESCRIPTION,
  MetricMetadata.JSON_PROPERTY_INTEGRATION,
  MetricMetadata.JSON_PROPERTY_PER_UNIT,
  MetricMetadata.JSON_PROPERTY_SHORT_NAME,
  MetricMetadata.JSON_PROPERTY_STATSD_INTERVAL,
  MetricMetadata.JSON_PROPERTY_TYPE,
  MetricMetadata.JSON_PROPERTY_UNIT
})

public class MetricMetadata {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private String integration;

  public static final String JSON_PROPERTY_PER_UNIT = "per_unit";
  private String perUnit;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public static final String JSON_PROPERTY_STATSD_INTERVAL = "statsd_interval";
  private Long statsdInterval;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;


  public MetricMetadata description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Metric description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metric description.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Name of the integration that sent the metric if applicable.
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the integration that sent the metric if applicable.")
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegration() {
    return integration;
  }




  public MetricMetadata perUnit(String perUnit) {
    
    this.perUnit = perUnit;
    return this;
  }

   /**
   * Per unit of the metric such as &#x60;second&#x60; in &#x60;bytes per second&#x60;.
   * @return perUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "second", value = "Per unit of the metric such as `second` in `bytes per second`.")
  @JsonProperty(JSON_PROPERTY_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPerUnit() {
    return perUnit;
  }


  public void setPerUnit(String perUnit) {
    this.perUnit = perUnit;
  }


  public MetricMetadata shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * A more human-readable and abbreviated version of the metric name.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A more human-readable and abbreviated version of the metric name.")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public MetricMetadata statsdInterval(Long statsdInterval) {
    
    this.statsdInterval = statsdInterval;
    return this;
  }

   /**
   * Statsd flush interval of the metric in seconds if applicable.
   * @return statsdInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Statsd flush interval of the metric in seconds if applicable.")
  @JsonProperty(JSON_PROPERTY_STATSD_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStatsdInterval() {
    return statsdInterval;
  }


  public void setStatsdInterval(Long statsdInterval) {
    this.statsdInterval = statsdInterval;
  }


  public MetricMetadata type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Metric type such as &#x60;gauge&#x60; or &#x60;rate&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "count", value = "Metric type such as `gauge` or `rate`.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MetricMetadata unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Primary unit of the metric such as &#x60;byte&#x60; or &#x60;operation&#x60;.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "byte", value = "Primary unit of the metric such as `byte` or `operation`.")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadata metricMetadata = (MetricMetadata) o;
    return Objects.equals(this.description, metricMetadata.description) &&
        Objects.equals(this.integration, metricMetadata.integration) &&
        Objects.equals(this.perUnit, metricMetadata.perUnit) &&
        Objects.equals(this.shortName, metricMetadata.shortName) &&
        Objects.equals(this.statsdInterval, metricMetadata.statsdInterval) &&
        Objects.equals(this.type, metricMetadata.type) &&
        Objects.equals(this.unit, metricMetadata.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, integration, perUnit, shortName, statsdInterval, type, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadata {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    perUnit: ").append(toIndentedString(perUnit)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    statsdInterval: ").append(toIndentedString(statsdInterval)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

