// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Pool change request.
 */
@Fluent
public final class PoolChangeRequest implements JsonSerializable<PoolChangeRequest> {
    /*
     * Resource id of the pool to move volume to
     */
    private String newPoolResourceId;

    /**
     * Creates an instance of PoolChangeRequest class.
     */
    public PoolChangeRequest() {
    }

    /**
     * Get the newPoolResourceId property: Resource id of the pool to move volume to.
     * 
     * @return the newPoolResourceId value.
     */
    public String newPoolResourceId() {
        return this.newPoolResourceId;
    }

    /**
     * Set the newPoolResourceId property: Resource id of the pool to move volume to.
     * 
     * @param newPoolResourceId the newPoolResourceId value to set.
     * @return the PoolChangeRequest object itself.
     */
    public PoolChangeRequest withNewPoolResourceId(String newPoolResourceId) {
        this.newPoolResourceId = newPoolResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newPoolResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property newPoolResourceId in model PoolChangeRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolChangeRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("newPoolResourceId", this.newPoolResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PoolChangeRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PoolChangeRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PoolChangeRequest.
     */
    public static PoolChangeRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PoolChangeRequest deserializedPoolChangeRequest = new PoolChangeRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("newPoolResourceId".equals(fieldName)) {
                    deserializedPoolChangeRequest.newPoolResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPoolChangeRequest;
        });
    }
}
