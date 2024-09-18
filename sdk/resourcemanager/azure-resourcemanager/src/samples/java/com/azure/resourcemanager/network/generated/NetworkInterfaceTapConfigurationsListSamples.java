// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkInterfaceTapConfigurations List.
 */
public final class NetworkInterfaceTapConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * NetworkInterfaceTapConfigurationList.json
     */
    /**
     * Sample code: List virtual network tap configurations.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVirtualNetworkTapConfigurations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaceTapConfigurations()
            .list("testrg", "mynic", com.azure.core.util.Context.NONE);
    }
}
