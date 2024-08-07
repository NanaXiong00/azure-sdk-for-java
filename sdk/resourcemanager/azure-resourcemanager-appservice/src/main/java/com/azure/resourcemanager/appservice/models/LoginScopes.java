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
 * The configuration settings of the login flow, including the scopes that should be requested.
 */
@Fluent
public final class LoginScopes implements JsonSerializable<LoginScopes> {
    /*
     * A list of the scopes that should be requested while authenticating.
     */
    private List<String> scopes;

    /**
     * Creates an instance of LoginScopes class.
     */
    public LoginScopes() {
    }

    /**
     * Get the scopes property: A list of the scopes that should be requested while authenticating.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of the scopes that should be requested while authenticating.
     * 
     * @param scopes the scopes value to set.
     * @return the LoginScopes object itself.
     */
    public LoginScopes withScopes(List<String> scopes) {
        this.scopes = scopes;
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
        jsonWriter.writeArrayField("scopes", this.scopes, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoginScopes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoginScopes if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoginScopes.
     */
    public static LoginScopes fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoginScopes deserializedLoginScopes = new LoginScopes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scopes".equals(fieldName)) {
                    List<String> scopes = reader.readArray(reader1 -> reader1.getString());
                    deserializedLoginScopes.scopes = scopes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoginScopes;
        });
    }
}
