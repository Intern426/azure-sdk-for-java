/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.batch.protocol.models.CloudJobSchedule;
import com.microsoft.azure.batch.protocol.models.JobScheduleAddHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleAddOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleAddParameter;
import com.microsoft.azure.batch.protocol.models.JobScheduleDeleteHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleDeleteOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleDisableHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleDisableOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleEnableHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleEnableOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleExistsHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleExistsOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleGetHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleGetOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleListHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleListNextOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleListOptions;
import com.microsoft.azure.batch.protocol.models.JobSchedulePatchHeaders;
import com.microsoft.azure.batch.protocol.models.JobSchedulePatchOptions;
import com.microsoft.azure.batch.protocol.models.JobSchedulePatchParameter;
import com.microsoft.azure.batch.protocol.models.JobScheduleTerminateHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleTerminateOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleUpdateHeaders;
import com.microsoft.azure.batch.protocol.models.JobScheduleUpdateOptions;
import com.microsoft.azure.batch.protocol.models.JobScheduleUpdateParameter;
import com.microsoft.azure.batch.protocol.models.PageImpl;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in JobScheduleOperations.
 */
public final class JobScheduleOperationsImpl implements JobScheduleOperations {
    /** The Retrofit service to perform REST calls. */
    private JobScheduleService service;
    /** The service client containing this operation class. */
    private BatchServiceClient client;

