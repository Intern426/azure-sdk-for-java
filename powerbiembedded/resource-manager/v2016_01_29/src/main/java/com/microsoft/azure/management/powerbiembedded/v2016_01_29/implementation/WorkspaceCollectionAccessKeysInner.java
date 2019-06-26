/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.powerbiembedded.v2016_01_29.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WorkspaceCollectionAccessKeysInner model.
 */
public class WorkspaceCollectionAccessKeysInner {
    /**
     * Access key 1.
     */
    @JsonProperty(value = "key1")
    private String key1;

    /**
     * Access key 2.
     */
    @JsonProperty(value = "key2")
    private String key2;

    /**
     * Get access key 1.
     *
     * @return the key1 value
     */
    public String key1() {
        return this.key1;
    }

    /**
     * Set access key 1.
     *
     * @param key1 the key1 value to set
     * @return the WorkspaceCollectionAccessKeysInner object itself.
     */
    public WorkspaceCollectionAccessKeysInner withKey1(String key1) {
        this.key1 = key1;
        return this;
    }

    /**
     * Get access key 2.
     *
     * @return the key2 value
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Set access key 2.
     *
     * @param key2 the key2 value to set
     * @return the WorkspaceCollectionAccessKeysInner object itself.
     */
    public WorkspaceCollectionAccessKeysInner withKey2(String key2) {
        this.key2 = key2;
        return this;
    }

}
