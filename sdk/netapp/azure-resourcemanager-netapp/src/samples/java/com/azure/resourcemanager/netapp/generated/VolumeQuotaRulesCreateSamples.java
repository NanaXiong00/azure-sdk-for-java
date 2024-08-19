// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.Type;

/**
 * Samples for VolumeQuotaRules Create.
 */
public final class VolumeQuotaRulesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2024-03-01/examples/VolumeQuotaRules_Create.json
     */
    /**
     * Sample code: VolumeQuotaRules_Create.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeQuotaRulesCreate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeQuotaRules()
            .define("rule-0004")
            .withRegion("westus")
            .withExistingVolume("myRG", "account-9957", "pool-5210", "volume-6387")
            .withQuotaSizeInKiBs(100005L)
            .withQuotaType(Type.INDIVIDUAL_USER_QUOTA)
            .withQuotaTarget("1821")
            .create();
    }
}
