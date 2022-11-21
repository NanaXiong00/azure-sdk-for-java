// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** requiredResourceAccess. */
@Fluent
public final class MicrosoftGraphRequiredResourceAccess {
    /*
     * The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
     */
    @JsonProperty(value = "resourceAccess")
    private List<MicrosoftGraphResourceAccess> resourceAccess;

    /*
     * The unique identifier for the resource that the application requires access to.  This should be equal to the
     * appId declared on the target resource application.
     */
    @JsonProperty(value = "resourceAppId")
    private String resourceAppId;

    /*
     * requiredResourceAccess
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphRequiredResourceAccess class. */
    public MicrosoftGraphRequiredResourceAccess() {
    }

    /**
     * Get the resourceAccess property: The list of OAuth2.0 permission scopes and app roles that the application
     * requires from the specified resource.
     *
     * @return the resourceAccess value.
     */
    public List<MicrosoftGraphResourceAccess> resourceAccess() {
        return this.resourceAccess;
    }

    /**
     * Set the resourceAccess property: The list of OAuth2.0 permission scopes and app roles that the application
     * requires from the specified resource.
     *
     * @param resourceAccess the resourceAccess value to set.
     * @return the MicrosoftGraphRequiredResourceAccess object itself.
     */
    public MicrosoftGraphRequiredResourceAccess withResourceAccess(List<MicrosoftGraphResourceAccess> resourceAccess) {
        this.resourceAccess = resourceAccess;
        return this;
    }

    /**
     * Get the resourceAppId property: The unique identifier for the resource that the application requires access to.
     * This should be equal to the appId declared on the target resource application.
     *
     * @return the resourceAppId value.
     */
    public String resourceAppId() {
        return this.resourceAppId;
    }

    /**
     * Set the resourceAppId property: The unique identifier for the resource that the application requires access to.
     * This should be equal to the appId declared on the target resource application.
     *
     * @param resourceAppId the resourceAppId value to set.
     * @return the MicrosoftGraphRequiredResourceAccess object itself.
     */
    public MicrosoftGraphRequiredResourceAccess withResourceAppId(String resourceAppId) {
        this.resourceAppId = resourceAppId;
        return this;
    }

    /**
     * Get the additionalProperties property: requiredResourceAccess.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: requiredResourceAccess.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphRequiredResourceAccess object itself.
     */
    public MicrosoftGraphRequiredResourceAccess withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceAccess() != null) {
            resourceAccess().forEach(e -> e.validate());
        }
    }
}
