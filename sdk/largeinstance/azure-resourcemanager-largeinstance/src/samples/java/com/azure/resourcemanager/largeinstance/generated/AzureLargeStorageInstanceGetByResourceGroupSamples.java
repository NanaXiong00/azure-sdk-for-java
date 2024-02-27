// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.generated;

/**
 * Samples for AzureLargeStorageInstance GetByResourceGroup.
 */
public final class AzureLargeStorageInstanceGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/
     * examples/AzureLargeStorageInstance_Get.json
     */
    /**
     * Sample code: AzureLargeStorageInstance_Get.
     * 
     * @param manager Entry point to LargeInstanceManager.
     */
    public static void
        azureLargeStorageInstanceGet(com.azure.resourcemanager.largeinstance.LargeInstanceManager manager) {
        manager.azureLargeStorageInstances().getByResourceGroupWithResponse("myResourceGroup",
            "myAzureLargeStorageInstance", com.azure.core.util.Context.NONE);
    }
}
