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

/** chatMessageMention. */
@Fluent
public final class MicrosoftGraphChatMessageMention {
    /*
     * Index of an entity being mentioned in the specified chatMessage. Matches the {index} value in the corresponding
     * <at id='{index}'> tag in the message body.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * identitySet
     */
    @JsonProperty(value = "mentioned")
    private MicrosoftGraphIdentitySet mentioned;

    /*
     * String used to represent the mention. For example, a user's display name, a team name.
     */
    @JsonProperty(value = "mentionText")
    private String mentionText;

    /*
     * chatMessageMention
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphChatMessageMention class. */
    public MicrosoftGraphChatMessageMention() {
    }

    /**
     * Get the id property: Index of an entity being mentioned in the specified chatMessage. Matches the {index} value
     * in the corresponding &lt;at id='{index}'&gt; tag in the message body.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id property: Index of an entity being mentioned in the specified chatMessage. Matches the {index} value
     * in the corresponding &lt;at id='{index}'&gt; tag in the message body.
     *
     * @param id the id value to set.
     * @return the MicrosoftGraphChatMessageMention object itself.
     */
    public MicrosoftGraphChatMessageMention withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the mentioned property: identitySet.
     *
     * @return the mentioned value.
     */
    public MicrosoftGraphIdentitySet mentioned() {
        return this.mentioned;
    }

    /**
     * Set the mentioned property: identitySet.
     *
     * @param mentioned the mentioned value to set.
     * @return the MicrosoftGraphChatMessageMention object itself.
     */
    public MicrosoftGraphChatMessageMention withMentioned(MicrosoftGraphIdentitySet mentioned) {
        this.mentioned = mentioned;
        return this;
    }

    /**
     * Get the mentionText property: String used to represent the mention. For example, a user's display name, a team
     * name.
     *
     * @return the mentionText value.
     */
    public String mentionText() {
        return this.mentionText;
    }

    /**
     * Set the mentionText property: String used to represent the mention. For example, a user's display name, a team
     * name.
     *
     * @param mentionText the mentionText value to set.
     * @return the MicrosoftGraphChatMessageMention object itself.
     */
    public MicrosoftGraphChatMessageMention withMentionText(String mentionText) {
        this.mentionText = mentionText;
        return this;
    }

    /**
     * Get the additionalProperties property: chatMessageMention.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: chatMessageMention.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChatMessageMention object itself.
     */
    public MicrosoftGraphChatMessageMention withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (mentioned() != null) {
            mentioned().validate();
        }
    }
}
