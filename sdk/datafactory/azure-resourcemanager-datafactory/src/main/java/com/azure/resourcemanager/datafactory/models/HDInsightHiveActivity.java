// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightHiveActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight Hive activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightHive")
@Fluent
public final class HDInsightHiveActivity extends ExecutionActivity {
    /*
     * HDInsight Hive activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private HDInsightHiveActivityTypeProperties innerTypeProperties = new HDInsightHiveActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: HDInsight Hive activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private HDInsightHiveActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightHiveActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     *
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().storageLinkedServices();
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withStorageLinkedServices(storageLinkedServices);
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity.
     *
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().arguments();
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity.
     *
     * @param arguments the arguments value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withArguments(List<Object> arguments) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
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
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withGetDebugInfo(getDebugInfo);
        return this;
    }

    /**
     * Get the scriptPath property: Script path. Type: string (or Expression with resultType string).
     *
     * @return the scriptPath value.
     */
    public Object scriptPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scriptPath();
    }

    /**
     * Set the scriptPath property: Script path. Type: string (or Expression with resultType string).
     *
     * @param scriptPath the scriptPath value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withScriptPath(Object scriptPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
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
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withScriptLinkedService(LinkedServiceReference scriptLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withScriptLinkedService(scriptLinkedService);
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for Hive job request.
     *
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().defines();
    }

    /**
     * Set the defines property: Allows user to specify defines for Hive job request.
     *
     * @param defines the defines value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withDefines(Map<String, Object> defines) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withDefines(defines);
        return this;
    }

    /**
     * Get the variables property: User specified arguments under hivevar namespace.
     *
     * @return the variables value.
     */
    public List<Object> variables() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variables();
    }

    /**
     * Set the variables property: User specified arguments under hivevar namespace.
     *
     * @param variables the variables value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withVariables(List<Object> variables) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withVariables(variables);
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout value (in minutes). Effective when the HDInsight cluster is with ESP
     * (Enterprise Security Package).
     *
     * @return the queryTimeout value.
     */
    public Integer queryTimeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().queryTimeout();
    }

    /**
     * Set the queryTimeout property: Query timeout value (in minutes). Effective when the HDInsight cluster is with ESP
     * (Enterprise Security Package).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the HDInsightHiveActivity object itself.
     */
    public HDInsightHiveActivity withQueryTimeout(Integer queryTimeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightHiveActivityTypeProperties();
        }
        this.innerTypeProperties().withQueryTimeout(queryTimeout);
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
                        "Missing required property innerTypeProperties in model HDInsightHiveActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HDInsightHiveActivity.class);
}
