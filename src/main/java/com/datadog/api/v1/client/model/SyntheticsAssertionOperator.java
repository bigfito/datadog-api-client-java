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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TODO.
 */
public enum SyntheticsAssertionOperator {
  
  CONTAINS("contains"),
  
  DOES_NOT_CONTAIN("doesNotContain"),
  
  IS("is"),
  
  IS_NOT("isNot"),
  
  LESS_THAN("lessThan"),
  
  MATCHES("matches"),
  
  DOES_NOT_MATCH("doesNotMatch"),
  
  VALIDATES("validates"),
  
  IS_IN_MORE_DAYS_THAN("isInMoreThan");

  private String value;

  SyntheticsAssertionOperator(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsAssertionOperator fromValue(String value) {
    for (SyntheticsAssertionOperator b : SyntheticsAssertionOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

