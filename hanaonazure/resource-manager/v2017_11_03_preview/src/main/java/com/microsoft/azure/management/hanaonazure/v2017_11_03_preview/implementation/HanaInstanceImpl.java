/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HanaInstance;
import rx.Observable;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HardwareProfile;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.NetworkProfile;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.OSProfile;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HanaInstancePowerStateEnum;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HanaProvisioningStatesEnum;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.StorageProfile;

class HanaInstanceImpl extends GroupableResourceCoreImpl<HanaInstance, HanaInstanceInner, HanaInstanceImpl, HanaOnAzureManager> implements HanaInstance, HanaInstance.Definition, HanaInstance.Update {
    HanaInstanceImpl(String name, HanaInstanceInner inner, HanaOnAzureManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<HanaInstance> createResourceAsync() {
        HanaInstancesInner client = this.manager().inner().hanaInstances();
        return client.createAsync(this.resourceGroupName(), this.name())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HanaInstance> updateResourceAsync() {
        HanaInstancesInner client = this.manager().inner().hanaInstances();
        return client.createAsync(this.resourceGroupName(), this.name())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HanaInstanceInner> getInnerAsync() {
        HanaInstancesInner client = this.manager().inner().hanaInstances();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String hanaInstanceId() {
        return this.inner().hanaInstanceId();
    }

    @Override
    public HardwareProfile hardwareProfile() {
        return this.inner().hardwareProfile();
    }

    @Override
    public String hwRevision() {
        return this.inner().hwRevision();
    }

    @Override
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OSProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public String partnerNodeId() {
        return this.inner().partnerNodeId();
    }

    @Override
    public HanaInstancePowerStateEnum powerState() {
        return this.inner().powerState();
    }

    @Override
    public HanaProvisioningStatesEnum provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String proximityPlacementGroup() {
        return this.inner().proximityPlacementGroup();
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
    }

}
