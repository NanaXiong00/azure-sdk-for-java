// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.FileShareDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** An on-premises file system dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileShare")
@Fluent
public final class FileShareDataset extends Dataset {
    /*
     * On-premises file system dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private FileShareDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: On-premises file system dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private FileShareDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileShareDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     *
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     *
     * @param folderPath the folderPath value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFolderPath(Object folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     *
     * @return the fileName value.
     */
    public Object fileName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     *
     * @param fileName the fileName value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileName(Object fileName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeStart();
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeStart(modifiedDatetimeStart);
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeEnd();
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeEnd(modifiedDatetimeEnd);
        return this;
    }

    /**
     * Get the format property: The format of the files.
     *
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().format();
    }

    /**
     * Set the format property: The format of the files.
     *
     * @param format the format value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFormat(DatasetStorageFormat format) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFormat(format);
        return this;
    }

    /**
     * Get the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     *
     * @return the fileFilter value.
     */
    public Object fileFilter() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileFilter();
    }

    /**
     * Set the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     *
     * @param fileFilter the fileFilter value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileFilter(Object fileFilter) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileFilter(fileFilter);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the file system.
     *
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the file system.
     *
     * @param compression the compression value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withCompression(compression);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
