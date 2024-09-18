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
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.NetworkInterfaceAuxiliaryMode;
import com.azure.resourcemanager.network.models.NetworkInterfaceAuxiliarySku;
import com.azure.resourcemanager.network.models.NetworkInterfaceDnsSettings;
import com.azure.resourcemanager.network.models.NetworkInterfaceMigrationPhase;
import com.azure.resourcemanager.network.models.NetworkInterfaceNicType;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * A network interface in a resource group.
 */
@Fluent
public final class NetworkInterfaceInner extends Resource {
    /*
     * The extended location of the network interface.
     */
    private ExtendedLocation extendedLocation;

    /*
     * Properties of the network interface.
     */
    private NetworkInterfacePropertiesFormatInner innerProperties;

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
     * Creates an instance of NetworkInterfaceInner class.
     */
    public NetworkInterfaceInner() {
    }

    /**
     * Get the extendedLocation property: The extended location of the network interface.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the network interface.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the network interface.
     * 
     * @return the innerProperties value.
     */
    private NetworkInterfacePropertiesFormatInner innerProperties() {
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withId(String id) {
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
    public NetworkInterfaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkInterfaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualMachine property: The reference to a virtual machine.
     * 
     * @return the virtualMachine value.
     */
    public SubResource virtualMachine() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachine();
    }

    /**
     * Get the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     * 
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroup();
    }

    /**
     * Set the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    /**
     * Get the privateEndpoint property: A reference to the private endpoint to which the network interface is linked.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpoint();
    }

    /**
     * Get the ipConfigurations property: A list of IPConfigurations of the network interface.
     * 
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: A list of IPConfigurations of the network interface.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withIpConfigurations(List<NetworkInterfaceIpConfigurationInner> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the tapConfigurations property: A list of TapConfigurations of the network interface.
     * 
     * @return the tapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> tapConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().tapConfigurations();
    }

    /**
     * Get the dnsSettings property: The DNS settings in network interface.
     * 
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The DNS settings in network interface.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     * 
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().macAddress();
    }

    /**
     * Get the primary property: Whether this is a primary network interface on a virtual machine.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Get the vnetEncryptionSupported property: Whether the virtual machine this nic is attached to supports
     * encryption.
     * 
     * @return the vnetEncryptionSupported value.
     */
    public Boolean vnetEncryptionSupported() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetEncryptionSupported();
    }

    /**
     * Get the enableAcceleratedNetworking property: If the network interface is configured for accelerated networking.
     * Not applicable to VM sizes which require accelerated networking.
     * 
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAcceleratedNetworking();
    }

    /**
     * Set the enableAcceleratedNetworking property: If the network interface is configured for accelerated networking.
     * Not applicable to VM sizes which require accelerated networking.
     * 
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    /**
     * Get the disableTcpStateTracking property: Indicates whether to disable tcp state tracking.
     * 
     * @return the disableTcpStateTracking value.
     */
    public Boolean disableTcpStateTracking() {
        return this.innerProperties() == null ? null : this.innerProperties().disableTcpStateTracking();
    }

    /**
     * Set the disableTcpStateTracking property: Indicates whether to disable tcp state tracking.
     * 
     * @param disableTcpStateTracking the disableTcpStateTracking value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDisableTcpStateTracking(Boolean disableTcpStateTracking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withDisableTcpStateTracking(disableTcpStateTracking);
        return this;
    }

    /**
     * Get the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     * 
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpForwarding();
    }

    /**
     * Set the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     * 
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableIpForwarding(Boolean enableIpForwarding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withEnableIpForwarding(enableIpForwarding);
        return this;
    }

    /**
     * Get the hostedWorkloads property: A list of references to linked BareMetal resources.
     * 
     * @return the hostedWorkloads value.
     */
    public List<String> hostedWorkloads() {
        return this.innerProperties() == null ? null : this.innerProperties().hostedWorkloads();
    }

