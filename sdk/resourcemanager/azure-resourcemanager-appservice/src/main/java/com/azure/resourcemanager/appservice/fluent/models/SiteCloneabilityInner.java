// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.CloneAbilityResult;
import com.azure.resourcemanager.appservice.models.SiteCloneabilityCriterion;
import java.io.IOException;
import java.util.List;

/**
 * Represents whether or not an app is cloneable.
 */
@Fluent
public final class SiteCloneabilityInner implements JsonSerializable<SiteCloneabilityInner> {
    /*
     * Name of app.
     */
    private CloneAbilityResult result;

    /*
     * List of features enabled on app that prevent cloning.
     */
    private List<SiteCloneabilityCriterion> blockingFeatures;

    /*
     * List of features enabled on app that are non-blocking but cannot be cloned. The app can still be cloned
     * but the features in this list will not be set up on cloned app.
     */
    private List<SiteCloneabilityCriterion> unsupportedFeatures;

    /*
     * List of blocking application characteristics.
     */
    private List<SiteCloneabilityCriterion> blockingCharacteristics;

    /**
     * Creates an instance of SiteCloneabilityInner class.
     */
    public SiteCloneabilityInner() {
    }

    /**
     * Get the result property: Name of app.
     * 
     * @return the result value.
     */
    public CloneAbilityResult result() {
        return this.result;
    }

    /**
     * Set the result property: Name of app.
     * 
     * @param result the result value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withResult(CloneAbilityResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get the blockingFeatures property: List of features enabled on app that prevent cloning.
     * 
     * @return the blockingFeatures value.
     */
    public List<SiteCloneabilityCriterion> blockingFeatures() {
        return this.blockingFeatures;
    }

    /**
     * Set the blockingFeatures property: List of features enabled on app that prevent cloning.
     * 
     * @param blockingFeatures the blockingFeatures value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withBlockingFeatures(List<SiteCloneabilityCriterion> blockingFeatures) {
        this.blockingFeatures = blockingFeatures;
        return this;
    }

    /**
     * Get the unsupportedFeatures property: List of features enabled on app that are non-blocking but cannot be cloned.
     * The app can still be cloned
     * but the features in this list will not be set up on cloned app.
     * 
     * @return the unsupportedFeatures value.
     */
    public List<SiteCloneabilityCriterion> unsupportedFeatures() {
        return this.unsupportedFeatures;
    }

    /**
     * Set the unsupportedFeatures property: List of features enabled on app that are non-blocking but cannot be cloned.
     * The app can still be cloned
     * but the features in this list will not be set up on cloned app.
     * 
     * @param unsupportedFeatures the unsupportedFeatures value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withUnsupportedFeatures(List<SiteCloneabilityCriterion> unsupportedFeatures) {
        this.unsupportedFeatures = unsupportedFeatures;
        return this;
    }

    /**
     * Get the blockingCharacteristics property: List of blocking application characteristics.
     * 
     * @return the blockingCharacteristics value.
     */
    public List<SiteCloneabilityCriterion> blockingCharacteristics() {
        return this.blockingCharacteristics;
    }

    /**
     * Set the blockingCharacteristics property: List of blocking application characteristics.
     * 
     * @param blockingCharacteristics the blockingCharacteristics value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withBlockingCharacteristics(List<SiteCloneabilityCriterion> blockingCharacteristics) {
        this.blockingCharacteristics = blockingCharacteristics;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blockingFeatures() != null) {
            blockingFeatures().forEach(e -> e.validate());
        }
        if (unsupportedFeatures() != null) {
            unsupportedFeatures().forEach(e -> e.validate());
        }
        if (blockingCharacteristics() != null) {
            blockingCharacteristics().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("result", this.result == null ? null : this.result.toString());
        jsonWriter.writeArrayField("blockingFeatures", this.blockingFeatures,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("unsupportedFeatures", this.unsupportedFeatures,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("blockingCharacteristics", this.blockingCharacteristics,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SiteCloneabilityInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SiteCloneabilityInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SiteCloneabilityInner.
     */
    public static SiteCloneabilityInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SiteCloneabilityInner deserializedSiteCloneabilityInner = new SiteCloneabilityInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("result".equals(fieldName)) {
                    deserializedSiteCloneabilityInner.result = CloneAbilityResult.fromString(reader.getString());
                } else if ("blockingFeatures".equals(fieldName)) {
                    List<SiteCloneabilityCriterion> blockingFeatures
                        = reader.readArray(reader1 -> SiteCloneabilityCriterion.fromJson(reader1));
                    deserializedSiteCloneabilityInner.blockingFeatures = blockingFeatures;
                } else if ("unsupportedFeatures".equals(fieldName)) {
                    List<SiteCloneabilityCriterion> unsupportedFeatures
                        = reader.readArray(reader1 -> SiteCloneabilityCriterion.fromJson(reader1));
                    deserializedSiteCloneabilityInner.unsupportedFeatures = unsupportedFeatures;
                } else if ("blockingCharacteristics".equals(fieldName)) {
                    List<SiteCloneabilityCriterion> blockingCharacteristics
                        = reader.readArray(reader1 -> SiteCloneabilityCriterion.fromJson(reader1));
                    deserializedSiteCloneabilityInner.blockingCharacteristics = blockingCharacteristics;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSiteCloneabilityInner;
        });
    }
}
