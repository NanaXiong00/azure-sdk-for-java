// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ArmProxyResource;
import java.io.IOException;

/**
 * An Azure Cosmos DB Role Assignment.
 */
@Fluent
public final class SqlRoleAssignmentGetResultsInner extends ArmProxyResource {
    /*
     * Properties related to the Role Assignment.
     */
    private SqlRoleAssignmentResource innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SqlRoleAssignmentGetResultsInner class.
     */
    public SqlRoleAssignmentGetResultsInner() {
    }

    /**
     * Get the innerProperties property: Properties related to the Role Assignment.
     * 
     * @return the innerProperties value.
     */
    private SqlRoleAssignmentResource innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the roleDefinitionId property: The unique identifier for the associated Role Definition.
     * 
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The unique identifier for the associated Role Definition.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the SqlRoleAssignmentGetResultsInner object itself.
     */
    public SqlRoleAssignmentGetResultsInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleAssignmentResource();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: The data plane resource path for which access is being granted through this Role
     * Assignment.
     * 
     * @param scope the scope value to set.
     * @return the SqlRoleAssignmentGetResultsInner object itself.
     */
    public SqlRoleAssignmentGetResultsInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleAssignmentResource();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The unique identifier for the associated AAD principal in the AAD graph to which
     * access is being granted through this Role Assignment. Tenant ID for the principal is inferred using the tenant
     * associated with the subscription.
     * 
     * @param principalId the principalId value to set.
     * @return the SqlRoleAssignmentGetResultsInner object itself.
     */
    public SqlRoleAssignmentGetResultsInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlRoleAssignmentResource();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SqlRoleAssignmentGetResultsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlRoleAssignmentGetResultsInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SqlRoleAssignmentGetResultsInner.
     */
    public static SqlRoleAssignmentGetResultsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlRoleAssignmentGetResultsInner deserializedSqlRoleAssignmentGetResultsInner
                = new SqlRoleAssignmentGetResultsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSqlRoleAssignmentGetResultsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSqlRoleAssignmentGetResultsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSqlRoleAssignmentGetResultsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSqlRoleAssignmentGetResultsInner.innerProperties
                        = SqlRoleAssignmentResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlRoleAssignmentGetResultsInner;
        });
    }
}
