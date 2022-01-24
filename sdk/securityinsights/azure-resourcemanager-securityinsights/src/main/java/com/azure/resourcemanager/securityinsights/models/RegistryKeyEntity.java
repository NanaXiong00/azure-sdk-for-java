// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityInner;
import com.azure.resourcemanager.securityinsights.fluent.models.RegistryKeyEntityProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Represents a registry key entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("RegistryKey")
@Fluent
public final class RegistryKeyEntity extends EntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistryKeyEntity.class);

    /*
     * RegistryKey entity properties
     */
    @JsonProperty(value = "properties")
    private RegistryKeyEntityProperties innerProperties;

    /**
     * Get the innerProperties property: RegistryKey entity properties.
     *
     * @return the innerProperties value.
     */
    private RegistryKeyEntityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the hive property: the hive that holds the registry key.
     *
     * @return the hive value.
     */
    public RegistryHive hive() {
        return this.innerProperties() == null ? null : this.innerProperties().hive();
    }

    /**
     * Get the key property: The registry key path.
     *
     * @return the key value.
     */
    public String key() {
        return this.innerProperties() == null ? null : this.innerProperties().key();
    }

    /**
     * Get the additionalData property: A bag of custom fields that should be part of the entity and will be presented
     * to the user.
     *
     * @return the additionalData value.
     */
    public Map<String, Object> additionalData() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalData();
    }

    /**
     * Get the friendlyName property: The graph item display name which is a short humanly readable description of the
     * graph item instance. This property is optional and might be system generated.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
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
}
