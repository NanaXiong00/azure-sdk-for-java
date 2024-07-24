// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of Snapshot.
 */
public interface Snapshot {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: Resource location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the snapshotId property: UUID v4 used to identify the Snapshot.
     * 
     * @return the snapshotId value.
     */
    String snapshotId();

    /**
     * Gets the created property: The creation date of the snapshot.
     * 
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.SnapshotInner object.
     * 
     * @return the inner object.
     */
    SnapshotInner innerModel();

    /**
     * The entirety of the Snapshot definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Snapshot definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Snapshot definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Snapshot definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Resource location.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the Snapshot definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, poolName, volumeName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of the NetApp account.
             * @param poolName The name of the capacity pool.
             * @param volumeName The name of the volume.
             * @return the next definition stage.
             */
            WithCreate withExistingVolume(String resourceGroupName, String accountName, String poolName,
                String volumeName);
        }

        /**
         * The stage of the Snapshot definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Snapshot create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Snapshot create(Context context);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Snapshot refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Snapshot refresh(Context context);

    /**
     * Create a new Snapshot Restore Files request
     * 
     * Restore the specified files from the specified snapshot to the active filesystem.
     * 
     * @param body Restore payload supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreFiles(SnapshotRestoreFiles body);

    /**
     * Create a new Snapshot Restore Files request
     * 
     * Restore the specified files from the specified snapshot to the active filesystem.
     * 
     * @param body Restore payload supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restoreFiles(SnapshotRestoreFiles body, Context context);
}
