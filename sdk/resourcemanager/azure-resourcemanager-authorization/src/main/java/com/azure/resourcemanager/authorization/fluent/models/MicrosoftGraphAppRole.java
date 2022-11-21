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
import java.util.UUID;

/** appRole. */
@Fluent
public final class MicrosoftGraphAppRole {
    /*
     * Specifies whether this app role can be assigned to users and groups (by setting to ['User']), to other
     * application's (by setting to ['Application'], or both (by setting to ['User', 'Application']). App roles
     * supporting assignment to other applications' service principals are also known as application permissions. The
     * 'Application' value is only supported for app roles defined on application entities.
     */
    @JsonProperty(value = "allowedMemberTypes")
    private List<String> allowedMemberTypes;

    /*
     * The description for the app role. This is displayed when the app role is being assigned and, if the app role
     * functions as an application permission, during  consent experiences.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Display name for the permission that appears in the app role assignment and consent experiences.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Unique role identifier inside the appRoles collection. When creating a new app role, a new Guid identifier must
     * be provided.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /*
     * When creating or updating an app role, this must be set to true (which is the default). To delete a role, this
     * must first be set to false.  At that point, in a subsequent call, this role may be removed.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Specifies if the app role is defined on the application object or on the servicePrincipal entity. Must not be
     * included in any POST or PATCH requests. Read-only.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Specifies the value to include in the roles claim in ID tokens and access tokens authenticating an assigned user
     * or service principal. Must not exceed 120 characters in length. Allowed characters are : ! # $ % & ' ( ) * + , -
     * . / : ;  =  ? @ [ ] ^ + _  {  } ~, as well as characters in the ranges 0-9, A-Z and a-z. Any other character,
     * including the space character, are not allowed.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * appRole
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphAppRole class. */
    public MicrosoftGraphAppRole() {
    }

    /**
     * Get the allowedMemberTypes property: Specifies whether this app role can be assigned to users and groups (by
     * setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User',
     * 'Application']). App roles supporting assignment to other applications' service principals are also known as
     * application permissions. The 'Application' value is only supported for app roles defined on application entities.
     *
     * @return the allowedMemberTypes value.
     */
    public List<String> allowedMemberTypes() {
        return this.allowedMemberTypes;
    }

    /**
     * Set the allowedMemberTypes property: Specifies whether this app role can be assigned to users and groups (by
     * setting to ['User']), to other application's (by setting to ['Application'], or both (by setting to ['User',
     * 'Application']). App roles supporting assignment to other applications' service principals are also known as
     * application permissions. The 'Application' value is only supported for app roles defined on application entities.
     *
     * @param allowedMemberTypes the allowedMemberTypes value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withAllowedMemberTypes(List<String> allowedMemberTypes) {
        this.allowedMemberTypes = allowedMemberTypes;
        return this;
    }

    /**
     * Get the description property: The description for the app role. This is displayed when the app role is being
     * assigned and, if the app role functions as an application permission, during consent experiences.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the app role. This is displayed when the app role is being
     * assigned and, if the app role functions as an application permission, during consent experiences.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the permission that appears in the app role assignment and consent
     * experiences.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the permission that appears in the app role assignment and consent
     * experiences.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the id property: Unique role identifier inside the appRoles collection. When creating a new app role, a new
     * Guid identifier must be provided.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id property: Unique role identifier inside the appRoles collection. When creating a new app role, a new
     * Guid identifier must be provided.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the isEnabled property: When creating or updating an app role, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: When creating or updating an app role, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the origin property: Specifies if the app role is defined on the application object or on the
     * servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Specifies if the app role is defined on the application object or on the
     * servicePrincipal entity. Must not be included in any POST or PATCH requests. Read-only.
     *
     * @param origin the origin value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the value property: Specifies the value to include in the roles claim in ID tokens and access tokens
     * authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed
     * characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges
     * 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Specifies the value to include in the roles claim in ID tokens and access tokens
     * authenticating an assigned user or service principal. Must not exceed 120 characters in length. Allowed
     * characters are : ! # $ % &amp; ' ( ) * + , - . / : ; = ? @ [ ] ^ + _ { } ~, as well as characters in the ranges
     * 0-9, A-Z and a-z. Any other character, including the space character, are not allowed.
     *
     * @param value the value value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the additionalProperties property: appRole.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: appRole.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAppRole object itself.
     */
    public MicrosoftGraphAppRole withAdditionalProperties(Map<String, Object> additionalProperties) {
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
