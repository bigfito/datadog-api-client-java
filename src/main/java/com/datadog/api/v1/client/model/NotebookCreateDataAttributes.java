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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The data attributes of a notebook. */
@ApiModel(description = "The data attributes of a notebook.")
@JsonPropertyOrder({
  NotebookCreateDataAttributes.JSON_PROPERTY_CELLS,
  NotebookCreateDataAttributes.JSON_PROPERTY_NAME,
  NotebookCreateDataAttributes.JSON_PROPERTY_STATUS,
  NotebookCreateDataAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotebookCreateDataAttributes {
  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<NotebookCellCreateRequest> cells = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NotebookStatus status = NotebookStatus.PUBLISHED;

  public static final String JSON_PROPERTY_TIME = "time";
  private NotebookGlobalTime time;

  public NotebookCreateDataAttributes() {}

  @JsonCreator
  public NotebookCreateDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELLS)
          List<NotebookCellCreateRequest> cells,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME) NotebookGlobalTime time) {
    this.cells = cells;
    this.name = name;
    this.time = time;
  }

  public NotebookCreateDataAttributes cells(List<NotebookCellCreateRequest> cells) {
    this.cells = cells;
    return this;
  }

  public NotebookCreateDataAttributes addCellsItem(NotebookCellCreateRequest cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * List of cells to display in the notebook.
   *
   * @return cells
   */
  @ApiModelProperty(
      example =
          "[{\"attributes\":{\"definition\":{\"text\":\"## Some test markdown\\n"
              + "\\n"
              + "```js\\n"
              + "var x, y;\\n"
              + "x = 5;\\n"
              + "y = 6;\\n"
              + "```\",\"type\":\"markdown\"}},\"type\":\"notebook_cells\"},{\"attributes\":{\"definition\":{\"requests\":[{\"display_type\":\"line\",\"q\":\"avg:system.load.1{*}\",\"style\":{\"line_type\":\"solid\",\"line_width\":\"normal\",\"palette\":\"dog_classic\"}}],\"show_legend\":true,\"type\":\"timeseries\",\"yaxis\":{\"scale\":\"linear\"}},\"graph_size\":\"m\",\"split_by\":{\"keys\":[],\"tags\":[]},\"time\":null},\"type\":\"notebook_cells\"}]",
      required = true,
      value = "List of cells to display in the notebook.")
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<NotebookCellCreateRequest> getCells() {
    return cells;
  }

  public void setCells(List<NotebookCellCreateRequest> cells) {
    this.cells = cells;
  }

  public NotebookCreateDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Notebook name.
   *
   * @return name
   */
  @ApiModelProperty(example = "Example Notebook", required = true, value = "Notebook name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotebookCreateDataAttributes status(NotebookStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookStatus getStatus() {
    return status;
  }

  public void setStatus(NotebookStatus status) {
    this.status = status;
  }

  public NotebookCreateDataAttributes time(NotebookGlobalTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookGlobalTime getTime() {
    return time;
  }

  public void setTime(NotebookGlobalTime time) {
    this.time = time;
  }

  /** Return true if this NotebookCreateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookCreateDataAttributes notebookCreateDataAttributes = (NotebookCreateDataAttributes) o;
    return Objects.equals(this.cells, notebookCreateDataAttributes.cells)
        && Objects.equals(this.name, notebookCreateDataAttributes.name)
        && Objects.equals(this.status, notebookCreateDataAttributes.status)
        && Objects.equals(this.time, notebookCreateDataAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, name, status, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookCreateDataAttributes {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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