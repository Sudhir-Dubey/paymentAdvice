package com.cnk.travel.operation.clientpaymentadvice.repository;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;

import java.util.List;

public interface ClientCommercialStatementRepository {
    ClientCommercialStatement getOne(String s);
    ClientCommercialStatement create(ClientCommercialStatement clientCommercialStatement);
    List<ClientCommercialStatement> findAll();
}
