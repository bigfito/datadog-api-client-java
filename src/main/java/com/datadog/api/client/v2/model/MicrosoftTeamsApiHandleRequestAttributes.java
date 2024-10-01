/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Handle attributes. */
@JsonPropertyOrder({
  MicrosoftTeamsApiHandleRequestAttributes.JSON_PROPERTY_CHANNEL_ID,
  MicrosoftTeamsApiHandleRequestAttributes.JSON_PROPERTY_NAME,
  MicrosoftTeamsApiHandleRequestAttributes.JSON_PROPERTY_TEAM_ID,
  MicrosoftTeamsApiHandleRequestAttributes.JSON_PROPERTY_TENANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftTeamsApiHandleRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public MicrosoftTeamsApiHandleRequestAttributes() {}

  @JsonCreator
  public MicrosoftTeamsApiHandleRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANNEL_ID) String channelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAM_ID) String teamId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TENANT_ID) String tenantId) {
    this.channelId = channelId;
    this.name = name;
    this.teamId = teamId;
    this.tenantId = tenantId;
  }

  public MicrosoftTeamsApiHandleRequestAttributes channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Channel id.
   *
   * @return channelId
   */
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public MicrosoftTeamsApiHandleRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Handle name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MicrosoftTeamsApiHandleRequestAttributes teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Team id.
   *
   * @return teamId
   */
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public MicrosoftTeamsApiHandleRequestAttributes tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant id.
   *
   * @return tenantId
   */
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
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
   * @return MicrosoftTeamsApiHandleRequestAttributes
   */
  @JsonAnySetter
  public MicrosoftTeamsApiHandleRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MicrosoftTeamsApiHandleRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftTeamsApiHandleRequestAttributes microsoftTeamsApiHandleRequestAttributes =
        (MicrosoftTeamsApiHandleRequestAttributes) o;
    return Objects.equals(this.channelId, microsoftTeamsApiHandleRequestAttributes.channelId)
        && Objects.equals(this.name, microsoftTeamsApiHandleRequestAttributes.name)
        && Objects.equals(this.teamId, microsoftTeamsApiHandleRequestAttributes.teamId)
        && Objects.equals(this.tenantId, microsoftTeamsApiHandleRequestAttributes.tenantId)
        && Objects.equals(
            this.additionalProperties,
            microsoftTeamsApiHandleRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, name, teamId, tenantId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftTeamsApiHandleRequestAttributes {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
