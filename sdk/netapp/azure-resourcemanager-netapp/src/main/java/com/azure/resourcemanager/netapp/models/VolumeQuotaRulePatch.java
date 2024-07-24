// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRulesProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Patchable Quota Rule of a Volume.
 */
@Fluent
public final class VolumeQuotaRulePatch implements JsonSerializable<VolumeQuotaRulePatch> {
    /*
     * Resource tags
     */
    private Map<String, String> tags;

    /*
     * Volume Quota Rule Properties
     */
    private VolumeQuotaRulesProperties innerProperties;

    /**
     * Creates an instance of VolumeQuotaRulePatch class.
     */
    public VolumeQuotaRulePatch() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Volume Quota Rule Properties.
     * 
     * @return the innerProperties value.
     */
    private VolumeQuotaRulesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Gets the status of the VolumeQuotaRule at the time the operation was called.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the quotaSizeInKiBs property: Size of quota.
     * 
     * @return the quotaSizeInKiBs value.
     */
    public Long quotaSizeInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaSizeInKiBs();
    }

    /**
     * Set the quotaSizeInKiBs property: Size of quota.
     * 
     * @param quotaSizeInKiBs the quotaSizeInKiBs value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaSizeInKiBs(Long quotaSizeInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaSizeInKiBs(quotaSizeInKiBs);
        return this;
    }

    /**
     * Get the quotaType property: Type of quota.
     * 
     * @return the quotaType value.
     */
    public Type quotaType() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaType();
    }

    /**
     * Set the quotaType property: Type of quota.
     * 
     * @param quotaType the quotaType value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaType(Type quotaType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaType(quotaType);
        return this;
    }

    /**
     * Get the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @return the quotaTarget value.
     */
    public String quotaTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaTarget();
    }

    /**
     * Set the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     * 
     * @param quotaTarget the quotaTarget value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaTarget(String quotaTarget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaTarget(quotaTarget);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeQuotaRulePatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeQuotaRulePatch if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeQuotaRulePatch.
     */
    public static VolumeQuotaRulePatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeQuotaRulePatch deserializedVolumeQuotaRulePatch = new VolumeQuotaRulePatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedVolumeQuotaRulePatch.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedVolumeQuotaRulePatch.innerProperties = VolumeQuotaRulesProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeQuotaRulePatch;
        });
    }
}
