// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.ActivityEntityQueriesProperties;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityQueryInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Represents Activity entity query. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Activity")
@Fluent
public final class ActivityEntityQuery extends EntityQueryInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivityEntityQuery.class);

    /*
     * Activity entity query properties
     */
    @JsonProperty(value = "properties")
    private ActivityEntityQueriesProperties innerProperties;

    /**
     * Get the innerProperties property: Activity entity query properties.
     *
     * @return the innerProperties value.
     */
    private ActivityEntityQueriesProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ActivityEntityQuery withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the title property: The entity query title.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: The entity query title.
     *
     * @param title the title value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the content property: The entity query content to display in timeline.
     *
     * @return the content value.
     */
    public String content() {
        return this.innerProperties() == null ? null : this.innerProperties().content();
    }

    /**
     * Set the content property: The entity query content to display in timeline.
     *
     * @param content the content value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withContent(String content) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withContent(content);
        return this;
    }

    /**
     * Get the description property: The entity query description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The entity query description.
     *
     * @param description the description value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the queryDefinitions property: The Activity query definitions.
     *
     * @return the queryDefinitions value.
     */
    public ActivityEntityQueriesPropertiesQueryDefinitions queryDefinitions() {
        return this.innerProperties() == null ? null : this.innerProperties().queryDefinitions();
    }

    /**
     * Set the queryDefinitions property: The Activity query definitions.
     *
     * @param queryDefinitions the queryDefinitions value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withQueryDefinitions(ActivityEntityQueriesPropertiesQueryDefinitions queryDefinitions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withQueryDefinitions(queryDefinitions);
        return this;
    }

    /**
     * Get the inputEntityType property: The type of the query's source entity.
     *
     * @return the inputEntityType value.
     */
    public EntityType inputEntityType() {
        return this.innerProperties() == null ? null : this.innerProperties().inputEntityType();
    }

    /**
     * Set the inputEntityType property: The type of the query's source entity.
     *
     * @param inputEntityType the inputEntityType value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withInputEntityType(EntityType inputEntityType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withInputEntityType(inputEntityType);
        return this;
    }

    /**
     * Get the requiredInputFieldsSets property: List of the fields of the source entity that are required to run the
     * query.
     *
     * @return the requiredInputFieldsSets value.
     */
    public List<List<String>> requiredInputFieldsSets() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredInputFieldsSets();
    }

    /**
     * Set the requiredInputFieldsSets property: List of the fields of the source entity that are required to run the
     * query.
     *
     * @param requiredInputFieldsSets the requiredInputFieldsSets value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withRequiredInputFieldsSets(List<List<String>> requiredInputFieldsSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withRequiredInputFieldsSets(requiredInputFieldsSets);
        return this;
    }

    /**
     * Get the entitiesFilter property: The query applied only to entities matching to all filters.
     *
     * @return the entitiesFilter value.
     */
    public Map<String, List<String>> entitiesFilter() {
        return this.innerProperties() == null ? null : this.innerProperties().entitiesFilter();
    }

    /**
     * Set the entitiesFilter property: The query applied only to entities matching to all filters.
     *
     * @param entitiesFilter the entitiesFilter value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withEntitiesFilter(Map<String, List<String>> entitiesFilter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withEntitiesFilter(entitiesFilter);
        return this;
    }

    /**
     * Get the templateName property: The template id this activity was created from.
     *
     * @return the templateName value.
     */
    public String templateName() {
        return this.innerProperties() == null ? null : this.innerProperties().templateName();
    }

    /**
     * Set the templateName property: The template id this activity was created from.
     *
     * @param templateName the templateName value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withTemplateName(String templateName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withTemplateName(templateName);
        return this;
    }

    /**
     * Get the enabled property: Determines whether this activity is enabled or disabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Determines whether this activity is enabled or disabled.
     *
     * @param enabled the enabled value to set.
     * @return the ActivityEntityQuery object itself.
     */
    public ActivityEntityQuery withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ActivityEntityQueriesProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the createdTimeUtc property: The time the activity was created.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTimeUtc();
    }

    /**
     * Get the lastModifiedTimeUtc property: The last time the activity was updated.
     *
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTimeUtc();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
