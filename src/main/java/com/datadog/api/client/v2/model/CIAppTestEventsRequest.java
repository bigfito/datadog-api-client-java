/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The request for a tests search. */
@JsonPropertyOrder({
  CIAppTestEventsRequest.JSON_PROPERTY_FILTER,
  CIAppTestEventsRequest.JSON_PROPERTY_OPTIONS,
  CIAppTestEventsRequest.JSON_PROPERTY_PAGE,
  CIAppTestEventsRequest.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestEventsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private CIAppTestsQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private CIAppQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private CIAppQueryPageOptions page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private CIAppSort sort;

  public CIAppTestEventsRequest filter(CIAppTestsQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The search and filter query settings.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppTestsQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(CIAppTestsQueryFilter filter) {
    this.filter = filter;
  }

  public CIAppTestEventsRequest options(CIAppQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Global query options that are used during the query. Only supply timezone or time offset, not
   * both. Otherwise, the query fails.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppQueryOptions getOptions() {
    return options;
  }

  public void setOptions(CIAppQueryOptions options) {
    this.options = options;
  }

  public CIAppTestEventsRequest page(CIAppQueryPageOptions page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes for listing events.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppQueryPageOptions getPage() {
    return page;
  }

  public void setPage(CIAppQueryPageOptions page) {
    this.page = page;
  }

  public CIAppTestEventsRequest sort(CIAppSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * Sort parameters when querying events.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppSort getSort() {
    return sort;
  }

  public void setSort(CIAppSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
  }

  /** Return true if this CIAppTestEventsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestEventsRequest ciAppTestEventsRequest = (CIAppTestEventsRequest) o;
    return Objects.equals(this.filter, ciAppTestEventsRequest.filter)
        && Objects.equals(this.options, ciAppTestEventsRequest.options)
        && Objects.equals(this.page, ciAppTestEventsRequest.page)
        && Objects.equals(this.sort, ciAppTestEventsRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestEventsRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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