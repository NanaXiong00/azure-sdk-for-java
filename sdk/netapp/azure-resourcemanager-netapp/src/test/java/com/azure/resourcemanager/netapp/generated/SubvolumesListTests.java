// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeInfoInner;
import com.azure.resourcemanager.netapp.models.SubvolumesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SubvolumesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"path\":\"lrcoolsttpki\",\"size\":6492343275931744449,\"parentPath\":\"ujrywvtyl\",\"provisioningState\":\"pncur\"},\"id\":\"iwii\",\"name\":\"htywubxcbihwq\",\"type\":\"nfdn\"}],\"nextLink\":\"jchrdgoihxumw\"}")
            .toObject(SubvolumesList.class);
        Assertions.assertEquals("lrcoolsttpki", model.value().get(0).path());
        Assertions.assertEquals(6492343275931744449L, model.value().get(0).size());
        Assertions.assertEquals("ujrywvtyl", model.value().get(0).parentPath());
        Assertions.assertEquals("jchrdgoihxumw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumesList model
            = new SubvolumesList().withValue(Arrays.asList(new SubvolumeInfoInner().withPath("lrcoolsttpki")
                .withSize(6492343275931744449L)
                .withParentPath("ujrywvtyl"))).withNextLink("jchrdgoihxumw");
        model = BinaryData.fromObject(model).toObject(SubvolumesList.class);
        Assertions.assertEquals("lrcoolsttpki", model.value().get(0).path());
        Assertions.assertEquals(6492343275931744449L, model.value().get(0).size());
        Assertions.assertEquals("ujrywvtyl", model.value().get(0).parentPath());
        Assertions.assertEquals("jchrdgoihxumw", model.nextLink());
    }
}
