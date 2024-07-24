// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * This parameter specifies who is authorized to change the ownership of a file. restricted - Only root user can change
 * the ownership of the file. unrestricted - Non-root users can change ownership of files that they own.
 */
public final class ChownMode extends ExpandableStringEnum<ChownMode> {
    /**
     * Static value Restricted for ChownMode.
     */
    public static final ChownMode RESTRICTED = fromString("Restricted");

    /**
     * Static value Unrestricted for ChownMode.
     */
    public static final ChownMode UNRESTRICTED = fromString("Unrestricted");

    /**
     * Creates a new instance of ChownMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ChownMode() {
    }

    /**
     * Creates or finds a ChownMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ChownMode.
     */
    public static ChownMode fromString(String name) {
        return fromString(name, ChownMode.class);
    }

    /**
     * Gets known ChownMode values.
     * 
     * @return known ChownMode values.
     */
    public static Collection<ChownMode> values() {
        return values(ChownMode.class);
    }
}
