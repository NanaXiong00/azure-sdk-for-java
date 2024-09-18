// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Defines the routing configuration properties.
 */
@Fluent
public final class NetworkManagerRoutingConfigurationPropertiesFormat
    implements JsonSerializable<NetworkManagerRoutingConfigurationPropertiesFormat> {
    /*
     * A description of the routing configuration.
     */
    private String description;

    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Unique identifier for this resource.
     */
    private String resourceGuid;

    /**
     * Creates an instance of NetworkManagerRoutingConfigurationPropertiesFormat class.
     */
    public NetworkManagerRoutingConfigurationPropertiesFormat() {
    }

    /**
     * Get the description property: A description of the routing configuration.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the routing configuration.
     * 
     * @param description the description value to set.
     * @return the NetworkManagerRoutingConfigurationPropertiesFormat object itself.
     */
    public NetworkManagerRoutingConfigurationPropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
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
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkManagerRoutingConfigurationPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkManagerRoutingConfigurationPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkManagerRoutingConfigurationPropertiesFormat.
     */
    public static NetworkManagerRoutingConfigurationPropertiesFormat fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkManagerRoutingConfigurationPropertiesFormat deserializedNetworkManagerRoutingConfigurationPropertiesFormat
                = new NetworkManagerRoutingConfigurationPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedNetworkManagerRoutingConfigurationPropertiesFormat.description = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedNetworkManagerRoutingConfigurationPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("resourceGuid".equals(fieldName)) {
                    deserializedNetworkManagerRoutingConfigurationPropertiesFormat.resourceGuid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkManagerRoutingConfigurationPropertiesFormat;
        });
    }
}
