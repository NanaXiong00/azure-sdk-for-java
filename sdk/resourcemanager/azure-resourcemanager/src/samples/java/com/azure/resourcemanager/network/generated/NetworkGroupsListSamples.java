// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkGroups List.
 */
public final class NetworkGroupsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/NetworkManagerGroupList.json
     */
    /**
     * Sample code: NetworkGroupsList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkGroupsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkGroups()
            .list("rg1", "testNetworkManager", null, null, com.azure.core.util.Context.NONE);
    }
}
