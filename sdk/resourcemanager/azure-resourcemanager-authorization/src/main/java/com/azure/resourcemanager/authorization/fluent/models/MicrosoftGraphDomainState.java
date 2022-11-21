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

/** domainState. */
@Fluent
public final class MicrosoftGraphDomainState {
    /*
     * Timestamp for when the last activity occurred. The value is updated when an operation is scheduled, the
     * asynchronous task starts, and when the operation completes.
     */
    @JsonProperty(value = "lastActionDateTime")
    private OffsetDateTime lastActionDateTime;

    /*
     * Type of asynchronous operation. The values can be ForceDelete or Verification
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Current status of the operation.  Scheduled - Operation has been scheduled but has not started.  InProgress -
     * Task has started and is in progress.  Failed - Operation has failed.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * domainState
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphDomainState class. */
    public MicrosoftGraphDomainState() {
    }

    /**
     * Get the lastActionDateTime property: Timestamp for when the last activity occurred. The value is updated when an
     * operation is scheduled, the asynchronous task starts, and when the operation completes.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime lastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: Timestamp for when the last activity occurred. The value is updated when an
     * operation is scheduled, the asynchronous task starts, and when the operation completes.
     *
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withLastActionDateTime(OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the operation property: Type of asynchronous operation. The values can be ForceDelete or Verification.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Type of asynchronous operation. The values can be ForceDelete or Verification.
     *
     * @param operation the operation value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the status property: Current status of the operation. Scheduled - Operation has been scheduled but has not
     * started. InProgress - Task has started and is in progress. Failed - Operation has failed.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Current status of the operation. Scheduled - Operation has been scheduled but has not
     * started. InProgress - Task has started and is in progress. Failed - Operation has failed.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: domainState.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: domainState.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDomainState object itself.
     */
    public MicrosoftGraphDomainState withAdditionalProperties(Map<String, Object> additionalProperties) {
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
