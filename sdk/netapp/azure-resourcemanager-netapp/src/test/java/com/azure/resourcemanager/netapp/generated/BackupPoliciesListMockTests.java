// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.BackupPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"etag\":\"emxswvruu\",\"properties\":{\"backupPolicyId\":\"zjgehkfkim\",\"provisioningState\":\"ixokffqyin\",\"dailyBackupsToKeep\":758637615,\"weeklyBackupsToKeep\":667642909,\"monthlyBackupsToKeep\":800032229,\"volumesAssigned\":1195081046,\"enabled\":true,\"volumeBackups\":[{\"volumeName\":\"tshi\",\"volumeResourceId\":\"gvelfc\",\"backupsCount\":666781891,\"policyEnabled\":false},{\"volumeName\":\"irdsvuwcob\",\"volumeResourceId\":\"gstmninwjizciln\",\"backupsCount\":1617896998,\"policyEnabled\":false}]},\"location\":\"jjtbxqmuluxlxqz\",\"tags\":{\"mikzeb\":\"rsbycucrwn\"},\"id\":\"qbsms\",\"name\":\"ziqgfuh\",\"type\":\"kzruswh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BackupPolicy> response
            = manager.backupPolicies().list("jgicgaao", "pttaqutd", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jjtbxqmuluxlxqz", response.iterator().next().location());
        Assertions.assertEquals("rsbycucrwn", response.iterator().next().tags().get("mikzeb"));
        Assertions.assertEquals(758637615, response.iterator().next().dailyBackupsToKeep());
        Assertions.assertEquals(667642909, response.iterator().next().weeklyBackupsToKeep());
        Assertions.assertEquals(800032229, response.iterator().next().monthlyBackupsToKeep());
        Assertions.assertEquals(true, response.iterator().next().enabled());
    }
}
