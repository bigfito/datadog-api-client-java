/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A Cloud Workload Security Agent rule returned by the API. */
@JsonPropertyOrder({
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CATEGORY,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CREATION_DATE,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_CREATOR,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_DEFAULT_RULE,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_ENABLED,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_EXPRESSION,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_NAME,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATED_AT,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_UPDATER,
  CloudWorkloadSecurityAgentRuleAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudWorkloadSecurityAgentRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private Long creationDate;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private CloudWorkloadSecurityAgentRuleCreatorAttributes creator;

  public static final String JSON_PROPERTY_DEFAULT_RULE = "defaultRule";
  private Boolean defaultRule;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private CloudWorkloadSecurityAgentRuleUpdaterAttributes updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public CloudWorkloadSecurityAgentRuleAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the Agent rule.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CloudWorkloadSecurityAgentRuleAttributes creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * When the Agent rule was created, timestamp in milliseconds.
   *
   * @return creationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public CloudWorkloadSecurityAgentRuleAttributes creator(
      CloudWorkloadSecurityAgentRuleCreatorAttributes creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * The attributes of the user who created the Agent rule.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleCreatorAttributes getCreator() {
    return creator;
  }

  public void setCreator(CloudWorkloadSecurityAgentRuleCreatorAttributes creator) {
    this.creator = creator;
  }

  public CloudWorkloadSecurityAgentRuleAttributes defaultRule(Boolean defaultRule) {
    this.defaultRule = defaultRule;
    return this;
  }

  /**
   * Whether the rule is included by default.
   *
   * @return defaultRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefaultRule() {
    return defaultRule;
  }

  public void setDefaultRule(Boolean defaultRule) {
    this.defaultRule = defaultRule;
  }

  public CloudWorkloadSecurityAgentRuleAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Agent rule.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudWorkloadSecurityAgentRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the Agent rule is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CloudWorkloadSecurityAgentRuleAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The SECL expression of the Agent rule.
   *
   * @return expression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public CloudWorkloadSecurityAgentRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Agent rule.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudWorkloadSecurityAgentRuleAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the Agent rule was last updated, timestamp in milliseconds.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CloudWorkloadSecurityAgentRuleAttributes updater(
      CloudWorkloadSecurityAgentRuleUpdaterAttributes updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * The attributes of the user who last updated the Agent rule.
   *
   * @return updater
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudWorkloadSecurityAgentRuleUpdaterAttributes getUpdater() {
    return updater;
  }

  public void setUpdater(CloudWorkloadSecurityAgentRuleUpdaterAttributes updater) {
    this.updater = updater;
  }

  public CloudWorkloadSecurityAgentRuleAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the Agent rule.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return CloudWorkloadSecurityAgentRuleAttributes
   */
  @JsonAnySetter
  public CloudWorkloadSecurityAgentRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudWorkloadSecurityAgentRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorkloadSecurityAgentRuleAttributes cloudWorkloadSecurityAgentRuleAttributes =
        (CloudWorkloadSecurityAgentRuleAttributes) o;
    return Objects.equals(this.category, cloudWorkloadSecurityAgentRuleAttributes.category)
        && Objects.equals(this.creationDate, cloudWorkloadSecurityAgentRuleAttributes.creationDate)
        && Objects.equals(this.creator, cloudWorkloadSecurityAgentRuleAttributes.creator)
        && Objects.equals(this.defaultRule, cloudWorkloadSecurityAgentRuleAttributes.defaultRule)
        && Objects.equals(this.description, cloudWorkloadSecurityAgentRuleAttributes.description)
        && Objects.equals(this.enabled, cloudWorkloadSecurityAgentRuleAttributes.enabled)
        && Objects.equals(this.expression, cloudWorkloadSecurityAgentRuleAttributes.expression)
        && Objects.equals(this.name, cloudWorkloadSecurityAgentRuleAttributes.name)
        && Objects.equals(this.updatedAt, cloudWorkloadSecurityAgentRuleAttributes.updatedAt)
        && Objects.equals(this.updater, cloudWorkloadSecurityAgentRuleAttributes.updater)
        && Objects.equals(this.version, cloudWorkloadSecurityAgentRuleAttributes.version)
        && Objects.equals(
            this.additionalProperties,
            cloudWorkloadSecurityAgentRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        creationDate,
        creator,
        defaultRule,
        description,
        enabled,
        expression,
        name,
        updatedAt,
        updater,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorkloadSecurityAgentRuleAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    defaultRule: ").append(toIndentedString(defaultRule)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
