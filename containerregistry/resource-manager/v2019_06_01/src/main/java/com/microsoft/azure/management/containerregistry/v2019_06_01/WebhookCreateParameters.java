/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for creating a webhook.
 */
@JsonFlatten
public class WebhookCreateParameters {
    /**
     * The tags for the webhook.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The location of the webhook. This cannot be changed after the resource
     * is created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The service URI for the webhook to post notifications.
     */
    @JsonProperty(value = "properties.serviceUri", required = true)
    private String serviceUri;

    /**
     * Custom headers that will be added to the webhook notifications.
     */
    @JsonProperty(value = "properties.customHeaders")
    private Map<String, String> customHeaders;

    /**
     * The status of the webhook at the time the operation was called. Possible
     * values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "properties.status")
    private WebhookStatus status;

    /**
     * The scope of repositories where the event can be triggered. For example,
     * 'foo:*' means events for all tags under repository 'foo'. 'foo:bar'
     * means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'.
     * Empty means all events.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * The list of actions that trigger the webhook to post notifications.
     */
    @JsonProperty(value = "properties.actions", required = true)
    private List<WebhookAction> actions;

    /**
     * Get the tags for the webhook.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags for the webhook.
     *
     * @param tags the tags value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location of the webhook. This cannot be changed after the resource is created.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the webhook. This cannot be changed after the resource is created.
     *
     * @param location the location value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the service URI for the webhook to post notifications.
     *
     * @return the serviceUri value
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the service URI for the webhook to post notifications.
     *
     * @param serviceUri the serviceUri value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get custom headers that will be added to the webhook notifications.
     *
     * @return the customHeaders value
     */
    public Map<String, String> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set custom headers that will be added to the webhook notifications.
     *
     * @param customHeaders the customHeaders value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get the status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'.
     *
     * @return the status value
     */
    public WebhookStatus status() {
        return this.status;
    }

    /**
     * Set the status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'.
     *
     * @param status the status value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withStatus(WebhookStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     *
     * @param scope the scope value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the list of actions that trigger the webhook to post notifications.
     *
     * @return the actions value
     */
    public List<WebhookAction> actions() {
        return this.actions;
    }

    /**
     * Set the list of actions that trigger the webhook to post notifications.
     *
     * @param actions the actions value to set
     * @return the WebhookCreateParameters object itself.
     */
    public WebhookCreateParameters withActions(List<WebhookAction> actions) {
        this.actions = actions;
        return this;
    }

}
