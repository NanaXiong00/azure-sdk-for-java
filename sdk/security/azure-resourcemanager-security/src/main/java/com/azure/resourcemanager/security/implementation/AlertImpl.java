// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.AlertInner;
import com.azure.resourcemanager.security.models.Alert;
import com.azure.resourcemanager.security.models.AlertEntity;
import com.azure.resourcemanager.security.models.AlertSeverity;
import com.azure.resourcemanager.security.models.AlertStatus;
import com.azure.resourcemanager.security.models.Intent;
import com.azure.resourcemanager.security.models.ResourceIdentifier;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AlertImpl implements Alert {
    private AlertInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    AlertImpl(AlertInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public String alertType() {
        return this.innerModel().alertType();
    }

    public String systemAlertId() {
        return this.innerModel().systemAlertId();
    }

    public String productComponentName() {
        return this.innerModel().productComponentName();
    }

    public String alertDisplayName() {
        return this.innerModel().alertDisplayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public AlertSeverity severity() {
        return this.innerModel().severity();
    }

    public Intent intent() {
        return this.innerModel().intent();
    }

    public OffsetDateTime startTimeUtc() {
        return this.innerModel().startTimeUtc();
    }

    public OffsetDateTime endTimeUtc() {
        return this.innerModel().endTimeUtc();
    }

    public List<ResourceIdentifier> resourceIdentifiers() {
        List<ResourceIdentifier> inner = this.innerModel().resourceIdentifiers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> remediationSteps() {
        List<String> inner = this.innerModel().remediationSteps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String vendorName() {
        return this.innerModel().vendorName();
    }

    public AlertStatus status() {
        return this.innerModel().status();
    }

    public List<Map<String, String>> extendedLinks() {
        List<Map<String, String>> inner = this.innerModel().extendedLinks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String alertUri() {
        return this.innerModel().alertUri();
    }

    public OffsetDateTime timeGeneratedUtc() {
        return this.innerModel().timeGeneratedUtc();
    }

    public String productName() {
        return this.innerModel().productName();
    }

    public OffsetDateTime processingEndTimeUtc() {
        return this.innerModel().processingEndTimeUtc();
    }

    public List<AlertEntity> entities() {
        List<AlertEntity> inner = this.innerModel().entities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean isIncident() {
        return this.innerModel().isIncident();
    }

    public String correlationKey() {
        return this.innerModel().correlationKey();
    }

    public Map<String, String> extendedProperties() {
        Map<String, String> inner = this.innerModel().extendedProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String compromisedEntity() {
        return this.innerModel().compromisedEntity();
    }

    public AlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
