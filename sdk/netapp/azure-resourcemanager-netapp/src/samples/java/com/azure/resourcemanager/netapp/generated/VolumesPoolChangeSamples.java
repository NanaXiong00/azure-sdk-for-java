// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.PoolChangeRequest;

/**
 * Samples for Volumes PoolChange.
 */
public final class VolumesPoolChangeSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Volumes_PoolChange.json
     */
    /**
     * Sample code: Volumes_AuthorizeReplication.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesAuthorizeReplication(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes()
            .poolChange("myRG", "account1", "pool1", "volume1", new PoolChangeRequest().withNewPoolResourceId(
                "/subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1"),
                com.azure.core.util.Context.NONE);
    }
}
