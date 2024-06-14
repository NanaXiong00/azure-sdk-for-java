// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Error response
 * 
 * Common error response for all Azure Resource Manager APIs to return error details for failed operations. (This also
 * follows the OData error response format.).
 */
@Fluent
public final class ErrorResponse implements JsonSerializable<ErrorResponse> {
    /*
     * The error object.
     */
    private ErrorDetail error;

    /**
     * Creates an instance of ErrorResponse class.
     */
    public ErrorResponse() {
    }

    /**
     * Get the error property: The error object.
     * 
     * @return the error value.
     */
    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * Set the error property: The error object.
     * 
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(ErrorDetail error) {
        this.error = error;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorResponse.
     */
    public static ErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorResponse deserializedErrorResponse = new ErrorResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("error".equals(fieldName)) {
                    deserializedErrorResponse.error = ErrorDetail.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorResponse;
        });
    }
}
