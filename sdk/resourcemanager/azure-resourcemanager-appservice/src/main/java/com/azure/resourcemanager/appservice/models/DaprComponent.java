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
 * Dapr component configuration.
 */
@Fluent
public final class DaprComponent implements JsonSerializable<DaprComponent> {
    /*
     * Component name
     */
    private String name;

    /*
     * Component type
     */
    private String type;

    /*
     * Component version
     */
    private String version;

    /*
     * Component metadata
     */
    private List<DaprMetadata> metadata;

    /**
     * Creates an instance of DaprComponent class.
     */
    public DaprComponent() {
    }

    /**
     * Get the name property: Component name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Component name.
     * 
     * @param name the name value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Component type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Component type.
     * 
     * @param type the type value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: Component version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Component version.
     * 
     * @param version the version value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the metadata property: Component metadata.
     * 
     * @return the metadata value.
     */
    public List<DaprMetadata> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Component metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the DaprComponent object itself.
     */
    public DaprComponent withMetadata(List<DaprMetadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeArrayField("metadata", this.metadata, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DaprComponent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DaprComponent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DaprComponent.
     */
    public static DaprComponent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DaprComponent deserializedDaprComponent = new DaprComponent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDaprComponent.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDaprComponent.type = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedDaprComponent.version = reader.getString();
                } else if ("metadata".equals(fieldName)) {
                    List<DaprMetadata> metadata = reader.readArray(reader1 -> DaprMetadata.fromJson(reader1));
                    deserializedDaprComponent.metadata = metadata;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDaprComponent;
        });
    }
}
