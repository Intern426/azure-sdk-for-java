/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaInstancesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing HanaInstances.
 */
public interface HanaInstances extends SupportsCreating<HanaInstance.DefinitionStages.Blank>, SupportsGettingByResourceGroup<HanaInstance>, SupportsListingByResourceGroup<HanaInstance>, SupportsListing<HanaInstance>, HasInner<HanaInstancesInner> {
    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartAsync(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to add a monitor to an SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param monitoringParameter Request body that only contains monitoring attributes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableMonitoringAsync(String resourceGroupName, String hanaInstanceName, MonitoringDetails monitoringParameter);

}
