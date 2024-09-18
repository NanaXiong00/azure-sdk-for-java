// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.network.fluent.NetworkManagerDeploymentStatusOperationsClient;
import com.azure.resourcemanager.network.fluent.models.NetworkManagerDeploymentStatusListResultInner;
import com.azure.resourcemanager.network.models.NetworkManagerDeploymentStatusParameter;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * NetworkManagerDeploymentStatusOperationsClient.
 */
public final class NetworkManagerDeploymentStatusOperationsClientImpl
    implements NetworkManagerDeploymentStatusOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final NetworkManagerDeploymentStatusOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkManagerDeploymentStatusOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    NetworkManagerDeploymentStatusOperationsClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(NetworkManagerDeploymentStatusOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientNetworkManagerDeploymentStatusOperations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface NetworkManagerDeploymentStatusOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkManagers/{networkManagerName}/listDeploymentStatus")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NetworkManagerDeploymentStatusListResultInner>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkManagerName") String networkManagerName, @QueryParam("api-version") String apiVersion,
            @QueryParam("$top") Integer top,
            @BodyParam("application/json") NetworkManagerDeploymentStatusParameter parameters,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<NetworkManagerDeploymentStatusListResultInner>> listWithResponseAsync(String resourceGroupName,
        String networkManagerName, NetworkManagerDeploymentStatusParameter parameters, Integer top) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkManagerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, networkManagerName, apiVersion, top, parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NetworkManagerDeploymentStatusListResultInner>> listWithResponseAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerDeploymentStatusParameter parameters,
        Integer top, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (networkManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkManagerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            networkManagerName, apiVersion, top, parameters, accept, context);
    }

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkManagerDeploymentStatusListResultInner> listAsync(String resourceGroupName,
        String networkManagerName, NetworkManagerDeploymentStatusParameter parameters) {
        final Integer top = null;
        return listWithResponseAsync(resourceGroupName, networkManagerName, parameters, top)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NetworkManagerDeploymentStatusListResultInner> listWithResponse(String resourceGroupName,
        String networkManagerName, NetworkManagerDeploymentStatusParameter parameters, Integer top, Context context) {
        return listWithResponseAsync(resourceGroupName, networkManagerName, parameters, top, context).block();
    }

    /**
     * Post to List of Network Manager Deployment Status.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network deployment status is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Manager Deployment Status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkManagerDeploymentStatusListResultInner list(String resourceGroupName, String networkManagerName,
        NetworkManagerDeploymentStatusParameter parameters) {
        final Integer top = null;
        return listWithResponse(resourceGroupName, networkManagerName, parameters, top, Context.NONE).getValue();
    }
}
