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
import java.util.List;

/**
 * Resource metrics service provided by Microsoft.Insights resource provider.
 */
@Fluent
public final class ServiceSpecification implements JsonSerializable<ServiceSpecification> {
    /*
     * The metricSpecifications property.
     */
    private List<MetricSpecification> metricSpecifications;

    /*
     * The logSpecifications property.
     */
    private List<LogSpecification> logSpecifications;

    /**
     * Creates an instance of ServiceSpecification class.
     */
    public ServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: The metricSpecifications property.
     * 
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: The metricSpecifications property.
     * 
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: The logSpecifications property.
     * 
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: The logSpecifications property.
     * 
     * @param logSpecifications the logSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("metricSpecifications", this.metricSpecifications,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("logSpecifications", this.logSpecifications,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceSpecification if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceSpecification.
     */
    public static ServiceSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceSpecification deserializedServiceSpecification = new ServiceSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metricSpecifications".equals(fieldName)) {
                    List<MetricSpecification> metricSpecifications
                        = reader.readArray(reader1 -> MetricSpecification.fromJson(reader1));
                    deserializedServiceSpecification.metricSpecifications = metricSpecifications;
                } else if ("logSpecifications".equals(fieldName)) {
                    List<LogSpecification> logSpecifications
                        = reader.readArray(reader1 -> LogSpecification.fromJson(reader1));
                    deserializedServiceSpecification.logSpecifications = logSpecifications;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceSpecification;
        });
    }
}
