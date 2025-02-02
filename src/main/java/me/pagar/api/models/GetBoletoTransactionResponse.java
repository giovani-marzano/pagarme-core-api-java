/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.pagar.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "transaction_type",
          defaultImpl = GetBoletoTransactionResponse.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class GetBoletoTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = -2785700397665230355L;
    private String url;
    private String barcode;
    private String nossoNumero;
    private String bank;
    private String documentNumber;
    private String instructions;
    private GetBillingAddressResponse billingAddress;
    private DateTime dueAt;
    private String qrCode;
    private String line;
    private String pdfPassword;
    private String pdf;
    private DateTime paidAt;
    private String paidAmount;
    private String type;
    private DateTime creditAt;
    private String statementDescriptor;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("barcode")
    public String getBarcode ( ) { 
        return this.barcode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("barcode")
    public void setBarcode (String value) { 
        this.barcode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("nosso_numero")
    public String getNossoNumero ( ) { 
        return this.nossoNumero;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero (String value) { 
        this.nossoNumero = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document_number")
    public String getDocumentNumber ( ) { 
        return this.documentNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document_number")
    public void setDocumentNumber (String value) { 
        this.documentNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("instructions")
    public String getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("instructions")
    public void setInstructions (String value) { 
        this.instructions = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (GetBillingAddressResponse value) { 
        this.billingAddress = value;
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
    @JsonGetter("qr_code")
    public String getQrCode ( ) { 
        return this.qrCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("qr_code")
    public void setQrCode (String value) { 
        this.qrCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("line")
    public String getLine ( ) { 
        return this.line;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("line")
    public void setLine (String value) { 
        this.line = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pdf_password")
    public String getPdfPassword ( ) { 
        return this.pdfPassword;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pdf_password")
    public void setPdfPassword (String value) { 
        this.pdfPassword = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pdf")
    public String getPdf ( ) { 
        return this.pdf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pdf")
    public void setPdf (String value) { 
        this.pdf = value;
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
    @JsonGetter("paid_amount")
    public String getPaidAmount ( ) { 
        return this.paidAmount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount (String value) { 
        this.paidAmount = value;
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
    @JsonGetter("credit_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreditAt ( ) { 
        return this.creditAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("credit_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreditAt (DateTime value) { 
        this.creditAt = value;
    }
 
    /** GETTER
     * Soft Descriptor
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Soft Descriptor
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
}
