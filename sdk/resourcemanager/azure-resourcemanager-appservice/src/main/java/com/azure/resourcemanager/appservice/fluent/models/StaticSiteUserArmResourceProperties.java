// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * StaticSiteUserARMResource resource specific properties.
 */
@Fluent
public final class StaticSiteUserArmResourceProperties
    implements JsonSerializable<StaticSiteUserArmResourceProperties> {
    /*
     * The identity provider for the static site user.
     */
    private String provider;

    /*
     * The user id for the static site user.
     */
    private String userId;

    /*
     * The display name for the static site user.
     */
    private String displayName;

    /*
     * The roles for the static site user, in free-form string format
     */
    private String roles;

    /**
     * Creates an instance of StaticSiteUserArmResourceProperties class.
     */
    public StaticSiteUserArmResourceProperties() {
    }

    /**
     * Get the provider property: The identity provider for the static site user.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the userId property: The user id for the static site user.
     * 
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Get the displayName property: The display name for the static site user.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the roles property: The roles for the static site user, in free-form string format.
     * 
     * @return the roles value.
     */
    public String roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for the static site user, in free-form string format.
     * 
     * @param roles the roles value to set.
     * @return the StaticSiteUserArmResourceProperties object itself.
     */
    public StaticSiteUserArmResourceProperties withRoles(String roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("roles", this.roles);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticSiteUserArmResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticSiteUserArmResourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticSiteUserArmResourceProperties.
     */
    public static StaticSiteUserArmResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticSiteUserArmResourceProperties deserializedStaticSiteUserArmResourceProperties
                = new StaticSiteUserArmResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    deserializedStaticSiteUserArmResourceProperties.provider = reader.getString();
                } else if ("userId".equals(fieldName)) {
                    deserializedStaticSiteUserArmResourceProperties.userId = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedStaticSiteUserArmResourceProperties.displayName = reader.getString();
                } else if ("roles".equals(fieldName)) {
                    deserializedStaticSiteUserArmResourceProperties.roles = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStaticSiteUserArmResourceProperties;
        });
    }
}
