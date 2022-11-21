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

/** notebookLinks. */
@Fluent
public final class MicrosoftGraphNotebookLinks {
    /*
     * externalLink
     */
    @JsonProperty(value = "oneNoteClientUrl")
    private MicrosoftGraphExternalLink oneNoteClientUrl;

    /*
     * externalLink
     */
    @JsonProperty(value = "oneNoteWebUrl")
    private MicrosoftGraphExternalLink oneNoteWebUrl;

    /*
     * notebookLinks
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphNotebookLinks class. */
    public MicrosoftGraphNotebookLinks() {
    }

    /**
     * Get the oneNoteClientUrl property: externalLink.
     *
     * @return the oneNoteClientUrl value.
     */
    public MicrosoftGraphExternalLink oneNoteClientUrl() {
        return this.oneNoteClientUrl;
    }

    /**
     * Set the oneNoteClientUrl property: externalLink.
     *
     * @param oneNoteClientUrl the oneNoteClientUrl value to set.
     * @return the MicrosoftGraphNotebookLinks object itself.
     */
    public MicrosoftGraphNotebookLinks withOneNoteClientUrl(MicrosoftGraphExternalLink oneNoteClientUrl) {
        this.oneNoteClientUrl = oneNoteClientUrl;
        return this;
    }

    /**
     * Get the oneNoteWebUrl property: externalLink.
     *
     * @return the oneNoteWebUrl value.
     */
    public MicrosoftGraphExternalLink oneNoteWebUrl() {
        return this.oneNoteWebUrl;
    }

    /**
     * Set the oneNoteWebUrl property: externalLink.
     *
     * @param oneNoteWebUrl the oneNoteWebUrl value to set.
     * @return the MicrosoftGraphNotebookLinks object itself.
     */
    public MicrosoftGraphNotebookLinks withOneNoteWebUrl(MicrosoftGraphExternalLink oneNoteWebUrl) {
        this.oneNoteWebUrl = oneNoteWebUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: notebookLinks.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: notebookLinks.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphNotebookLinks object itself.
     */
    public MicrosoftGraphNotebookLinks withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (oneNoteClientUrl() != null) {
            oneNoteClientUrl().validate();
        }
        if (oneNoteWebUrl() != null) {
            oneNoteWebUrl().validate();
        }
    }
}
