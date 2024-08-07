// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Represents the correlation filter expression.
 */
@Fluent
public final class CorrelationFilter implements JsonSerializable<CorrelationFilter> {
    /*
     * dictionary object for custom filters
     */
    private Map<String, String> properties;

    /*
     * Identifier of the correlation.
     */
    private String correlationId;

    /*
     * Identifier of the message.
     */
    private String messageId;

    /*
     * Address to send to.
     */
    private String to;

    /*
     * Address of the queue to reply to.
     */
    private String replyTo;

    /*
     * Application specific label.
     */
    private String label;

    /*
     * Session identifier.
     */
    private String sessionId;

    /*
     * Session identifier to reply to.
     */
    private String replyToSessionId;

    /*
     * Content type of the message.
     */
    private String contentType;

    /*
     * Value that indicates whether the rule action requires preprocessing.
     */
    private Boolean requiresPreprocessing;

    /**
     * Creates an instance of CorrelationFilter class.
     */
    public CorrelationFilter() {
    }

    /**
     * Get the properties property: dictionary object for custom filters.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: dictionary object for custom filters.
     * 
     * @param properties the properties value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the correlationId property: Identifier of the correlation.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Identifier of the correlation.
     * 
     * @param correlationId the correlationId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the messageId property: Identifier of the message.
     * 
     * @return the messageId value.
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: Identifier of the message.
     * 
     * @param messageId the messageId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the to property: Address to send to.
     * 
     * @return the to value.
     */
    public String to() {
        return this.to;
    }

    /**
     * Set the to property: Address to send to.
     * 
     * @param to the to value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the replyTo property: Address of the queue to reply to.
     * 
     * @return the replyTo value.
     */
    public String replyTo() {
        return this.replyTo;
    }

    /**
     * Set the replyTo property: Address of the queue to reply to.
     * 
     * @param replyTo the replyTo value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Get the label property: Application specific label.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: Application specific label.
     * 
     * @param label the label value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the sessionId property: Session identifier.
     * 
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: Session identifier.
     * 
     * @param sessionId the sessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the replyToSessionId property: Session identifier to reply to.
     * 
     * @return the replyToSessionId value.
     */
    public String replyToSessionId() {
        return this.replyToSessionId;
    }

    /**
     * Set the replyToSessionId property: Session identifier to reply to.
     * 
     * @param replyToSessionId the replyToSessionId value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withReplyToSessionId(String replyToSessionId) {
        this.replyToSessionId = replyToSessionId;
        return this;
    }

    /**
     * Get the contentType property: Content type of the message.
     * 
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Content type of the message.
     * 
     * @param contentType the contentType value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     * 
     * @return the requiresPreprocessing value.
     */
    public Boolean requiresPreprocessing() {
        return this.requiresPreprocessing;
    }

    /**
     * Set the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     * 
     * @param requiresPreprocessing the requiresPreprocessing value to set.
     * @return the CorrelationFilter object itself.
     */
    public CorrelationFilter withRequiresPreprocessing(Boolean requiresPreprocessing) {
        this.requiresPreprocessing = requiresPreprocessing;
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
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("correlationId", this.correlationId);
        jsonWriter.writeStringField("messageId", this.messageId);
        jsonWriter.writeStringField("to", this.to);
        jsonWriter.writeStringField("replyTo", this.replyTo);
        jsonWriter.writeStringField("label", this.label);
        jsonWriter.writeStringField("sessionId", this.sessionId);
        jsonWriter.writeStringField("replyToSessionId", this.replyToSessionId);
        jsonWriter.writeStringField("contentType", this.contentType);
        jsonWriter.writeBooleanField("requiresPreprocessing", this.requiresPreprocessing);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CorrelationFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CorrelationFilter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CorrelationFilter.
     */
    public static CorrelationFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CorrelationFilter deserializedCorrelationFilter = new CorrelationFilter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedCorrelationFilter.properties = properties;
                } else if ("correlationId".equals(fieldName)) {
                    deserializedCorrelationFilter.correlationId = reader.getString();
                } else if ("messageId".equals(fieldName)) {
                    deserializedCorrelationFilter.messageId = reader.getString();
                } else if ("to".equals(fieldName)) {
                    deserializedCorrelationFilter.to = reader.getString();
                } else if ("replyTo".equals(fieldName)) {
                    deserializedCorrelationFilter.replyTo = reader.getString();
                } else if ("label".equals(fieldName)) {
                    deserializedCorrelationFilter.label = reader.getString();
                } else if ("sessionId".equals(fieldName)) {
                    deserializedCorrelationFilter.sessionId = reader.getString();
                } else if ("replyToSessionId".equals(fieldName)) {
                    deserializedCorrelationFilter.replyToSessionId = reader.getString();
                } else if ("contentType".equals(fieldName)) {
                    deserializedCorrelationFilter.contentType = reader.getString();
                } else if ("requiresPreprocessing".equals(fieldName)) {
                    deserializedCorrelationFilter.requiresPreprocessing = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCorrelationFilter;
        });
    }
}
