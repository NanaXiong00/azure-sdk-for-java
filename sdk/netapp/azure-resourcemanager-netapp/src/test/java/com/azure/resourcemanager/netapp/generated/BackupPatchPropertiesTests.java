// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupPatchProperties;
import org.junit.jupiter.api.Assertions;

public final class BackupPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPatchProperties model
            = BinaryData.fromString("{\"label\":\"vdxec\"}").toObject(BackupPatchProperties.class);
        Assertions.assertEquals("vdxec", model.label());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPatchProperties model = new BackupPatchProperties().withLabel("vdxec");
        model = BinaryData.fromObject(model).toObject(BackupPatchProperties.class);
        Assertions.assertEquals("vdxec", model.label());
    }
}
