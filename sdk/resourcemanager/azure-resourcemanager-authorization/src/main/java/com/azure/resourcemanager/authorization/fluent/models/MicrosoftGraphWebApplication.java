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

/** webApplication. */
@Fluent
public final class MicrosoftGraphWebApplication {
    /*
     * Home page or landing page of the application.
     */
    @JsonProperty(value = "homePageUrl")
    private String homePageUrl;

    /*
     * implicitGrantSettings
     */
    @JsonProperty(value = "implicitGrantSettings")
    private MicrosoftGraphImplicitGrantSettings implicitGrantSettings;

    /*
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel,
     * back-channel or SAML logout protocols.
     */
    @JsonProperty(value = "logoutUrl")
    private String logoutUrl;

    /*
     * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization
     * codes and access tokens are sent.
     */
    @JsonProperty(value = "redirectUris")
    private List<String> redirectUris;

    /*
     * webApplication
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphWebApplication class. */
    public MicrosoftGraphWebApplication() {
    }

    /**
     * Get the homePageUrl property: Home page or landing page of the application.
     *
     * @return the homePageUrl value.
     */
    public String homePageUrl() {
        return this.homePageUrl;
    }

    /**
     * Set the homePageUrl property: Home page or landing page of the application.
     *
     * @param homePageUrl the homePageUrl value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
        return this;
    }

    /**
     * Get the implicitGrantSettings property: implicitGrantSettings.
     *
     * @return the implicitGrantSettings value.
     */
    public MicrosoftGraphImplicitGrantSettings implicitGrantSettings() {
        return this.implicitGrantSettings;
    }

    /**
     * Set the implicitGrantSettings property: implicitGrantSettings.
     *
     * @param implicitGrantSettings the implicitGrantSettings value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withImplicitGrantSettings(
        MicrosoftGraphImplicitGrantSettings implicitGrantSettings) {
        this.implicitGrantSettings = implicitGrantSettings;
        return this;
    }

    /**
     * Get the logoutUrl property: Specifies the URL that will be used by Microsoft's authorization service to logout an
     * user using front-channel, back-channel or SAML logout protocols.
     *
     * @return the logoutUrl value.
     */
    public String logoutUrl() {
        return this.logoutUrl;
    }

    /**
     * Set the logoutUrl property: Specifies the URL that will be used by Microsoft's authorization service to logout an
     * user using front-channel, back-channel or SAML logout protocols.
     *
     * @param logoutUrl the logoutUrl value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
        return this;
    }

    /**
     * Get the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     *
     * @return the redirectUris value.
     */
    public List<String> redirectUris() {
        return this.redirectUris;
    }

    /**
     * Set the redirectUris property: Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs
     * where OAuth 2.0 authorization codes and access tokens are sent.
     *
     * @param redirectUris the redirectUris value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }

    /**
     * Get the additionalProperties property: webApplication.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: webApplication.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWebApplication object itself.
     */
    public MicrosoftGraphWebApplication withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (implicitGrantSettings() != null) {
            implicitGrantSettings().validate();
        }
    }
}
