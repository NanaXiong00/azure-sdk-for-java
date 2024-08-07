// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps GetSlotSiteDeploymentStatusSlot.
 */
public final class WebAppsGetSlotSiteDeploymentStatusSlotSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/GetSiteDeploymentStatusSlot.json
     */
    /**
     * Sample code: Get Deployment Status Slot.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDeploymentStatusSlot(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getSlotSiteDeploymentStatusSlot("rg", "testSite", "stage", "eacfd68b-3bbd-4ad9-99c5-98614d89c8e5",
                com.azure.core.util.Context.NONE);
    }
}
