/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = LogsArchiveDestination.LogsArchiveDestinationDeserializer.class)
@JsonSerialize(using = LogsArchiveDestination.LogsArchiveDestinationSerializer.class)
public class LogsArchiveDestination extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(LogsArchiveDestination.class.getName());

  public static class LogsArchiveDestinationSerializer
      extends StdSerializer<LogsArchiveDestination> {
    public LogsArchiveDestinationSerializer(Class<LogsArchiveDestination> t) {
      super(t);
    }

    public LogsArchiveDestinationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsArchiveDestination value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class LogsArchiveDestinationDeserializer
      extends StdDeserializer<LogsArchiveDestination> {
    public LogsArchiveDestinationDeserializer() {
      this(LogsArchiveDestination.class);
    }

    public LogsArchiveDestinationDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public LogsArchiveDestination deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize LogsArchiveDestinationAzure
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArchiveDestinationAzure.class.equals(Integer.class)
            || LogsArchiveDestinationAzure.class.equals(Long.class)
            || LogsArchiveDestinationAzure.class.equals(Float.class)
            || LogsArchiveDestinationAzure.class.equals(Double.class)
            || LogsArchiveDestinationAzure.class.equals(Boolean.class)
            || LogsArchiveDestinationAzure.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArchiveDestinationAzure.class.equals(Integer.class)
                        || LogsArchiveDestinationAzure.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArchiveDestinationAzure.class.equals(Float.class)
                        || LogsArchiveDestinationAzure.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArchiveDestinationAzure.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArchiveDestinationAzure.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
            attemptParsing |= (token == JsonToken.VALUE_NULL);
          }
        }
        if (attemptParsing) {
          deserialized =
              tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationAzure.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          match++;
          log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationAzure'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationAzure'", e);
      }

      // deserialize LogsArchiveDestinationGCS
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArchiveDestinationGCS.class.equals(Integer.class)
            || LogsArchiveDestinationGCS.class.equals(Long.class)
            || LogsArchiveDestinationGCS.class.equals(Float.class)
            || LogsArchiveDestinationGCS.class.equals(Double.class)
            || LogsArchiveDestinationGCS.class.equals(Boolean.class)
            || LogsArchiveDestinationGCS.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArchiveDestinationGCS.class.equals(Integer.class)
                        || LogsArchiveDestinationGCS.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArchiveDestinationGCS.class.equals(Float.class)
                        || LogsArchiveDestinationGCS.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArchiveDestinationGCS.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArchiveDestinationGCS.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
            attemptParsing |= (token == JsonToken.VALUE_NULL);
          }
        }
        if (attemptParsing) {
          deserialized = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationGCS.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          match++;
          log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationGCS'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationGCS'", e);
      }

      // deserialize LogsArchiveDestinationS3
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (LogsArchiveDestinationS3.class.equals(Integer.class)
            || LogsArchiveDestinationS3.class.equals(Long.class)
            || LogsArchiveDestinationS3.class.equals(Float.class)
            || LogsArchiveDestinationS3.class.equals(Double.class)
            || LogsArchiveDestinationS3.class.equals(Boolean.class)
            || LogsArchiveDestinationS3.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((LogsArchiveDestinationS3.class.equals(Integer.class)
                        || LogsArchiveDestinationS3.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((LogsArchiveDestinationS3.class.equals(Float.class)
                        || LogsArchiveDestinationS3.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (LogsArchiveDestinationS3.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (LogsArchiveDestinationS3.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
            attemptParsing |= (token == JsonToken.VALUE_NULL);
          }
        }
        if (attemptParsing) {
          deserialized = tree.traverse(jp.getCodec()).readValueAs(LogsArchiveDestinationS3.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          match++;
          log.log(Level.FINER, "Input data matches schema 'LogsArchiveDestinationS3'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'LogsArchiveDestinationS3'", e);
      }

      if (match == 1) {
        LogsArchiveDestination ret = new LogsArchiveDestination();
        ret.setActualInstance(deserialized);
        return ret;
      }
      throw new IOException(
          String.format(
              "Failed deserialization for LogsArchiveDestination: %d classes match result,"
                  + " expected 1",
              match));
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public LogsArchiveDestination getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      return null;
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public LogsArchiveDestination() {
    super("oneOf", Boolean.TRUE);
  }

  public LogsArchiveDestination(LogsArchiveDestinationAzure o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  public LogsArchiveDestination(LogsArchiveDestinationGCS o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  public LogsArchiveDestination(LogsArchiveDestinationS3 o) {
    super("oneOf", Boolean.TRUE);
    setActualInstance(o);
  }

  static {
    schemas.put("LogsArchiveDestinationAzure", new GenericType<LogsArchiveDestinationAzure>() {});
    schemas.put("LogsArchiveDestinationGCS", new GenericType<LogsArchiveDestinationGCS>() {});
    schemas.put("LogsArchiveDestinationS3", new GenericType<LogsArchiveDestinationS3>() {});
    JSON.registerDescendants(LogsArchiveDestination.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return LogsArchiveDestination.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: LogsArchiveDestinationAzure, LogsArchiveDestinationGCS,
   * LogsArchiveDestinationS3
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance == null) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(LogsArchiveDestinationAzure.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(LogsArchiveDestinationGCS.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(LogsArchiveDestinationS3.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException(
        "Invalid instance type. Must be LogsArchiveDestinationAzure, LogsArchiveDestinationGCS,"
            + " LogsArchiveDestinationS3");
  }

  /**
   * Get the actual instance, which can be the following: LogsArchiveDestinationAzure,
   * LogsArchiveDestinationGCS, LogsArchiveDestinationS3
   *
   * @return The actual instance (LogsArchiveDestinationAzure, LogsArchiveDestinationGCS,
   *     LogsArchiveDestinationS3)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArchiveDestinationAzure`. If the actual instanct is not
   * `LogsArchiveDestinationAzure`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArchiveDestinationAzure`
   * @throws ClassCastException if the instance is not `LogsArchiveDestinationAzure`
   */
  public LogsArchiveDestinationAzure getLogsArchiveDestinationAzure() throws ClassCastException {
    return (LogsArchiveDestinationAzure) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArchiveDestinationGCS`. If the actual instanct is not
   * `LogsArchiveDestinationGCS`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArchiveDestinationGCS`
   * @throws ClassCastException if the instance is not `LogsArchiveDestinationGCS`
   */
  public LogsArchiveDestinationGCS getLogsArchiveDestinationGCS() throws ClassCastException {
    return (LogsArchiveDestinationGCS) super.getActualInstance();
  }

  /**
   * Get the actual instance of `LogsArchiveDestinationS3`. If the actual instanct is not
   * `LogsArchiveDestinationS3`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `LogsArchiveDestinationS3`
   * @throws ClassCastException if the instance is not `LogsArchiveDestinationS3`
   */
  public LogsArchiveDestinationS3 getLogsArchiveDestinationS3() throws ClassCastException {
    return (LogsArchiveDestinationS3) super.getActualInstance();
  }
}
