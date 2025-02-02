/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetChargeResponseBuilder {
    //the instance to build
    private GetChargeResponse getChargeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetChargeResponseBuilder() {
        getChargeResponse = new GetChargeResponse();
    }

    public GetChargeResponseBuilder id(String id) {
        getChargeResponse.setId(id);
        return this;
    }

    public GetChargeResponseBuilder code(String code) {
        getChargeResponse.setCode(code);
        return this;
    }

    public GetChargeResponseBuilder gatewayId(String gatewayId) {
        getChargeResponse.setGatewayId(gatewayId);
        return this;
    }

    public GetChargeResponseBuilder amount(int amount) {
        getChargeResponse.setAmount(amount);
        return this;
    }

    public GetChargeResponseBuilder status(String status) {
        getChargeResponse.setStatus(status);
        return this;
    }

    public GetChargeResponseBuilder currency(String currency) {
        getChargeResponse.setCurrency(currency);
        return this;
    }

    public GetChargeResponseBuilder paymentMethod(String paymentMethod) {
        getChargeResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public GetChargeResponseBuilder dueAt(DateTime dueAt) {
        getChargeResponse.setDueAt(dueAt);
        return this;
    }

    public GetChargeResponseBuilder createdAt(DateTime createdAt) {
        getChargeResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetChargeResponseBuilder updatedAt(DateTime updatedAt) {
        getChargeResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetChargeResponseBuilder lastTransaction(GetTransactionResponse lastTransaction) {
        getChargeResponse.setLastTransaction(lastTransaction);
        return this;
    }

    public GetChargeResponseBuilder invoice(GetInvoiceResponse invoice) {
        getChargeResponse.setInvoice(invoice);
        return this;
    }

    public GetChargeResponseBuilder order(GetOrderResponse order) {
        getChargeResponse.setOrder(order);
        return this;
    }

    public GetChargeResponseBuilder customer(GetCustomerResponse customer) {
        getChargeResponse.setCustomer(customer);
        return this;
    }

    public GetChargeResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getChargeResponse.setMetadata(metadata);
        return this;
    }

    public GetChargeResponseBuilder paidAt(DateTime paidAt) {
        getChargeResponse.setPaidAt(paidAt);
        return this;
    }

    public GetChargeResponseBuilder canceledAt(DateTime canceledAt) {
        getChargeResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Canceled Amount
     */
    public GetChargeResponseBuilder canceledAmount(int canceledAmount) {
        getChargeResponse.setCanceledAmount(canceledAmount);
        return this;
    }

    /**
     * Paid amount
     */
    public GetChargeResponseBuilder paidAmount(int paidAmount) {
        getChargeResponse.setPaidAmount(paidAmount);
        return this;
    }

    /**
     * Defines whether the card has been used one or more times.
     */
    public GetChargeResponseBuilder recurrencyCycle(String recurrencyCycle) {
        getChargeResponse.setRecurrencyCycle(recurrencyCycle);
        return this;
    }

    /**
     * interest and fine paid
     */
    public GetChargeResponseBuilder interestAndFinePaid(Integer interestAndFinePaid) {
        getChargeResponse.setInterestAndFinePaid(interestAndFinePaid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetChargeResponse build() {
        return getChargeResponse;
    }
}