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
import java.io.IOException;

/**
 * StorageMigrationOptions resource specific properties.
 */
@Fluent
public final class StorageMigrationOptionsProperties implements JsonSerializable<StorageMigrationOptionsProperties> {
    /*
     * AzureFiles connection string.
     */
    private String azurefilesConnectionString;

    /*
     * AzureFiles share.
     */
    private String azurefilesShare;

    /*
     * <code>true</code>if the app should be switched over; otherwise, <code>false</code>.
     */
    private Boolean switchSiteAfterMigration;

    /*
     * <code>true</code> if the app should be read only during copy operation; otherwise, <code>false</code>.
     */
    private Boolean blockWriteAccessToSite;

    /**
     * Creates an instance of StorageMigrationOptionsProperties class.
     */
    public StorageMigrationOptionsProperties() {
    }

    /**
     * Get the azurefilesConnectionString property: AzureFiles connection string.
     * 
     * @return the azurefilesConnectionString value.
     */
    public String azurefilesConnectionString() {
        return this.azurefilesConnectionString;
    }

    /**
     * Set the azurefilesConnectionString property: AzureFiles connection string.
     * 
     * @param azurefilesConnectionString the azurefilesConnectionString value to set.
     * @return the StorageMigrationOptionsProperties object itself.
     */
    public StorageMigrationOptionsProperties withAzurefilesConnectionString(String azurefilesConnectionString) {
        this.azurefilesConnectionString = azurefilesConnectionString;
        return this;
    }

    /**
     * Get the azurefilesShare property: AzureFiles share.
     * 
     * @return the azurefilesShare value.
     */
    public String azurefilesShare() {
        return this.azurefilesShare;
    }

    /**
     * Set the azurefilesShare property: AzureFiles share.
     * 
     * @param azurefilesShare the azurefilesShare value to set.
     * @return the StorageMigrationOptionsProperties object itself.
     */
    public StorageMigrationOptionsProperties withAzurefilesShare(String azurefilesShare) {
        this.azurefilesShare = azurefilesShare;
        return this;
    }

    /**
     * Get the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the switchSiteAfterMigration value.
     */
    public Boolean switchSiteAfterMigration() {
        return this.switchSiteAfterMigration;
    }

    /**
     * Set the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param switchSiteAfterMigration the switchSiteAfterMigration value to set.
     * @return the StorageMigrationOptionsProperties object itself.
     */
    public StorageMigrationOptionsProperties withSwitchSiteAfterMigration(Boolean switchSiteAfterMigration) {
        this.switchSiteAfterMigration = switchSiteAfterMigration;
        return this;
    }

    /**
     * Get the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the blockWriteAccessToSite value.
     */
    public Boolean blockWriteAccessToSite() {
        return this.blockWriteAccessToSite;
    }

    /**
     * Set the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param blockWriteAccessToSite the blockWriteAccessToSite value to set.
     * @return the StorageMigrationOptionsProperties object itself.
     */
    public StorageMigrationOptionsProperties withBlockWriteAccessToSite(Boolean blockWriteAccessToSite) {
        this.blockWriteAccessToSite = blockWriteAccessToSite;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azurefilesConnectionString() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azurefilesConnectionString in model StorageMigrationOptionsProperties"));
        }
        if (azurefilesShare() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azurefilesShare in model StorageMigrationOptionsProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageMigrationOptionsProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("azurefilesConnectionString", this.azurefilesConnectionString);
        jsonWriter.writeStringField("azurefilesShare", this.azurefilesShare);
        jsonWriter.writeBooleanField("switchSiteAfterMigration", this.switchSiteAfterMigration);
        jsonWriter.writeBooleanField("blockWriteAccessToSite", this.blockWriteAccessToSite);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageMigrationOptionsProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageMigrationOptionsProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageMigrationOptionsProperties.
     */
    public static StorageMigrationOptionsProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageMigrationOptionsProperties deserializedStorageMigrationOptionsProperties
                = new StorageMigrationOptionsProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azurefilesConnectionString".equals(fieldName)) {
                    deserializedStorageMigrationOptionsProperties.azurefilesConnectionString = reader.getString();
                } else if ("azurefilesShare".equals(fieldName)) {
                    deserializedStorageMigrationOptionsProperties.azurefilesShare = reader.getString();
                } else if ("switchSiteAfterMigration".equals(fieldName)) {
                    deserializedStorageMigrationOptionsProperties.switchSiteAfterMigration
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("blockWriteAccessToSite".equals(fieldName)) {
                    deserializedStorageMigrationOptionsProperties.blockWriteAccessToSite
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageMigrationOptionsProperties;
        });
    }
}
