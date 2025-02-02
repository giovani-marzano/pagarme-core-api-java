/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListWithdrawalsBuilder {
    //the instance to build
    private ListWithdrawals listWithdrawals;

    /**
     * Default constructor to initialize the instance
     */
    public ListWithdrawalsBuilder() {
        listWithdrawals = new ListWithdrawals();
    }

    /**
     * The Increments response
     */
    public ListWithdrawalsBuilder data(List<GetWithdrawResponse> data) {
        listWithdrawals.setData(data);
        return this;
    }

    /**
     * Paging object
     */
    public ListWithdrawalsBuilder paging(PagingResponse paging) {
        listWithdrawals.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListWithdrawals build() {
        return listWithdrawals;
    }
}