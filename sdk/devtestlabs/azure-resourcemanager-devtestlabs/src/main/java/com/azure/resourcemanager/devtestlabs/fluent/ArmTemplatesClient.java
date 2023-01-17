// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArmTemplateInner;

/** An instance of this class provides access to all the operations defined in ArmTemplatesClient. */
public interface ArmTemplatesClient {
    /**
     * List azure resource manager templates in a given artifact source.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArmTemplateInner> list(String resourceGroupName, String labName, String artifactSourceName);

    /**
     * List azure resource manager templates in a given artifact source.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param expand Specify the $expand query. Example: 'properties($select=displayName)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ArmTemplateInner> list(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get azure resource manager template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the azure resource manager template.
     * @param expand Specify the $expand query. Example: 'properties($select=displayName)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure resource manager template along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ArmTemplateInner> getWithResponse(
        String resourceGroupName,
        String labName,
        String artifactSourceName,
        String name,
        String expand,
        Context context);

    /**
     * Get azure resource manager template.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param artifactSourceName The name of the artifact source.
     * @param name The name of the azure resource manager template.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure resource manager template.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ArmTemplateInner get(String resourceGroupName, String labName, String artifactSourceName, String name);
}
