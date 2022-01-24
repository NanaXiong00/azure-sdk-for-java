// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntityKind. */
public final class EntityKind extends ExpandableStringEnum<EntityKind> {
    /** Static value Account for EntityKind. */
    public static final EntityKind ACCOUNT = fromString("Account");

    /** Static value Host for EntityKind. */
    public static final EntityKind HOST = fromString("Host");

    /** Static value File for EntityKind. */
    public static final EntityKind FILE = fromString("File");

    /** Static value AzureResource for EntityKind. */
    public static final EntityKind AZURE_RESOURCE = fromString("AzureResource");

    /** Static value CloudApplication for EntityKind. */
    public static final EntityKind CLOUD_APPLICATION = fromString("CloudApplication");

    /** Static value DnsResolution for EntityKind. */
    public static final EntityKind DNS_RESOLUTION = fromString("DnsResolution");

    /** Static value FileHash for EntityKind. */
    public static final EntityKind FILE_HASH = fromString("FileHash");

    /** Static value Ip for EntityKind. */
    public static final EntityKind IP = fromString("Ip");

    /** Static value Malware for EntityKind. */
    public static final EntityKind MALWARE = fromString("Malware");

    /** Static value Process for EntityKind. */
    public static final EntityKind PROCESS = fromString("Process");

    /** Static value RegistryKey for EntityKind. */
    public static final EntityKind REGISTRY_KEY = fromString("RegistryKey");

    /** Static value RegistryValue for EntityKind. */
    public static final EntityKind REGISTRY_VALUE = fromString("RegistryValue");

    /** Static value SecurityGroup for EntityKind. */
    public static final EntityKind SECURITY_GROUP = fromString("SecurityGroup");

    /** Static value Url for EntityKind. */
    public static final EntityKind URL = fromString("Url");

    /** Static value IoTDevice for EntityKind. */
    public static final EntityKind IO_TDEVICE = fromString("IoTDevice");

    /** Static value SecurityAlert for EntityKind. */
    public static final EntityKind SECURITY_ALERT = fromString("SecurityAlert");

    /** Static value Bookmark for EntityKind. */
    public static final EntityKind BOOKMARK = fromString("Bookmark");

    /** Static value MailCluster for EntityKind. */
    public static final EntityKind MAIL_CLUSTER = fromString("MailCluster");

    /** Static value MailMessage for EntityKind. */
    public static final EntityKind MAIL_MESSAGE = fromString("MailMessage");

    /** Static value Mailbox for EntityKind. */
    public static final EntityKind MAILBOX = fromString("Mailbox");

    /** Static value SubmissionMail for EntityKind. */
    public static final EntityKind SUBMISSION_MAIL = fromString("SubmissionMail");

    /**
     * Creates or finds a EntityKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityKind.
     */
    @JsonCreator
    public static EntityKind fromString(String name) {
        return fromString(name, EntityKind.class);
    }

    /** @return known EntityKind values. */
    public static Collection<EntityKind> values() {
        return values(EntityKind.class);
    }
}
