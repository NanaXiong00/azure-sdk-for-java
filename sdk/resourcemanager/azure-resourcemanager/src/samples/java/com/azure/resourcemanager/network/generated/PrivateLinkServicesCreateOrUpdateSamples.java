// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.fluent.models.PrivateLinkServiceIpConfigurationInner;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.PrivateLinkServicePropertiesAutoApproval;
import com.azure.resourcemanager.network.models.PrivateLinkServicePropertiesVisibility;
import java.util.Arrays;

/** Samples for PrivateLinkServices CreateOrUpdate. */
public final class PrivateLinkServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateLinkServiceCreate.json
     */
    /**
     * Sample code: Create private link service.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPrivateLinkService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateLinkServices()
            .createOrUpdate(
                "rg1",
                "testPls",
                new PrivateLinkServiceInner()
                    .withLocation("eastus")
                    .withLoadBalancerFrontendIpConfigurations(
                        Arrays
                            .asList(
                                new FrontendIpConfigurationInner()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/loadBalancers/lb/frontendIPConfigurations/fe-lb")))
                    .withIpConfigurations(
                        Arrays
                            .asList(
                                new PrivateLinkServiceIpConfigurationInner()
                                    .withName("fe-lb")
                                    .withPrivateIpAddress("10.0.1.4")
                                    .withPrivateIpAllocationMethod(IpAllocationMethod.STATIC)
                                    .withSubnet(
                                        new SubnetInner()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb/subnets/subnetlb"))
                                    .withPrivateIpAddressVersion(IpVersion.IPV4)))
                    .withVisibility(
                        new PrivateLinkServicePropertiesVisibility()
                            .withSubscriptions(Arrays.asList("subscription1", "subscription2", "subscription3")))
                    .withAutoApproval(
                        new PrivateLinkServicePropertiesAutoApproval()
                            .withSubscriptions(Arrays.asList("subscription1", "subscription2")))
                    .withFqdns(Arrays.asList("fqdn1", "fqdn2", "fqdn3")),
                com.azure.core.util.Context.NONE);
    }
}
