// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The object representing periodic mode backup policy.
 */
@Fluent
public final class PeriodicModeBackupPolicy extends BackupPolicy {
    /*
     * Describes the mode of backups.
     */
    private BackupPolicyType type = BackupPolicyType.PERIODIC;

    /*
     * Configuration values for periodic mode backup
     */
    private PeriodicModeProperties periodicModeProperties;

    /**
     * Creates an instance of PeriodicModeBackupPolicy class.
     */
    public PeriodicModeBackupPolicy() {
    }

    /**
     * Get the type property: Describes the mode of backups.
     * 
     * @return the type value.
     */
    @Override
    public BackupPolicyType type() {
        return this.type;
    }

    /**
     * Get the periodicModeProperties property: Configuration values for periodic mode backup.
     * 
     * @return the periodicModeProperties value.
     */
    public PeriodicModeProperties periodicModeProperties() {
        return this.periodicModeProperties;
    }

    /**
     * Set the periodicModeProperties property: Configuration values for periodic mode backup.
     * 
     * @param periodicModeProperties the periodicModeProperties value to set.
     * @return the PeriodicModeBackupPolicy object itself.
     */
    public PeriodicModeBackupPolicy withPeriodicModeProperties(PeriodicModeProperties periodicModeProperties) {
        this.periodicModeProperties = periodicModeProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodicModeBackupPolicy withMigrationState(BackupPolicyMigrationState migrationState) {
        super.withMigrationState(migrationState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (periodicModeProperties() != null) {
            periodicModeProperties().validate();
        }
        if (migrationState() != null) {
            migrationState().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("migrationState", migrationState());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("periodicModeProperties", this.periodicModeProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeriodicModeBackupPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeriodicModeBackupPolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PeriodicModeBackupPolicy.
     */
    public static PeriodicModeBackupPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeriodicModeBackupPolicy deserializedPeriodicModeBackupPolicy = new PeriodicModeBackupPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("migrationState".equals(fieldName)) {
                    deserializedPeriodicModeBackupPolicy
                        .withMigrationState(BackupPolicyMigrationState.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedPeriodicModeBackupPolicy.type = BackupPolicyType.fromString(reader.getString());
                } else if ("periodicModeProperties".equals(fieldName)) {
                    deserializedPeriodicModeBackupPolicy.periodicModeProperties
                        = PeriodicModeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeriodicModeBackupPolicy;
        });
    }
}
