// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityQueryItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Retrieve queries for entity result operation response. */
@Fluent
public final class GetQueriesResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetQueriesResponseInner.class);

    /*
     * The query result values.
     */
    @JsonProperty(value = "value")
    private List<EntityQueryItem> value;

    /**
     * Get the value property: The query result values.
     *
     * @return the value value.
     */
    public List<EntityQueryItem> value() {
        return this.value;
    }

    /**
     * Set the value property: The query result values.
     *
     * @param value the value value to set.
     * @return the GetQueriesResponseInner object itself.
     */
    public GetQueriesResponseInner withValue(List<EntityQueryItem> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
