/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** An array of service level objective objects. */
@JsonPropertyOrder({CheckCanDeleteSLOResponseData.JSON_PROPERTY_OK})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CheckCanDeleteSLOResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OK = "ok";
  private List<String> ok = null;

  public CheckCanDeleteSLOResponseData ok(List<String> ok) {
    this.ok = ok;
    return this;
  }

  public CheckCanDeleteSLOResponseData addOkItem(String okItem) {
    if (this.ok == null) {
      this.ok = new ArrayList<>();
    }
    this.ok.add(okItem);
    return this;
  }

  /**
   * An array of of SLO IDs that can be safely deleted.
   *
   * @return ok
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOk() {
    return ok;
  }

  public void setOk(List<String> ok) {
    this.ok = ok;
  }

  /** Return true if this CheckCanDeleteSLOResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteSLOResponseData checkCanDeleteSloResponseData = (CheckCanDeleteSLOResponseData) o;
    return Objects.equals(this.ok, checkCanDeleteSloResponseData.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteSLOResponseData {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
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