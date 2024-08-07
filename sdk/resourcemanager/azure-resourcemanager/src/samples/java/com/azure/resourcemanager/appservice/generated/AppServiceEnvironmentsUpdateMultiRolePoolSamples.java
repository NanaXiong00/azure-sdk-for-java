// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.WorkerPoolResourceInner;

/**
 * Samples for AppServiceEnvironments UpdateMultiRolePool.
 */
public final class AppServiceEnvironmentsUpdateMultiRolePoolSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/
     * AppServiceEnvironments_CreateOrUpdateMultiRolePool.json
     */
    /**
     * Sample code: Create or update a multi-role pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAMultiRolePool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .updateMultiRolePoolWithResponse("test-rg", "test-ase",
                new WorkerPoolResourceInner().withWorkerSize("Medium").withWorkerCount(3),
                com.azure.core.util.Context.NONE);
    }
}