    /**
     * Initializes an instance of JobScheduleOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public JobScheduleOperationsImpl(Retrofit retrofit, BatchServiceClient client) {
        this.service = retrofit.create(JobScheduleService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for JobScheduleOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface JobScheduleService {
        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @HEAD("jobschedules/{jobScheduleId}")
        Call<Void> exists(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("$select") String select, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @HTTP(path = "jobschedules/{jobScheduleId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET("jobschedules/{jobScheduleId}")
        Call<ResponseBody> get(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("$select") String select, @Query("$expand") String expand, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @PATCH("jobschedules/{jobScheduleId}")
        Call<ResponseBody> patch(@Path("jobScheduleId") String jobScheduleId, @Body JobSchedulePatchParameter jobSchedulePatchParameter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @PUT("jobschedules/{jobScheduleId}")
        Call<ResponseBody> update(@Path("jobScheduleId") String jobScheduleId, @Body JobScheduleUpdateParameter jobScheduleUpdateParameter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @POST("jobschedules/{jobScheduleId}/disable")
        Call<ResponseBody> disable(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @POST("jobschedules/{jobScheduleId}/enable")
        Call<ResponseBody> enable(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @POST("jobschedules/{jobScheduleId}/terminate")
        Call<ResponseBody> terminate(@Path("jobScheduleId") String jobScheduleId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate, @Header("If-Match") String ifMatch, @Header("If-None-Match") String ifNoneMatch, @Header("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @Header("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @POST("jobschedules")
        Call<ResponseBody> add(@Body JobScheduleAddParameter cloudJobSchedule, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET("jobschedules")
        Call<ResponseBody> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Query("$filter") String filter, @Query("$select") String select, @Query("$expand") String expand, @Query("maxresults") Integer maxResults, @Query("timeout") Integer timeout, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

        @Headers("Content-Type: application/json; odata=minimalmetadata; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("client-request-id") String clientRequestId, @Header("return-client-request-id") Boolean returnClientRequestId, @Header("ocp-date") DateTimeRfc1123 ocpDate);

    }

    /**
     * Checks the specified job schedule exists.
     *
     * @param jobScheduleId The id of the job schedule which you want to check.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the boolean object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<Boolean, JobScheduleExistsHeaders> exists(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleExistsOptions jobScheduleExistsOptions = null;
        String select = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<Void> call = service.exists(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return existsDelegate(call.execute());
    }

    /**
     * Checks the specified job schedule exists.
     *
     * @param jobScheduleId The id of the job schedule which you want to check.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall existsAsync(String jobScheduleId, final ServiceCallback<Boolean> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleExistsOptions jobScheduleExistsOptions = null;
        String select = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<Void> call = service.exists(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseEmptyCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(existsDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Checks the specified job schedule exists.
     *
     * @param jobScheduleId The id of the job schedule which you want to check.
     * @param jobScheduleExistsOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the boolean object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<Boolean, JobScheduleExistsHeaders> exists(String jobScheduleId, JobScheduleExistsOptions jobScheduleExistsOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleExistsOptions);
        String select = null;
        if (jobScheduleExistsOptions != null) {
            select = jobScheduleExistsOptions.getSelect();
        }
        Integer timeout = null;
        if (jobScheduleExistsOptions != null) {
            timeout = jobScheduleExistsOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleExistsOptions != null) {
            clientRequestId = jobScheduleExistsOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleExistsOptions != null) {
            returnClientRequestId = jobScheduleExistsOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleExistsOptions != null) {
            ocpDate = jobScheduleExistsOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleExistsOptions != null) {
            ifMatch = jobScheduleExistsOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleExistsOptions != null) {
            ifNoneMatch = jobScheduleExistsOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleExistsOptions != null) {
            ifModifiedSince = jobScheduleExistsOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleExistsOptions != null) {
            ifUnmodifiedSince = jobScheduleExistsOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<Void> call = service.exists(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return existsDelegate(call.execute());
    }

    /**
     * Checks the specified job schedule exists.
     *
     * @param jobScheduleId The id of the job schedule which you want to check.
     * @param jobScheduleExistsOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall existsAsync(String jobScheduleId, JobScheduleExistsOptions jobScheduleExistsOptions, final ServiceCallback<Boolean> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleExistsOptions, serviceCallback);
        String select = null;
        if (jobScheduleExistsOptions != null) {
            select = jobScheduleExistsOptions.getSelect();
        }
        Integer timeout = null;
        if (jobScheduleExistsOptions != null) {
            timeout = jobScheduleExistsOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleExistsOptions != null) {
            clientRequestId = jobScheduleExistsOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleExistsOptions != null) {
            returnClientRequestId = jobScheduleExistsOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleExistsOptions != null) {
            ocpDate = jobScheduleExistsOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleExistsOptions != null) {
            ifMatch = jobScheduleExistsOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleExistsOptions != null) {
            ifNoneMatch = jobScheduleExistsOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleExistsOptions != null) {
            ifModifiedSince = jobScheduleExistsOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleExistsOptions != null) {
            ifUnmodifiedSince = jobScheduleExistsOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<Void> call = service.exists(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseEmptyCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                try {
                    serviceCallback.success(existsDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Boolean, JobScheduleExistsHeaders> existsDelegate(Response<Void> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Boolean, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildEmptyWithHeaders(response, JobScheduleExistsHeaders.class);
    }

    /**
     * Deletes a job schedule from the specified account.
     *
     * @param jobScheduleId The id of the job schedule to delete.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleDeleteHeaders> delete(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleDeleteOptions jobScheduleDeleteOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.delete(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return deleteDelegate(call.execute());
    }

    /**
     * Deletes a job schedule from the specified account.
     *
     * @param jobScheduleId The id of the job schedule to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteAsync(String jobScheduleId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleDeleteOptions jobScheduleDeleteOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.delete(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Deletes a job schedule from the specified account.
     *
     * @param jobScheduleId The id of the job schedule to delete.
     * @param jobScheduleDeleteOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleDeleteHeaders> delete(String jobScheduleId, JobScheduleDeleteOptions jobScheduleDeleteOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleDeleteOptions);
        Integer timeout = null;
        if (jobScheduleDeleteOptions != null) {
            timeout = jobScheduleDeleteOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleDeleteOptions != null) {
            clientRequestId = jobScheduleDeleteOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleDeleteOptions != null) {
            returnClientRequestId = jobScheduleDeleteOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleDeleteOptions != null) {
            ocpDate = jobScheduleDeleteOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleDeleteOptions != null) {
            ifMatch = jobScheduleDeleteOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleDeleteOptions != null) {
            ifNoneMatch = jobScheduleDeleteOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleDeleteOptions != null) {
            ifModifiedSince = jobScheduleDeleteOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleDeleteOptions != null) {
            ifUnmodifiedSince = jobScheduleDeleteOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.delete(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return deleteDelegate(call.execute());
    }

    /**
     * Deletes a job schedule from the specified account.
     *
     * @param jobScheduleId The id of the job schedule to delete.
     * @param jobScheduleDeleteOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteAsync(String jobScheduleId, JobScheduleDeleteOptions jobScheduleDeleteOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleDeleteOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleDeleteOptions != null) {
            timeout = jobScheduleDeleteOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleDeleteOptions != null) {
            clientRequestId = jobScheduleDeleteOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleDeleteOptions != null) {
            returnClientRequestId = jobScheduleDeleteOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleDeleteOptions != null) {
            ocpDate = jobScheduleDeleteOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleDeleteOptions != null) {
            ifMatch = jobScheduleDeleteOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleDeleteOptions != null) {
            ifNoneMatch = jobScheduleDeleteOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleDeleteOptions != null) {
            ifModifiedSince = jobScheduleDeleteOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleDeleteOptions != null) {
            ifUnmodifiedSince = jobScheduleDeleteOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.delete(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleDeleteHeaders> deleteDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleDeleteHeaders.class);
    }

    /**
     * Gets information about the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to get.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CloudJobSchedule object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<CloudJobSchedule, JobScheduleGetHeaders> get(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleGetOptions jobScheduleGetOptions = null;
        String select = null;
        String expand = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.get(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, expand, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return getDelegate(call.execute());
    }

    /**
     * Gets information about the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String jobScheduleId, final ServiceCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleGetOptions jobScheduleGetOptions = null;
        String select = null;
        String expand = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.get(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, expand, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<CloudJobSchedule>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Gets information about the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to get.
     * @param jobScheduleGetOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CloudJobSchedule object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<CloudJobSchedule, JobScheduleGetHeaders> get(String jobScheduleId, JobScheduleGetOptions jobScheduleGetOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleGetOptions);
        String select = null;
        if (jobScheduleGetOptions != null) {
            select = jobScheduleGetOptions.getSelect();
        }
        String expand = null;
        if (jobScheduleGetOptions != null) {
            expand = jobScheduleGetOptions.getExpand();
        }
        Integer timeout = null;
        if (jobScheduleGetOptions != null) {
            timeout = jobScheduleGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleGetOptions != null) {
            clientRequestId = jobScheduleGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleGetOptions != null) {
            returnClientRequestId = jobScheduleGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleGetOptions != null) {
            ocpDate = jobScheduleGetOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleGetOptions != null) {
            ifMatch = jobScheduleGetOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleGetOptions != null) {
            ifNoneMatch = jobScheduleGetOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleGetOptions != null) {
            ifModifiedSince = jobScheduleGetOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleGetOptions != null) {
            ifUnmodifiedSince = jobScheduleGetOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.get(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, expand, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return getDelegate(call.execute());
    }

    /**
     * Gets information about the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to get.
     * @param jobScheduleGetOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String jobScheduleId, JobScheduleGetOptions jobScheduleGetOptions, final ServiceCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleGetOptions, serviceCallback);
        String select = null;
        if (jobScheduleGetOptions != null) {
            select = jobScheduleGetOptions.getSelect();
        }
        String expand = null;
        if (jobScheduleGetOptions != null) {
            expand = jobScheduleGetOptions.getExpand();
        }
        Integer timeout = null;
        if (jobScheduleGetOptions != null) {
            timeout = jobScheduleGetOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleGetOptions != null) {
            clientRequestId = jobScheduleGetOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleGetOptions != null) {
            returnClientRequestId = jobScheduleGetOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleGetOptions != null) {
            ocpDate = jobScheduleGetOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleGetOptions != null) {
            ifMatch = jobScheduleGetOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleGetOptions != null) {
            ifNoneMatch = jobScheduleGetOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleGetOptions != null) {
            ifModifiedSince = jobScheduleGetOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleGetOptions != null) {
            ifUnmodifiedSince = jobScheduleGetOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.get(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), select, expand, timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<CloudJobSchedule>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<CloudJobSchedule, JobScheduleGetHeaders> getDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<CloudJobSchedule, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<CloudJobSchedule>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleGetHeaders.class);
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobSchedulePatchParameter The parameters for the request.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobSchedulePatchHeaders> patch(String jobScheduleId, JobSchedulePatchParameter jobSchedulePatchParameter) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (jobSchedulePatchParameter == null) {
            throw new IllegalArgumentException("Parameter jobSchedulePatchParameter is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobSchedulePatchParameter);
        final JobSchedulePatchOptions jobSchedulePatchOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.patch(jobScheduleId, jobSchedulePatchParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return patchDelegate(call.execute());
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobSchedulePatchParameter The parameters for the request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall patchAsync(String jobScheduleId, JobSchedulePatchParameter jobSchedulePatchParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (jobSchedulePatchParameter == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobSchedulePatchParameter is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobSchedulePatchParameter, serviceCallback);
        final JobSchedulePatchOptions jobSchedulePatchOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.patch(jobScheduleId, jobSchedulePatchParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patchDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobSchedulePatchParameter The parameters for the request.
     * @param jobSchedulePatchOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobSchedulePatchHeaders> patch(String jobScheduleId, JobSchedulePatchParameter jobSchedulePatchParameter, JobSchedulePatchOptions jobSchedulePatchOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (jobSchedulePatchParameter == null) {
            throw new IllegalArgumentException("Parameter jobSchedulePatchParameter is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobSchedulePatchParameter);
        Validator.validate(jobSchedulePatchOptions);
        Integer timeout = null;
        if (jobSchedulePatchOptions != null) {
            timeout = jobSchedulePatchOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobSchedulePatchOptions != null) {
            clientRequestId = jobSchedulePatchOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobSchedulePatchOptions != null) {
            returnClientRequestId = jobSchedulePatchOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobSchedulePatchOptions != null) {
            ocpDate = jobSchedulePatchOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobSchedulePatchOptions != null) {
            ifMatch = jobSchedulePatchOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobSchedulePatchOptions != null) {
            ifNoneMatch = jobSchedulePatchOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobSchedulePatchOptions != null) {
            ifModifiedSince = jobSchedulePatchOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobSchedulePatchOptions != null) {
            ifUnmodifiedSince = jobSchedulePatchOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.patch(jobScheduleId, jobSchedulePatchParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return patchDelegate(call.execute());
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobSchedulePatchParameter The parameters for the request.
     * @param jobSchedulePatchOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall patchAsync(String jobScheduleId, JobSchedulePatchParameter jobSchedulePatchParameter, JobSchedulePatchOptions jobSchedulePatchOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (jobSchedulePatchParameter == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobSchedulePatchParameter is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobSchedulePatchParameter, serviceCallback);
        Validator.validate(jobSchedulePatchOptions, serviceCallback);
        Integer timeout = null;
        if (jobSchedulePatchOptions != null) {
            timeout = jobSchedulePatchOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobSchedulePatchOptions != null) {
            clientRequestId = jobSchedulePatchOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobSchedulePatchOptions != null) {
            returnClientRequestId = jobSchedulePatchOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobSchedulePatchOptions != null) {
            ocpDate = jobSchedulePatchOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobSchedulePatchOptions != null) {
            ifMatch = jobSchedulePatchOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobSchedulePatchOptions != null) {
            ifNoneMatch = jobSchedulePatchOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobSchedulePatchOptions != null) {
            ifModifiedSince = jobSchedulePatchOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobSchedulePatchOptions != null) {
            ifUnmodifiedSince = jobSchedulePatchOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.patch(jobScheduleId, jobSchedulePatchParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(patchDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobSchedulePatchHeaders> patchDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobSchedulePatchHeaders.class);
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobScheduleUpdateParameter The parameters for the request.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleUpdateHeaders> update(String jobScheduleId, JobScheduleUpdateParameter jobScheduleUpdateParameter) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (jobScheduleUpdateParameter == null) {
            throw new IllegalArgumentException("Parameter jobScheduleUpdateParameter is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleUpdateParameter);
        final JobScheduleUpdateOptions jobScheduleUpdateOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.update(jobScheduleId, jobScheduleUpdateParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return updateDelegate(call.execute());
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobScheduleUpdateParameter The parameters for the request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateAsync(String jobScheduleId, JobScheduleUpdateParameter jobScheduleUpdateParameter, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (jobScheduleUpdateParameter == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleUpdateParameter is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleUpdateParameter, serviceCallback);
        final JobScheduleUpdateOptions jobScheduleUpdateOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.update(jobScheduleId, jobScheduleUpdateParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobScheduleUpdateParameter The parameters for the request.
     * @param jobScheduleUpdateOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleUpdateHeaders> update(String jobScheduleId, JobScheduleUpdateParameter jobScheduleUpdateParameter, JobScheduleUpdateOptions jobScheduleUpdateOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (jobScheduleUpdateParameter == null) {
            throw new IllegalArgumentException("Parameter jobScheduleUpdateParameter is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleUpdateParameter);
        Validator.validate(jobScheduleUpdateOptions);
        Integer timeout = null;
        if (jobScheduleUpdateOptions != null) {
            timeout = jobScheduleUpdateOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleUpdateOptions != null) {
            clientRequestId = jobScheduleUpdateOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleUpdateOptions != null) {
            returnClientRequestId = jobScheduleUpdateOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleUpdateOptions != null) {
            ocpDate = jobScheduleUpdateOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleUpdateOptions != null) {
            ifMatch = jobScheduleUpdateOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleUpdateOptions != null) {
            ifNoneMatch = jobScheduleUpdateOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleUpdateOptions != null) {
            ifModifiedSince = jobScheduleUpdateOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleUpdateOptions != null) {
            ifUnmodifiedSince = jobScheduleUpdateOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.update(jobScheduleId, jobScheduleUpdateParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return updateDelegate(call.execute());
    }

    /**
     * Updates the properties of the specified job schedule.
     *
     * @param jobScheduleId The id of the job schedule to update.
     * @param jobScheduleUpdateParameter The parameters for the request.
     * @param jobScheduleUpdateOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateAsync(String jobScheduleId, JobScheduleUpdateParameter jobScheduleUpdateParameter, JobScheduleUpdateOptions jobScheduleUpdateOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (jobScheduleUpdateParameter == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleUpdateParameter is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleUpdateParameter, serviceCallback);
        Validator.validate(jobScheduleUpdateOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleUpdateOptions != null) {
            timeout = jobScheduleUpdateOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleUpdateOptions != null) {
            clientRequestId = jobScheduleUpdateOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleUpdateOptions != null) {
            returnClientRequestId = jobScheduleUpdateOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleUpdateOptions != null) {
            ocpDate = jobScheduleUpdateOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleUpdateOptions != null) {
            ifMatch = jobScheduleUpdateOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleUpdateOptions != null) {
            ifNoneMatch = jobScheduleUpdateOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleUpdateOptions != null) {
            ifModifiedSince = jobScheduleUpdateOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleUpdateOptions != null) {
            ifUnmodifiedSince = jobScheduleUpdateOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.update(jobScheduleId, jobScheduleUpdateParameter, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleUpdateHeaders> updateDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleUpdateHeaders.class);
    }

    /**
     * Disables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to disable.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleDisableHeaders> disable(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleDisableOptions jobScheduleDisableOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.disable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return disableDelegate(call.execute());
    }

    /**
     * Disables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to disable.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall disableAsync(String jobScheduleId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleDisableOptions jobScheduleDisableOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.disable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(disableDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Disables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to disable.
     * @param jobScheduleDisableOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleDisableHeaders> disable(String jobScheduleId, JobScheduleDisableOptions jobScheduleDisableOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleDisableOptions);
        Integer timeout = null;
        if (jobScheduleDisableOptions != null) {
            timeout = jobScheduleDisableOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleDisableOptions != null) {
            clientRequestId = jobScheduleDisableOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleDisableOptions != null) {
            returnClientRequestId = jobScheduleDisableOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleDisableOptions != null) {
            ocpDate = jobScheduleDisableOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleDisableOptions != null) {
            ifMatch = jobScheduleDisableOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleDisableOptions != null) {
            ifNoneMatch = jobScheduleDisableOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleDisableOptions != null) {
            ifModifiedSince = jobScheduleDisableOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleDisableOptions != null) {
            ifUnmodifiedSince = jobScheduleDisableOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.disable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return disableDelegate(call.execute());
    }

    /**
     * Disables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to disable.
     * @param jobScheduleDisableOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall disableAsync(String jobScheduleId, JobScheduleDisableOptions jobScheduleDisableOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleDisableOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleDisableOptions != null) {
            timeout = jobScheduleDisableOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleDisableOptions != null) {
            clientRequestId = jobScheduleDisableOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleDisableOptions != null) {
            returnClientRequestId = jobScheduleDisableOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleDisableOptions != null) {
            ocpDate = jobScheduleDisableOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleDisableOptions != null) {
            ifMatch = jobScheduleDisableOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleDisableOptions != null) {
            ifNoneMatch = jobScheduleDisableOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleDisableOptions != null) {
            ifModifiedSince = jobScheduleDisableOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleDisableOptions != null) {
            ifUnmodifiedSince = jobScheduleDisableOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.disable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(disableDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleDisableHeaders> disableDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleDisableHeaders.class);
    }

    /**
     * Enables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to enable.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleEnableHeaders> enable(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleEnableOptions jobScheduleEnableOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.enable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return enableDelegate(call.execute());
    }

    /**
     * Enables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to enable.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall enableAsync(String jobScheduleId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleEnableOptions jobScheduleEnableOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.enable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(enableDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Enables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to enable.
     * @param jobScheduleEnableOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleEnableHeaders> enable(String jobScheduleId, JobScheduleEnableOptions jobScheduleEnableOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleEnableOptions);
        Integer timeout = null;
        if (jobScheduleEnableOptions != null) {
            timeout = jobScheduleEnableOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleEnableOptions != null) {
            clientRequestId = jobScheduleEnableOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleEnableOptions != null) {
            returnClientRequestId = jobScheduleEnableOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleEnableOptions != null) {
            ocpDate = jobScheduleEnableOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleEnableOptions != null) {
            ifMatch = jobScheduleEnableOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleEnableOptions != null) {
            ifNoneMatch = jobScheduleEnableOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleEnableOptions != null) {
            ifModifiedSince = jobScheduleEnableOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleEnableOptions != null) {
            ifUnmodifiedSince = jobScheduleEnableOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.enable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return enableDelegate(call.execute());
    }

    /**
     * Enables a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to enable.
     * @param jobScheduleEnableOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall enableAsync(String jobScheduleId, JobScheduleEnableOptions jobScheduleEnableOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleEnableOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleEnableOptions != null) {
            timeout = jobScheduleEnableOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleEnableOptions != null) {
            clientRequestId = jobScheduleEnableOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleEnableOptions != null) {
            returnClientRequestId = jobScheduleEnableOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleEnableOptions != null) {
            ocpDate = jobScheduleEnableOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleEnableOptions != null) {
            ifMatch = jobScheduleEnableOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleEnableOptions != null) {
            ifNoneMatch = jobScheduleEnableOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleEnableOptions != null) {
            ifModifiedSince = jobScheduleEnableOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleEnableOptions != null) {
            ifUnmodifiedSince = jobScheduleEnableOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.enable(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(enableDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleEnableHeaders> enableDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleEnableHeaders.class);
    }

    /**
     * Terminates a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to terminates.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleTerminateHeaders> terminate(String jobScheduleId) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleTerminateOptions jobScheduleTerminateOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.terminate(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return terminateDelegate(call.execute());
    }

    /**
     * Terminates a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to terminates.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall terminateAsync(String jobScheduleId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleTerminateOptions jobScheduleTerminateOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        String ifMatch = null;
        String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        Call<ResponseBody> call = service.terminate(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(terminateDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Terminates a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to terminates.
     * @param jobScheduleTerminateOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleTerminateHeaders> terminate(String jobScheduleId, JobScheduleTerminateOptions jobScheduleTerminateOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (jobScheduleId == null) {
            throw new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleTerminateOptions);
        Integer timeout = null;
        if (jobScheduleTerminateOptions != null) {
            timeout = jobScheduleTerminateOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleTerminateOptions != null) {
            clientRequestId = jobScheduleTerminateOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleTerminateOptions != null) {
            returnClientRequestId = jobScheduleTerminateOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleTerminateOptions != null) {
            ocpDate = jobScheduleTerminateOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleTerminateOptions != null) {
            ifMatch = jobScheduleTerminateOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleTerminateOptions != null) {
            ifNoneMatch = jobScheduleTerminateOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleTerminateOptions != null) {
            ifModifiedSince = jobScheduleTerminateOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleTerminateOptions != null) {
            ifUnmodifiedSince = jobScheduleTerminateOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.terminate(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        return terminateDelegate(call.execute());
    }

    /**
     * Terminates a job schedule.
     *
     * @param jobScheduleId The id of the job schedule to terminates.
     * @param jobScheduleTerminateOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall terminateAsync(String jobScheduleId, JobScheduleTerminateOptions jobScheduleTerminateOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (jobScheduleId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter jobScheduleId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleTerminateOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleTerminateOptions != null) {
            timeout = jobScheduleTerminateOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleTerminateOptions != null) {
            clientRequestId = jobScheduleTerminateOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleTerminateOptions != null) {
            returnClientRequestId = jobScheduleTerminateOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleTerminateOptions != null) {
            ocpDate = jobScheduleTerminateOptions.getOcpDate();
        }
        String ifMatch = null;
        if (jobScheduleTerminateOptions != null) {
            ifMatch = jobScheduleTerminateOptions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (jobScheduleTerminateOptions != null) {
            ifNoneMatch = jobScheduleTerminateOptions.getIfNoneMatch();
        }
        DateTime ifModifiedSince = null;
        if (jobScheduleTerminateOptions != null) {
            ifModifiedSince = jobScheduleTerminateOptions.getIfModifiedSince();
        }
        DateTime ifUnmodifiedSince = null;
        if (jobScheduleTerminateOptions != null) {
            ifUnmodifiedSince = jobScheduleTerminateOptions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        DateTimeRfc1123 ifModifiedSinceConverted = new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = new DateTimeRfc1123(ifUnmodifiedSince);
        Call<ResponseBody> call = service.terminate(jobScheduleId, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(terminateDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleTerminateHeaders> terminateDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleTerminateHeaders.class);
    }

    /**
     * Adds a job schedule to the specified account.
     *
     * @param cloudJobSchedule Specifies the job schedule to be added.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleAddHeaders> add(JobScheduleAddParameter cloudJobSchedule) throws BatchErrorException, IOException, IllegalArgumentException {
        if (cloudJobSchedule == null) {
            throw new IllegalArgumentException("Parameter cloudJobSchedule is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(cloudJobSchedule);
        final JobScheduleAddOptions jobScheduleAddOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.add(cloudJobSchedule, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        return addDelegate(call.execute());
    }

    /**
     * Adds a job schedule to the specified account.
     *
     * @param cloudJobSchedule Specifies the job schedule to be added.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall addAsync(JobScheduleAddParameter cloudJobSchedule, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (cloudJobSchedule == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter cloudJobSchedule is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(cloudJobSchedule, serviceCallback);
        final JobScheduleAddOptions jobScheduleAddOptions = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.add(cloudJobSchedule, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(addDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Adds a job schedule to the specified account.
     *
     * @param cloudJobSchedule Specifies the job schedule to be added.
     * @param jobScheduleAddOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, JobScheduleAddHeaders> add(JobScheduleAddParameter cloudJobSchedule, JobScheduleAddOptions jobScheduleAddOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (cloudJobSchedule == null) {
            throw new IllegalArgumentException("Parameter cloudJobSchedule is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(cloudJobSchedule);
        Validator.validate(jobScheduleAddOptions);
        Integer timeout = null;
        if (jobScheduleAddOptions != null) {
            timeout = jobScheduleAddOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleAddOptions != null) {
            clientRequestId = jobScheduleAddOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleAddOptions != null) {
            returnClientRequestId = jobScheduleAddOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleAddOptions != null) {
            ocpDate = jobScheduleAddOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.add(cloudJobSchedule, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        return addDelegate(call.execute());
    }

    /**
     * Adds a job schedule to the specified account.
     *
     * @param cloudJobSchedule Specifies the job schedule to be added.
     * @param jobScheduleAddOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall addAsync(JobScheduleAddParameter cloudJobSchedule, JobScheduleAddOptions jobScheduleAddOptions, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (cloudJobSchedule == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter cloudJobSchedule is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(cloudJobSchedule, serviceCallback);
        Validator.validate(jobScheduleAddOptions, serviceCallback);
        Integer timeout = null;
        if (jobScheduleAddOptions != null) {
            timeout = jobScheduleAddOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleAddOptions != null) {
            clientRequestId = jobScheduleAddOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleAddOptions != null) {
            returnClientRequestId = jobScheduleAddOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleAddOptions != null) {
            ocpDate = jobScheduleAddOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.add(cloudJobSchedule, this.client.getApiVersion(), this.client.getAcceptLanguage(), timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(addDelegate(response));
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, JobScheduleAddHeaders> addDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, BatchErrorException>(this.client.getMapperAdapter())
                .register(201, new TypeToken<Void>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleAddHeaders.class);
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;CloudJobSchedule&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PagedList<CloudJobSchedule>, JobScheduleListHeaders> list() throws BatchErrorException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final JobScheduleListOptions jobScheduleListOptions = null;
        String filter = null;
        String select = null;
        String expand = null;
        Integer maxResults = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), filter, select, expand, maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> response = listDelegate(call.execute());
        PagedList<CloudJobSchedule> result = new PagedList<CloudJobSchedule>(response.getBody()) {
            @Override
            public Page<CloudJobSchedule> nextPage(String nextPageLink) throws BatchErrorException, IOException {
                return listNext(nextPageLink, null).getBody();
            }
        };
        return new ServiceResponseWithHeaders<>(result, response.getHeaders(), response.getResponse());
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final ListOperationCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        final JobScheduleListOptions jobScheduleListOptions = null;
        String filter = null;
        String select = null;
        String expand = null;
        Integer maxResults = null;
        Integer timeout = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), filter, select, expand, maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<CloudJobSchedule>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), null, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param jobScheduleListOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;CloudJobSchedule&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PagedList<CloudJobSchedule>, JobScheduleListHeaders> list(final JobScheduleListOptions jobScheduleListOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(jobScheduleListOptions);
        String filter = null;
        if (jobScheduleListOptions != null) {
            filter = jobScheduleListOptions.getFilter();
        }
        String select = null;
        if (jobScheduleListOptions != null) {
            select = jobScheduleListOptions.getSelect();
        }
        String expand = null;
        if (jobScheduleListOptions != null) {
            expand = jobScheduleListOptions.getExpand();
        }
        Integer maxResults = null;
        if (jobScheduleListOptions != null) {
            maxResults = jobScheduleListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (jobScheduleListOptions != null) {
            timeout = jobScheduleListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleListOptions != null) {
            clientRequestId = jobScheduleListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleListOptions != null) {
            returnClientRequestId = jobScheduleListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleListOptions != null) {
            ocpDate = jobScheduleListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), filter, select, expand, maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> response = listDelegate(call.execute());
        PagedList<CloudJobSchedule> result = new PagedList<CloudJobSchedule>(response.getBody()) {
            @Override
            public Page<CloudJobSchedule> nextPage(String nextPageLink) throws BatchErrorException, IOException {
                JobScheduleListNextOptions jobScheduleListNextOptions = null;
                if (jobScheduleListOptions != null) {
                    jobScheduleListNextOptions = new JobScheduleListNextOptions();
                    jobScheduleListNextOptions.setClientRequestId(jobScheduleListOptions.getClientRequestId());
                    jobScheduleListNextOptions.setReturnClientRequestId(jobScheduleListOptions.getReturnClientRequestId());
                    jobScheduleListNextOptions.setOcpDate(jobScheduleListOptions.getOcpDate());
                }
                return listNext(nextPageLink, jobScheduleListNextOptions).getBody();
            }
        };
        return new ServiceResponseWithHeaders<>(result, response.getHeaders(), response.getResponse());
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param jobScheduleListOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final JobScheduleListOptions jobScheduleListOptions, final ListOperationCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleListOptions, serviceCallback);
        String filter = null;
        if (jobScheduleListOptions != null) {
            filter = jobScheduleListOptions.getFilter();
        }
        String select = null;
        if (jobScheduleListOptions != null) {
            select = jobScheduleListOptions.getSelect();
        }
        String expand = null;
        if (jobScheduleListOptions != null) {
            expand = jobScheduleListOptions.getExpand();
        }
        Integer maxResults = null;
        if (jobScheduleListOptions != null) {
            maxResults = jobScheduleListOptions.getMaxResults();
        }
        Integer timeout = null;
        if (jobScheduleListOptions != null) {
            timeout = jobScheduleListOptions.getTimeout();
        }
        String clientRequestId = null;
        if (jobScheduleListOptions != null) {
            clientRequestId = jobScheduleListOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleListOptions != null) {
            returnClientRequestId = jobScheduleListOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleListOptions != null) {
            ocpDate = jobScheduleListOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage(), filter, select, expand, maxResults, timeout, clientRequestId, returnClientRequestId, ocpDateConverted);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<CloudJobSchedule>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        JobScheduleListNextOptions jobScheduleListNextOptions = null;
                        if (jobScheduleListOptions != null) {
                            jobScheduleListNextOptions = new JobScheduleListNextOptions();
                            jobScheduleListNextOptions.setClientRequestId(jobScheduleListOptions.getClientRequestId());
                            jobScheduleListNextOptions.setReturnClientRequestId(jobScheduleListOptions.getReturnClientRequestId());
                            jobScheduleListNextOptions.setOcpDate(jobScheduleListOptions.getOcpDate());
                        }
                        listNextAsync(result.getBody().getNextPageLink(), jobScheduleListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> listDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<CloudJobSchedule>, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<CloudJobSchedule>>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleListHeaders.class);
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;CloudJobSchedule&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> listNext(final String nextPageLink) throws BatchErrorException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        final JobScheduleListNextOptions jobScheduleListNextOptions = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        return listNextDelegate(call.execute());
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        final JobScheduleListNextOptions jobScheduleListNextOptions = null;
        String clientRequestId = null;
        Boolean returnClientRequestId = null;
        DateTimeRfc1123 ocpDateConverted = null;
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<CloudJobSchedule>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), null, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param jobScheduleListNextOptions Additional parameters for the operation
     * @throws BatchErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;CloudJobSchedule&gt; object wrapped in {@link ServiceResponseWithHeaders} if successful.
     */
    public ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> listNext(final String nextPageLink, final JobScheduleListNextOptions jobScheduleListNextOptions) throws BatchErrorException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Validator.validate(jobScheduleListNextOptions);
        String clientRequestId = null;
        if (jobScheduleListNextOptions != null) {
            clientRequestId = jobScheduleListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleListNextOptions != null) {
            returnClientRequestId = jobScheduleListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleListNextOptions != null) {
            ocpDate = jobScheduleListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        return listNextDelegate(call.execute());
    }

