// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/** A custom image. */
@Fluent
public final class CustomImageFragment extends UpdateResource {
    /** Creates an instance of CustomImageFragment class. */
    public CustomImageFragment() {
    }

    /** {@inheritDoc} */
    @Override
    public CustomImageFragment withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
