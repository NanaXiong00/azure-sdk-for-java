// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.UserFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UserFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserFragment model =
            BinaryData
                .fromString("{\"tags\":{\"kqqfk\":\"atnwxyiopi\",\"dmligovibrxk\":\"vscx\"}}")
                .toObject(UserFragment.class);
        Assertions.assertEquals("atnwxyiopi", model.tags().get("kqqfk"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserFragment model = new UserFragment().withTags(mapOf("kqqfk", "atnwxyiopi", "dmligovibrxk", "vscx"));
        model = BinaryData.fromObject(model).toObject(UserFragment.class);
        Assertions.assertEquals("atnwxyiopi", model.tags().get("kqqfk"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
