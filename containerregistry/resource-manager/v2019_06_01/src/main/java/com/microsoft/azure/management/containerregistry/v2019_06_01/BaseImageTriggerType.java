/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BaseImageTriggerType.
 */
public final class BaseImageTriggerType extends ExpandableStringEnum<BaseImageTriggerType> {
    /** Static value All for BaseImageTriggerType. */
    public static final BaseImageTriggerType ALL = fromString("All");

    /** Static value Runtime for BaseImageTriggerType. */
    public static final BaseImageTriggerType RUNTIME = fromString("Runtime");

    /**
     * Creates or finds a BaseImageTriggerType from its string representation.
     * @param name a name to look for
     * @return the corresponding BaseImageTriggerType
     */
    @JsonCreator
    public static BaseImageTriggerType fromString(String name) {
        return fromString(name, BaseImageTriggerType.class);
    }

    /**
     * @return known BaseImageTriggerType values
     */
    public static Collection<BaseImageTriggerType> values() {
        return values(BaseImageTriggerType.class);
    }
}
