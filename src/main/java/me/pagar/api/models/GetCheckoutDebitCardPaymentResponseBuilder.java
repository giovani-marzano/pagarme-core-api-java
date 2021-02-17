/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetCheckoutDebitCardPaymentResponseBuilder {
    //the instance to build
    private GetCheckoutDebitCardPaymentResponse getCheckoutDebitCardPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCheckoutDebitCardPaymentResponseBuilder() {
        getCheckoutDebitCardPaymentResponse = new GetCheckoutDebitCardPaymentResponse();
    }

    /**
     * Descrição na fatura
     */
    public GetCheckoutDebitCardPaymentResponseBuilder statementDescriptor(String statementDescriptor) {
        getCheckoutDebitCardPaymentResponse.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Payment Authentication response object data
     */
    public GetCheckoutDebitCardPaymentResponseBuilder authentication(GetPaymentAuthenticationResponse authentication) {
        getCheckoutDebitCardPaymentResponse.setAuthentication(authentication);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCheckoutDebitCardPaymentResponse build() {
        return getCheckoutDebitCardPaymentResponse;
    }
}