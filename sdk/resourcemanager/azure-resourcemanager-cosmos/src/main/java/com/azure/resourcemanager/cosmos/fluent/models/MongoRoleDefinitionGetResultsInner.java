// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ArmProxyResource;
import com.azure.resourcemanager.cosmos.models.MongoRoleDefinitionType;
import com.azure.resourcemanager.cosmos.models.Privilege;
import com.azure.resourcemanager.cosmos.models.Role;
import java.io.IOException;
import java.util.List;

/**
 * An Azure Cosmos DB Mongo Role Definition.
 */
@Fluent
public final class MongoRoleDefinitionGetResultsInner extends ArmProxyResource {
    /*
     * Properties related to the Mongo Role Definition.
     */
    private MongoRoleDefinitionResource innerProperties;

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
     * Creates an instance of MongoRoleDefinitionGetResultsInner class.
     */
    public MongoRoleDefinitionGetResultsInner() {
    }

    /**
     * Get the innerProperties property: Properties related to the Mongo Role Definition.
     * 
     * @return the innerProperties value.
     */
    private MongoRoleDefinitionResource innerProperties() {
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
     * Get the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     * @return the roleName value.
     */
    public String roleName() {
        return this.innerProperties() == null ? null : this.innerProperties().roleName();
    }

    /**
     * Set the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     * @param roleName the roleName value to set.
     * @return the MongoRoleDefinitionGetResultsInner object itself.
     */
    public MongoRoleDefinitionGetResultsInner withRoleName(String roleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoRoleDefinitionResource();
        }
        this.innerProperties().withRoleName(roleName);
        return this;
    }

    /**
     * Get the type property: Indicates whether the Role Definition was built-in or user created.
     * 
     * @return the type value.
     */
    public MongoRoleDefinitionType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Indicates whether the Role Definition was built-in or user created.
     * 
     * @param type the type value to set.
     * @return the MongoRoleDefinitionGetResultsInner object itself.
     */
    public MongoRoleDefinitionGetResultsInner withTypePropertiesType(MongoRoleDefinitionType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoRoleDefinitionResource();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the databaseName property: The database name for which access is being granted for this Role Definition.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Set the databaseName property: The database name for which access is being granted for this Role Definition.
     * 
     * @param databaseName the databaseName value to set.
     * @return the MongoRoleDefinitionGetResultsInner object itself.
     */
    public MongoRoleDefinitionGetResultsInner withDatabaseName(String databaseName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoRoleDefinitionResource();
        }
        this.innerProperties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the privileges property: A set of privileges contained by the Role Definition. This will allow application of
     * this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than
     * Database are not enforceable as privilege.
     * 
     * @return the privileges value.
     */
    public List<Privilege> privileges() {
        return this.innerProperties() == null ? null : this.innerProperties().privileges();
    }

    /**
     * Set the privileges property: A set of privileges contained by the Role Definition. This will allow application of
     * this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than
     * Database are not enforceable as privilege.
     * 
     * @param privileges the privileges value to set.
     * @return the MongoRoleDefinitionGetResultsInner object itself.
     */
    public MongoRoleDefinitionGetResultsInner withPrivileges(List<Privilege> privileges) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoRoleDefinitionResource();
        }
        this.innerProperties().withPrivileges(privileges);
        return this;
    }

    /**
     * Get the roles property: The set of roles inherited by this Role Definition.
     * 
     * @return the roles value.
     */
    public List<Role> roles() {
        return this.innerProperties() == null ? null : this.innerProperties().roles();
    }

    /**
     * Set the roles property: The set of roles inherited by this Role Definition.
     * 
     * @param roles the roles value to set.
     * @return the MongoRoleDefinitionGetResultsInner object itself.
     */
    public MongoRoleDefinitionGetResultsInner withRoles(List<Role> roles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MongoRoleDefinitionResource();
        }
        this.innerProperties().withRoles(roles);
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
     * Reads an instance of MongoRoleDefinitionGetResultsInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoRoleDefinitionGetResultsInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MongoRoleDefinitionGetResultsInner.
     */
    public static MongoRoleDefinitionGetResultsInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoRoleDefinitionGetResultsInner deserializedMongoRoleDefinitionGetResultsInner
                = new MongoRoleDefinitionGetResultsInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMongoRoleDefinitionGetResultsInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMongoRoleDefinitionGetResultsInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMongoRoleDefinitionGetResultsInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedMongoRoleDefinitionGetResultsInner.innerProperties
                        = MongoRoleDefinitionResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoRoleDefinitionGetResultsInner;
        });
    }
}
