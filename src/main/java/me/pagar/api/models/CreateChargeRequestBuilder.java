/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CreateChargeRequestBuilder {
    //the instance to build
    private CreateChargeRequest createChargeRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateChargeRequestBuilder() {
        createChargeRequest = new CreateChargeRequest();
    }

    /**
     * Code
     */
    public CreateChargeRequestBuilder code(String code) {
        createChargeRequest.setCode(code);
        return this;
    }

    /**
     * The amount of the charge, in cents
     */
    public CreateChargeRequestBuilder amount(int amount) {
        createChargeRequest.setAmount(amount);
        return this;
    }

    /**
     * The customer's id
     */
    public CreateChargeRequestBuilder customerId(String customerId) {
        createChargeRequest.setCustomerId(customerId);
        return this;
    }

    /**
     * Customer data
     */
    public CreateChargeRequestBuilder customer(CreateCustomerRequest customer) {
        createChargeRequest.setCustomer(customer);
        return this;
    }

    /**
     * Payment data
     */
    public CreateChargeRequestBuilder payment(CreatePaymentRequest payment) {
        createChargeRequest.setPayment(payment);
        return this;
    }

    /**
     * Metadata
     */
    public CreateChargeRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createChargeRequest.setMetadata(metadata);
        return this;
    }

    /**
     * The charge due date
     */
    public CreateChargeRequestBuilder dueAt(DateTime dueAt) {
        createChargeRequest.setDueAt(dueAt);
        return this;
    }

    public CreateChargeRequestBuilder antifraud(CreateAntifraudRequest antifraud) {
        createChargeRequest.setAntifraud(antifraud);
        return this;
    }

    /**
     * Order Id
     */
    public CreateChargeRequestBuilder orderId(String orderId) {
        createChargeRequest.setOrderId(orderId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateChargeRequest build() {
        return createChargeRequest;
    }
}