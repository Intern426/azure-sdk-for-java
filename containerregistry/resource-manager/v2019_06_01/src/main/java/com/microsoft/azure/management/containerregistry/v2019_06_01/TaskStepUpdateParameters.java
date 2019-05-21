/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base properties for updating any task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TaskStepUpdateParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Docker", value = DockerBuildStepUpdateParameters.class),
    @JsonSubTypes.Type(name = "FileTask", value = FileTaskStepUpdateParameters.class),
    @JsonSubTypes.Type(name = "EncodedTask", value = EncodedTaskStepUpdateParameters.class)
})
public class TaskStepUpdateParameters {
    /**
     * The URL(absolute or relative) of the source context for the task step.
     */
    @JsonProperty(value = "contextPath")
    private String contextPath;

    /**
     * The token (git PAT or SAS token of storage account blob) associated with
     * the context for a step.
     */
    @JsonProperty(value = "contextAccessToken")
    private String contextAccessToken;

    /**
     * Get the URL(absolute or relative) of the source context for the task step.
     *
     * @return the contextPath value
     */
    public String contextPath() {
        return this.contextPath;
    }

    /**
     * Set the URL(absolute or relative) of the source context for the task step.
     *
     * @param contextPath the contextPath value to set
     * @return the TaskStepUpdateParameters object itself.
     */
    public TaskStepUpdateParameters withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

    /**
     * Get the token (git PAT or SAS token of storage account blob) associated with the context for a step.
     *
     * @return the contextAccessToken value
     */
    public String contextAccessToken() {
        return this.contextAccessToken;
    }

    /**
     * Set the token (git PAT or SAS token of storage account blob) associated with the context for a step.
     *
     * @param contextAccessToken the contextAccessToken value to set
     * @return the TaskStepUpdateParameters object itself.
     */
    public TaskStepUpdateParameters withContextAccessToken(String contextAccessToken) {
        this.contextAccessToken = contextAccessToken;
        return this;
    }

}