    /**
     * Get the dscpConfiguration property: A reference to the dscp configuration to which the network interface is
     * linked.
     * 
     * @return the dscpConfiguration value.
     */
    public SubResource dscpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dscpConfiguration();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network interface resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the workloadType property: WorkloadType of the NetworkInterface for BareMetal resources.
     * 
     * @return the workloadType value.
     */
    public String workloadType() {
        return this.innerProperties() == null ? null : this.innerProperties().workloadType();
    }

    /**
     * Set the workloadType property: WorkloadType of the NetworkInterface for BareMetal resources.
     * 
     * @param workloadType the workloadType value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withWorkloadType(String workloadType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withWorkloadType(workloadType);
        return this;
    }

    /**
     * Get the nicType property: Type of Network Interface resource.
     * 
     * @return the nicType value.
     */
    public NetworkInterfaceNicType nicType() {
        return this.innerProperties() == null ? null : this.innerProperties().nicType();
    }

    /**
     * Set the nicType property: Type of Network Interface resource.
     * 
     * @param nicType the nicType value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNicType(NetworkInterfaceNicType nicType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withNicType(nicType);
        return this;
    }

    /**
     * Get the privateLinkService property: Privatelinkservice of the network interface resource.
     * 
     * @return the privateLinkService value.
     */
    public PrivateLinkServiceInner privateLinkService() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkService();
    }

    /**
     * Set the privateLinkService property: Privatelinkservice of the network interface resource.
     * 
     * @param privateLinkService the privateLinkService value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withPrivateLinkService(PrivateLinkServiceInner privateLinkService) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withPrivateLinkService(privateLinkService);
        return this;
    }

    /**
     * Get the migrationPhase property: Migration phase of Network Interface resource.
     * 
     * @return the migrationPhase value.
     */
    public NetworkInterfaceMigrationPhase migrationPhase() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationPhase();
    }

    /**
     * Set the migrationPhase property: Migration phase of Network Interface resource.
     * 
     * @param migrationPhase the migrationPhase value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withMigrationPhase(NetworkInterfaceMigrationPhase migrationPhase) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withMigrationPhase(migrationPhase);
        return this;
    }

    /**
     * Get the auxiliaryMode property: Auxiliary mode of Network Interface resource.
     * 
     * @return the auxiliaryMode value.
     */
    public NetworkInterfaceAuxiliaryMode auxiliaryMode() {
        return this.innerProperties() == null ? null : this.innerProperties().auxiliaryMode();
    }

    /**
     * Set the auxiliaryMode property: Auxiliary mode of Network Interface resource.
     * 
     * @param auxiliaryMode the auxiliaryMode value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withAuxiliaryMode(NetworkInterfaceAuxiliaryMode auxiliaryMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withAuxiliaryMode(auxiliaryMode);
        return this;
    }

    /**
     * Get the auxiliarySku property: Auxiliary sku of Network Interface resource.
     * 
     * @return the auxiliarySku value.
     */
    public NetworkInterfaceAuxiliarySku auxiliarySku() {
        return this.innerProperties() == null ? null : this.innerProperties().auxiliarySku();
    }

    /**
     * Set the auxiliarySku property: Auxiliary sku of Network Interface resource.
     * 
     * @param auxiliarySku the auxiliarySku value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withAuxiliarySku(NetworkInterfaceAuxiliarySku auxiliarySku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfacePropertiesFormatInner();
        }
        this.innerProperties().withAuxiliarySku(auxiliarySku);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
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
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkInterfaceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkInterfaceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkInterfaceInner.
     */
    public static NetworkInterfaceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkInterfaceInner deserializedNetworkInterfaceInner = new NetworkInterfaceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedNetworkInterfaceInner.withTags(tags);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.innerProperties
                        = NetworkInterfacePropertiesFormatInner.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedNetworkInterfaceInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkInterfaceInner;
        });
    }
}
