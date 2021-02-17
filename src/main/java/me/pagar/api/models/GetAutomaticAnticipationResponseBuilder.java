/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetAutomaticAnticipationResponseBuilder {
    //the instance to build
    private GetAutomaticAnticipationResponse getAutomaticAnticipationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetAutomaticAnticipationResponseBuilder() {
        getAutomaticAnticipationResponse = new GetAutomaticAnticipationResponse();
    }

    public GetAutomaticAnticipationResponseBuilder enabled(boolean enabled) {
        getAutomaticAnticipationResponse.setEnabled(enabled);
        return this;
    }

    public GetAutomaticAnticipationResponseBuilder type(String type) {
        getAutomaticAnticipationResponse.setType(type);
        return this;
    }

    public GetAutomaticAnticipationResponseBuilder volumePercentage(int volumePercentage) {
        getAutomaticAnticipationResponse.setVolumePercentage(volumePercentage);
        return this;
    }

    public GetAutomaticAnticipationResponseBuilder delay(int delay) {
        getAutomaticAnticipationResponse.setDelay(delay);
        return this;
    }

    public GetAutomaticAnticipationResponseBuilder days(List<Integer> days) {
        getAutomaticAnticipationResponse.setDays(days);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetAutomaticAnticipationResponse build() {
        return getAutomaticAnticipationResponse;
    }
}