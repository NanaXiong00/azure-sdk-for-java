// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an automation rule action to run a playbook. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "actionType")
@JsonTypeName("RunPlaybook")
@Fluent
public final class AutomationRuleRunPlaybookAction extends AutomationRuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomationRuleRunPlaybookAction.class);

    /*
     * The configuration of the run playbook automation rule action
     */
    @JsonProperty(value = "actionConfiguration", required = true)
    private AutomationRuleRunPlaybookActionConfiguration actionConfiguration;

    /**
     * Get the actionConfiguration property: The configuration of the run playbook automation rule action.
     *
     * @return the actionConfiguration value.
     */
    public AutomationRuleRunPlaybookActionConfiguration actionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * Set the actionConfiguration property: The configuration of the run playbook automation rule action.
     *
     * @param actionConfiguration the actionConfiguration value to set.
     * @return the AutomationRuleRunPlaybookAction object itself.
     */
    public AutomationRuleRunPlaybookAction withActionConfiguration(
        AutomationRuleRunPlaybookActionConfiguration actionConfiguration) {
        this.actionConfiguration = actionConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutomationRuleRunPlaybookAction withOrder(int order) {
        super.withOrder(order);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (actionConfiguration() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property actionConfiguration in model AutomationRuleRunPlaybookAction"));
        } else {
            actionConfiguration().validate();
        }
    }
}
