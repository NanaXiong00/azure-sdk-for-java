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
import java.util.List;

/**
 * Full view of networking configuration for an ASE.
 */
@Fluent
public final class AseV3NetworkingConfigurationInner extends ProxyOnlyResource {
    /*
     * AseV3NetworkingConfiguration resource specific properties
     */
    private AseV3NetworkingConfigurationProperties innerProperties;

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
     * Creates an instance of AseV3NetworkingConfigurationInner class.
     */
    public AseV3NetworkingConfigurationInner() {
    }

    /**
     * Get the innerProperties property: AseV3NetworkingConfiguration resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private AseV3NetworkingConfigurationProperties innerProperties() {
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
    public AseV3NetworkingConfigurationInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the windowsOutboundIpAddresses property: The windowsOutboundIpAddresses property.
     * 
     * @return the windowsOutboundIpAddresses value.
     */
    public List<String> windowsOutboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().windowsOutboundIpAddresses();
    }

    /**
     * Get the linuxOutboundIpAddresses property: The linuxOutboundIpAddresses property.
     * 
     * @return the linuxOutboundIpAddresses value.
     */
    public List<String> linuxOutboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().linuxOutboundIpAddresses();
    }

    /**
     * Get the externalInboundIpAddresses property: The externalInboundIpAddresses property.
     * 
     * @return the externalInboundIpAddresses value.
     */
    public List<String> externalInboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().externalInboundIpAddresses();
    }

    /**
     * Get the internalInboundIpAddresses property: The internalInboundIpAddresses property.
     * 
     * @return the internalInboundIpAddresses value.
     */
    public List<String> internalInboundIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().internalInboundIpAddresses();
    }

    /**
     * Get the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     * 
     * @return the allowNewPrivateEndpointConnections value.
     */
    public Boolean allowNewPrivateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().allowNewPrivateEndpointConnections();
    }

    /**
     * Set the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     * 
     * @param allowNewPrivateEndpointConnections the allowNewPrivateEndpointConnections value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner
        withAllowNewPrivateEndpointConnections(Boolean allowNewPrivateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseV3NetworkingConfigurationProperties();
        }
        this.innerProperties().withAllowNewPrivateEndpointConnections(allowNewPrivateEndpointConnections);
        return this;
    }

    /**
     * Get the ftpEnabled property: Property to enable and disable FTP on ASEV3.
     * 
     * @return the ftpEnabled value.
     */
    public Boolean ftpEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().ftpEnabled();
    }

    /**
     * Set the ftpEnabled property: Property to enable and disable FTP on ASEV3.
     * 
     * @param ftpEnabled the ftpEnabled value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner withFtpEnabled(Boolean ftpEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseV3NetworkingConfigurationProperties();
        }
        this.innerProperties().withFtpEnabled(ftpEnabled);
        return this;
    }

    /**
     * Get the remoteDebugEnabled property: Property to enable and disable Remote Debug on ASEV3.
     * 
     * @return the remoteDebugEnabled value.
     */
    public Boolean remoteDebugEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteDebugEnabled();
    }

    /**
     * Set the remoteDebugEnabled property: Property to enable and disable Remote Debug on ASEV3.
     * 
     * @param remoteDebugEnabled the remoteDebugEnabled value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner withRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseV3NetworkingConfigurationProperties();
        }
        this.innerProperties().withRemoteDebugEnabled(remoteDebugEnabled);
        return this;
    }

    /**
     * Get the inboundIpAddressOverride property: Customer provided Inbound IP Address. Only able to be set on Ase
     * create.
     * 
     * @return the inboundIpAddressOverride value.
     */
    public String inboundIpAddressOverride() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundIpAddressOverride();
    }

    /**
     * Set the inboundIpAddressOverride property: Customer provided Inbound IP Address. Only able to be set on Ase
     * create.
     * 
     * @param inboundIpAddressOverride the inboundIpAddressOverride value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner withInboundIpAddressOverride(String inboundIpAddressOverride) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseV3NetworkingConfigurationProperties();
        }
        this.innerProperties().withInboundIpAddressOverride(inboundIpAddressOverride);
        return this;
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
     * Reads an instance of AseV3NetworkingConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AseV3NetworkingConfigurationInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AseV3NetworkingConfigurationInner.
     */
    public static AseV3NetworkingConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AseV3NetworkingConfigurationInner deserializedAseV3NetworkingConfigurationInner
                = new AseV3NetworkingConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAseV3NetworkingConfigurationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAseV3NetworkingConfigurationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAseV3NetworkingConfigurationInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedAseV3NetworkingConfigurationInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedAseV3NetworkingConfigurationInner.innerProperties
                        = AseV3NetworkingConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAseV3NetworkingConfigurationInner;
        });
    }
}
