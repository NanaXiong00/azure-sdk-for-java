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
import java.util.Map;

/** identity. */
@Fluent
public class MicrosoftGraphIdentity {
    /*
     * The identity's display name. Note that this may not always be available or up to date. For example, if a user
     * changes their display name, the API may show the new value in a future response, but the items associated with
     * the user won't show up as having changed when using delta.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Unique identifier for the identity.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * identity
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphIdentity class. */
    public MicrosoftGraphIdentity() {
    }

    /**
     * Get the displayName property: The identity's display name. Note that this may not always be available or up to
     * date. For example, if a user changes their display name, the API may show the new value in a future response, but
     * the items associated with the user won't show up as having changed when using delta.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The identity's display name. Note that this may not always be available or up to
     * date. For example, if a user changes their display name, the API may show the new value in a future response, but
     * the items associated with the user won't show up as having changed when using delta.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphIdentity object itself.
     */
    public MicrosoftGraphIdentity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the id property: Unique identifier for the identity.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique identifier for the identity.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphIdentity object itself.
     */
    public MicrosoftGraphIdentity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the additionalProperties property: identity.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: identity.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphIdentity object itself.
     */
    public MicrosoftGraphIdentity withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}
