// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchPropertiesDataProtectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatchPropertiesDataProtection model = BinaryData.fromString(
            "{\"backup\":{\"backupPolicyId\":\"mnubexkpzksmond\",\"policyEnforced\":true,\"backupVaultId\":\"xvy\"},\"snapshot\":{\"snapshotPolicyId\":\"gkopkwhojvpajqgx\"}}")
            .toObject(VolumePatchPropertiesDataProtection.class);
        Assertions.assertEquals("mnubexkpzksmond", model.backup().backupPolicyId());
        Assertions.assertEquals(true, model.backup().policyEnforced());
        Assertions.assertEquals("xvy", model.backup().backupVaultId());
        Assertions.assertEquals("gkopkwhojvpajqgx", model.snapshot().snapshotPolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatchPropertiesDataProtection model = new VolumePatchPropertiesDataProtection()
            .withBackup(new VolumeBackupProperties().withBackupPolicyId("mnubexkpzksmond")
                .withPolicyEnforced(true)
                .withBackupVaultId("xvy"))
            .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("gkopkwhojvpajqgx"));
        model = BinaryData.fromObject(model).toObject(VolumePatchPropertiesDataProtection.class);
        Assertions.assertEquals("mnubexkpzksmond", model.backup().backupPolicyId());
        Assertions.assertEquals(true, model.backup().policyEnforced());
        Assertions.assertEquals("xvy", model.backup().backupVaultId());
        Assertions.assertEquals("gkopkwhojvpajqgx", model.snapshot().snapshotPolicyId());
    }
}
