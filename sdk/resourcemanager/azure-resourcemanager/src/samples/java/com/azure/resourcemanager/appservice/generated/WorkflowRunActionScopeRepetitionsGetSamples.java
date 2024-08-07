// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WorkflowRunActionScopeRepetitions Get.
 */
public final class WorkflowRunActionScopeRepetitionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/WorkflowRunActionScopeRepetitions_Get
     * .json
     */
    /**
     * Sample code: Get a scoped repetition.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAScopedRepetition(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWorkflowRunActionScopeRepetitions()
            .getWithResponse("testResourceGroup", "test-name", "testFlow", "08586776228332053161046300351", "for_each",
                "000000", com.azure.core.util.Context.NONE);
    }
}
