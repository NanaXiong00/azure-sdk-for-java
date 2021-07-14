// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolution Delete. */
public final class IotSecuritySolutionDeleteSamples {
    /**
     * Sample code: Delete an IoT security solution.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void deleteAnIoTSecuritySolution(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotSecuritySolutions().deleteWithResponse("MyGroup", "default", Context.NONE);
    }
}
