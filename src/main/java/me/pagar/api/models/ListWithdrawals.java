/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ListWithdrawals 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4904885067059411379L;
    private List<GetWithdrawResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The Increments response
     */
    @JsonGetter("data")
    public List<GetWithdrawResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Increments response
     */
    @JsonSetter("data")
    public void setData (List<GetWithdrawResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
