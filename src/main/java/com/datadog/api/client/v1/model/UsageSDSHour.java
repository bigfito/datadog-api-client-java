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
import java.util.Objects;

/** Sensitive Data Scanner usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageSDSHour.JSON_PROPERTY_HOUR,
  UsageSDSHour.JSON_PROPERTY_LOGS_SCANNED_BYTES,
  UsageSDSHour.JSON_PROPERTY_ORG_NAME,
  UsageSDSHour.JSON_PROPERTY_PUBLIC_ID,
  UsageSDSHour.JSON_PROPERTY_TOTAL_SCANNED_BYTES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageSDSHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_LOGS_SCANNED_BYTES = "logs_scanned_bytes";
  private Long logsScannedBytes;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TOTAL_SCANNED_BYTES = "total_scanned_bytes";
  private Long totalScannedBytes;

  public UsageSDSHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageSDSHour logsScannedBytes(Long logsScannedBytes) {
    this.logsScannedBytes = logsScannedBytes;
    return this;
  }

  /**
   * The total number of bytes scanned of logs usage by the Sensitive Data Scanner from the start of
   * the given hour’s month until the given hour.
   *
   * @return logsScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLogsScannedBytes() {
    return logsScannedBytes;
  }

  public void setLogsScannedBytes(Long logsScannedBytes) {
    this.logsScannedBytes = logsScannedBytes;
  }

  public UsageSDSHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageSDSHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageSDSHour totalScannedBytes(Long totalScannedBytes) {
    this.totalScannedBytes = totalScannedBytes;
    return this;
  }

  /**
   * The total number of bytes scanned across all usage types by the Sensitive Data Scanner from the
   * start of the given hour’s month until the given hour.
   *
   * @return totalScannedBytes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SCANNED_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalScannedBytes() {
    return totalScannedBytes;
  }

  public void setTotalScannedBytes(Long totalScannedBytes) {
    this.totalScannedBytes = totalScannedBytes;
  }

  /** Return true if this UsageSDSHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSDSHour usageSdsHour = (UsageSDSHour) o;
    return Objects.equals(this.hour, usageSdsHour.hour)
        && Objects.equals(this.logsScannedBytes, usageSdsHour.logsScannedBytes)
        && Objects.equals(this.orgName, usageSdsHour.orgName)
        && Objects.equals(this.publicId, usageSdsHour.publicId)
        && Objects.equals(this.totalScannedBytes, usageSdsHour.totalScannedBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, logsScannedBytes, orgName, publicId, totalScannedBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSDSHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    logsScannedBytes: ").append(toIndentedString(logsScannedBytes)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    totalScannedBytes: ").append(toIndentedString(totalScannedBytes)).append("\n");
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