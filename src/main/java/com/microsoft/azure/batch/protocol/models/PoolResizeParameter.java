/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for a CloudPoolOperations.Resize request.
 */
public class PoolResizeParameter {
    /**
     * Sets the desired number of compute nodes in the pool.
     */
    @JsonProperty(required = true)
    private int targetDedicated;

    /**
     * Sets the timeout for allocation of compute nodes to the pool or removal
     * of compute nodes from the pool. The default value is 10 minutes.
     */
    private Period resizeTimeout;

    /**
     * Sets when nodes may be removed from the pool, if the pool size is
     * decreasing. Possible values include: 'requeue', 'terminate',
     * 'taskcompletion', 'retaineddata'.
     */
    private ComputeNodeDeallocationOption nodeDeallocationOption;

    /**
     * Get the targetDedicated value.
     *
     * @return the targetDedicated value
     */
    public int getTargetDedicated() {
        return this.targetDedicated;
    }

    /**
     * Set the targetDedicated value.
     *
     * @param targetDedicated the targetDedicated value to set
     */
    public void setTargetDedicated(int targetDedicated) {
        this.targetDedicated = targetDedicated;
    }

    /**
     * Get the resizeTimeout value.
     *
     * @return the resizeTimeout value
     */
    public Period getResizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout value.
     *
     * @param resizeTimeout the resizeTimeout value to set
     */
    public void setResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
    }

    /**
     * Get the nodeDeallocationOption value.
     *
     * @return the nodeDeallocationOption value
     */
    public ComputeNodeDeallocationOption getNodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the nodeDeallocationOption value.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     */
    public void setNodeDeallocationOption(ComputeNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
    }

}
