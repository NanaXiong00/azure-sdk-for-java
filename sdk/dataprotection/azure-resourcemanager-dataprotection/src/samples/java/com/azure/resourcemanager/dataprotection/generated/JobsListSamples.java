// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/** Samples for Jobs List. */
public final class JobsListSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/preview/2022-11-01-preview/examples/JobCRUD/ListJobs.json
     */
    /**
     * Sample code: Get Jobs.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getJobs(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.jobs().list("BugBash1", "BugBashVaultForCCYv11", com.azure.core.util.Context.NONE);
    }
}
