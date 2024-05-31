// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for ResourceManagementClient class.
 */
public interface ResourceManagementClient {
    /**
     * Gets The Microsoft Azure subscription ID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the DeploymentsClient object to access its operations.
     * 
     * @return the DeploymentsClient object.
     */
    DeploymentsClient getDeployments();

    /**
     * Gets the ProvidersClient object to access its operations.
     * 
     * @return the ProvidersClient object.
     */
    ProvidersClient getProviders();

    /**
     * Gets the ProviderResourceTypesClient object to access its operations.
     * 
     * @return the ProviderResourceTypesClient object.
     */
    ProviderResourceTypesClient getProviderResourceTypes();

    /**
     * Gets the ResourcesClient object to access its operations.
     * 
     * @return the ResourcesClient object.
     */
    ResourcesClient getResources();

    /**
     * Gets the ResourceGroupsClient object to access its operations.
     * 
     * @return the ResourceGroupsClient object.
     */
    ResourceGroupsClient getResourceGroups();

    /**
     * Gets the TagOperationsClient object to access its operations.
     * 
     * @return the TagOperationsClient object.
     */
    TagOperationsClient getTagOperations();

    /**
     * Gets the DeploymentOperationsClient object to access its operations.
     * 
     * @return the DeploymentOperationsClient object.
     */
    DeploymentOperationsClient getDeploymentOperations();
}
