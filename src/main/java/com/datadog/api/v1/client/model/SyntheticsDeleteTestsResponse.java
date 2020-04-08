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
import com.datadog.api.v1.client.model.SyntheticsDeleteTestsResponseDeletedTests;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  SyntheticsDeleteTestsResponse.JSON_PROPERTY_DELETED_TESTS
})

public class SyntheticsDeleteTestsResponse {
  public static final String JSON_PROPERTY_DELETED_TESTS = "deleted_tests";
  private List<SyntheticsDeleteTestsResponseDeletedTests> deletedTests = null;


  public SyntheticsDeleteTestsResponse deletedTests(List<SyntheticsDeleteTestsResponseDeletedTests> deletedTests) {
    
    this.deletedTests = deletedTests;
    return this;
  }

  public SyntheticsDeleteTestsResponse addDeletedTestsItem(SyntheticsDeleteTestsResponseDeletedTests deletedTestsItem) {
    if (this.deletedTests == null) {
      this.deletedTests = new ArrayList<>();
    }
    this.deletedTests.add(deletedTestsItem);
    return this;
  }

   /**
   * TODO.
   * @return deletedTests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_DELETED_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsDeleteTestsResponseDeletedTests> getDeletedTests() {
    return deletedTests;
  }


  public void setDeletedTests(List<SyntheticsDeleteTestsResponseDeletedTests> deletedTests) {
    this.deletedTests = deletedTests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeleteTestsResponse syntheticsDeleteTestsResponse = (SyntheticsDeleteTestsResponse) o;
    return Objects.equals(this.deletedTests, syntheticsDeleteTestsResponse.deletedTests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedTests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeleteTestsResponse {\n");
    sb.append("    deletedTests: ").append(toIndentedString(deletedTests)).append("\n");
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

