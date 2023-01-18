// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.dataprotection.fluent.models.DeletedBackupInstanceResourceInner;
import com.azure.resourcemanager.dataprotection.models.DeletedBackupInstance;
import com.azure.resourcemanager.dataprotection.models.DeletedBackupInstanceResource;

public final class DeletedBackupInstanceResourceImpl implements DeletedBackupInstanceResource {
    private DeletedBackupInstanceResourceInner innerObject;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    DeletedBackupInstanceResourceImpl(
        DeletedBackupInstanceResourceInner innerObject,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DeletedBackupInstance properties() {
        return this.innerModel().properties();
    }

    public DeletedBackupInstanceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
