// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for Providers Get.
 */
public final class ProvidersGetSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/GetProvider.json
     */
    /**
     * Sample code: Get provider.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getProvider(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .serviceClient()
            .getProviders()
            .getWithResponse("Microsoft.TestRP1", null, com.azure.core.util.Context.NONE);
    }
}
