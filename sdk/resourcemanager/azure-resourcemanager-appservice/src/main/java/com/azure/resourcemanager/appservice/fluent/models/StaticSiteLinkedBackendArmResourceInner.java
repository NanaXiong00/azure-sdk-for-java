// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Static Site Linked Backend ARM resource.
 */
@Fluent
public final class StaticSiteLinkedBackendArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteLinkedBackendARMResource resource specific properties
     */
    private StaticSiteLinkedBackendArmResourceProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of StaticSiteLinkedBackendArmResourceInner class.
     */
    public StaticSiteLinkedBackendArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteLinkedBackendARMResource resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StaticSiteLinkedBackendArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaticSiteLinkedBackendArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the backendResourceId property: The resource id of the backend linked to the static site.
     * 
     * @return the backendResourceId value.
     */
    public String backendResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().backendResourceId();
    }

    /**
     * Set the backendResourceId property: The resource id of the backend linked to the static site.
     * 
     * @param backendResourceId the backendResourceId value to set.
     * @return the StaticSiteLinkedBackendArmResourceInner object itself.
     */
    public StaticSiteLinkedBackendArmResourceInner withBackendResourceId(String backendResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteLinkedBackendArmResourceProperties();
        }
        this.innerProperties().withBackendResourceId(backendResourceId);
        return this;
    }

    /**
     * Get the region property: The region of the backend linked to the static site.
     * 
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: The region of the backend linked to the static site.
     * 
     * @param region the region value to set.
     * @return the StaticSiteLinkedBackendArmResourceInner object itself.
     */
    public StaticSiteLinkedBackendArmResourceInner withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSiteLinkedBackendArmResourceProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
    }

    /**
     * Get the createdOn property: The date and time on which the backend was linked to the static site.
     * 
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the provisioningState property: The provisioning state of the linking process.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteLinkedBackendArmResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteLinkedBackendArmResourceInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StaticSiteLinkedBackendArmResourceInner.
     */
    public static StaticSiteLinkedBackendArmResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteLinkedBackendArmResourceInner deserializedStaticSiteLinkedBackendArmResourceInner
                = new StaticSiteLinkedBackendArmResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackendArmResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackendArmResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackendArmResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackendArmResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStaticSiteLinkedBackendArmResourceInner.innerProperties
                        = StaticSiteLinkedBackendArmResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteLinkedBackendArmResourceInner;
        });
    }
}
