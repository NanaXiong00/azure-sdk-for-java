// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.largeinstance.fluent.AzureLargeStorageInstancesClient;
import com.azure.resourcemanager.largeinstance.fluent.models.AzureLargeStorageInstanceInner;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstance;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstanceTagsUpdate;
import com.azure.resourcemanager.largeinstance.models.AzureLargeStorageInstances;

public final class AzureLargeStorageInstancesImpl implements AzureLargeStorageInstances {
    private static final ClientLogger LOGGER = new ClientLogger(AzureLargeStorageInstancesImpl.class);

    private final AzureLargeStorageInstancesClient innerClient;

    private final com.azure.resourcemanager.largeinstance.LargeInstanceManager serviceManager;

    public AzureLargeStorageInstancesImpl(AzureLargeStorageInstancesClient innerClient,
        com.azure.resourcemanager.largeinstance.LargeInstanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureLargeStorageInstance> list() {
        PagedIterable<AzureLargeStorageInstanceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureLargeStorageInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureLargeStorageInstance> list(Context context) {
        PagedIterable<AzureLargeStorageInstanceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureLargeStorageInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureLargeStorageInstance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureLargeStorageInstanceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureLargeStorageInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureLargeStorageInstance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureLargeStorageInstanceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureLargeStorageInstanceImpl(inner1, this.manager()));
    }

    public Response<AzureLargeStorageInstance> getByResourceGroupWithResponse(String resourceGroupName,
        String azureLargeStorageInstanceName, Context context) {
        Response<AzureLargeStorageInstanceInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, azureLargeStorageInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureLargeStorageInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureLargeStorageInstance getByResourceGroup(String resourceGroupName,
        String azureLargeStorageInstanceName) {
        AzureLargeStorageInstanceInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, azureLargeStorageInstanceName);
        if (inner != null) {
            return new AzureLargeStorageInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureLargeStorageInstance> updateWithResponse(String resourceGroupName,
        String azureLargeStorageInstanceName, AzureLargeStorageInstanceTagsUpdate properties, Context context) {
        Response<AzureLargeStorageInstanceInner> inner = this.serviceClient().updateWithResponse(resourceGroupName,
            azureLargeStorageInstanceName, properties, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureLargeStorageInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureLargeStorageInstance update(String resourceGroupName, String azureLargeStorageInstanceName,
        AzureLargeStorageInstanceTagsUpdate properties) {
        AzureLargeStorageInstanceInner inner
            = this.serviceClient().update(resourceGroupName, azureLargeStorageInstanceName, properties);
        if (inner != null) {
            return new AzureLargeStorageInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AzureLargeStorageInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.largeinstance.LargeInstanceManager manager() {
        return this.serviceManager;
    }
}
