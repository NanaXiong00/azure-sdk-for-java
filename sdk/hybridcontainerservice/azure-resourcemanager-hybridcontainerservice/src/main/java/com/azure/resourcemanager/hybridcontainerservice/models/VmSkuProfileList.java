// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VmSkuProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of supported VM SKUs.
 */
@Fluent
public final class VmSkuProfileList {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<VmSkuProfileInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of VmSkuProfileList class.
     */
    public VmSkuProfileList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<VmSkuProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the VmSkuProfileList object itself.
     */
    public VmSkuProfileList withValue(List<VmSkuProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VmSkuProfileList object itself.
     */
    public VmSkuProfileList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
