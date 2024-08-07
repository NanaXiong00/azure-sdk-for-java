// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

/**
 * Samples for Namespaces ListNetworkRuleSets.
 */
public final class NamespacesListNetworkRuleSetsSamples {
    /*
     * x-ms-original-file:
     * specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/NameSpaces/
     * VirtualNetworkRule/SBNetworkRuleSetList.json
     */
    /**
     * Sample code: NameSpaceNetworkRuleSetList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpaceNetworkRuleSetList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getNamespaces()
            .listNetworkRuleSets("ResourceGroup", "sdk-Namespace-6019", com.azure.core.util.Context.NONE);
    }
}
