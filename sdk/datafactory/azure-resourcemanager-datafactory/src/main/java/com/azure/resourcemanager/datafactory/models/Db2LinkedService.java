// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.Db2LinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for DB2 data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Db2")
@Fluent
public final class Db2LinkedService extends LinkedService {
    /*
     * DB2 linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private Db2LinkedServiceTypeProperties innerTypeProperties = new Db2LinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: DB2 linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private Db2LinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public Db2LinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2LinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2LinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Db2LinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with server, database,
     * authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with server, database,
     * authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the server property: Server name for connection. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: Server name for connection. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the database property: Database name for connection. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: Database name for connection. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection. It is mutually exclusive with
     * connectionString property.
     *
     * @return the authenticationType value.
     */
    public Db2AuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection. It is mutually exclusive with
     * connectionString property.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withAuthenticationType(Db2AuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: Username for authentication. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username for authentication. It is mutually exclusive with connectionString property.
     * Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the packageCollection property: Under where packages are created when querying database. It is mutually
     * exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the packageCollection value.
     */
    public Object packageCollection() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageCollection();
    }

    /**
     * Set the packageCollection property: Under where packages are created when querying database. It is mutually
     * exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param packageCollection the packageCollection value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withPackageCollection(Object packageCollection) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPackageCollection(packageCollection);
        return this;
    }

    /**
     * Get the certificateCommonName property: Certificate Common Name when TLS is enabled. It is mutually exclusive
     * with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the certificateCommonName value.
     */
    public Object certificateCommonName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().certificateCommonName();
    }

    /**
     * Set the certificateCommonName property: Certificate Common Name when TLS is enabled. It is mutually exclusive
     * with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param certificateCommonName the certificateCommonName value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withCertificateCommonName(Object certificateCommonName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCertificateCommonName(certificateCommonName);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type:
     * string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type:
     * string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new Db2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
                        "Missing required property innerTypeProperties in model Db2LinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Db2LinkedService.class);
}
