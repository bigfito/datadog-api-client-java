/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Object describing a monitor update request. */
@JsonPropertyOrder({
  MonitorUpdateRequest.JSON_PROPERTY_CREATED,
  MonitorUpdateRequest.JSON_PROPERTY_CREATOR,
  MonitorUpdateRequest.JSON_PROPERTY_DELETED,
  MonitorUpdateRequest.JSON_PROPERTY_ID,
  MonitorUpdateRequest.JSON_PROPERTY_MESSAGE,
  MonitorUpdateRequest.JSON_PROPERTY_MODIFIED,
  MonitorUpdateRequest.JSON_PROPERTY_MULTI,
  MonitorUpdateRequest.JSON_PROPERTY_NAME,
  MonitorUpdateRequest.JSON_PROPERTY_OPTIONS,
  MonitorUpdateRequest.JSON_PROPERTY_OVERALL_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_PRIORITY,
  MonitorUpdateRequest.JSON_PROPERTY_QUERY,
  MonitorUpdateRequest.JSON_PROPERTY_RESTRICTED_ROLES,
  MonitorUpdateRequest.JSON_PROPERTY_STATE,
  MonitorUpdateRequest.JSON_PROPERTY_TAGS,
  MonitorUpdateRequest.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DELETED = "deleted";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> deleted = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_MODIFIED = "modified";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_MULTI = "multi";
  private Boolean multi;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private MonitorOptions options;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private MonitorOverallStates overallState;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RESTRICTED_ROLES = "restricted_roles";
  private List<String> restrictedRoles = null;

  public static final String JSON_PROPERTY_STATE = "state";
  private MonitorState state;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorType type;

  /**
   * Timestamp of the monitor creation.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * Object describing the creator of the shared element.
   *
   * @return creator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Creator getCreator() {
    return creator;
  }

  /**
   * Whether or not the monitor is deleted. (Always <code>null</code>)
   *
   * @return deleted
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDeleted() {

    if (deleted == null) {
      deleted = JsonNullable.<OffsetDateTime>undefined();
    }
    return deleted.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeleted_JsonNullable() {
    return deleted;
  }

  @JsonProperty(JSON_PROPERTY_DELETED)
  private void setDeleted_JsonNullable(JsonNullable<OffsetDateTime> deleted) {
    this.deleted = deleted;
  }

  /**
   * ID of this monitor.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public MonitorUpdateRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message to include with notifications for this monitor.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Last timestamp when the monitor was edited.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  /**
   * Whether or not the monitor is broken down on different groups.
   *
   * @return multi
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getMulti() {
    return multi;
  }

  public MonitorUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The monitor name.
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

  public MonitorUpdateRequest options(MonitorOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * List of options associated with your monitor.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOptions getOptions() {
    return options;
  }

  public void setOptions(MonitorOptions options) {
    this.options = options;
  }

  /**
   * The different states your monitor can be in.
   *
   * @return overallState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorOverallStates getOverallState() {
    return overallState;
  }

  public MonitorUpdateRequest priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Integer from 1 (high) to 5 (low) indicating alert severity. minimum: 1 maximum: 5
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public MonitorUpdateRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The monitor query.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public MonitorUpdateRequest restrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
    return this;
  }

  public MonitorUpdateRequest addRestrictedRolesItem(String restrictedRolesItem) {
    if (this.restrictedRoles == null) {
      this.restrictedRoles = new ArrayList<>();
    }
    this.restrictedRoles.add(restrictedRolesItem);
    return this;
  }

  /**
   * A list of unique role identifiers to define which roles are allowed to edit the monitor. The
   * unique identifiers for all roles can be pulled from the <a
   * href="https://docs.datadoghq.com/api/latest/roles/#list-roles">Roles API</a> and are located in
   * the <code>data.id</code> field. Editing a monitor includes any updates to the monitor
   * configuration, monitor deletion, and muting of the monitor for any amount of time. <code>
   * restricted_roles</code> is the successor of <code>locked</code>. For more information about
   * <code>locked</code> and <code>restricted_roles</code>, see the <a
   * href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/#permissions-options">monitor
   * options docs</a>.
   *
   * @return restrictedRoles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRestrictedRoles() {
    return restrictedRoles;
  }

  public void setRestrictedRoles(List<String> restrictedRoles) {
    this.restrictedRoles = restrictedRoles;
  }

  /**
   * Wrapper object with the different monitor states.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorState getState() {
    return state;
  }

  public MonitorUpdateRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MonitorUpdateRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated to your monitor.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MonitorUpdateRequest type(MonitorType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the monitor. For more information about <code>type</code>, see the <a
   * href="https://docs.datadoghq.com/monitors/guide/monitor_api_options/">monitor options</a> docs.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorType getType() {
    return type;
  }

  public void setType(MonitorType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MonitorUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorUpdateRequest monitorUpdateRequest = (MonitorUpdateRequest) o;
    return Objects.equals(this.created, monitorUpdateRequest.created)
        && Objects.equals(this.creator, monitorUpdateRequest.creator)
        && Objects.equals(this.deleted, monitorUpdateRequest.deleted)
        && Objects.equals(this.id, monitorUpdateRequest.id)
        && Objects.equals(this.message, monitorUpdateRequest.message)
        && Objects.equals(this.modified, monitorUpdateRequest.modified)
        && Objects.equals(this.multi, monitorUpdateRequest.multi)
        && Objects.equals(this.name, monitorUpdateRequest.name)
        && Objects.equals(this.options, monitorUpdateRequest.options)
        && Objects.equals(this.overallState, monitorUpdateRequest.overallState)
        && Objects.equals(this.priority, monitorUpdateRequest.priority)
        && Objects.equals(this.query, monitorUpdateRequest.query)
        && Objects.equals(this.restrictedRoles, monitorUpdateRequest.restrictedRoles)
        && Objects.equals(this.state, monitorUpdateRequest.state)
        && Objects.equals(this.tags, monitorUpdateRequest.tags)
        && Objects.equals(this.type, monitorUpdateRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        creator,
        deleted,
        id,
        message,
        modified,
        multi,
        name,
        options,
        overallState,
        priority,
        query,
        restrictedRoles,
        state,
        tags,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorUpdateRequest {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    restrictedRoles: ").append(toIndentedString(restrictedRoles)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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