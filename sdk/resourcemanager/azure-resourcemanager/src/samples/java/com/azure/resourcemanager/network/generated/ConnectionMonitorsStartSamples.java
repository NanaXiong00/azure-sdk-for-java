// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ConnectionMonitors Start.
 */
public final class ConnectionMonitorsStartSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkWatcherConnectionMonitorStart.json
     */
    /**
     * Sample code: Start connection monitor.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void startConnectionMonitor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getConnectionMonitors()
            .start("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
