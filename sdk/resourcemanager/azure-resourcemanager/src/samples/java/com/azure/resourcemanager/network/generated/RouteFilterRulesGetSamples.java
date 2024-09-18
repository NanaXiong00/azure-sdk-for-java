// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for RouteFilterRules Get.
 */
public final class RouteFilterRulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/RouteFilterRuleGet.json
     */
    /**
     * Sample code: RouteFilterRuleGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeFilterRuleGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getRouteFilterRules()
            .getWithResponse("rg1", "filterName", "filterName", com.azure.core.util.Context.NONE);
    }
}
