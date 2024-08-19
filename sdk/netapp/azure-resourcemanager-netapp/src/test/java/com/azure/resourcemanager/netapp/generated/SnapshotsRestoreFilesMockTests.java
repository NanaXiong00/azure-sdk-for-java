// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SnapshotRestoreFiles;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SnapshotsRestoreFilesMockTests {
    @Test
    public void testRestoreFiles() throws Exception {
        String responseStr = "{}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        manager.snapshots()
            .restoreFiles("olewjwi", "ubwefqs", "ap", "qtferrqwexjkmf", "apjwogqqnobpudcd",
                new SnapshotRestoreFiles()
                    .withFilePaths(Arrays.asList("tqwpwya", "bzasqbucljgkyexa", "guyaip", "dsdaultxijjumf"))
                    .withDestinationPath("azlnqnmcjngzqdqx"),
                com.azure.core.util.Context.NONE);

    }
}
