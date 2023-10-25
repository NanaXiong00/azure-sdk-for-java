// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** The items in the current page of results. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AssetResource.class)
@JsonTypeName("AssetResource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "as", value = AsAssetResource.class),
    @JsonSubTypes.Type(name = "contact", value = ContactAssetResource.class),
    @JsonSubTypes.Type(name = "domain", value = DomainAssetResource.class),
    @JsonSubTypes.Type(name = "host", value = HostAssetResource.class),
    @JsonSubTypes.Type(name = "ipAddress", value = IpAddressAssetResource.class),
    @JsonSubTypes.Type(name = "ipBlock", value = IpBlockAssetResource.class),
    @JsonSubTypes.Type(name = "page", value = PageAssetResource.class),
    @JsonSubTypes.Type(name = "sslCert", value = SslCertAssetResource.class)
})
@Immutable
public class AssetResource {

    /*
     * The system generated unique id for the resource.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The caller provided unique name for the resource.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name that can be used for display purposes.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Global UUID for the asset.
     */
    @Generated
    @JsonProperty(value = "uuid")
    private String uuid;

    /*
     * The date this asset was first added to this workspace.
     */
    @Generated
    @JsonProperty(value = "createdDate")
    private OffsetDateTime createdDate;

    /*
     * The date this asset was last updated for this workspace.
     */
    @Generated
    @JsonProperty(value = "updatedDate")
    private OffsetDateTime updatedDate;

    /*
     * The state property.
     */
    @Generated
    @JsonProperty(value = "state")
    private AssetState state;

    /*
     * An optional customer provided identifier for this asset.
     */
    @Generated
    @JsonProperty(value = "externalId")
    private String externalId;

    /*
     * Customer labels assigned to this asset.
     */
    @Generated
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * An indicator of whether this asset represents a wildcard rollup of assets on this domain.
     */
    @Generated
    @JsonProperty(value = "wildcard")
    private Boolean wildcard;

    /*
     * The name of the DiscoGroup that brought added this asset to the workspace.
     */
    @Generated
    @JsonProperty(value = "discoGroupName")
    private String discoGroupName;

    /*
     * The history of how this asset was pulled into the workspace through the discovery process.
     */
    @Generated
    @JsonProperty(value = "auditTrail")
    private List<AuditTrailItem> auditTrail;

    /*
     * The reason property.
     */
    @Generated
    @JsonProperty(value = "reason")
    private String reason;

    /** Creates an instance of AssetResource class. */
    @Generated
    protected AssetResource() {}

    /**
     * Get the id property: The system generated unique id for the resource.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The caller provided unique name for the resource.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The name that can be used for display purposes.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the uuid property: Global UUID for the asset.
     *
     * @return the uuid value.
     */
    @Generated
    public String getUuid() {
        return this.uuid;
    }

    /**
     * Get the createdDate property: The date this asset was first added to this workspace.
     *
     * @return the createdDate value.
     */
    @Generated
    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Get the updatedDate property: The date this asset was last updated for this workspace.
     *
     * @return the updatedDate value.
     */
    @Generated
    public OffsetDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    @Generated
    public AssetState getState() {
        return this.state;
    }

    /**
     * Get the externalId property: An optional customer provided identifier for this asset.
     *
     * @return the externalId value.
     */
    @Generated
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * Get the labels property: Customer labels assigned to this asset.
     *
     * @return the labels value.
     */
    @Generated
    public List<String> getLabels() {
        return this.labels;
    }

    /**
     * Get the wildcard property: An indicator of whether this asset represents a wildcard rollup of assets on this
     * domain.
     *
     * @return the wildcard value.
     */
    @Generated
    public Boolean isWildcard() {
        return this.wildcard;
    }

    /**
     * Get the discoGroupName property: The name of the DiscoGroup that brought added this asset to the workspace.
     *
     * @return the discoGroupName value.
     */
    @Generated
    public String getDiscoGroupName() {
        return this.discoGroupName;
    }

    /**
     * Get the auditTrail property: The history of how this asset was pulled into the workspace through the discovery
     * process.
     *
     * @return the auditTrail value.
     */
    @Generated
    public List<AuditTrailItem> getAuditTrail() {
        return this.auditTrail;
    }

    /**
     * Get the reason property: The reason property.
     *
     * @return the reason value.
     */
    @Generated
    public String getReason() {
        return this.reason;
    }
}
