// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/**
 * The CreateSnapshotHeaders model.
 */
@Fluent
public final class CreateSnapshotHeaders {
    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The Sync-Token property.
     */
    private String syncToken;

    /*
     * The Operation-Location property.
     */
    private String operationLocation;

    /*
     * The Link property.
     */
    private String link;

    private static final HttpHeaderName SYNC_TOKEN = HttpHeaderName.fromString("Sync-Token");

    private static final HttpHeaderName OPERATION_LOCATION = HttpHeaderName.fromString("Operation-Location");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of CreateSnapshotHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public CreateSnapshotHeaders(HttpHeaders rawHeaders) {
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.syncToken = rawHeaders.getValue(SYNC_TOKEN);
        this.operationLocation = rawHeaders.getValue(OPERATION_LOCATION);
        this.link = rawHeaders.getValue(HttpHeaderName.LINK);
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the CreateSnapshotHeaders object itself.
     */
    public CreateSnapshotHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the syncToken property: The Sync-Token property.
     * 
     * @return the syncToken value.
     */
    public String getSyncToken() {
        return this.syncToken;
    }

    /**
     * Set the syncToken property: The Sync-Token property.
     * 
     * @param syncToken the syncToken value to set.
     * @return the CreateSnapshotHeaders object itself.
     */
    public CreateSnapshotHeaders setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     * 
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     * 
     * @param operationLocation the operationLocation value to set.
     * @return the CreateSnapshotHeaders object itself.
     */
    public CreateSnapshotHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * Get the link property: The Link property.
     * 
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The Link property.
     * 
     * @param link the link value to set.
     * @return the CreateSnapshotHeaders object itself.
     */
    public CreateSnapshotHeaders setLink(String link) {
        this.link = link;
        return this;
    }
}
