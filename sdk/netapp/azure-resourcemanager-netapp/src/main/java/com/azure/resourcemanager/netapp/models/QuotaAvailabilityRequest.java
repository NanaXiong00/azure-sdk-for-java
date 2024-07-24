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
 * Quota availability request content.
 */
@Fluent
public final class QuotaAvailabilityRequest implements JsonSerializable<QuotaAvailabilityRequest> {
    /*
     * Name of the resource to verify.
     */
    private String name;

    /*
     * Resource type used for verification.
     */
    private CheckQuotaNameResourceTypes type;

    /*
     * Resource group name.
     */
    private String resourceGroup;

    /**
     * Creates an instance of QuotaAvailabilityRequest class.
     */
    public QuotaAvailabilityRequest() {
    }

    /**
     * Get the name property: Name of the resource to verify.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource to verify.
     * 
     * @param name the name value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     * 
     * @return the type value.
     */
    public CheckQuotaNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     * 
     * @param type the type value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withType(CheckQuotaNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group name.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Resource group name.
     * 
     * @param resourceGroup the resourceGroup value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model QuotaAvailabilityRequest"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model QuotaAvailabilityRequest"));
        }
        if (resourceGroup() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceGroup in model QuotaAvailabilityRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuotaAvailabilityRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("resourceGroup", this.resourceGroup);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaAvailabilityRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaAvailabilityRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QuotaAvailabilityRequest.
     */
    public static QuotaAvailabilityRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaAvailabilityRequest deserializedQuotaAvailabilityRequest = new QuotaAvailabilityRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedQuotaAvailabilityRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedQuotaAvailabilityRequest.type
                        = CheckQuotaNameResourceTypes.fromString(reader.getString());
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedQuotaAvailabilityRequest.resourceGroup = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaAvailabilityRequest;
        });
    }
}
