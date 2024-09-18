// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteGateways ListBySubscription.
 */
public final class ExpressRouteGatewaysListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * ExpressRouteGatewayListBySubscription.json
     */
    /**
     * Sample code: ExpressRouteGatewayListBySubscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteGatewayListBySubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteGateways()
            .listBySubscriptionWithResponse(com.azure.core.util.Context.NONE);
    }
}
