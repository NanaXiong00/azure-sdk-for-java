// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The GuidPair model. */
@Immutable
public final class GuidPair {

    /*
     * The pageGuid property.
     */
    @Generated
    @JsonProperty(value = "pageGuid")
    private String pageGuid;

    /*
     * The crawlStateGuid property.
     */
    @Generated
    @JsonProperty(value = "crawlStateGuid")
    private String crawlStateGuid;

    /*
     * The loadDate property.
     */
    @Generated
    @JsonProperty(value = "loadDate")
    private OffsetDateTime loadDate;

    /*
     * The recent property.
     */
    @Generated
    @JsonProperty(value = "recent")
    private Boolean recent;

    /** Creates an instance of GuidPair class. */
    @Generated
    private GuidPair() {}

    /**
     * Get the pageGuid property: The pageGuid property.
     *
     * @return the pageGuid value.
     */
    @Generated
    public String getPageGuid() {
        return this.pageGuid;
    }

    /**
     * Get the crawlStateGuid property: The crawlStateGuid property.
     *
     * @return the crawlStateGuid value.
     */
    @Generated
    public String getCrawlStateGuid() {
        return this.crawlStateGuid;
    }

    /**
     * Get the loadDate property: The loadDate property.
     *
     * @return the loadDate value.
     */
    @Generated
    public OffsetDateTime getLoadDate() {
        return this.loadDate;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    public Boolean isRecent() {
        return this.recent;
    }
}
