// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity snowflake source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SnowflakeSource")
@Fluent
public final class SnowflakeSource extends CopySource {
    /*
     * Snowflake Sql query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Snowflake export settings.
     */
    @JsonProperty(value = "exportSettings")
    private SnowflakeExportCopyCommand exportSettings;

    /**
     * Get the query property: Snowflake Sql query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: Snowflake Sql query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the SnowflakeSource object itself.
     */
    public SnowflakeSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the exportSettings property: Snowflake export settings.
     *
     * @return the exportSettings value.
     */
    public SnowflakeExportCopyCommand exportSettings() {
        return this.exportSettings;
    }

    /**
     * Set the exportSettings property: Snowflake export settings.
     *
     * @param exportSettings the exportSettings value to set.
     * @return the SnowflakeSource object itself.
     */
    public SnowflakeSource withExportSettings(SnowflakeExportCopyCommand exportSettings) {
        this.exportSettings = exportSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnowflakeSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (exportSettings() != null) {
            exportSettings().validate();
        }
    }
}
