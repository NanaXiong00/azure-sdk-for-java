// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.network.fluent.FirewallPolicyRuleCollectionGroupDraftsClient;
import com.azure.resourcemanager.network.fluent.models.FirewallPolicyRuleCollectionGroupDraftInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FirewallPolicyRuleCollectionGroupDraftsClient.
 */
public final class FirewallPolicyRuleCollectionGroupDraftsClientImpl
    implements FirewallPolicyRuleCollectionGroupDraftsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FirewallPolicyRuleCollectionGroupDraftsService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of FirewallPolicyRuleCollectionGroupDraftsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FirewallPolicyRuleCollectionGroupDraftsClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(FirewallPolicyRuleCollectionGroupDraftsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientFirewallPolicyRuleCollectionGroupDrafts to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface FirewallPolicyRuleCollectionGroupDraftsService {
        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/ruleCollectionGroups/{ruleCollectionGroupName}/ruleCollectionGroupDrafts/default")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("ruleCollectionGroupName") String ruleCollectionGroupName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/ruleCollectionGroups/{ruleCollectionGroupName}/ruleCollectionGroupDrafts/default")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("ruleCollectionGroupName") String ruleCollectionGroupName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") FirewallPolicyRuleCollectionGroupDraftInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/firewallPolicies/{firewallPolicyName}/ruleCollectionGroups/{ruleCollectionGroupName}/ruleCollectionGroupDrafts/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("ruleCollectionGroupName") String ruleCollectionGroupName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Delete Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                ruleCollectionGroupName, apiVersion, this.client.getSubscriptionId(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), resourceGroupName, firewallPolicyName, ruleCollectionGroupName,
            apiVersion, this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Delete Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName) {
        return deleteWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context).block();
    }

    /**
     * Delete Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName) {
        deleteWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, Context.NONE);
    }

    /**
     * Create or Update Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param parameters Parameters supplied to the create or update FirewallPolicyRuleCollectionGroup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName,
        FirewallPolicyRuleCollectionGroupDraftInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.createOrUpdate(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                    ruleCollectionGroupName, apiVersion, this.client.getSubscriptionId(), parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create or Update Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param parameters Parameters supplied to the create or update FirewallPolicyRuleCollectionGroup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName,
        FirewallPolicyRuleCollectionGroupDraftInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
            ruleCollectionGroupName, apiVersion, this.client.getSubscriptionId(), parameters, accept, context);
    }

    /**
     * Create or Update Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param parameters Parameters supplied to the create or update FirewallPolicyRuleCollectionGroup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallPolicyRuleCollectionGroupDraftInner> createOrUpdateAsync(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName,
        FirewallPolicyRuleCollectionGroupDraftInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName,
            parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create or Update Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param parameters Parameters supplied to the create or update FirewallPolicyRuleCollectionGroup operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<FirewallPolicyRuleCollectionGroupDraftInner> createOrUpdateWithResponse(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName,
        FirewallPolicyRuleCollectionGroupDraftInner parameters, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName,
            parameters, context).block();
    }

    /**
     * Create or Update Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param parameters Parameters supplied to the create or update FirewallPolicyRuleCollectionGroup operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicyRuleCollectionGroupDraftInner createOrUpdate(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName,
        FirewallPolicyRuleCollectionGroupDraftInner parameters) {
        return createOrUpdateWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, parameters,
            Context.NONE).getValue();
    }

    /**
     * Get Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group Draft along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> getWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, firewallPolicyName,
                ruleCollectionGroupName, this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group Draft along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FirewallPolicyRuleCollectionGroupDraftInner>> getWithResponseAsync(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (ruleCollectionGroupName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter ruleCollectionGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2024-03-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, firewallPolicyName, ruleCollectionGroupName,
            this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Get Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group Draft on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FirewallPolicyRuleCollectionGroupDraftInner> getAsync(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName) {
        return getWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group Draft along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<FirewallPolicyRuleCollectionGroupDraftInner> getWithResponse(String resourceGroupName,
        String firewallPolicyName, String ruleCollectionGroupName, Context context) {
        return getWithResponseAsync(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, context).block();
    }

    /**
     * Get Rule Collection Group Draft.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rule Collection Group Draft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FirewallPolicyRuleCollectionGroupDraftInner get(String resourceGroupName, String firewallPolicyName,
        String ruleCollectionGroupName) {
        return getWithResponse(resourceGroupName, firewallPolicyName, ruleCollectionGroupName, Context.NONE).getValue();
    }
}
