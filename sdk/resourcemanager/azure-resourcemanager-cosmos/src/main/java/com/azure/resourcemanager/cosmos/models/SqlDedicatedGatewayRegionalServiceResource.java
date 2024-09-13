// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Resource for a regional service location.
 */
@Immutable
public final class SqlDedicatedGatewayRegionalServiceResource extends RegionalServiceResource {
    /*
     * The regional endpoint for SqlDedicatedGateway.
     */
    private String sqlDedicatedGatewayEndpoint;

    /*
     * Describes the status of a service.
     */
    private ServiceStatus status;

    /*
     * The location name.
     */
    private String location;

    /*
     * The regional service name.
     */
    private String name;

    /**
     * Creates an instance of SqlDedicatedGatewayRegionalServiceResource class.
     */
    public SqlDedicatedGatewayRegionalServiceResource() {
    }

    /**
     * Get the sqlDedicatedGatewayEndpoint property: The regional endpoint for SqlDedicatedGateway.
     * 
     * @return the sqlDedicatedGatewayEndpoint value.
     */
    public String sqlDedicatedGatewayEndpoint() {
        return this.sqlDedicatedGatewayEndpoint;
    }

    /**
     * Get the status property: Describes the status of a service.
     * 
     * @return the status value.
     */
    @Override
    public ServiceStatus status() {
        return this.status;
    }

    /**
     * Get the location property: The location name.
     * 
     * @return the location value.
     */
    @Override
    public String location() {
        return this.location;
    }

    /**
     * Get the name property: The regional service name.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlDedicatedGatewayRegionalServiceResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlDedicatedGatewayRegionalServiceResource if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlDedicatedGatewayRegionalServiceResource.
     */
    public static SqlDedicatedGatewayRegionalServiceResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlDedicatedGatewayRegionalServiceResource deserializedSqlDedicatedGatewayRegionalServiceResource
                = new SqlDedicatedGatewayRegionalServiceResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayRegionalServiceResource.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayRegionalServiceResource.location = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayRegionalServiceResource.status
                        = ServiceStatus.fromString(reader.getString());
                } else if ("sqlDedicatedGatewayEndpoint".equals(fieldName)) {
                    deserializedSqlDedicatedGatewayRegionalServiceResource.sqlDedicatedGatewayEndpoint
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlDedicatedGatewayRegionalServiceResource;
        });
    }
}
