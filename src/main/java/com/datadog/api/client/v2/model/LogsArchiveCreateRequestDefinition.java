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

/** The definition of an archive. */
@JsonPropertyOrder({
  LogsArchiveCreateRequestDefinition.JSON_PROPERTY_ATTRIBUTES,
  LogsArchiveCreateRequestDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsArchiveCreateRequestDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private LogsArchiveCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "archives";

  public LogsArchiveCreateRequestDefinition() {}

  @JsonCreator
  public LogsArchiveCreateRequestDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.type = type;
  }

  public LogsArchiveCreateRequestDefinition attributes(
      LogsArchiveCreateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes associated with the archive.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsArchiveCreateRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(LogsArchiveCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public LogsArchiveCreateRequestDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the resource. The value should always be archives.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this LogsArchiveCreateRequestDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsArchiveCreateRequestDefinition logsArchiveCreateRequestDefinition =
        (LogsArchiveCreateRequestDefinition) o;
    return Objects.equals(this.attributes, logsArchiveCreateRequestDefinition.attributes)
        && Objects.equals(this.type, logsArchiveCreateRequestDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsArchiveCreateRequestDefinition {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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