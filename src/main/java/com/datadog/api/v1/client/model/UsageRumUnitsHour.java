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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Number of RUM Units used for each hour for a given organization (data available as of November 1,
 * 2021).
 */
@ApiModel(
    description =
        "Number of RUM Units used for each hour for a given organization (data available as of"
            + " November 1, 2021).")
@JsonPropertyOrder({
  UsageRumUnitsHour.JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT,
  UsageRumUnitsHour.JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT,
  UsageRumUnitsHour.JSON_PROPERTY_BROWSER_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT,
  UsageRumUnitsHour.JSON_PROPERTY_MOBILE_RUM_UNITS,
  UsageRumUnitsHour.JSON_PROPERTY_ORG_NAME,
  UsageRumUnitsHour.JSON_PROPERTY_PUBLIC_ID,
  UsageRumUnitsHour.JSON_PROPERTY_RUM_UNITS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageRumUnitsHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT =
      "browser_rum_lite_session_count";
  private Long browserRumLiteSessionCount;

  public static final String JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT =
      "browser_rum_replay_session_count";
  private Long browserRumReplaySessionCount;

  public static final String JSON_PROPERTY_BROWSER_RUM_UNITS = "browser_rum_units";
  private Long browserRumUnits;

  public static final String JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT =
      "mobile_rum_lite_session_count";
  private Long mobileRumLiteSessionCount;

  public static final String JSON_PROPERTY_MOBILE_RUM_UNITS = "mobile_rum_units";
  private Long mobileRumUnits;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RUM_UNITS = "rum_units";
  private JsonNullable<Long> rumUnits = JsonNullable.<Long>undefined();

  public UsageRumUnitsHour browserRumLiteSessionCount(Long browserRumLiteSessionCount) {
    this.browserRumLiteSessionCount = browserRumLiteSessionCount;
    return this;
  }

  /**
   * Number of browser RUM lite sessions.
   *
   * @return browserRumLiteSessionCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of browser RUM lite sessions.")
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_LITE_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumLiteSessionCount() {
    return browserRumLiteSessionCount;
  }

  public void setBrowserRumLiteSessionCount(Long browserRumLiteSessionCount) {
    this.browserRumLiteSessionCount = browserRumLiteSessionCount;
  }

  public UsageRumUnitsHour browserRumReplaySessionCount(Long browserRumReplaySessionCount) {
    this.browserRumReplaySessionCount = browserRumReplaySessionCount;
    return this;
  }

  /**
   * Number of browser RUM replay sessions.
   *
   * @return browserRumReplaySessionCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of browser RUM replay sessions.")
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_REPLAY_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumReplaySessionCount() {
    return browserRumReplaySessionCount;
  }

  public void setBrowserRumReplaySessionCount(Long browserRumReplaySessionCount) {
    this.browserRumReplaySessionCount = browserRumReplaySessionCount;
  }

  public UsageRumUnitsHour browserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = browserRumUnits;
    return this;
  }

  /**
   * The number of browser RUM units.
   *
   * @return browserRumUnits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of browser RUM units.")
  @JsonProperty(JSON_PROPERTY_BROWSER_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBrowserRumUnits() {
    return browserRumUnits;
  }

  public void setBrowserRumUnits(Long browserRumUnits) {
    this.browserRumUnits = browserRumUnits;
  }

  public UsageRumUnitsHour mobileRumLiteSessionCount(Long mobileRumLiteSessionCount) {
    this.mobileRumLiteSessionCount = mobileRumLiteSessionCount;
    return this;
  }

  /**
   * Number of mobile RUM lite sessions.
   *
   * @return mobileRumLiteSessionCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of mobile RUM lite sessions.")
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_LITE_SESSION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumLiteSessionCount() {
    return mobileRumLiteSessionCount;
  }

  public void setMobileRumLiteSessionCount(Long mobileRumLiteSessionCount) {
    this.mobileRumLiteSessionCount = mobileRumLiteSessionCount;
  }

  public UsageRumUnitsHour mobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = mobileRumUnits;
    return this;
  }

  /**
   * The number of mobile RUM units.
   *
   * @return mobileRumUnits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of mobile RUM units.")
  @JsonProperty(JSON_PROPERTY_MOBILE_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMobileRumUnits() {
    return mobileRumUnits;
  }

  public void setMobileRumUnits(Long mobileRumUnits) {
    this.mobileRumUnits = mobileRumUnits;
  }

  public UsageRumUnitsHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization name.")
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageRumUnitsHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization public ID.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public UsageRumUnitsHour rumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
    return this;
  }

  /**
   * Total RUM units across mobile and browser RUM.
   *
   * @return rumUnits
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total RUM units across mobile and browser RUM.")
  @JsonIgnore
  public Long getRumUnits() {
    return rumUnits.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getRumUnits_JsonNullable() {
    return rumUnits;
  }

  @JsonProperty(JSON_PROPERTY_RUM_UNITS)
  public void setRumUnits_JsonNullable(JsonNullable<Long> rumUnits) {
    this.rumUnits = rumUnits;
  }

  public void setRumUnits(Long rumUnits) {
    this.rumUnits = JsonNullable.<Long>of(rumUnits);
  }

  /** Return true if this UsageRumUnitsHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageRumUnitsHour usageRumUnitsHour = (UsageRumUnitsHour) o;
    return Objects.equals(
            this.browserRumLiteSessionCount, usageRumUnitsHour.browserRumLiteSessionCount)
        && Objects.equals(
            this.browserRumReplaySessionCount, usageRumUnitsHour.browserRumReplaySessionCount)
        && Objects.equals(this.browserRumUnits, usageRumUnitsHour.browserRumUnits)
        && Objects.equals(
            this.mobileRumLiteSessionCount, usageRumUnitsHour.mobileRumLiteSessionCount)
        && Objects.equals(this.mobileRumUnits, usageRumUnitsHour.mobileRumUnits)
        && Objects.equals(this.orgName, usageRumUnitsHour.orgName)
        && Objects.equals(this.publicId, usageRumUnitsHour.publicId)
        && Objects.equals(this.rumUnits, usageRumUnitsHour.rumUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        browserRumLiteSessionCount,
        browserRumReplaySessionCount,
        browserRumUnits,
        mobileRumLiteSessionCount,
        mobileRumUnits,
        orgName,
        publicId,
        rumUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageRumUnitsHour {\n");
    sb.append("    browserRumLiteSessionCount: ")
        .append(toIndentedString(browserRumLiteSessionCount))
        .append("\n");
    sb.append("    browserRumReplaySessionCount: ")
        .append(toIndentedString(browserRumReplaySessionCount))
        .append("\n");
    sb.append("    browserRumUnits: ").append(toIndentedString(browserRumUnits)).append("\n");
    sb.append("    mobileRumLiteSessionCount: ")
        .append(toIndentedString(mobileRumLiteSessionCount))
        .append("\n");
    sb.append("    mobileRumUnits: ").append(toIndentedString(mobileRumUnits)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    rumUnits: ").append(toIndentedString(rumUnits)).append("\n");
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