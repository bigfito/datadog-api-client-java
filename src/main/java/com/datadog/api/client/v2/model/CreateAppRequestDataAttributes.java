/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>CreateAppRequestDataAttributes</code> object. */
@JsonPropertyOrder({
  CreateAppRequestDataAttributes.JSON_PROPERTY_COMPONENTS,
  CreateAppRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateAppRequestDataAttributes.JSON_PROPERTY_EMBEDDED_QUERIES,
  CreateAppRequestDataAttributes.JSON_PROPERTY_INPUT_SCHEMA,
  CreateAppRequestDataAttributes.JSON_PROPERTY_NAME,
  CreateAppRequestDataAttributes.JSON_PROPERTY_ROOT_INSTANCE_NAME,
  CreateAppRequestDataAttributes.JSON_PROPERTY_SCRIPTS,
  CreateAppRequestDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateAppRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<ComponentGrid> components = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EMBEDDED_QUERIES = "embeddedQueries";
  private List<Query> embeddedQueries = null;

  public static final String JSON_PROPERTY_INPUT_SCHEMA = "inputSchema";
  private InputSchema inputSchema;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROOT_INSTANCE_NAME = "rootInstanceName";
  private String rootInstanceName;

  public static final String JSON_PROPERTY_SCRIPTS = "scripts";
  private List<Script> scripts = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public CreateAppRequestDataAttributes components(List<ComponentGrid> components) {
    this.components = components;
    for (ComponentGrid item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateAppRequestDataAttributes addComponentsItem(ComponentGrid componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * The <code>attributes</code> <code>components</code>.
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ComponentGrid> getComponents() {
    return components;
  }

  public void setComponents(List<ComponentGrid> components) {
    this.components = components;
  }

  public CreateAppRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The <code>attributes</code> <code>description</code>.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateAppRequestDataAttributes embeddedQueries(List<Query> embeddedQueries) {
    this.embeddedQueries = embeddedQueries;
    for (Query item : embeddedQueries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateAppRequestDataAttributes addEmbeddedQueriesItem(Query embeddedQueriesItem) {
    if (this.embeddedQueries == null) {
      this.embeddedQueries = new ArrayList<>();
    }
    this.embeddedQueries.add(embeddedQueriesItem);
    this.unparsed |= embeddedQueriesItem.unparsed;
    return this;
  }

  /**
   * The <code>attributes</code> <code>embeddedQueries</code>.
   *
   * @return embeddedQueries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Query> getEmbeddedQueries() {
    return embeddedQueries;
  }

  public void setEmbeddedQueries(List<Query> embeddedQueries) {
    this.embeddedQueries = embeddedQueries;
  }

  public CreateAppRequestDataAttributes inputSchema(InputSchema inputSchema) {
    this.inputSchema = inputSchema;
    this.unparsed |= inputSchema.unparsed;
    return this;
  }

  /**
   * The definition of <code>InputSchema</code> object.
   *
   * @return inputSchema
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public InputSchema getInputSchema() {
    return inputSchema;
  }

  public void setInputSchema(InputSchema inputSchema) {
    this.inputSchema = inputSchema;
  }

  public CreateAppRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>attributes</code> <code>name</code>.
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

  public CreateAppRequestDataAttributes rootInstanceName(String rootInstanceName) {
    this.rootInstanceName = rootInstanceName;
    return this;
  }

  /**
   * The <code>attributes</code> <code>rootInstanceName</code>.
   *
   * @return rootInstanceName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROOT_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRootInstanceName() {
    return rootInstanceName;
  }

  public void setRootInstanceName(String rootInstanceName) {
    this.rootInstanceName = rootInstanceName;
  }

  public CreateAppRequestDataAttributes scripts(List<Script> scripts) {
    this.scripts = scripts;
    for (Script item : scripts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateAppRequestDataAttributes addScriptsItem(Script scriptsItem) {
    if (this.scripts == null) {
      this.scripts = new ArrayList<>();
    }
    this.scripts.add(scriptsItem);
    this.unparsed |= scriptsItem.unparsed;
    return this;
  }

  /**
   * The <code>attributes</code> <code>scripts</code>.
   *
   * @return scripts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Script> getScripts() {
    return scripts;
  }

  public void setScripts(List<Script> scripts) {
    this.scripts = scripts;
  }

  public CreateAppRequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateAppRequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The <code>attributes</code> <code>tags</code>.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CreateAppRequestDataAttributes
   */
  @JsonAnySetter
  public CreateAppRequestDataAttributes putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this CreateAppRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppRequestDataAttributes createAppRequestDataAttributes =
        (CreateAppRequestDataAttributes) o;
    return Objects.equals(this.components, createAppRequestDataAttributes.components)
        && Objects.equals(this.description, createAppRequestDataAttributes.description)
        && Objects.equals(this.embeddedQueries, createAppRequestDataAttributes.embeddedQueries)
        && Objects.equals(this.inputSchema, createAppRequestDataAttributes.inputSchema)
        && Objects.equals(this.name, createAppRequestDataAttributes.name)
        && Objects.equals(this.rootInstanceName, createAppRequestDataAttributes.rootInstanceName)
        && Objects.equals(this.scripts, createAppRequestDataAttributes.scripts)
        && Objects.equals(this.tags, createAppRequestDataAttributes.tags)
        && Objects.equals(
            this.additionalProperties, createAppRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        components,
        description,
        embeddedQueries,
        inputSchema,
        name,
        rootInstanceName,
        scripts,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppRequestDataAttributes {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    embeddedQueries: ").append(toIndentedString(embeddedQueries)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootInstanceName: ").append(toIndentedString(rootInstanceName)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
