// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RepoType. */
public final class RepoType extends ExpandableStringEnum<RepoType> {
    /** Static value Github for RepoType. */
    public static final RepoType GITHUB = fromString("Github");

    /** Static value DevOps for RepoType. */
    public static final RepoType DEV_OPS = fromString("DevOps");

    /**
     * Creates or finds a RepoType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RepoType.
     */
    @JsonCreator
    public static RepoType fromString(String name) {
        return fromString(name, RepoType.class);
    }

    /** @return known RepoType values. */
    public static Collection<RepoType> values() {
        return values(RepoType.class);
    }
}
