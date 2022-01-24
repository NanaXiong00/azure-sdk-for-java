// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Operator. */
public final class Operator extends ExpandableStringEnum<Operator> {
    /** Static value AND for Operator. */
    public static final Operator AND = fromString("AND");

    /** Static value OR for Operator. */
    public static final Operator OR = fromString("OR");

    /**
     * Creates or finds a Operator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Operator.
     */
    @JsonCreator
    public static Operator fromString(String name) {
        return fromString(name, Operator.class);
    }

    /** @return known Operator values. */
    public static Collection<Operator> values() {
        return values(Operator.class);
    }
}
