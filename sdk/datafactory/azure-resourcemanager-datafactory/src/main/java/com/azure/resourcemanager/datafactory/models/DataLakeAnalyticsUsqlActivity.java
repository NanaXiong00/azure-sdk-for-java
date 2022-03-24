// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DataLakeAnalyticsUsqlActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Data Lake Analytics U-SQL activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DataLakeAnalyticsU-SQL")
@Fluent
public final class DataLakeAnalyticsUsqlActivity extends ExecutionActivity {
    /*
     * Data Lake Analytics U-SQL activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private DataLakeAnalyticsUsqlActivityTypeProperties innerTypeProperties =
        new DataLakeAnalyticsUsqlActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: Data Lake Analytics U-SQL activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private DataLakeAnalyticsUsqlActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataLakeAnalyticsUsqlActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the scriptPath property: Case-sensitive path to folder that contains the U-SQL script. Type: string (or
     * Expression with resultType string).
     *
     * @return the scriptPath value.
     */
    public Object scriptPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scriptPath();
    }

    /**
     * Set the scriptPath property: Case-sensitive path to folder that contains the U-SQL script. Type: string (or
     * Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withScriptPath(Object scriptPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withScriptPath(scriptPath);
        return this;
    }

    /**
     * Get the scriptLinkedService property: Script linked service reference.
     *
     * @return the scriptLinkedService value.
     */
    public LinkedServiceReference scriptLinkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scriptLinkedService();
    }

    /**
     * Set the scriptLinkedService property: Script linked service reference.
     *
     * @param scriptLinkedService the scriptLinkedService value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withScriptLinkedService(scriptLinkedService);
        return this;
    }

    /**
     * Get the degreeOfParallelism property: The maximum number of nodes simultaneously used to run the job. Default
     * value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @return the degreeOfParallelism value.
     */
    public Object degreeOfParallelism() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().degreeOfParallelism();
    }

    /**
     * Set the degreeOfParallelism property: The maximum number of nodes simultaneously used to run the job. Default
     * value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withDegreeOfParallelism(Object degreeOfParallelism) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withDegreeOfParallelism(degreeOfParallelism);
        return this;
    }

    /**
     * Get the priority property: Determines which jobs out of all that are queued should be selected to run first. The
     * lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType
     * integer), minimum: 1.
     *
     * @return the priority value.
     */
    public Object priority() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().priority();
    }

    /**
     * Set the priority property: Determines which jobs out of all that are queued should be selected to run first. The
     * lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType
     * integer), minimum: 1.
     *
     * @param priority the priority value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withPriority(Object priority) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the parameters property: Parameters for U-SQL job request.
     *
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().parameters();
    }

    /**
     * Set the parameters property: Parameters for U-SQL job request.
     *
     * @param parameters the parameters value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withParameters(Map<String, Object> parameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the runtimeVersion property: Runtime version of the U-SQL engine to use. Type: string (or Expression with
     * resultType string).
     *
     * @return the runtimeVersion value.
     */
    public Object runtimeVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().runtimeVersion();
    }

    /**
     * Set the runtimeVersion property: Runtime version of the U-SQL engine to use. Type: string (or Expression with
     * resultType string).
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withRuntimeVersion(Object runtimeVersion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withRuntimeVersion(runtimeVersion);
        return this;
    }

    /**
     * Get the compilationMode property: Compilation mode of U-SQL. Must be one of these values : Semantic, Full and
     * SingleBox. Type: string (or Expression with resultType string).
     *
     * @return the compilationMode value.
     */
    public Object compilationMode() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compilationMode();
    }

    /**
     * Set the compilationMode property: Compilation mode of U-SQL. Must be one of these values : Semantic, Full and
     * SingleBox. Type: string (or Expression with resultType string).
     *
     * @param compilationMode the compilationMode value to set.
     * @return the DataLakeAnalyticsUsqlActivity object itself.
     */
    public DataLakeAnalyticsUsqlActivity withCompilationMode(Object compilationMode) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DataLakeAnalyticsUsqlActivityTypeProperties();
        }
        this.innerTypeProperties().withCompilationMode(compilationMode);
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
                        "Missing required property innerTypeProperties in model DataLakeAnalyticsUsqlActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataLakeAnalyticsUsqlActivity.class);
}
