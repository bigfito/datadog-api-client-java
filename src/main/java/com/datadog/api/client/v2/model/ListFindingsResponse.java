/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The expected response schema when listing findings. */
@JsonPropertyOrder({
  ListFindingsResponse.JSON_PROPERTY_DATA,
  ListFindingsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListFindingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<Finding> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private ListFindingsMeta meta = new ListFindingsMeta();

  public ListFindingsResponse() {}

  @JsonCreator
  public ListFindingsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<Finding> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) ListFindingsMeta meta) {
    this.data = data;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public ListFindingsResponse data(List<Finding> data) {
    this.data = data;
    for (Finding item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListFindingsResponse addDataItem(Finding dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of findings.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Finding> getData() {
    return data;
  }

  public void setData(List<Finding> data) {
    this.data = data;
  }

  public ListFindingsResponse meta(ListFindingsMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for pagination.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ListFindingsMeta getMeta() {
    return meta;
  }

  public void setMeta(ListFindingsMeta meta) {
    this.meta = meta;
  }

  /** Return true if this ListFindingsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFindingsResponse listFindingsResponse = (ListFindingsResponse) o;
    return Objects.equals(this.data, listFindingsResponse.data)
        && Objects.equals(this.meta, listFindingsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFindingsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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