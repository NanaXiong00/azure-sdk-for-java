// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbV2CollectionDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The MongoDB database dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbV2Collection")
@Fluent
public final class MongoDbV2CollectionDataset extends Dataset {
    /*
     * MongoDB database dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private MongoDbV2CollectionDatasetTypeProperties innerTypeProperties =
        new MongoDbV2CollectionDatasetTypeProperties();

    /**
     * Get the innerTypeProperties property: MongoDB database dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private MongoDbV2CollectionDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbV2CollectionDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @return the collection value.
     */
    public Object collection() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().collection();
    }

    /**
     * Set the collection property: The collection name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @param collection the collection value to set.
     * @return the MongoDbV2CollectionDataset object itself.
     */
    public MongoDbV2CollectionDataset withCollection(Object collection) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MongoDbV2CollectionDatasetTypeProperties();
        }
        this.innerTypeProperties().withCollection(collection);
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
                        "Missing required property innerTypeProperties in model MongoDbV2CollectionDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MongoDbV2CollectionDataset.class);
}
