// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupStatusInner;

public final class BackupStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupStatusInner model = BinaryData.fromString(
            "{\"healthy\":true,\"relationshipStatus\":\"Unknown\",\"mirrorState\":\"Broken\",\"unhealthyReason\":\"hpjbib\",\"errorMessage\":\"mfxumvfcluyovw\",\"lastTransferSize\":9180905954554209142,\"lastTransferType\":\"ezzxscyhwzdgiruj\",\"totalTransferBytes\":4366398544066137642,\"transferProgressBytes\":8232701631993997082}")
            .toObject(BackupStatusInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupStatusInner model = new BackupStatusInner();
        model = BinaryData.fromObject(model).toObject(BackupStatusInner.class);
    }
}
