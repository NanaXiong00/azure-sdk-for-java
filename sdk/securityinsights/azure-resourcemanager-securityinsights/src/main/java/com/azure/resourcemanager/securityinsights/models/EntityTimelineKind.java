// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntityTimelineKind. */
public final class EntityTimelineKind extends ExpandableStringEnum<EntityTimelineKind> {
    /** Static value Activity for EntityTimelineKind. */
    public static final EntityTimelineKind ACTIVITY = fromString("Activity");

    /** Static value Bookmark for EntityTimelineKind. */
    public static final EntityTimelineKind BOOKMARK = fromString("Bookmark");

    /** Static value SecurityAlert for EntityTimelineKind. */
    public static final EntityTimelineKind SECURITY_ALERT = fromString("SecurityAlert");

    /**
     * Creates or finds a EntityTimelineKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityTimelineKind.
     */
    @JsonCreator
    public static EntityTimelineKind fromString(String name) {
        return fromString(name, EntityTimelineKind.class);
    }

    /** @return known EntityTimelineKind values. */
    public static Collection<EntityTimelineKind> values() {
        return values(EntityTimelineKind.class);
    }
}
