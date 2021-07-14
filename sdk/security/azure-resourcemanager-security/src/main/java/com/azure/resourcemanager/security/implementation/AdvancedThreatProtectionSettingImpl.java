// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AdvancedThreatProtectionSettingInner;
import com.azure.resourcemanager.security.models.AdvancedThreatProtectionSetting;

public final class AdvancedThreatProtectionSettingImpl
    implements AdvancedThreatProtectionSetting, AdvancedThreatProtectionSetting.Definition {
    private AdvancedThreatProtectionSettingInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    AdvancedThreatProtectionSettingImpl(
        AdvancedThreatProtectionSettingInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public Boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public AdvancedThreatProtectionSettingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String resourceId;

    public AdvancedThreatProtectionSettingImpl withExistingResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public AdvancedThreatProtectionSetting create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdvancedThreatProtections()
                .createWithResponse(resourceId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AdvancedThreatProtectionSetting create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdvancedThreatProtections()
                .createWithResponse(resourceId, this.innerModel(), context)
                .getValue();
        return this;
    }

    AdvancedThreatProtectionSettingImpl(com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new AdvancedThreatProtectionSettingInner();
        this.serviceManager = serviceManager;
    }

    public AdvancedThreatProtectionSetting refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdvancedThreatProtections()
                .getWithResponse(resourceId, Context.NONE)
                .getValue();
        return this;
    }

    public AdvancedThreatProtectionSetting refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAdvancedThreatProtections()
                .getWithResponse(resourceId, context)
                .getValue();
        return this;
    }

    public AdvancedThreatProtectionSettingImpl withIsEnabled(Boolean isEnabled) {
        this.innerModel().withIsEnabled(isEnabled);
        return this;
    }
}
