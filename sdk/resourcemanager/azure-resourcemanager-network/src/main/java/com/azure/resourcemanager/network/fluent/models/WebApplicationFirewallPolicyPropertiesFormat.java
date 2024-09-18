// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ApplicationGatewayForContainersReferenceDefinition;
import com.azure.resourcemanager.network.models.ManagedRulesDefinition;
import com.azure.resourcemanager.network.models.PolicySettings;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.WebApplicationFirewallCustomRule;
import com.azure.resourcemanager.network.models.WebApplicationFirewallPolicyResourceState;
import java.io.IOException;
import java.util.List;

/**
 * Defines web application firewall policy properties.
 */
@Fluent
public final class WebApplicationFirewallPolicyPropertiesFormat
    implements JsonSerializable<WebApplicationFirewallPolicyPropertiesFormat> {
    /*
     * The PolicySettings for policy.
     */
    private PolicySettings policySettings;

    /*
     * The custom rules inside the policy.
     */
    private List<WebApplicationFirewallCustomRule> customRules;

    /*
     * A collection of references to application gateways.
     */
    private List<ApplicationGatewayInner> applicationGateways;

    /*
     * The provisioning state of the web application firewall policy resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Resource status of the policy.
     */
    private WebApplicationFirewallPolicyResourceState resourceState;

    /*
     * Describes the managedRules structure.
     */
    private ManagedRulesDefinition managedRules;

    /*
     * A collection of references to application gateway http listeners.
     */
    private List<SubResource> httpListeners;

    /*
     * A collection of references to application gateway path rules.
     */
    private List<SubResource> pathBasedRules;

    /*
     * A collection of references to application gateway for containers.
     */
    private List<ApplicationGatewayForContainersReferenceDefinition> applicationGatewayForContainers;

    /**
     * Creates an instance of WebApplicationFirewallPolicyPropertiesFormat class.
     */
    public WebApplicationFirewallPolicyPropertiesFormat() {
    }

    /**
     * Get the policySettings property: The PolicySettings for policy.
     * 
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set the policySettings property: The PolicySettings for policy.
     * 
     * @param policySettings the policySettings value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get the customRules property: The custom rules inside the policy.
     * 
     * @return the customRules value.
     */
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.customRules;
    }

    /**
     * Set the customRules property: The custom rules inside the policy.
     * 
     * @param customRules the customRules value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat
        withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get the applicationGateways property: A collection of references to application gateways.
     * 
     * @return the applicationGateways value.
     */
    public List<ApplicationGatewayInner> applicationGateways() {
        return this.applicationGateways;
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall policy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     * 
     * @return the resourceState value.
     */
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the managedRules property: Describes the managedRules structure.
     * 
     * @return the managedRules value.
     */
    public ManagedRulesDefinition managedRules() {
        return this.managedRules;
    }

    /**
     * Set the managedRules property: Describes the managedRules structure.
     * 
     * @param managedRules the managedRules value to set.
     * @return the WebApplicationFirewallPolicyPropertiesFormat object itself.
     */
    public WebApplicationFirewallPolicyPropertiesFormat withManagedRules(ManagedRulesDefinition managedRules) {
        this.managedRules = managedRules;
        return this;
    }

    /**
     * Get the httpListeners property: A collection of references to application gateway http listeners.
     * 
     * @return the httpListeners value.
     */
    public List<SubResource> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Get the pathBasedRules property: A collection of references to application gateway path rules.
     * 
     * @return the pathBasedRules value.
     */
    public List<SubResource> pathBasedRules() {
        return this.pathBasedRules;
    }

    /**
     * Get the applicationGatewayForContainers property: A collection of references to application gateway for
     * containers.
     * 
     * @return the applicationGatewayForContainers value.
     */
    public List<ApplicationGatewayForContainersReferenceDefinition> applicationGatewayForContainers() {
        return this.applicationGatewayForContainers;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policySettings() != null) {
            policySettings().validate();
        }
        if (customRules() != null) {
            customRules().forEach(e -> e.validate());
        }
        if (applicationGateways() != null) {
            applicationGateways().forEach(e -> e.validate());
        }
        if (managedRules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property managedRules in model WebApplicationFirewallPolicyPropertiesFormat"));
        } else {
            managedRules().validate();
        }
        if (applicationGatewayForContainers() != null) {
            applicationGatewayForContainers().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallPolicyPropertiesFormat.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("managedRules", this.managedRules);
        jsonWriter.writeJsonField("policySettings", this.policySettings);
        jsonWriter.writeArrayField("customRules", this.customRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebApplicationFirewallPolicyPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebApplicationFirewallPolicyPropertiesFormat if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebApplicationFirewallPolicyPropertiesFormat.
     */
    public static WebApplicationFirewallPolicyPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebApplicationFirewallPolicyPropertiesFormat deserializedWebApplicationFirewallPolicyPropertiesFormat
                = new WebApplicationFirewallPolicyPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("managedRules".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.managedRules
                        = ManagedRulesDefinition.fromJson(reader);
                } else if ("policySettings".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.policySettings
                        = PolicySettings.fromJson(reader);
                } else if ("customRules".equals(fieldName)) {
                    List<WebApplicationFirewallCustomRule> customRules
                        = reader.readArray(reader1 -> WebApplicationFirewallCustomRule.fromJson(reader1));
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.customRules = customRules;
                } else if ("applicationGateways".equals(fieldName)) {
                    List<ApplicationGatewayInner> applicationGateways
                        = reader.readArray(reader1 -> ApplicationGatewayInner.fromJson(reader1));
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.applicationGateways = applicationGateways;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("resourceState".equals(fieldName)) {
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.resourceState
                        = WebApplicationFirewallPolicyResourceState.fromString(reader.getString());
                } else if ("httpListeners".equals(fieldName)) {
                    List<SubResource> httpListeners = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.httpListeners = httpListeners;
                } else if ("pathBasedRules".equals(fieldName)) {
                    List<SubResource> pathBasedRules = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.pathBasedRules = pathBasedRules;
                } else if ("applicationGatewayForContainers".equals(fieldName)) {
                    List<ApplicationGatewayForContainersReferenceDefinition> applicationGatewayForContainers = reader
                        .readArray(reader1 -> ApplicationGatewayForContainersReferenceDefinition.fromJson(reader1));
                    deserializedWebApplicationFirewallPolicyPropertiesFormat.applicationGatewayForContainers
                        = applicationGatewayForContainers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebApplicationFirewallPolicyPropertiesFormat;
        });
    }
}
