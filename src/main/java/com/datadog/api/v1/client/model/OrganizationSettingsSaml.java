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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Set the boolean property enabled to enable or disable single sign on with SAML. See the SAML documentation for more information about all SAML settings.
 */
@ApiModel(description = "Set the boolean property enabled to enable or disable single sign on with SAML. See the SAML documentation for more information about all SAML settings.")
@JsonPropertyOrder({
  OrganizationSettingsSaml.JSON_PROPERTY_ENABLED
})

public class OrganizationSettingsSaml {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;


  public OrganizationSettingsSaml enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * TODO.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSettingsSaml organizationSettingsSaml = (OrganizationSettingsSaml) o;
    return Objects.equals(this.enabled, organizationSettingsSaml.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSettingsSaml {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

