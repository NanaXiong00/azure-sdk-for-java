// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/** Samples for RecoveryPoints Get. */
public final class RecoveryPointsGetSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-01-01/examples/BackupInstanceOperations/GetRecoveryPoint.json
     */
    /**
     * Sample code: Get Recovery Point.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getRecoveryPoint(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .recoveryPoints()
            .getWithResponse(
                "000pikumar",
                "PratikPrivatePreviewVault1",
                "testInstance1",
                "7fb2cddd-c5b3-44f6-a0d9-db3c4f9d5f25",
                com.azure.core.util.Context.NONE);
    }
}
