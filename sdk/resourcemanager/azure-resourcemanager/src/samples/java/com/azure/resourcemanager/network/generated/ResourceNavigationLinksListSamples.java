// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ResourceNavigationLinks List. */
public final class ResourceNavigationLinksListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VirtualNetworkGetResourceNavigationLinks.json
     */
    /**
     * Sample code: Get Resource Navigation Links.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getResourceNavigationLinks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getResourceNavigationLinks()
            .listWithResponse("rg1", "vnet", "subnet", com.azure.core.util.Context.NONE);
    }
}
