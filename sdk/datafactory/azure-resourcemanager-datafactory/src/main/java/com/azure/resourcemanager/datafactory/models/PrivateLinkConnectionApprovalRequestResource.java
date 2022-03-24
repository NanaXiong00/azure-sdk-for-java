// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private Endpoint Connection Approval ARM resource. */
@Fluent
public final class PrivateLinkConnectionApprovalRequestResource extends SubResource {
    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private PrivateLinkConnectionApprovalRequest properties;

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
     * Get the properties property: Core resource properties.
     *
     * @return the properties value.
     */
    public PrivateLinkConnectionApprovalRequest properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Core resource properties.
     *
     * @param properties the properties value to set.
     * @return the PrivateLinkConnectionApprovalRequestResource object itself.
     */
    public PrivateLinkConnectionApprovalRequestResource withProperties(
        PrivateLinkConnectionApprovalRequest properties) {
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
    public PrivateLinkConnectionApprovalRequestResource withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
