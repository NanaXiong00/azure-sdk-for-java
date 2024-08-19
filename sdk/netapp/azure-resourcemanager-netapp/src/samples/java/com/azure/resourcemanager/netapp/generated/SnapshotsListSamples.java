// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Snapshots List.
 */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2024-03-01/examples/Snapshots_List.json
     */
    /**
     * Sample code: Snapshots_List.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void snapshotsList(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.snapshots().list("myRG", "account1", "pool1", "volume1", com.azure.core.util.Context.NONE);
    }
}
