// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The IpGroups resource information.
 */
@Fluent
public final class IpGroupInner extends Resource {
    /*
     * Properties of the IpGroups.
     */
    private IpGroupPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /**
     * Creates an instance of IpGroupInner class.
     */
    public IpGroupInner() {
    }

    /**
     * Get the innerProperties property: Properties of the IpGroups.
     * 
     * @return the innerProperties value.
     */
    private IpGroupPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the IpGroupInner object itself.
     */
    public IpGroupInner withId(String id) {
        this.id = id;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public IpGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IpGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the IpGroups resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     * @return the ipAddresses value.
     */
    public List<String> ipAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddresses();
    }

    /**
     * Set the ipAddresses property: IpAddresses/IpAddressPrefixes in the IpGroups resource.
     * 
     * @param ipAddresses the ipAddresses value to set.
     * @return the IpGroupInner object itself.
     */
    public IpGroupInner withIpAddresses(List<String> ipAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpGroupPropertiesFormat();
        }
        this.innerProperties().withIpAddresses(ipAddresses);
        return this;
    }

    /**
     * Get the firewalls property: List of references to Firewall resources that this IpGroups is associated with.
     * 
     * @return the firewalls value.
     */
    public List<SubResource> firewalls() {
        return this.innerProperties() == null ? null : this.innerProperties().firewalls();
    }

    /**
     * Get the firewallPolicies property: List of references to Firewall Policies resources that this IpGroups is
     * associated with.
     * 
     * @return the firewallPolicies value.
     */
    public List<SubResource> firewallPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallPolicies();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpGroupInner.
     */
    public static IpGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpGroupInner deserializedIpGroupInner = new IpGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIpGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIpGroupInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedIpGroupInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedIpGroupInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedIpGroupInner.innerProperties = IpGroupPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedIpGroupInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedIpGroupInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpGroupInner;
        });
    }
}
