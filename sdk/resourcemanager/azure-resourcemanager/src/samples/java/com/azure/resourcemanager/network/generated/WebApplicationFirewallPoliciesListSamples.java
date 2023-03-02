// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for WebApplicationFirewallPolicies List. */
public final class WebApplicationFirewallPoliciesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/WafListAllPolicies.json
     */
    /**
     * Sample code: Lists all WAF policies in a subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllWAFPoliciesInASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getWebApplicationFirewallPolicies()
            .list(com.azure.core.util.Context.NONE);
    }
}
