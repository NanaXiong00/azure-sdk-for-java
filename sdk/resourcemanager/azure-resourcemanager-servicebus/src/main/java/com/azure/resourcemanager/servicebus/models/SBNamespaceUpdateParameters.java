// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicebus.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.servicebus.fluent.models.SBNamespaceUpdateProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Description of a namespace resource.
 */
@Fluent
public final class SBNamespaceUpdateParameters extends ResourceNamespacePatch {
    /*
     * Properties of SKU
     */
    private SBSku sku;

    /*
     * Properties of the namespace.
     */
    private SBNamespaceUpdateProperties innerProperties;

    /*
     * Properties of BYOK Identity description
     */
    private Identity identity;

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
     * Creates an instance of SBNamespaceUpdateParameters class.
     */
    public SBNamespaceUpdateParameters() {
    }

    /**
     * Get the sku property: Properties of SKU.
     * 
     * @return the sku value.
     */
    public SBSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of SKU.
     * 
     * @param sku the sku value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withSku(SBSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the namespace.
     * 
     * @return the innerProperties value.
     */
    private SBNamespaceUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Properties of BYOK Identity description.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Properties of BYOK Identity description.
     * 
     * @param identity the identity value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
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
    public SBNamespaceUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SBNamespaceUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Status of the namespace.
     * 
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     * 
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusEndpoint();
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.innerProperties() == null ? null : this.innerProperties().metricId();
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     * 
     * @param encryption the encryption value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceUpdateProperties();
        }
        this.innerProperties().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Get the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: This property disables SAS authentication for the Service Bus namespace.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceUpdateProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the alternateName property: Alternate name for namespace.
     * 
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.innerProperties() == null ? null : this.innerProperties().alternateName();
    }

    /**
     * Set the alternateName property: Alternate name for namespace.
     * 
     * @param alternateName the alternateName value to set.
     * @return the SBNamespaceUpdateParameters object itself.
     */
    public SBNamespaceUpdateParameters withAlternateName(String alternateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBNamespaceUpdateProperties();
        }
        this.innerProperties().withAlternateName(alternateName);
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
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
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
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SBNamespaceUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SBNamespaceUpdateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SBNamespaceUpdateParameters.
     */
    public static SBNamespaceUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SBNamespaceUpdateParameters deserializedSBNamespaceUpdateParameters = new SBNamespaceUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSBNamespaceUpdateParameters.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.sku = SBSku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.innerProperties
                        = SBNamespaceUpdateProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedSBNamespaceUpdateParameters.identity = Identity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSBNamespaceUpdateParameters;
        });
    }
}
