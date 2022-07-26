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

/** Object used to create an API key. */
@JsonPropertyOrder({APIKeyCreateData.JSON_PROPERTY_ATTRIBUTES, APIKeyCreateData.JSON_PROPERTY_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class APIKeyCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private APIKeyCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private APIKeysType type = APIKeysType.API_KEYS;

  public APIKeyCreateData() {}

  @JsonCreator
  public APIKeyCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          APIKeyCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) APIKeysType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public APIKeyCreateData attributes(APIKeyCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes used to create an API Key.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public APIKeyCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(APIKeyCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public APIKeyCreateData type(APIKeysType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * API Keys resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public APIKeysType getType() {
    return type;
  }

  public void setType(APIKeysType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this APIKeyCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyCreateData apiKeyCreateData = (APIKeyCreateData) o;
    return Objects.equals(this.attributes, apiKeyCreateData.attributes)
        && Objects.equals(this.type, apiKeyCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyCreateData {\n");
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