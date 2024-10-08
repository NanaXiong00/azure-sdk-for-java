// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ManagedNetworkProvisionOptions;
import org.junit.jupiter.api.Assertions;

public final class ManagedNetworkProvisionOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedNetworkProvisionOptions model
            = BinaryData.fromString("{\"includeSpark\":true}").toObject(ManagedNetworkProvisionOptions.class);
        Assertions.assertEquals(true, model.includeSpark());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedNetworkProvisionOptions model = new ManagedNetworkProvisionOptions().withIncludeSpark(true);
        model = BinaryData.fromObject(model).toObject(ManagedNetworkProvisionOptions.class);
        Assertions.assertEquals(true, model.includeSpark());
    }
}
