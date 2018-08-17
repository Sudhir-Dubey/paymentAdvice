package com.cnk.travel.operation.clientpaymentadvice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
public class ClientCommercialStatement extends BaseModel {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",
            strategy = "uuid")
    private String id;

    public ClientCommercialStatement() {
    }

    private BigDecimal statementAmount;
    private String productName;
    private String bookId;

    public ClientCommercialStatement(BigDecimal statementAmount, String productName, String bookId) {
        this.statementAmount = statementAmount;
        this.productName = productName;
        this.bookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getStatementAmount() {
        return statementAmount;
    }

    public void setStatementAmount(BigDecimal statementAmount) {
        this.statementAmount = statementAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
