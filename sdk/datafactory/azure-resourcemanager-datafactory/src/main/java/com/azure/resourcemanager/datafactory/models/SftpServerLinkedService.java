// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SftpServerLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** A linked service for an SSH File Transfer Protocol (SFTP) server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Sftp")
@Fluent
public final class SftpServerLinkedService extends LinkedService {
    /*
     * Properties specific to this linked service type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SftpServerLinkedServiceTypeProperties innerTypeProperties = new SftpServerLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Properties specific to this linked service type.
     *
     * @return the innerTypeProperties value.
     */
    private SftpServerLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SftpServerLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpServerLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpServerLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SftpServerLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     *
     * @return the authenticationType value.
     */
    public SftpAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withAuthenticationType(SftpAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     *
     * @param username the username value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to logon the SFTP server for Basic authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to logon the SFTP server for Basic authentication.
     *
     * @param password the password value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     *
     * @return the privateKeyPath value.
     */
    public Object privateKeyPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().privateKeyPath();
    }

    /**
     * Set the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     *
     * @param privateKeyPath the privateKeyPath value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPrivateKeyPath(Object privateKeyPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPrivateKeyPath(privateKeyPath);
        return this;
    }

    /**
     * Get the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     *
     * @return the privateKeyContent value.
     */
    public SecretBase privateKeyContent() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().privateKeyContent();
    }

    /**
     * Set the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     *
     * @param privateKeyContent the privateKeyContent value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPrivateKeyContent(SecretBase privateKeyContent) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPrivateKeyContent(privateKeyContent);
        return this;
    }

    /**
     * Get the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @return the passPhrase value.
     */
    public SecretBase passPhrase() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().passPhrase();
    }

    /**
     * Set the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @param passPhrase the passPhrase value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withPassPhrase(SecretBase passPhrase) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassPhrase(passPhrase);
        return this;
    }

    /**
     * Get the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the skipHostKeyValidation value.
     */
    public Object skipHostKeyValidation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().skipHostKeyValidation();
    }

    /**
     * Set the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param skipHostKeyValidation the skipHostKeyValidation value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withSkipHostKeyValidation(Object skipHostKeyValidation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSkipHostKeyValidation(skipHostKeyValidation);
        return this;
    }

    /**
     * Get the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @return the hostKeyFingerprint value.
     */
    public Object hostKeyFingerprint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().hostKeyFingerprint();
    }

    /**
     * Set the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @param hostKeyFingerprint the hostKeyFingerprint value to set.
     * @return the SftpServerLinkedService object itself.
     */
    public SftpServerLinkedService withHostKeyFingerprint(Object hostKeyFingerprint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SftpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHostKeyFingerprint(hostKeyFingerprint);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SftpServerLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SftpServerLinkedService.class);
}
