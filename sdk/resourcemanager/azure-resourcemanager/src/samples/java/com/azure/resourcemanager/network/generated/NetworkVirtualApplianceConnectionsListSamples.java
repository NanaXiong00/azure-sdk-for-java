// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkVirtualApplianceConnections List.
 */
public final class NetworkVirtualApplianceConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkVirtualApplianceConnectionList.json
     */
    /**
     * Sample code: NetworkVirtualApplianceConnectionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkVirtualApplianceConnectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkVirtualApplianceConnections()
            .list("rg1", "nva1", com.azure.core.util.Context.NONE);
    }
}
