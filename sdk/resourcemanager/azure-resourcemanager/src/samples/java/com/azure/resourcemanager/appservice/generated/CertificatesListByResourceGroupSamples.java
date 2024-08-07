// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for Certificates ListByResourceGroup.
 */
public final class CertificatesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-12-01/examples/ListCertificatesByResourceGroup.json
     */
    /**
     * Sample code: List Certificates by resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCertificatesByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getCertificates()
            .listByResourceGroup("testrg123", com.azure.core.util.Context.NONE);
    }
}
