// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PricingTier. */
public final class PricingTier extends ExpandableStringEnum<PricingTier> {
    /** Static value Free for PricingTier. */
    public static final PricingTier FREE = fromString("Free");

    /** Static value Standard for PricingTier. */
    public static final PricingTier STANDARD = fromString("Standard");

    /**
     * Creates or finds a PricingTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PricingTier.
     */
    @JsonCreator
    public static PricingTier fromString(String name) {
        return fromString(name, PricingTier.class);
    }

    /** @return known PricingTier values. */
    public static Collection<PricingTier> values() {
        return values(PricingTier.class);
    }
}
