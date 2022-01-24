// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.MstiCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents Microsoft Threat Intelligence requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MicrosoftThreatIntelligence")
@Fluent
public final class MstiCheckRequirements extends DataConnectorsCheckRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MstiCheckRequirements.class);

    /*
     * Microsoft Threat Intelligence requirements check properties.
     */
    @JsonProperty(value = "properties")
    private MstiCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: Microsoft Threat Intelligence requirements check properties.
     *
     * @return the innerProperties value.
     */
    private MstiCheckRequirementsProperties innerProperties() {
        return this.innerProperties;
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
