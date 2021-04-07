// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.costmanagement.fluent.models.OperationStatusInner;

/**
 * An instance of this class provides access to all the operations defined in GenerateReservationDetailsReportsClient.
 */
public interface GenerateReservationDetailsReportsClient {
    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingAccountId(
        String billingAccountId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingAccountId(String billingAccountId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously based on enrollment id.
     *
     * @param billingAccountId Enrollment ID (Legacy BillingAccount ID).
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingAccountId(String billingAccountId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<OperationStatusInner>, OperationStatusInner> beginByBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Generates the reservations details report for provided date range asynchronously by billing profile.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId BillingProfile ID.
     * @param startDate Start Date.
     * @param endDate End Date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the long running operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner byBillingProfileId(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);
}
