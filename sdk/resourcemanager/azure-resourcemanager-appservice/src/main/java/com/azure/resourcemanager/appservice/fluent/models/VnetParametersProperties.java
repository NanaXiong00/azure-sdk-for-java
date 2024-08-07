// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VnetParameters resource specific properties.
 */
@Fluent
public final class VnetParametersProperties implements JsonSerializable<VnetParametersProperties> {
    /*
     * The Resource Group of the VNET to be validated
     */
    private String vnetResourceGroup;

    /*
     * The name of the VNET to be validated
     */
    private String vnetName;

    /*
     * The subnet name to be validated
     */
    private String vnetSubnetName;

    /*
     * The ARM Resource ID of the subnet to validate
     */
    private String subnetResourceId;

    /**
     * Creates an instance of VnetParametersProperties class.
     */
    public VnetParametersProperties() {
    }

    /**
     * Get the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     * 
     * @return the vnetResourceGroup value.
     */
    public String vnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    /**
     * Set the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     * 
     * @param vnetResourceGroup the vnetResourceGroup value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetResourceGroup(String vnetResourceGroup) {
        this.vnetResourceGroup = vnetResourceGroup;
        return this;
    }

    /**
     * Get the vnetName property: The name of the VNET to be validated.
     * 
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName property: The name of the VNET to be validated.
     * 
     * @param vnetName the vnetName value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vnetSubnetName property: The subnet name to be validated.
     * 
     * @return the vnetSubnetName value.
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName property: The subnet name to be validated.
     * 
     * @param vnetSubnetName the vnetSubnetName value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
        return this;
    }

    /**
     * Get the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     * 
     * @return the subnetResourceId value.
     */
    public String subnetResourceId() {
        return this.subnetResourceId;
    }

    /**
     * Set the subnetResourceId property: The ARM Resource ID of the subnet to validate.
     * 
     * @param subnetResourceId the subnetResourceId value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withSubnetResourceId(String subnetResourceId) {
        this.subnetResourceId = subnetResourceId;
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
        jsonWriter.writeStringField("vnetResourceGroup", this.vnetResourceGroup);
        jsonWriter.writeStringField("vnetName", this.vnetName);
        jsonWriter.writeStringField("vnetSubnetName", this.vnetSubnetName);
        jsonWriter.writeStringField("subnetResourceId", this.subnetResourceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VnetParametersProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VnetParametersProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VnetParametersProperties.
     */
    public static VnetParametersProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VnetParametersProperties deserializedVnetParametersProperties = new VnetParametersProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vnetResourceGroup".equals(fieldName)) {
                    deserializedVnetParametersProperties.vnetResourceGroup = reader.getString();
                } else if ("vnetName".equals(fieldName)) {
                    deserializedVnetParametersProperties.vnetName = reader.getString();
                } else if ("vnetSubnetName".equals(fieldName)) {
                    deserializedVnetParametersProperties.vnetSubnetName = reader.getString();
                } else if ("subnetResourceId".equals(fieldName)) {
                    deserializedVnetParametersProperties.subnetResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVnetParametersProperties;
        });
    }
}
