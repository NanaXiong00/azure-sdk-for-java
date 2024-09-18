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
 * VirtualRouter Resource.
 */
@Fluent
public final class VirtualRouterInner extends Resource {
    /*
     * Properties of the Virtual Router.
     */
    private VirtualRouterPropertiesFormat innerProperties;

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
     * Creates an instance of VirtualRouterInner class.
     */
    public VirtualRouterInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Virtual Router.
     * 
     * @return the innerProperties value.
     */
    private VirtualRouterPropertiesFormat innerProperties() {
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
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withId(String id) {
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
    public VirtualRouterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtualRouterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualRouterAsn();
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     * 
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterAsn(Long virtualRouterAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualRouterPropertiesFormat();
        }
        this.innerProperties().withVirtualRouterAsn(virtualRouterAsn);
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualRouterIps();
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     * 
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterIps(List<String> virtualRouterIps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualRouterPropertiesFormat();
        }
        this.innerProperties().withVirtualRouterIps(virtualRouterIps);
        return this;
    }

    /**
     * Get the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @return the hostedSubnet value.
     */
    public SubResource hostedSubnet() {
        return this.innerProperties() == null ? null : this.innerProperties().hostedSubnet();
    }

    /**
     * Set the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     * 
     * @param hostedSubnet the hostedSubnet value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedSubnet(SubResource hostedSubnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualRouterPropertiesFormat();
        }
        this.innerProperties().withHostedSubnet(hostedSubnet);
        return this;
    }

    /**
     * Get the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @return the hostedGateway value.
     */
    public SubResource hostedGateway() {
        return this.innerProperties() == null ? null : this.innerProperties().hostedGateway();
    }

    /**
     * Set the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     * 
     * @param hostedGateway the hostedGateway value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedGateway(SubResource hostedGateway) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualRouterPropertiesFormat();
        }
        this.innerProperties().withHostedGateway(hostedGateway);
        return this;
    }

    /**
     * Get the peerings property: List of references to VirtualRouterPeerings.
     * 
     * @return the peerings value.
     */
    public List<SubResource> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
     * Reads an instance of VirtualRouterInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualRouterInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VirtualRouterInner.
     */
    public static VirtualRouterInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualRouterInner deserializedVirtualRouterInner = new VirtualRouterInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVirtualRouterInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualRouterInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedVirtualRouterInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVirtualRouterInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualRouterInner.innerProperties = VirtualRouterPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedVirtualRouterInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedVirtualRouterInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualRouterInner;
        });
    }
}
