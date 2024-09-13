// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.SqlStoredProcedureCreateUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Parameters to create and update Cosmos DB storedProcedure.
 */
@Fluent
public final class SqlStoredProcedureCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to create and update Azure Cosmos DB storedProcedure.
     */
    private SqlStoredProcedureCreateUpdateProperties innerProperties = new SqlStoredProcedureCreateUpdateProperties();

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
     * Creates an instance of SqlStoredProcedureCreateUpdateParameters class.
     */
    public SqlStoredProcedureCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB storedProcedure.
     * 
     * @return the innerProperties value.
     */
    private SqlStoredProcedureCreateUpdateProperties innerProperties() {
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
    public SqlStoredProcedureCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlStoredProcedureCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a storedProcedure.
     * 
     * @return the resource value.
     */
    public SqlStoredProcedureResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a storedProcedure.
     * 
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withResource(SqlStoredProcedureResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlStoredProcedureCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlStoredProcedureCreateUpdateProperties();
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
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model SqlStoredProcedureCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model SqlStoredProcedureCreateUpdateParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlStoredProcedureCreateUpdateParameters.class);

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
     * Reads an instance of SqlStoredProcedureCreateUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlStoredProcedureCreateUpdateParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SqlStoredProcedureCreateUpdateParameters.
     */
    public static SqlStoredProcedureCreateUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlStoredProcedureCreateUpdateParameters deserializedSqlStoredProcedureCreateUpdateParameters
                = new SqlStoredProcedureCreateUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSqlStoredProcedureCreateUpdateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSqlStoredProcedureCreateUpdateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSqlStoredProcedureCreateUpdateParameters.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSqlStoredProcedureCreateUpdateParameters.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSqlStoredProcedureCreateUpdateParameters.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedSqlStoredProcedureCreateUpdateParameters.innerProperties
                        = SqlStoredProcedureCreateUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlStoredProcedureCreateUpdateParameters;
        });
    }
}
