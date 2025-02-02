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
public class GetChargeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -305036994272917284L;
    private String id;
    private String code;
    private String gatewayId;
    private int amount;
    private String status;
    private String currency;
    private String paymentMethod;
    private DateTime dueAt;
    private DateTime createdAt;
    private DateTime updatedAt;
    private GetTransactionResponse lastTransaction;
    private GetInvoiceResponse invoice;
    private GetOrderResponse order;
    private GetCustomerResponse customer;
    private LinkedHashMap<String, String> metadata;
    private DateTime paidAt;
    private DateTime canceledAt;
    private int canceledAmount;
    private int paidAmount;
    private String recurrencyCycle;
    private Integer interestAndFinePaid;
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
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
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
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
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
    @JsonGetter("last_transaction")
    public GetTransactionResponse getLastTransaction ( ) { 
        return this.lastTransaction;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_transaction")
    public void setLastTransaction (GetTransactionResponse value) { 
        this.lastTransaction = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("invoice")
    public GetInvoiceResponse getInvoice ( ) { 
        return this.invoice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("invoice")
    public void setInvoice (GetInvoiceResponse value) { 
        this.invoice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("order")
    public GetOrderResponse getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("order")
    public void setOrder (GetOrderResponse value) { 
        this.order = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customer")
    public GetCustomerResponse getCustomer ( ) { 
        return this.customer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customer")
    public void setCustomer (GetCustomerResponse value) { 
        this.customer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paid_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getPaidAt ( ) { 
        return this.paidAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paid_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaidAt (DateTime value) { 
        this.paidAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("canceled_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCanceledAt ( ) { 
        return this.canceledAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt (DateTime value) { 
        this.canceledAt = value;
    }
 
    /** GETTER
     * Canceled Amount
     */
    @JsonGetter("canceled_amount")
    public int getCanceledAmount ( ) { 
        return this.canceledAmount;
    }
    
    /** SETTER
     * Canceled Amount
     */
    @JsonSetter("canceled_amount")
    public void setCanceledAmount (int value) { 
        this.canceledAmount = value;
    }
 
    /** GETTER
     * Paid amount
     */
    @JsonGetter("paid_amount")
    public int getPaidAmount ( ) { 
        return this.paidAmount;
    }
    
    /** SETTER
     * Paid amount
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount (int value) { 
        this.paidAmount = value;
    }
 
    /** GETTER
     * Defines whether the card has been used one or more times.
     */
    @JsonGetter("recurrency_cycle")
    public String getRecurrencyCycle ( ) { 
        return this.recurrencyCycle;
    }
    
    /** SETTER
     * Defines whether the card has been used one or more times.
     */
    @JsonSetter("recurrency_cycle")
    public void setRecurrencyCycle (String value) { 
        this.recurrencyCycle = value;
    }
 
    /** GETTER
     * interest and fine paid
     */
    @JsonGetter("interest_and_fine_paid")
    public Integer getInterestAndFinePaid ( ) { 
        return this.interestAndFinePaid;
    }
    
    /** SETTER
     * interest and fine paid
     */
    @JsonSetter("interest_and_fine_paid")
    public void setInterestAndFinePaid (Integer value) { 
        this.interestAndFinePaid = value;
    }
 
}
