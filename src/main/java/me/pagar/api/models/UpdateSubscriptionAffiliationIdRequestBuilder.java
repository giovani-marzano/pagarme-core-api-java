/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateSubscriptionAffiliationIdRequestBuilder {
    //the instance to build
    private UpdateSubscriptionAffiliationIdRequest updateSubscriptionAffiliationIdRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionAffiliationIdRequestBuilder() {
        updateSubscriptionAffiliationIdRequest = new UpdateSubscriptionAffiliationIdRequest();
    }

    public UpdateSubscriptionAffiliationIdRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        updateSubscriptionAffiliationIdRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionAffiliationIdRequest build() {
        return updateSubscriptionAffiliationIdRequest;
    }
}