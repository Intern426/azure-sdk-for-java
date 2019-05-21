/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.containerregistry.v2019_06_01.implementation.RegistryPoliciesInner;
import com.microsoft.azure.management.containerregistry.v2019_06_01.implementation.RegistriesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Registries.
 */
public interface Registries extends SupportsCreating<Registry.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Registry>, SupportsListingByResourceGroup<Registry>, SupportsListing<Registry>, HasInner<RegistriesInner> {
    /**
     * Copies an image to this container registry from the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param parameters The parameters specifying the image to copy and the source container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable importImageAsync(String resourceGroupName, String registryName, ImportImageParameters parameters);

    /**
     * Lists the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryListCredentialsResult> listCredentialsAsync(String resourceGroupName, String registryName);

    /**
     * Regenerates one of the login credentials for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param name Specifies name of the password which should be regenerated -- password or password2. Possible values include: 'password', 'password2'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryListCredentialsResult> regenerateCredentialAsync(String resourceGroupName, String registryName, PasswordName name);

    /**
     * Updates the policies for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param registryPoliciesUpdateParameters The parameters for updating policies of a container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryPolicies> updatePoliciesAsync(String resourceGroupName, String registryName, RegistryPoliciesInner registryPoliciesUpdateParameters);

    /**
     * Schedules a new run based on the request parameters and add it to the run queue.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param runRequest The parameters of a run that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Run> scheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest);

    /**
     * Get the upload location for the user to be able to upload the source.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SourceUploadDefinition> getBuildSourceUploadUrlAsync(String resourceGroupName, String registryName);

    /**
     * Checks whether the container registry name is available for use. The name must contain only alphanumeric characters, be globally unique, and between 5 and 50 characters in length.
     *
     * @param name The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryNameStatus> checkNameAvailabilityAsync(String name);

    /**
     * Gets the quota usages for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryUsageListResult> listUsagesAsync(String resourceGroupName, String registryName);

    /**
     * Lists the policies for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RegistryPolicies> listPoliciesAsync(String resourceGroupName, String registryName);

}
