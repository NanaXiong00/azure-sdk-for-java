// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.StaticSiteDatabaseConnectionConfigurationFileOverview;
import java.io.IOException;
import java.util.List;

/**
 * DatabaseConnection resource specific properties.
 */
@Fluent
public final class DatabaseConnectionProperties implements JsonSerializable<DatabaseConnectionProperties> {
    /*
     * The resource id of the database.
     */
    private String resourceId;

    /*
     * If present, the identity is used in conjunction with connection string to connect to the database. Use of the
     * system-assigned managed identity is indicated with the string 'SystemAssigned', while use of a user-assigned
     * managed identity is indicated with the resource id of the managed identity resource.
     */
    private String connectionIdentity;

    /*
     * The connection string to use to connect to the database.
     */
    private String connectionString;

    /*
     * The region of the database resource.
     */
    private String region;

    /*
     * A list of configuration files associated with this database connection.
     */
    private List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles;

    /**
     * Creates an instance of DatabaseConnectionProperties class.
     */
    public DatabaseConnectionProperties() {
    }

    /**
     * Get the resourceId property: The resource id of the database.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of the database.
     * 
     * @param resourceId the resourceId value to set.
     * @return the DatabaseConnectionProperties object itself.
     */
    public DatabaseConnectionProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     * 
     * @return the connectionIdentity value.
     */
    public String connectionIdentity() {
        return this.connectionIdentity;
    }

    /**
     * Set the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     * 
     * @param connectionIdentity the connectionIdentity value to set.
     * @return the DatabaseConnectionProperties object itself.
     */
    public DatabaseConnectionProperties withConnectionIdentity(String connectionIdentity) {
        this.connectionIdentity = connectionIdentity;
        return this;
    }

    /**
     * Get the connectionString property: The connection string to use to connect to the database.
     * 
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string to use to connect to the database.
     * 
     * @param connectionString the connectionString value to set.
     * @return the DatabaseConnectionProperties object itself.
     */
    public DatabaseConnectionProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the region property: The region of the database resource.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region of the database resource.
     * 
     * @param region the region value to set.
     * @return the DatabaseConnectionProperties object itself.
     */
    public DatabaseConnectionProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the configurationFiles property: A list of configuration files associated with this database connection.
     * 
     * @return the configurationFiles value.
     */
    public List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles() {
        return this.configurationFiles;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceId in model DatabaseConnectionProperties"));
        }
        if (region() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property region in model DatabaseConnectionProperties"));
        }
        if (configurationFiles() != null) {
            configurationFiles().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseConnectionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeStringField("connectionIdentity", this.connectionIdentity);
        jsonWriter.writeStringField("connectionString", this.connectionString);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseConnectionProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DatabaseConnectionProperties.
     */
    public static DatabaseConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseConnectionProperties deserializedDatabaseConnectionProperties = new DatabaseConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedDatabaseConnectionProperties.resourceId = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedDatabaseConnectionProperties.region = reader.getString();
                } else if ("connectionIdentity".equals(fieldName)) {
                    deserializedDatabaseConnectionProperties.connectionIdentity = reader.getString();
                } else if ("connectionString".equals(fieldName)) {
                    deserializedDatabaseConnectionProperties.connectionString = reader.getString();
                } else if ("configurationFiles".equals(fieldName)) {
                    List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles = reader
                        .readArray(reader1 -> StaticSiteDatabaseConnectionConfigurationFileOverview.fromJson(reader1));
                    deserializedDatabaseConnectionProperties.configurationFiles = configurationFiles;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseConnectionProperties;
        });
    }
}
