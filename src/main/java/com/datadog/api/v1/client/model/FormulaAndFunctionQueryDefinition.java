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
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionProcessQueryDataSource;
import com.datadog.api.v1.client.model.QuerySortOrder;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionEventQueryDefinitionGroupBy;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.v1.client.model.TimeSeriesFormulaAndFunctionProcessQueryDefinition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.datadog.api.v1.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = FormulaAndFunctionQueryDefinition.FormulaAndFunctionQueryDefinitionDeserializer.class)
@JsonSerialize(using = FormulaAndFunctionQueryDefinition.FormulaAndFunctionQueryDefinitionSerializer.class)
public class FormulaAndFunctionQueryDefinition extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FormulaAndFunctionQueryDefinition.class.getName());

    public static class FormulaAndFunctionQueryDefinitionSerializer extends StdSerializer<FormulaAndFunctionQueryDefinition> {
        public FormulaAndFunctionQueryDefinitionSerializer(Class<FormulaAndFunctionQueryDefinition> t) {
            super(t);
        }

        public FormulaAndFunctionQueryDefinitionSerializer() {
            this(null);
        }

        @Override
        public void serialize(FormulaAndFunctionQueryDefinition value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class FormulaAndFunctionQueryDefinitionDeserializer extends StdDeserializer<FormulaAndFunctionQueryDefinition> {
        public FormulaAndFunctionQueryDefinitionDeserializer() {
            this(FormulaAndFunctionQueryDefinition.class);
        }

        public FormulaAndFunctionQueryDefinitionDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public FormulaAndFunctionQueryDefinition deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TimeSeriesFormulaAndFunctionEventQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Long.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Double.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesFormulaAndFunctionEventQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesFormulaAndFunctionEventQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesFormulaAndFunctionEventQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesFormulaAndFunctionEventQueryDefinition'", e);
            }

            // deserialize TimeSeriesFormulaAndFunctionMetricQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Long.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Double.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesFormulaAndFunctionMetricQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesFormulaAndFunctionMetricQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesFormulaAndFunctionMetricQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesFormulaAndFunctionMetricQueryDefinition'", e);
            }

            // deserialize TimeSeriesFormulaAndFunctionProcessQueryDefinition
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Long.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Double.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Boolean.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Integer.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Float.class) || TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesFormulaAndFunctionProcessQueryDefinition.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesFormulaAndFunctionProcessQueryDefinition.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesFormulaAndFunctionProcessQueryDefinition'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesFormulaAndFunctionProcessQueryDefinition'", e);
            }

            if (match == 1) {
                FormulaAndFunctionQueryDefinition ret = new FormulaAndFunctionQueryDefinition();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for FormulaAndFunctionQueryDefinition: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public FormulaAndFunctionQueryDefinition getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "FormulaAndFunctionQueryDefinition cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FormulaAndFunctionQueryDefinition() {
        super("oneOf", Boolean.FALSE);
    }

    public FormulaAndFunctionQueryDefinition(TimeSeriesFormulaAndFunctionEventQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FormulaAndFunctionQueryDefinition(TimeSeriesFormulaAndFunctionMetricQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FormulaAndFunctionQueryDefinition(TimeSeriesFormulaAndFunctionProcessQueryDefinition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TimeSeriesFormulaAndFunctionEventQueryDefinition", new GenericType<TimeSeriesFormulaAndFunctionEventQueryDefinition>() {
        });
        schemas.put("TimeSeriesFormulaAndFunctionMetricQueryDefinition", new GenericType<TimeSeriesFormulaAndFunctionMetricQueryDefinition>() {
        });
        schemas.put("TimeSeriesFormulaAndFunctionProcessQueryDefinition", new GenericType<TimeSeriesFormulaAndFunctionProcessQueryDefinition>() {
        });
        JSON.registerDescendants(FormulaAndFunctionQueryDefinition.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FormulaAndFunctionQueryDefinition.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TimeSeriesFormulaAndFunctionEventQueryDefinition, TimeSeriesFormulaAndFunctionMetricQueryDefinition, TimeSeriesFormulaAndFunctionProcessQueryDefinition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TimeSeriesFormulaAndFunctionEventQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TimeSeriesFormulaAndFunctionMetricQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TimeSeriesFormulaAndFunctionProcessQueryDefinition.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TimeSeriesFormulaAndFunctionEventQueryDefinition, TimeSeriesFormulaAndFunctionMetricQueryDefinition, TimeSeriesFormulaAndFunctionProcessQueryDefinition");
    }

    /**
     * Get the actual instance, which can be the following:
     * TimeSeriesFormulaAndFunctionEventQueryDefinition, TimeSeriesFormulaAndFunctionMetricQueryDefinition, TimeSeriesFormulaAndFunctionProcessQueryDefinition
     *
     * @return The actual instance (TimeSeriesFormulaAndFunctionEventQueryDefinition, TimeSeriesFormulaAndFunctionMetricQueryDefinition, TimeSeriesFormulaAndFunctionProcessQueryDefinition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesFormulaAndFunctionEventQueryDefinition`. If the actual instanct is not `TimeSeriesFormulaAndFunctionEventQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesFormulaAndFunctionEventQueryDefinition`
     * @throws ClassCastException if the instance is not `TimeSeriesFormulaAndFunctionEventQueryDefinition`
     */
    public TimeSeriesFormulaAndFunctionEventQueryDefinition getTimeSeriesFormulaAndFunctionEventQueryDefinition() throws ClassCastException {
        return (TimeSeriesFormulaAndFunctionEventQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesFormulaAndFunctionMetricQueryDefinition`. If the actual instanct is not `TimeSeriesFormulaAndFunctionMetricQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesFormulaAndFunctionMetricQueryDefinition`
     * @throws ClassCastException if the instance is not `TimeSeriesFormulaAndFunctionMetricQueryDefinition`
     */
    public TimeSeriesFormulaAndFunctionMetricQueryDefinition getTimeSeriesFormulaAndFunctionMetricQueryDefinition() throws ClassCastException {
        return (TimeSeriesFormulaAndFunctionMetricQueryDefinition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesFormulaAndFunctionProcessQueryDefinition`. If the actual instanct is not `TimeSeriesFormulaAndFunctionProcessQueryDefinition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesFormulaAndFunctionProcessQueryDefinition`
     * @throws ClassCastException if the instance is not `TimeSeriesFormulaAndFunctionProcessQueryDefinition`
     */
    public TimeSeriesFormulaAndFunctionProcessQueryDefinition getTimeSeriesFormulaAndFunctionProcessQueryDefinition() throws ClassCastException {
        return (TimeSeriesFormulaAndFunctionProcessQueryDefinition)super.getActualInstance();
    }

}
