/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetPixTransactionResponseBuilder 
        extends GetTransactionResponseBuilder {
    //the instance to build
    private GetPixTransactionResponse getPixTransactionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPixTransactionResponseBuilder() {
        getPixTransactionResponse = new GetPixTransactionResponse();
    }

    public GetPixTransactionResponseBuilder qrCode(String qrCode) {
        getPixTransactionResponse.setQrCode(qrCode);
        return this;
    }

    public GetPixTransactionResponseBuilder qrCodeUrl(String qrCodeUrl) {
        getPixTransactionResponse.setQrCodeUrl(qrCodeUrl);
        return this;
    }

    public GetPixTransactionResponseBuilder expiresAt(DateTime expiresAt) {
        getPixTransactionResponse.setExpiresAt(expiresAt);
        return this;
    }

    public GetPixTransactionResponseBuilder additionalInformation(List<PixAdditionalInformation> additionalInformation) {
        getPixTransactionResponse.setAdditionalInformation(additionalInformation);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPixTransactionResponse build() {
        return getPixTransactionResponse;
    }
}