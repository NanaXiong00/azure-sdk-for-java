// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DynamicsAXResourceDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The path of the Dynamics AX OData entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAXResource")
@Fluent
public final class DynamicsAXResourceDataset extends Dataset {
    /*
     * Dynamics AX OData resource dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private DynamicsAXResourceDatasetTypeProperties innerTypeProperties = new DynamicsAXResourceDatasetTypeProperties();

    /**
     * Get the innerTypeProperties property: Dynamics AX OData resource dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private DynamicsAXResourceDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsAXResourceDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the path property: The path of the Dynamics AX OData entity. Type: string (or Expression with resultType
     * string).
     *
     * @return the path value.
     */
    public Object path() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().path();
    }

    /**
     * Set the path property: The path of the Dynamics AX OData entity. Type: string (or Expression with resultType
     * string).
     *
     * @param path the path value to set.
     * @return the DynamicsAXResourceDataset object itself.
     */
    public DynamicsAXResourceDataset withPath(Object path) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DynamicsAXResourceDatasetTypeProperties();
        }
        this.innerTypeProperties().withPath(path);
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
                        "Missing required property innerTypeProperties in model DynamicsAXResourceDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicsAXResourceDataset.class);
}
