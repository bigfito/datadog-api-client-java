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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The proxy to perform the test. */
@JsonPropertyOrder({
  SyntheticsTestRequestProxy.JSON_PROPERTY_HEADERS,
  SyntheticsTestRequestProxy.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRequestProxy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = null;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestRequestProxy() {}

  @JsonCreator
  public SyntheticsTestRequestProxy(
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.url = url;
  }

  public SyntheticsTestRequestProxy headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public SyntheticsTestRequestProxy putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Headers to include when performing the test.
   *
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public SyntheticsTestRequestProxy url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the proxy to perform the test.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this SyntheticsTestRequestProxy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequestProxy syntheticsTestRequestProxy = (SyntheticsTestRequestProxy) o;
    return Objects.equals(this.headers, syntheticsTestRequestProxy.headers)
        && Objects.equals(this.url, syntheticsTestRequestProxy.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequestProxy {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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