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
 * The SqlContainerGetPropertiesOptions model.
 */
@Fluent
public final class SqlContainerGetPropertiesOptions extends OptionsResource {
    /**
     * Creates an instance of SqlContainerGetPropertiesOptions class.
     */
    public SqlContainerGetPropertiesOptions() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlContainerGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlContainerGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
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
     * Reads an instance of SqlContainerGetPropertiesOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlContainerGetPropertiesOptions if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlContainerGetPropertiesOptions.
     */
    public static SqlContainerGetPropertiesOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlContainerGetPropertiesOptions deserializedSqlContainerGetPropertiesOptions
                = new SqlContainerGetPropertiesOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("throughput".equals(fieldName)) {
                    deserializedSqlContainerGetPropertiesOptions.withThroughput(reader.getNullable(JsonReader::getInt));
                } else if ("autoscaleSettings".equals(fieldName)) {
                    deserializedSqlContainerGetPropertiesOptions
                        .withAutoscaleSettings(AutoscaleSettings.fromJson(reader));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlContainerGetPropertiesOptions;
        });
    }
}