    /**
     * Lists all of the job schedules in the specified account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param jobScheduleListNextOptions Additional parameters for the operation
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final JobScheduleListNextOptions jobScheduleListNextOptions, final ServiceCall serviceCall, final ListOperationCallback<CloudJobSchedule> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Validator.validate(jobScheduleListNextOptions, serviceCallback);
        String clientRequestId = null;
        if (jobScheduleListNextOptions != null) {
            clientRequestId = jobScheduleListNextOptions.getClientRequestId();
        }
        Boolean returnClientRequestId = null;
        if (jobScheduleListNextOptions != null) {
            returnClientRequestId = jobScheduleListNextOptions.getReturnClientRequestId();
        }
        DateTime ocpDate = null;
        if (jobScheduleListNextOptions != null) {
            ocpDate = jobScheduleListNextOptions.getOcpDate();
        }
        DateTimeRfc1123 ocpDateConverted = new DateTimeRfc1123(ocpDate);
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage(), clientRequestId, returnClientRequestId, ocpDateConverted);
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<CloudJobSchedule>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), jobScheduleListNextOptions, serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponseWithHeaders<>(serviceCallback.get(), result.getHeaders(), result.getResponse()));
                    }
                } catch (BatchErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<PageImpl<CloudJobSchedule>, JobScheduleListHeaders> listNextDelegate(Response<ResponseBody> response) throws BatchErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<CloudJobSchedule>, BatchErrorException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<CloudJobSchedule>>() { }.getType())
                .registerError(BatchErrorException.class)
                .buildWithHeaders(response, JobScheduleListHeaders.class);
    }

}
