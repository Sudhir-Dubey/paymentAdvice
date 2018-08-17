package com.cnk.travel.operation.clientpaymentadvice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

@Table
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
public class ClientPaymentAdvice extends BaseModel {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",
            strategy = "uuid")
    private String id;
    private BigDecimal totalAmountPayable;
    private BigDecimal balanceAmountPayable;
    private BigDecimal paidAmount;
    @Column(name = "paymentGenerationDate", columnDefinition = "TIMESTAMP WITH TIME ZONE", insertable = true, updatable = true)
    private ZonedDateTime paymentGenerationDate;
    @Fetch(FetchMode.JOIN)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_payment_id")
    private Set<ClientCommercialStatement> statements;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalAmountPayable() {
        return totalAmountPayable;
    }

    public void setTotalAmountPayable(BigDecimal totalAmountPayable) {
        this.totalAmountPayable = totalAmountPayable;
    }

    public BigDecimal getBalanceAmountPayable() {
        return balanceAmountPayable;
    }

    public void setBalanceAmountPayable(BigDecimal balanceAmountPayable) {
        this.balanceAmountPayable = balanceAmountPayable;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Set<ClientCommercialStatement> getStatements() {
        return statements;
    }

    public void setStatements(Set<ClientCommercialStatement> statements) {
        this.statements = statements;
    }

    public ZonedDateTime getPaymentGenerationDate() {
        return paymentGenerationDate;
    }

    public void setPaymentGenerationDate(ZonedDateTime paymentGenerationDate) {
        this.paymentGenerationDate = paymentGenerationDate;
    }
}
