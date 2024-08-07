// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * The response to the List Namespace operation.
 */
@Fluent
public final class SBAuthorizationRuleListResult implements JsonSerializable<SBAuthorizationRuleListResult> {
    /*
     * Result of the List Authorization Rules operation.
     */
    private List<SBAuthorizationRuleInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of Authorization Rules.
     */
    private String nextLink;

    /**
     * Creates an instance of SBAuthorizationRuleListResult class.
     */
    public SBAuthorizationRuleListResult() {
    }

    /**
     * Get the value property: Result of the List Authorization Rules operation.
     * 
     * @return the value value.
     */
    public List<SBAuthorizationRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Authorization Rules operation.
     * 
     * @param value the value value to set.
     * @return the SBAuthorizationRuleListResult object itself.
     */
    public SBAuthorizationRuleListResult withValue(List<SBAuthorizationRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Authorization Rules.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Authorization Rules.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SBAuthorizationRuleListResult object itself.
     */
    public SBAuthorizationRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SBAuthorizationRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SBAuthorizationRuleListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SBAuthorizationRuleListResult.
     */
    public static SBAuthorizationRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SBAuthorizationRuleListResult deserializedSBAuthorizationRuleListResult
                = new SBAuthorizationRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SBAuthorizationRuleInner> value
                        = reader.readArray(reader1 -> SBAuthorizationRuleInner.fromJson(reader1));
                    deserializedSBAuthorizationRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSBAuthorizationRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSBAuthorizationRuleListResult;
        });
    }
}
