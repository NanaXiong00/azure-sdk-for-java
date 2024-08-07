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
 * Retention policy of a resource metric.
 */
@Fluent
public final class MetricAvailability implements JsonSerializable<MetricAvailability> {
    /*
     * The timeGrain property.
     */
    private String timeGrain;

    /*
     * The blobDuration property.
     */
    private String blobDuration;

    /**
     * Creates an instance of MetricAvailability class.
     */
    public MetricAvailability() {
    }

    /**
     * Get the timeGrain property: The timeGrain property.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: The timeGrain property.
     * 
     * @param timeGrain the timeGrain value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the blobDuration property: The blobDuration property.
     * 
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
    }

    /**
     * Set the blobDuration property: The blobDuration property.
     * 
     * @param blobDuration the blobDuration value to set.
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withBlobDuration(String blobDuration) {
        this.blobDuration = blobDuration;
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
        jsonWriter.writeStringField("timeGrain", this.timeGrain);
        jsonWriter.writeStringField("blobDuration", this.blobDuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricAvailability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricAvailability if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricAvailability.
     */
    public static MetricAvailability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricAvailability deserializedMetricAvailability = new MetricAvailability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeGrain".equals(fieldName)) {
                    deserializedMetricAvailability.timeGrain = reader.getString();
                } else if ("blobDuration".equals(fieldName)) {
                    deserializedMetricAvailability.blobDuration = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricAvailability;
        });
    }
}
