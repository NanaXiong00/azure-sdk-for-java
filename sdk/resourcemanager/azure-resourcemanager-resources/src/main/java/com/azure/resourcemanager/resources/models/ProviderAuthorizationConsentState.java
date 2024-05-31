// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The provider authorization consent state.
 */
public final class ProviderAuthorizationConsentState extends ExpandableStringEnum<ProviderAuthorizationConsentState> {
    /**
     * Static value NotSpecified for ProviderAuthorizationConsentState.
     */
    public static final ProviderAuthorizationConsentState NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value Required for ProviderAuthorizationConsentState.
     */
    public static final ProviderAuthorizationConsentState REQUIRED = fromString("Required");

    /**
     * Static value NotRequired for ProviderAuthorizationConsentState.
     */
    public static final ProviderAuthorizationConsentState NOT_REQUIRED = fromString("NotRequired");

    /**
     * Static value Consented for ProviderAuthorizationConsentState.
     */
    public static final ProviderAuthorizationConsentState CONSENTED = fromString("Consented");

    /**
     * Creates a new instance of ProviderAuthorizationConsentState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProviderAuthorizationConsentState() {
    }

    /**
     * Creates or finds a ProviderAuthorizationConsentState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProviderAuthorizationConsentState.
     */
    @JsonCreator
    public static ProviderAuthorizationConsentState fromString(String name) {
        return fromString(name, ProviderAuthorizationConsentState.class);
    }

    /**
     * Gets known ProviderAuthorizationConsentState values.
     * 
     * @return known ProviderAuthorizationConsentState values.
     */
    public static Collection<ProviderAuthorizationConsentState> values() {
        return values(ProviderAuthorizationConsentState.class);
    }
}
