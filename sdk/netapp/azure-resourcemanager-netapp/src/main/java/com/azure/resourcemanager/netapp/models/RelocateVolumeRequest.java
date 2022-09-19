// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Relocate volume request. */
@Fluent
public final class RelocateVolumeRequest {
    /*
     * New creation token for the volume that controls the mount point name
     */
    @JsonProperty(value = "creationToken")
    private String creationToken;

    /**
     * Get the creationToken property: New creation token for the volume that controls the mount point name.
     *
     * @return the creationToken value.
     */
    public String creationToken() {
        return this.creationToken;
    }

    /**
     * Set the creationToken property: New creation token for the volume that controls the mount point name.
     *
     * @param creationToken the creationToken value to set.
     * @return the RelocateVolumeRequest object itself.
     */
    public RelocateVolumeRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
