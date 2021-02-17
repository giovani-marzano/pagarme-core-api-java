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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.pagar.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class GetWithdrawResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -7961603999078387608L;
    private String id;
    private String gatewayId;
    private int amount;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private List<String> metadata;
    private Integer fee;
    private DateTime fundingDate;
    private DateTime fundingEstimatedDate;
    private String type;
    private GetWithdrawSourceResponse source;
    private GetWithdrawTargetResponse target;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("gateway_id")
    public String getGatewayId ( ) { 
        return this.gatewayId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("gateway_id")
    public void setGatewayId (String value) { 
        this.gatewayId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public List<String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (List<String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("fee")
    public Integer getFee ( ) { 
        return this.fee;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("fee")
    public void setFee (Integer value) { 
        this.fee = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("funding_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getFundingDate ( ) { 
        return this.fundingDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("funding_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFundingDate (DateTime value) { 
        this.fundingDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("funding_estimated_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getFundingEstimatedDate ( ) { 
        return this.fundingEstimatedDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("funding_estimated_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFundingEstimatedDate (DateTime value) { 
        this.fundingEstimatedDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("source")
    public GetWithdrawSourceResponse getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("source")
    public void setSource (GetWithdrawSourceResponse value) { 
        this.source = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("target")
    public GetWithdrawTargetResponse getTarget ( ) { 
        return this.target;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("target")
    public void setTarget (GetWithdrawTargetResponse value) { 
        this.target = value;
    }
 
}
