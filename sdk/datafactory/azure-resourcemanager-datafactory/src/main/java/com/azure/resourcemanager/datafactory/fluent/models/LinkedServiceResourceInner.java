// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Linked service resource type. */
@Fluent
public final class LinkedServiceResourceInner extends SubResource {
    /*
     * Properties of linked service.
     */
    @JsonProperty(value = "properties", required = true)
    private LinkedService properties;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the properties property: Properties of linked service.
     *
     * @return the properties value.
     */
    public LinkedService properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of linked service.
     *
     * @param properties the properties value to set.
     * @return the LinkedServiceResourceInner object itself.
     */
    public LinkedServiceResourceInner withProperties(LinkedService properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public LinkedServiceResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model LinkedServiceResourceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedServiceResourceInner.class);
}
