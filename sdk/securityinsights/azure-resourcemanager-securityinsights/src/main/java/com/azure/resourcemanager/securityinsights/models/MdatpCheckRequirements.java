// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.MdatpCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents MDATP (Microsoft Defender Advanced Threat Protection) requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MicrosoftDefenderAdvancedThreatProtection")
@Fluent
public final class MdatpCheckRequirements extends DataConnectorsCheckRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MdatpCheckRequirements.class);

    /*
     * MDATP (Microsoft Defender Advanced Threat Protection) requirements check
     * properties.
     */
    @JsonProperty(value = "properties")
    private MdatpCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: MDATP (Microsoft Defender Advanced Threat Protection) requirements check
     * properties.
     *
     * @return the innerProperties value.
     */
    private MdatpCheckRequirementsProperties innerProperties() {
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
