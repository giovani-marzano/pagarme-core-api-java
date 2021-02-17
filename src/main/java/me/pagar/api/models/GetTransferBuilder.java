/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetTransferBuilder {
    //the instance to build
    private GetTransfer getTransfer;

    /**
     * Default constructor to initialize the instance
     */
    public GetTransferBuilder() {
        getTransfer = new GetTransfer();
    }

    public GetTransferBuilder id(String id) {
        getTransfer.setId(id);
        return this;
    }

    public GetTransferBuilder gatewayId(String gatewayId) {
        getTransfer.setGatewayId(gatewayId);
        return this;
    }

    public GetTransferBuilder amount(int amount) {
        getTransfer.setAmount(amount);
        return this;
    }

    public GetTransferBuilder status(String status) {
        getTransfer.setStatus(status);
        return this;
    }

    public GetTransferBuilder createdAt(DateTime createdAt) {
        getTransfer.setCreatedAt(createdAt);
        return this;
    }

    public GetTransferBuilder updatedAt(DateTime updatedAt) {
        getTransfer.setUpdatedAt(updatedAt);
        return this;
    }

    public GetTransferBuilder metadata(LinkedHashMap<String, String> metadata) {
        getTransfer.setMetadata(metadata);
        return this;
    }

    public GetTransferBuilder fee(Integer fee) {
        getTransfer.setFee(fee);
        return this;
    }

    public GetTransferBuilder fundingDate(DateTime fundingDate) {
        getTransfer.setFundingDate(fundingDate);
        return this;
    }

    public GetTransferBuilder fundingEstimatedDate(DateTime fundingEstimatedDate) {
        getTransfer.setFundingEstimatedDate(fundingEstimatedDate);
        return this;
    }

    public GetTransferBuilder type(String type) {
        getTransfer.setType(type);
        return this;
    }

    public GetTransferBuilder source(GetTransferSourceResponse source) {
        getTransfer.setSource(source);
        return this;
    }

    public GetTransferBuilder target(GetTransferTargetResponse target) {
        getTransfer.setTarget(target);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTransfer build() {
        return getTransfer;
    }
}