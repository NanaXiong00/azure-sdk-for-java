// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.SubvolumePatchRequest;
import org.junit.jupiter.api.Assertions;

public final class SubvolumePatchRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumePatchRequest model
            = BinaryData.fromString("{\"properties\":{\"size\":3660605975239241458,\"path\":\"xi\"}}")
                .toObject(SubvolumePatchRequest.class);
        Assertions.assertEquals(3660605975239241458L, model.size());
        Assertions.assertEquals("xi", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumePatchRequest model = new SubvolumePatchRequest().withSize(3660605975239241458L).withPath("xi");
        model = BinaryData.fromObject(model).toObject(SubvolumePatchRequest.class);
        Assertions.assertEquals(3660605975239241458L, model.size());
        Assertions.assertEquals("xi", model.path());
    }
}
