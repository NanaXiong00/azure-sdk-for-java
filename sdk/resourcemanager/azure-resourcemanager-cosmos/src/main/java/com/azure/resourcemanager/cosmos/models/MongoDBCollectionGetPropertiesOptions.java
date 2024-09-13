// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The MongoDBCollectionGetPropertiesOptions model.
 */
@Fluent
public final class MongoDBCollectionGetPropertiesOptions extends OptionsResource {
    /**
     * Creates an instance of MongoDBCollectionGetPropertiesOptions class.
     */
    public MongoDBCollectionGetPropertiesOptions() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBCollectionGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MongoDBCollectionGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (autoscaleSettings() != null) {
            autoscaleSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("throughput", throughput());
        jsonWriter.writeJsonField("autoscaleSettings", autoscaleSettings());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoDBCollectionGetPropertiesOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoDBCollectionGetPropertiesOptions if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoDBCollectionGetPropertiesOptions.
     */
    public static MongoDBCollectionGetPropertiesOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoDBCollectionGetPropertiesOptions deserializedMongoDBCollectionGetPropertiesOptions
                = new MongoDBCollectionGetPropertiesOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("throughput".equals(fieldName)) {
                    deserializedMongoDBCollectionGetPropertiesOptions
                        .withThroughput(reader.getNullable(JsonReader::getInt));
                } else if ("autoscaleSettings".equals(fieldName)) {
                    deserializedMongoDBCollectionGetPropertiesOptions
                        .withAutoscaleSettings(AutoscaleSettings.fromJson(reader));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoDBCollectionGetPropertiesOptions;
        });
    }
}
