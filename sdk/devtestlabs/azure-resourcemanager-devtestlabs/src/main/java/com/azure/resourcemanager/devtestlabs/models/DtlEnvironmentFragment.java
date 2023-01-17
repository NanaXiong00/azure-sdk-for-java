// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/** An environment, which is essentially an ARM template deployment. */
@Fluent
public final class DtlEnvironmentFragment extends UpdateResource {
    /** Creates an instance of DtlEnvironmentFragment class. */
    public DtlEnvironmentFragment() {
    }

    /** {@inheritDoc} */
    @Override
    public DtlEnvironmentFragment withTags(Map<String, String> tags) {
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
