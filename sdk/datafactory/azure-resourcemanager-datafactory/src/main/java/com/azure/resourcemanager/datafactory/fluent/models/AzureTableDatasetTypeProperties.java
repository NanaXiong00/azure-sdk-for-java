// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Table dataset properties. */
@Fluent
public final class AzureTableDatasetTypeProperties {
    /*
     * The table name of the Azure Table storage. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "tableName", required = true)
    private Object tableName;

    /**
     * Get the tableName property: The table name of the Azure Table storage. Type: string (or Expression with
     * resultType string).
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name of the Azure Table storage. Type: string (or Expression with
     * resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the AzureTableDatasetTypeProperties object itself.
     */
    public AzureTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tableName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tableName in model AzureTableDatasetTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureTableDatasetTypeProperties.class);
}
