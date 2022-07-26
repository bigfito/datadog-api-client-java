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

/** Indexed logs usage summary for each organization for each retention period with usage. */
@JsonPropertyOrder({LogsByRetentionOrgs.JSON_PROPERTY_USAGE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsByRetentionOrgs {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<LogsByRetentionOrgUsage> usage = null;

  public LogsByRetentionOrgs usage(List<LogsByRetentionOrgUsage> usage) {
    this.usage = usage;
    for (LogsByRetentionOrgUsage item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsByRetentionOrgs addUsageItem(LogsByRetentionOrgUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Indexed logs usage summary for each organization.
   *
   * @return usage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsByRetentionOrgUsage> getUsage() {
    return usage;
  }

  public void setUsage(List<LogsByRetentionOrgUsage> usage) {
    this.usage = usage;
  }

  /** Return true if this LogsByRetentionOrgs object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsByRetentionOrgs logsByRetentionOrgs = (LogsByRetentionOrgs) o;
    return Objects.equals(this.usage, logsByRetentionOrgs.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsByRetentionOrgs {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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