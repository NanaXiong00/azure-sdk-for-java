// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolutionsAnalyticsRecommendation Get. */
public final class IotSecuritySolutionsAnalyticsRecommendationGetSamples {
    /**
     * Sample code: Get the aggregated security analytics recommendation of yours IoT Security solution.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getTheAggregatedSecurityAnalyticsRecommendationOfYoursIoTSecuritySolution(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSecuritySolutionsAnalyticsRecommendations()
            .getWithResponse("IoTEdgeResources", "default", "OpenPortsOnDevice", Context.NONE);
    }
}
