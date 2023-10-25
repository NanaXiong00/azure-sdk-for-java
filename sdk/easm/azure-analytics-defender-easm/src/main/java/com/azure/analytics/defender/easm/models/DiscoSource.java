// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Source entity used to drive discovery. */
@Fluent
public final class DiscoSource {

    /*
     * The kind of disco source.
     */
    @Generated
    @JsonProperty(value = "kind")
    private DiscoSourceKind kind;

    /*
     * The name for the disco source.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of DiscoSource class. */
    @Generated
    public DiscoSource() {}

    /**
     * Get the kind property: The kind of disco source.
     *
     * @return the kind value.
     */
    @Generated
    public DiscoSourceKind getKind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of disco source.
     *
     * @param kind the kind value to set.
     * @return the DiscoSource object itself.
     */
    @Generated
    public DiscoSource setKind(DiscoSourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the name property: The name for the disco source.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name for the disco source.
     *
     * @param name the name value to set.
     * @return the DiscoSource object itself.
     */
    @Generated
    public DiscoSource setName(String name) {
        this.name = name;
        return this;
    }
}
