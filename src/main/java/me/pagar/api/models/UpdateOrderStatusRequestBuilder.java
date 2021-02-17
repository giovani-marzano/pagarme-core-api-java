/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateOrderStatusRequestBuilder {
    //the instance to build
    private UpdateOrderStatusRequest updateOrderStatusRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateOrderStatusRequestBuilder() {
        updateOrderStatusRequest = new UpdateOrderStatusRequest();
    }

    /**
     * Order status
     */
    public UpdateOrderStatusRequestBuilder status(String status) {
        updateOrderStatusRequest.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateOrderStatusRequest build() {
        return updateOrderStatusRequest;
    }
}