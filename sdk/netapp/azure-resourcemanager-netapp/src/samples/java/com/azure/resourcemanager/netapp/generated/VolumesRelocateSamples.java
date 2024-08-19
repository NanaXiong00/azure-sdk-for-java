// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.RelocateVolumeRequest;

/**
 * Samples for Volumes Relocate.
 */
public final class VolumesRelocateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2024-03-01/examples/Volumes_Relocate.json
     */
    /**
     * Sample code: Volumes_Relocate.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesRelocate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes()
            .relocate("myRG", "account1", "pool1", "volume1", new RelocateVolumeRequest(),
                com.azure.core.util.Context.NONE);
    }
}
