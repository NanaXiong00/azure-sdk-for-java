// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** recurrenceRangeType. */
public final class MicrosoftGraphRecurrenceRangeType extends ExpandableStringEnum<MicrosoftGraphRecurrenceRangeType> {
    /** Static value endDate for MicrosoftGraphRecurrenceRangeType. */
    public static final MicrosoftGraphRecurrenceRangeType END_DATE = fromString("endDate");

    /** Static value noEnd for MicrosoftGraphRecurrenceRangeType. */
    public static final MicrosoftGraphRecurrenceRangeType NO_END = fromString("noEnd");

    /** Static value numbered for MicrosoftGraphRecurrenceRangeType. */
    public static final MicrosoftGraphRecurrenceRangeType NUMBERED = fromString("numbered");

    /**
     * Creates or finds a MicrosoftGraphRecurrenceRangeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphRecurrenceRangeType.
     */
    @JsonCreator
    public static MicrosoftGraphRecurrenceRangeType fromString(String name) {
        return fromString(name, MicrosoftGraphRecurrenceRangeType.class);
    }

    /**
     * Gets known MicrosoftGraphRecurrenceRangeType values.
     *
     * @return known MicrosoftGraphRecurrenceRangeType values.
     */
    public static Collection<MicrosoftGraphRecurrenceRangeType> values() {
        return values(MicrosoftGraphRecurrenceRangeType.class);
    }
}
