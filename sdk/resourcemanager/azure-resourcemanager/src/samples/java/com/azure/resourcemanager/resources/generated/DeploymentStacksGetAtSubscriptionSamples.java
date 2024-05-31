// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for DeploymentStacks GetAtSubscription.
 */
public final class DeploymentStacksGetAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2024-03-01/examples/DeploymentStackSubscriptionGet.json
     */
    /**
     * Sample code: DeploymentStacksSubscriptionGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentStacksSubscriptionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .deploymentStackClient()
            .getDeploymentStacks()
            .getAtSubscriptionWithResponse("simpleDeploymentStack", com.azure.core.util.Context.NONE);
    }
}
