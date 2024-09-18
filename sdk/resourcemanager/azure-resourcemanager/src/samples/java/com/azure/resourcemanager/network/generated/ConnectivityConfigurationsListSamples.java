// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ConnectivityConfigurations List.
 */
public final class ConnectivityConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkManagerConnectivityConfigurationList.json
     */
    /**
     * Sample code: ConnectivityConfigurationsList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void connectivityConfigurationsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getConnectivityConfigurations()
            .list("myResourceGroup", "testNetworkManager", null, null, com.azure.core.util.Context.NONE);
    }
}
