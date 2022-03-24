// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Map Power Query mashup query to sink dataset(s). */
@Fluent
public final class PowerQuerySinkMapping {
    /*
     * Name of the query in Power Query mashup document.
     */
    @JsonProperty(value = "queryName")
    private String queryName;

    /*
     * List of sinks mapped to Power Query mashup query.
     */
    @JsonProperty(value = "dataflowSinks")
    private List<PowerQuerySink> dataflowSinks;

    /**
     * Get the queryName property: Name of the query in Power Query mashup document.
     *
     * @return the queryName value.
     */
    public String queryName() {
        return this.queryName;
    }

    /**
     * Set the queryName property: Name of the query in Power Query mashup document.
     *
     * @param queryName the queryName value to set.
     * @return the PowerQuerySinkMapping object itself.
     */
    public PowerQuerySinkMapping withQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }

    /**
     * Get the dataflowSinks property: List of sinks mapped to Power Query mashup query.
     *
     * @return the dataflowSinks value.
     */
    public List<PowerQuerySink> dataflowSinks() {
        return this.dataflowSinks;
    }

    /**
     * Set the dataflowSinks property: List of sinks mapped to Power Query mashup query.
     *
     * @param dataflowSinks the dataflowSinks value to set.
     * @return the PowerQuerySinkMapping object itself.
     */
    public PowerQuerySinkMapping withDataflowSinks(List<PowerQuerySink> dataflowSinks) {
        this.dataflowSinks = dataflowSinks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataflowSinks() != null) {
            dataflowSinks().forEach(e -> e.validate());
        }
    }
}
