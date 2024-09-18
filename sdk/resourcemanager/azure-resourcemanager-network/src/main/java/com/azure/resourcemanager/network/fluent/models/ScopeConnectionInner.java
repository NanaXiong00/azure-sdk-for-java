// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.ScopeConnectionState;
import java.io.IOException;

/**
 * The Scope Connections resource.
 */
@Fluent
public final class ScopeConnectionInner extends ChildResource {
    /*
     * The scope connection properties
     */
    private ScopeConnectionProperties innerProperties;

    /*
     * The system metadata related to this resource.
     */
    private SystemData systemData;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ScopeConnectionInner class.
     */
    public ScopeConnectionInner() {
    }

    /**
     * Get the innerProperties property: The scope connection properties.
     * 
     * @return the innerProperties value.
     */
    private ScopeConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the tenantId property: Tenant ID.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: Tenant ID.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ScopeConnectionInner object itself.
     */
    public ScopeConnectionInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeConnectionProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the resourceId property: Resource ID.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: Resource ID.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ScopeConnectionInner object itself.
     */
    public ScopeConnectionInner withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeConnectionProperties();
        }
        this.innerProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the connectionState property: Connection State.
     * 
     * @return the connectionState value.
     */
    public ScopeConnectionState connectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionState();
    }

    /**
     * Get the description property: A description of the scope connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the scope connection.
     * 
     * @param description the description value to set.
     * @return the ScopeConnectionInner object itself.
     */
    public ScopeConnectionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeConnectionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScopeConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScopeConnectionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScopeConnectionInner.
     */
    public static ScopeConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScopeConnectionInner deserializedScopeConnectionInner = new ScopeConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedScopeConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedScopeConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedScopeConnectionInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedScopeConnectionInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedScopeConnectionInner.innerProperties = ScopeConnectionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedScopeConnectionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScopeConnectionInner;
        });
    }
}
