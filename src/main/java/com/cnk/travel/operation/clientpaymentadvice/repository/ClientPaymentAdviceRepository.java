package com.cnk.travel.operation.clientpaymentadvice.repository;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;

import java.util.List;

public interface ClientPaymentAdviceRepository {
    ClientPaymentAdvice getOne(String s);

    List<ClientPaymentAdvice> findAll();

    ClientPaymentAdvice create(ClientPaymentAdvice clientPaymentAdvice);
}
