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
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetAppResourcesUpdateNetworkSiblingSetMockTests {
    @Test
    public void testUpdateNetworkSiblingSet() throws Exception {
        String responseStr
            = "{\"networkSiblingSetId\":\"kmoyxcdyuibh\",\"subnetId\":\"dnbzydvfvfcjn\",\"networkSiblingSetStateId\":\"oisrvhmgorffu\",\"networkFeatures\":\"Basic_Standard\",\"provisioningState\":\"Updating\",\"nicInfoList\":[{\"ipAddress\":\"hwplefaxvx\",\"volumeResourceIds\":[\"btgn\",\"nzeyqxtjj\"]},{\"ipAddress\":\"qlqhycavodg\",\"volumeResourceIds\":[\"beesmieknlra\",\"iaa\"]},{\"ipAddress\":\"uagydwqfbylyrf\",\"volumeResourceIds\":[\"gtcojocqwo\"]},{\"ipAddress\":\"nzjvusfzldm\",\"volumeResourceIds\":[\"xylfsb\",\"kadpysown\",\"tgkbugrjqctojc\",\"isofieypefojyqd\"]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkSiblingSet response = manager.netAppResources()
            .updateNetworkSiblingSet("wafqroud",
                new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("spave")
                    .withSubnetId("hrv")
                    .withNetworkSiblingSetStateId("bunzozudh")
                    .withNetworkFeatures(NetworkFeatures.BASIC),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kmoyxcdyuibh", response.networkSiblingSetId());
        Assertions.assertEquals("dnbzydvfvfcjn", response.subnetId());
        Assertions.assertEquals("oisrvhmgorffu", response.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC_STANDARD, response.networkFeatures());
        Assertions.assertEquals("btgn", response.nicInfoList().get(0).volumeResourceIds().get(0));
    }
}
