// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the storage of the tokens if blob storage is used.
 */
@Fluent
public final class BlobStorageTokenStore implements JsonSerializable<BlobStorageTokenStore> {
    /*
     * The name of the app setting containing the SAS URL of the blob storage containing the tokens.
     */
    private String sasUrlSettingName;

    /**
     * Creates an instance of BlobStorageTokenStore class.
     */
    public BlobStorageTokenStore() {
    }

    /**
     * Get the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     * 
     * @return the sasUrlSettingName value.
     */
    public String sasUrlSettingName() {
        return this.sasUrlSettingName;
    }

    /**
     * Set the sasUrlSettingName property: The name of the app setting containing the SAS URL of the blob storage
     * containing the tokens.
     * 
     * @param sasUrlSettingName the sasUrlSettingName value to set.
     * @return the BlobStorageTokenStore object itself.
     */
    public BlobStorageTokenStore withSasUrlSettingName(String sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sasUrlSettingName", this.sasUrlSettingName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobStorageTokenStore from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobStorageTokenStore if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BlobStorageTokenStore.
     */
    public static BlobStorageTokenStore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobStorageTokenStore deserializedBlobStorageTokenStore = new BlobStorageTokenStore();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sasUrlSettingName".equals(fieldName)) {
                    deserializedBlobStorageTokenStore.sasUrlSettingName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobStorageTokenStore;
        });
    }
}
