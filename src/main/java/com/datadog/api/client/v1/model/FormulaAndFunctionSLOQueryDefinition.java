/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A formula and functions metrics query. */
@JsonPropertyOrder({
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_DATA_SOURCE,
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_GROUP_MODE,
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_MEASURE,
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_NAME,
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_SLO_ID,
  FormulaAndFunctionSLOQueryDefinition.JSON_PROPERTY_SLO_QUERY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionSLOQueryDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaAndFunctionSLODataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_MODE = "group_mode";
  private FormulaAndFunctionSLOGroupMode groupMode;

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private FormulaAndFunctionSLOMeasure measure;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_SLO_QUERY_TYPE = "slo_query_type";
  private FormulaAndFunctionSLOQueryType sloQueryType;

  public FormulaAndFunctionSLOQueryDefinition() {}

  @JsonCreator
  public FormulaAndFunctionSLOQueryDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaAndFunctionSLODataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE)
          FormulaAndFunctionSLOMeasure measure,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLO_ID) String sloId) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.measure = measure;
    this.unparsed |= !measure.isValid();
    this.sloId = sloId;
  }

  public FormulaAndFunctionSLOQueryDefinition dataSource(
      FormulaAndFunctionSLODataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for SLO measures queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionSLODataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaAndFunctionSLODataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaAndFunctionSLOQueryDefinition groupMode(FormulaAndFunctionSLOGroupMode groupMode) {
    this.groupMode = groupMode;
    this.unparsed |= !groupMode.isValid();
    return this;
  }

  /**
   * Group mode to query measures.
   *
   * @return groupMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionSLOGroupMode getGroupMode() {
    return groupMode;
  }

  public void setGroupMode(FormulaAndFunctionSLOGroupMode groupMode) {
    if (!groupMode.isValid()) {
      this.unparsed = true;
    }
    this.groupMode = groupMode;
  }

  public FormulaAndFunctionSLOQueryDefinition measure(FormulaAndFunctionSLOMeasure measure) {
    this.measure = measure;
    this.unparsed |= !measure.isValid();
    return this;
  }

  /**
   * SLO measures queries.
   *
   * @return measure
   */
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormulaAndFunctionSLOMeasure getMeasure() {
    return measure;
  }

  public void setMeasure(FormulaAndFunctionSLOMeasure measure) {
    if (!measure.isValid()) {
      this.unparsed = true;
    }
    this.measure = measure;
  }

  public FormulaAndFunctionSLOQueryDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the query for use in formulas.
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

  public FormulaAndFunctionSLOQueryDefinition sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * ID of an SLO to query measures.
   *
   * @return sloId
   */
  @JsonProperty(JSON_PROPERTY_SLO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSloId() {
    return sloId;
  }

  public void setSloId(String sloId) {
    this.sloId = sloId;
  }

  public FormulaAndFunctionSLOQueryDefinition sloQueryType(
      FormulaAndFunctionSLOQueryType sloQueryType) {
    this.sloQueryType = sloQueryType;
    this.unparsed |= !sloQueryType.isValid();
    return this;
  }

  /**
   * Name of the query for use in formulas.
   *
   * @return sloQueryType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_QUERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionSLOQueryType getSloQueryType() {
    return sloQueryType;
  }

  public void setSloQueryType(FormulaAndFunctionSLOQueryType sloQueryType) {
    if (!sloQueryType.isValid()) {
      this.unparsed = true;
    }
    this.sloQueryType = sloQueryType;
  }

  /** Return true if this FormulaAndFunctionSLOQueryDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionSLOQueryDefinition formulaAndFunctionSloQueryDefinition =
        (FormulaAndFunctionSLOQueryDefinition) o;
    return Objects.equals(this.dataSource, formulaAndFunctionSloQueryDefinition.dataSource)
        && Objects.equals(this.groupMode, formulaAndFunctionSloQueryDefinition.groupMode)
        && Objects.equals(this.measure, formulaAndFunctionSloQueryDefinition.measure)
        && Objects.equals(this.name, formulaAndFunctionSloQueryDefinition.name)
        && Objects.equals(this.sloId, formulaAndFunctionSloQueryDefinition.sloId)
        && Objects.equals(this.sloQueryType, formulaAndFunctionSloQueryDefinition.sloQueryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, groupMode, measure, name, sloId, sloQueryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionSLOQueryDefinition {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupMode: ").append(toIndentedString(groupMode)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    sloQueryType: ").append(toIndentedString(sloQueryType)).append("\n");
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