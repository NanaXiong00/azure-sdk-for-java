// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for BackupPolicies Delete.
 */
public final class BackupPoliciesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2024-03-01/examples/BackupPolicies_Delete.json
     */
    /**
     * Sample code: BackupPolicies_Delete.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void backupPoliciesDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.backupPolicies()
            .delete("resourceGroup", "accountName", "backupPolicyName", com.azure.core.util.Context.NONE);
    }
}
