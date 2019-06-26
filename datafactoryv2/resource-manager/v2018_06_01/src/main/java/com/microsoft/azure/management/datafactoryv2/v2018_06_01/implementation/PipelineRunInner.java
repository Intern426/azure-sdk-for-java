/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineRunInvokedBy;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a pipeline run.
 */
public class PipelineRunInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Identifier of a run.
     */
    @JsonProperty(value = "runId", access = JsonProperty.Access.WRITE_ONLY)
    private String runId;

    /**
     * Identifier that correlates all the recovery runs of a pipeline run.
     */
    @JsonProperty(value = "runGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String runGroupId;

    /**
     * Indicates if the recovered pipeline run is the latest in its group.
     */
    @JsonProperty(value = "isLatest", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isLatest;

    /**
     * The pipeline name.
     */
    @JsonProperty(value = "pipelineName", access = JsonProperty.Access.WRITE_ONLY)
    private String pipelineName;

    /**
     * The full or partial list of parameter name, value pair used in the
     * pipeline run.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> parameters;

    /**
     * Run dimension emitted by Pipeline run.
     */
    @JsonProperty(value = "runDimension", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> runDimension;

    /**
     * Entity that started the pipeline run.
     */
    @JsonProperty(value = "invokedBy", access = JsonProperty.Access.WRITE_ONLY)
    private PipelineRunInvokedBy invokedBy;

    /**
     * The last updated timestamp for the pipeline run event in ISO8601 format.
     */
    @JsonProperty(value = "lastUpdated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdated;

    /**
     * The start time of a pipeline run in ISO8601 format.
     */
    @JsonProperty(value = "runStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime runStart;

    /**
     * The end time of a pipeline run in ISO8601 format.
     */
    @JsonProperty(value = "runEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime runEnd;

    /**
     * The duration of a pipeline run.
     */
    @JsonProperty(value = "durationInMs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer durationInMs;

    /**
     * The status of a pipeline run.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The message from a pipeline run.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get identifier of a run.
     *
     * @return the runId value
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Get identifier that correlates all the recovery runs of a pipeline run.
     *
     * @return the runGroupId value
     */
    public String runGroupId() {
        return this.runGroupId;
    }

    /**
     * Get indicates if the recovered pipeline run is the latest in its group.
     *
     * @return the isLatest value
     */
    public Boolean isLatest() {
        return this.isLatest;
    }

    /**
     * Get the pipeline name.
     *
     * @return the pipelineName value
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Get the full or partial list of parameter name, value pair used in the pipeline run.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Get run dimension emitted by Pipeline run.
     *
     * @return the runDimension value
     */
    public Map<String, String> runDimension() {
        return this.runDimension;
    }

    /**
     * Get entity that started the pipeline run.
     *
     * @return the invokedBy value
     */
    public PipelineRunInvokedBy invokedBy() {
        return this.invokedBy;
    }

    /**
     * Get the last updated timestamp for the pipeline run event in ISO8601 format.
     *
     * @return the lastUpdated value
     */
    public DateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Get the start time of a pipeline run in ISO8601 format.
     *
     * @return the runStart value
     */
    public DateTime runStart() {
        return this.runStart;
    }

    /**
     * Get the end time of a pipeline run in ISO8601 format.
     *
     * @return the runEnd value
     */
    public DateTime runEnd() {
        return this.runEnd;
    }

    /**
     * Get the duration of a pipeline run.
     *
     * @return the durationInMs value
     */
    public Integer durationInMs() {
        return this.durationInMs;
    }

    /**
     * Get the status of a pipeline run.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the message from a pipeline run.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
