// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** activityHistoryItem. */
@Fluent
public final class MicrosoftGraphActivityHistoryItem extends MicrosoftGraphEntity {
    /*
     * Optional. The duration of active user engagement. if not supplied, this is calculated from the startedDateTime
     * and lastActiveDateTime.
     */
    @JsonProperty(value = "activeDurationSeconds")
    private Integer activeDurationSeconds;

    /*
     * Set by the server. DateTime in UTC when the object was created on the server.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be set by the client.
     */
    @JsonProperty(value = "expirationDateTime")
    private OffsetDateTime expirationDateTime;

    /*
     * Optional. UTC DateTime when the historyItem (activity session) was last understood as active or finished - if
     * null, historyItem status should be Ongoing.
     */
    @JsonProperty(value = "lastActiveDateTime")
    private OffsetDateTime lastActiveDateTime;

    /*
     * Set by the server. DateTime in UTC when the object was modified on the server.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * Required. UTC DateTime when the historyItem (activity session) was started. Required for timeline history.
     */
    @JsonProperty(value = "startedDateTime")
    private OffsetDateTime startedDateTime;

    /*
     * status
     */
    @JsonProperty(value = "status")
    private MicrosoftGraphStatus status;

    /*
     * Optional. The timezone in which the user's device used to generate the activity was located at activity creation
     * time. Values supplied as Olson IDs in order to support cross-platform representation.
     */
    @JsonProperty(value = "userTimezone")
    private String userTimezone;

    /*
     * userActivity
     */
    @JsonProperty(value = "activity")
    private MicrosoftGraphUserActivity activity;

    /*
     * activityHistoryItem
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphActivityHistoryItem class. */
    public MicrosoftGraphActivityHistoryItem() {
    }

    /**
     * Get the activeDurationSeconds property: Optional. The duration of active user engagement. if not supplied, this
     * is calculated from the startedDateTime and lastActiveDateTime.
     *
     * @return the activeDurationSeconds value.
     */
    public Integer activeDurationSeconds() {
        return this.activeDurationSeconds;
    }

    /**
     * Set the activeDurationSeconds property: Optional. The duration of active user engagement. if not supplied, this
     * is calculated from the startedDateTime and lastActiveDateTime.
     *
     * @param activeDurationSeconds the activeDurationSeconds value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withActiveDurationSeconds(Integer activeDurationSeconds) {
        this.activeDurationSeconds = activeDurationSeconds;
        return this;
    }

    /**
     * Get the createdDateTime property: Set by the server. DateTime in UTC when the object was created on the server.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Set by the server. DateTime in UTC when the object was created on the server.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be
     * set by the client.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime expirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Optional. UTC DateTime when the historyItem will undergo hard-delete. Can be
     * set by the client.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the lastActiveDateTime property: Optional. UTC DateTime when the historyItem (activity session) was last
     * understood as active or finished - if null, historyItem status should be Ongoing.
     *
     * @return the lastActiveDateTime value.
     */
    public OffsetDateTime lastActiveDateTime() {
        return this.lastActiveDateTime;
    }

    /**
     * Set the lastActiveDateTime property: Optional. UTC DateTime when the historyItem (activity session) was last
     * understood as active or finished - if null, historyItem status should be Ongoing.
     *
     * @param lastActiveDateTime the lastActiveDateTime value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withLastActiveDateTime(OffsetDateTime lastActiveDateTime) {
        this.lastActiveDateTime = lastActiveDateTime;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: Set by the server. DateTime in UTC when the object was modified on the
     * server.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: Set by the server. DateTime in UTC when the object was modified on the
     * server.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the startedDateTime property: Required. UTC DateTime when the historyItem (activity session) was started.
     * Required for timeline history.
     *
     * @return the startedDateTime value.
     */
    public OffsetDateTime startedDateTime() {
        return this.startedDateTime;
    }

    /**
     * Set the startedDateTime property: Required. UTC DateTime when the historyItem (activity session) was started.
     * Required for timeline history.
     *
     * @param startedDateTime the startedDateTime value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withStartedDateTime(OffsetDateTime startedDateTime) {
        this.startedDateTime = startedDateTime;
        return this;
    }

    /**
     * Get the status property: status.
     *
     * @return the status value.
     */
    public MicrosoftGraphStatus status() {
        return this.status;
    }

    /**
     * Set the status property: status.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withStatus(MicrosoftGraphStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the userTimezone property: Optional. The timezone in which the user's device used to generate the activity
     * was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform
     * representation.
     *
     * @return the userTimezone value.
     */
    public String userTimezone() {
        return this.userTimezone;
    }

    /**
     * Set the userTimezone property: Optional. The timezone in which the user's device used to generate the activity
     * was located at activity creation time. Values supplied as Olson IDs in order to support cross-platform
     * representation.
     *
     * @param userTimezone the userTimezone value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withUserTimezone(String userTimezone) {
        this.userTimezone = userTimezone;
        return this;
    }

    /**
     * Get the activity property: userActivity.
     *
     * @return the activity value.
     */
    public MicrosoftGraphUserActivity activity() {
        return this.activity;
    }

    /**
     * Set the activity property: userActivity.
     *
     * @param activity the activity value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withActivity(MicrosoftGraphUserActivity activity) {
        this.activity = activity;
        return this;
    }

    /**
     * Get the additionalProperties property: activityHistoryItem.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: activityHistoryItem.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphActivityHistoryItem object itself.
     */
    public MicrosoftGraphActivityHistoryItem withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphActivityHistoryItem withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (activity() != null) {
            activity().validate();
        }
    }
}
