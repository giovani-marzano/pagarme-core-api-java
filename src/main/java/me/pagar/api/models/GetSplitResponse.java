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
public class GetSplitResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -625232464034629085L;
    private String type;
    private int amount;
    private GetRecipientResponse recipient;
    private String gatewayId;
    private GetSplitOptionsResponse options;
    private String id;
    /** GETTER
     * Type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
    /** GETTER
     * The split rule gateway id
     */
    @JsonGetter("gateway_id")
    public String getGatewayId ( ) { 
        return this.gatewayId;
    }
    
    /** SETTER
     * The split rule gateway id
     */
    @JsonSetter("gateway_id")
    public void setGatewayId (String value) { 
        this.gatewayId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("options")
    public GetSplitOptionsResponse getOptions ( ) { 
        return this.options;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("options")
    public void setOptions (GetSplitOptionsResponse value) { 
        this.options = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
}
