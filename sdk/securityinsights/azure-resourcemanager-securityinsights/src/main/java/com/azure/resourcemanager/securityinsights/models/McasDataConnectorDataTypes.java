// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The available data types for MCAS (Microsoft Cloud App Security) data connector. */
@Fluent
public final class McasDataConnectorDataTypes extends AlertsDataTypeOfDataConnector {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(McasDataConnectorDataTypes.class);

    /*
     * Discovery log data type connection.
     */
    @JsonProperty(value = "discoveryLogs")
    private DataConnectorDataTypeCommon discoveryLogs;

    /**
     * Get the discoveryLogs property: Discovery log data type connection.
     *
     * @return the discoveryLogs value.
     */
    public DataConnectorDataTypeCommon discoveryLogs() {
        return this.discoveryLogs;
    }

    /**
     * Set the discoveryLogs property: Discovery log data type connection.
     *
     * @param discoveryLogs the discoveryLogs value to set.
     * @return the McasDataConnectorDataTypes object itself.
     */
    public McasDataConnectorDataTypes withDiscoveryLogs(DataConnectorDataTypeCommon discoveryLogs) {
        this.discoveryLogs = discoveryLogs;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public McasDataConnectorDataTypes withAlerts(DataConnectorDataTypeCommon alerts) {
        super.withAlerts(alerts);
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
        if (discoveryLogs() != null) {
            discoveryLogs().validate();
        }
    }
}
