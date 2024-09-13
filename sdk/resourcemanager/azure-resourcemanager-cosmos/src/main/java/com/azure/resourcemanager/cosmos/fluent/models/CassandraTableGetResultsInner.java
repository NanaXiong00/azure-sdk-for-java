// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.CassandraTableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.CassandraTableGetPropertiesResource;
import java.io.IOException;
import java.util.Map;

/**
 * An Azure Cosmos DB Cassandra table.
 */
@Fluent
public final class CassandraTableGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB Cassandra table
     */
    private CassandraTableGetProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of CassandraTableGetResultsInner class.
     */
    public CassandraTableGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB Cassandra table.
     * 
     * @return the innerProperties value.
     */
    private CassandraTableGetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraTableGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraTableGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public CassandraTableGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withResource(CassandraTableGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraTableGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     * 
     * @return the options value.
     */
    public CassandraTableGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     * 
     * @param options the options value to set.
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withOptions(CassandraTableGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraTableGetProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model CassandraTableGetResultsInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraTableGetResultsInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CassandraTableGetResultsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CassandraTableGetResultsInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CassandraTableGetResultsInner.
     */
    public static CassandraTableGetResultsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CassandraTableGetResultsInner deserializedCassandraTableGetResultsInner
                = new CassandraTableGetResultsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCassandraTableGetResultsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCassandraTableGetResultsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCassandraTableGetResultsInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCassandraTableGetResultsInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCassandraTableGetResultsInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedCassandraTableGetResultsInner.innerProperties
                        = CassandraTableGetProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCassandraTableGetResultsInner;
        });
    }
}
