// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightSparkActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight Spark activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightSpark")
@Fluent
public final class HDInsightSparkActivity extends ExecutionActivity {
    /*
     * HDInsight spark activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private HDInsightSparkActivityTypeProperties innerTypeProperties = new HDInsightSparkActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: HDInsight spark activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private HDInsightSparkActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightSparkActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the rootPath property: The root path in 'sparkJobLinkedService' for all the job’s files. Type: string (or
     * Expression with resultType string).
     *
     * @return the rootPath value.
     */
    public Object rootPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().rootPath();
    }

    /**
     * Set the rootPath property: The root path in 'sparkJobLinkedService' for all the job’s files. Type: string (or
     * Expression with resultType string).
     *
     * @param rootPath the rootPath value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withRootPath(Object rootPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withRootPath(rootPath);
        return this;
    }

    /**
     * Get the entryFilePath property: The relative path to the root folder of the code/package to be executed. Type:
     * string (or Expression with resultType string).
     *
     * @return the entryFilePath value.
     */
    public Object entryFilePath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().entryFilePath();
    }

    /**
     * Set the entryFilePath property: The relative path to the root folder of the code/package to be executed. Type:
     * string (or Expression with resultType string).
     *
     * @param entryFilePath the entryFilePath value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withEntryFilePath(Object entryFilePath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withEntryFilePath(entryFilePath);
        return this;
    }

    /**
     * Get the arguments property: The user-specified arguments to HDInsightSparkActivity.
     *
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().arguments();
    }

    /**
     * Set the arguments property: The user-specified arguments to HDInsightSparkActivity.
     *
     * @param arguments the arguments value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withArguments(List<Object> arguments) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withArguments(arguments);
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     *
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().getDebugInfo();
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     *
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withGetDebugInfo(getDebugInfo);
        return this;
    }

    /**
     * Get the sparkJobLinkedService property: The storage linked service for uploading the entry file and dependencies,
     * and for receiving logs.
     *
     * @return the sparkJobLinkedService value.
     */
    public LinkedServiceReference sparkJobLinkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sparkJobLinkedService();
    }

    /**
     * Set the sparkJobLinkedService property: The storage linked service for uploading the entry file and dependencies,
     * and for receiving logs.
     *
     * @param sparkJobLinkedService the sparkJobLinkedService value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withSparkJobLinkedService(LinkedServiceReference sparkJobLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withSparkJobLinkedService(sparkJobLinkedService);
        return this;
    }

    /**
     * Get the className property: The application's Java/Spark main class.
     *
     * @return the className value.
     */
    public String className() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().className();
    }

    /**
     * Set the className property: The application's Java/Spark main class.
     *
     * @param className the className value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withClassName(String className) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withClassName(className);
        return this;
    }

    /**
     * Get the proxyUser property: The user to impersonate that will execute the job. Type: string (or Expression with
     * resultType string).
     *
     * @return the proxyUser value.
     */
    public Object proxyUser() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().proxyUser();
    }

    /**
     * Set the proxyUser property: The user to impersonate that will execute the job. Type: string (or Expression with
     * resultType string).
     *
     * @param proxyUser the proxyUser value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withProxyUser(Object proxyUser) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withProxyUser(proxyUser);
        return this;
    }

    /**
     * Get the sparkConfig property: Spark configuration property.
     *
     * @return the sparkConfig value.
     */
    public Map<String, Object> sparkConfig() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sparkConfig();
    }

    /**
     * Set the sparkConfig property: Spark configuration property.
     *
     * @param sparkConfig the sparkConfig value to set.
     * @return the HDInsightSparkActivity object itself.
     */
    public HDInsightSparkActivity withSparkConfig(Map<String, Object> sparkConfig) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightSparkActivityTypeProperties();
        }
        this.innerTypeProperties().withSparkConfig(sparkConfig);
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
                        "Missing required property innerTypeProperties in model HDInsightSparkActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightSparkActivity.class);
}
