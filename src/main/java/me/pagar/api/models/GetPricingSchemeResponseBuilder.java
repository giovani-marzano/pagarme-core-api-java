/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetPricingSchemeResponseBuilder {
    //the instance to build
    private GetPricingSchemeResponse getPricingSchemeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetPricingSchemeResponseBuilder() {
        getPricingSchemeResponse = new GetPricingSchemeResponse();
    }

    public GetPricingSchemeResponseBuilder price(int price) {
        getPricingSchemeResponse.setPrice(price);
        return this;
    }

    public GetPricingSchemeResponseBuilder schemeType(String schemeType) {
        getPricingSchemeResponse.setSchemeType(schemeType);
        return this;
    }

    public GetPricingSchemeResponseBuilder priceBrackets(List<GetPriceBracketResponse> priceBrackets) {
        getPricingSchemeResponse.setPriceBrackets(priceBrackets);
        return this;
    }

    public GetPricingSchemeResponseBuilder minimumPrice(Integer minimumPrice) {
        getPricingSchemeResponse.setMinimumPrice(minimumPrice);
        return this;
    }

    /**
     * percentual value used in pricing_scheme Percent
     */
    public GetPricingSchemeResponseBuilder percentage(Double percentage) {
        getPricingSchemeResponse.setPercentage(percentage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetPricingSchemeResponse build() {
        return getPricingSchemeResponse;
    }
}