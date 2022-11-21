// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of role definition. */
@Fluent
public final class PolicyAssignmentPropertiesRoleDefinition {
    /*
     * Id of the role definition
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Display name of the role definition
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Type of the role definition
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of PolicyAssignmentPropertiesRoleDefinition class. */
    public PolicyAssignmentPropertiesRoleDefinition() {
    }

    /**
     * Get the id property: Id of the role definition.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the role definition.
     *
     * @param id the id value to set.
     * @return the PolicyAssignmentPropertiesRoleDefinition object itself.
     */
    public PolicyAssignmentPropertiesRoleDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName property: Display name of the role definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the role definition.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyAssignmentPropertiesRoleDefinition object itself.
     */
    public PolicyAssignmentPropertiesRoleDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the type property: Type of the role definition.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the role definition.
     *
     * @param type the type value to set.
     * @return the PolicyAssignmentPropertiesRoleDefinition object itself.
     */
    public PolicyAssignmentPropertiesRoleDefinition withType(String type) {
        this.type = type;
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
