// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualNetworkGateways GetLearnedRoutes. */
public final class VirtualNetworkGatewaysGetLearnedRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualNetworkGatewayLearnedRoutes.json
     */
    /**
     * Sample code: GetVirtualNetworkGatewayLearnedRoutes.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkGatewayLearnedRoutes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGateways()
            .getLearnedRoutes("rg1", "vpngw", com.azure.core.util.Context.NONE);
    }
}
