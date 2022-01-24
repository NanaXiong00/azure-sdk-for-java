// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.ThreatIntelligenceMetricsListInner;

/**
 * An instance of this class provides access to all the operations defined in ThreatIntelligenceIndicatorMetricsClient.
 */
public interface ThreatIntelligenceIndicatorMetricsClient {
    /**
     * Get threat intelligence indicators metrics (Indicators counts by Type, Threat Type, Source).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return threat intelligence indicators metrics (Indicators counts by Type, Threat Type, Source).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ThreatIntelligenceMetricsListInner list(String resourceGroupName, String workspaceName);

    /**
     * Get threat intelligence indicators metrics (Indicators counts by Type, Threat Type, Source).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return threat intelligence indicators metrics (Indicators counts by Type, Threat Type, Source) along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ThreatIntelligenceMetricsListInner> listWithResponse(
        String resourceGroupName, String workspaceName, Context context);
}
