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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequestAttributes;
import com.datadog.api.v1.client.model.SLOCorrectionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The data object associated with the SLO correction to be created
 */
@ApiModel(description = "The data object associated with the SLO correction to be created")
@JsonPropertyOrder({
  SLOCorrectionCreateData.JSON_PROPERTY_ATTRIBUTES,
  SLOCorrectionCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOCorrectionCreateData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SLOCorrectionCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOCorrectionType type = SLOCorrectionType.CORRECTION;


  public SLOCorrectionCreateData attributes(SLOCorrectionCreateRequestAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOCorrectionCreateRequestAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(SLOCorrectionCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }


  public SLOCorrectionCreateData type(SLOCorrectionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOCorrectionType getType() {
    return type;
  }


  public void setType(SLOCorrectionType type) {
    this.type = type;
  }


  /**
   * Return true if this SLOCorrectionCreateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionCreateData slOCorrectionCreateData = (SLOCorrectionCreateData) o;
    return Objects.equals(this.attributes, slOCorrectionCreateData.attributes) &&
        Objects.equals(this.type, slOCorrectionCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

