// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CustomEventsTriggerTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Trigger that runs every time a custom event is received. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CustomEventsTrigger")
@Fluent
public final class CustomEventsTrigger extends MultiplePipelineTrigger {
    /*
     * Custom Events Trigger properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private CustomEventsTriggerTypeProperties innerTypeProperties = new CustomEventsTriggerTypeProperties();

    /**
     * Get the innerTypeProperties property: Custom Events Trigger properties.
     *
     * @return the innerTypeProperties value.
     */
    private CustomEventsTriggerTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        super.withPipelines(pipelines);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomEventsTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the subjectBeginsWith property: The event subject must begin with the pattern provided for trigger to fire.
     * At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @return the subjectBeginsWith value.
     */
    public String subjectBeginsWith() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().subjectBeginsWith();
    }

    /**
     * Set the subjectBeginsWith property: The event subject must begin with the pattern provided for trigger to fire.
     * At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @param subjectBeginsWith the subjectBeginsWith value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withSubjectBeginsWith(String subjectBeginsWith) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomEventsTriggerTypeProperties();
        }
        this.innerTypeProperties().withSubjectBeginsWith(subjectBeginsWith);
        return this;
    }

    /**
     * Get the subjectEndsWith property: The event subject must end with the pattern provided for trigger to fire. At
     * least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @return the subjectEndsWith value.
     */
    public String subjectEndsWith() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().subjectEndsWith();
    }

    /**
     * Set the subjectEndsWith property: The event subject must end with the pattern provided for trigger to fire. At
     * least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     *
     * @param subjectEndsWith the subjectEndsWith value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withSubjectEndsWith(String subjectEndsWith) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomEventsTriggerTypeProperties();
        }
        this.innerTypeProperties().withSubjectEndsWith(subjectEndsWith);
        return this;
    }

    /**
     * Get the events property: The list of event types that cause this trigger to fire.
     *
     * @return the events value.
     */
    public List<Object> events() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().events();
    }

    /**
     * Set the events property: The list of event types that cause this trigger to fire.
     *
     * @param events the events value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withEvents(List<Object> events) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomEventsTriggerTypeProperties();
        }
        this.innerTypeProperties().withEvents(events);
        return this;
    }

    /**
     * Get the scope property: The ARM resource ID of the Azure Event Grid Topic.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scope();
    }

    /**
     * Set the scope property: The ARM resource ID of the Azure Event Grid Topic.
     *
     * @param scope the scope value to set.
     * @return the CustomEventsTrigger object itself.
     */
    public CustomEventsTrigger withScope(String scope) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CustomEventsTriggerTypeProperties();
        }
        this.innerTypeProperties().withScope(scope);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model CustomEventsTrigger"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomEventsTrigger.class);
}
