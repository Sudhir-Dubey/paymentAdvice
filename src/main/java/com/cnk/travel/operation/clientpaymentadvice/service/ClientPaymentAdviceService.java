package com.cnk.travel.operation.clientpaymentadvice.service;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;

import java.util.List;

public interface ClientPaymentAdviceService {
    ClientPaymentAdvice create(ClientPaymentAdvice clientPaymentAdvice);
    List<ClientPaymentAdvice> getAll();
    ClientPaymentAdvice getOne(String id);
}
