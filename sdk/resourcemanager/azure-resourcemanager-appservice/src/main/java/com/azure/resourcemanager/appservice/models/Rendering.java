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
 * Instructions for rendering the data.
 */
@Fluent
public final class Rendering implements JsonSerializable<Rendering> {
    /*
     * Rendering Type
     */
    private RenderingType type;

    /*
     * Title of data
     */
    private String title;

    /*
     * Description of the data that will help it be interpreted
     */
    private String description;

    /**
     * Creates an instance of Rendering class.
     */
    public Rendering() {
    }

    /**
     * Get the type property: Rendering Type.
     * 
     * @return the type value.
     */
    public RenderingType type() {
        return this.type;
    }

    /**
     * Set the type property: Rendering Type.
     * 
     * @param type the type value to set.
     * @return the Rendering object itself.
     */
    public Rendering withType(RenderingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the title property: Title of data.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title of data.
     * 
     * @param title the title value to set.
     * @return the Rendering object itself.
     */
    public Rendering withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Description of the data that will help it be interpreted.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the data that will help it be interpreted.
     * 
     * @param description the description value to set.
     * @return the Rendering object itself.
     */
    public Rendering withDescription(String description) {
        this.description = description;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("title", this.title);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Rendering from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Rendering if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Rendering.
     */
    public static Rendering fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Rendering deserializedRendering = new Rendering();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedRendering.type = RenderingType.fromString(reader.getString());
                } else if ("title".equals(fieldName)) {
                    deserializedRendering.title = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedRendering.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRendering;
        });
    }
}
