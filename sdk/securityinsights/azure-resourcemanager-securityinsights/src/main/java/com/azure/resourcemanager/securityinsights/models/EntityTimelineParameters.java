// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The parameters required to execute s timeline operation on the given entity. */
@Fluent
public final class EntityTimelineParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityTimelineParameters.class);

    /*
     * Array of timeline Item kinds.
     */
    @JsonProperty(value = "kinds")
    private List<EntityTimelineKind> kinds;

    /*
     * The start timeline date, so the results returned are after this date.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * The end timeline date, so the results returned are before this date.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * The number of bucket for timeline queries aggregation.
     */
    @JsonProperty(value = "numberOfBucket")
    private Integer numberOfBucket;

    /**
     * Get the kinds property: Array of timeline Item kinds.
     *
     * @return the kinds value.
     */
    public List<EntityTimelineKind> kinds() {
        return this.kinds;
    }

    /**
     * Set the kinds property: Array of timeline Item kinds.
     *
     * @param kinds the kinds value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withKinds(List<EntityTimelineKind> kinds) {
        this.kinds = kinds;
        return this;
    }

    /**
     * Get the startTime property: The start timeline date, so the results returned are after this date.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start timeline date, so the results returned are after this date.
     *
     * @param startTime the startTime value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end timeline date, so the results returned are before this date.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end timeline date, so the results returned are before this date.
     *
     * @param endTime the endTime value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the numberOfBucket property: The number of bucket for timeline queries aggregation.
     *
     * @return the numberOfBucket value.
     */
    public Integer numberOfBucket() {
        return this.numberOfBucket;
    }

    /**
     * Set the numberOfBucket property: The number of bucket for timeline queries aggregation.
     *
     * @param numberOfBucket the numberOfBucket value to set.
     * @return the EntityTimelineParameters object itself.
     */
    public EntityTimelineParameters withNumberOfBucket(Integer numberOfBucket) {
        this.numberOfBucket = numberOfBucket;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startTime in model EntityTimelineParameters"));
        }
        if (endTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endTime in model EntityTimelineParameters"));
        }
    }
}
