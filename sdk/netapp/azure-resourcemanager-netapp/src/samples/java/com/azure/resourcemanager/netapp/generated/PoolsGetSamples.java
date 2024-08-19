// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Pools Get.
 */
public final class PoolsGetSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2024-03-01/examples/Pools_Get.json
     */
    /**
     * Sample code: Pools_Get.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsGet(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.pools().getWithResponse("myRG", "account1", "pool1", com.azure.core.util.Context.NONE);
    }
}
