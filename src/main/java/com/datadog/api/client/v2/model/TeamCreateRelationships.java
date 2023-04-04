/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Relationships formed with the team on creation */
@JsonPropertyOrder({TeamCreateRelationships.JSON_PROPERTY_USERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamCreateRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USERS = "users";
  private RelationshipToUsers users;

  public TeamCreateRelationships users(RelationshipToUsers users) {
    this.users = users;
    this.unparsed |= users.unparsed;
    return this;
  }

  /**
   * Relationship to users.
   *
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationshipToUsers getUsers() {
    return users;
  }

  public void setUsers(RelationshipToUsers users) {
    this.users = users;
  }

  /** Return true if this TeamCreateRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamCreateRelationships teamCreateRelationships = (TeamCreateRelationships) o;
    return Objects.equals(this.users, teamCreateRelationships.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamCreateRelationships {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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