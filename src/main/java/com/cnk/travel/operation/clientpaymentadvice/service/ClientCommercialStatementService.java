package com.cnk.travel.operation.clientpaymentadvice.service;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;

import java.util.List;

public interface ClientCommercialStatementService {
    ClientCommercialStatement create(ClientCommercialStatement clientCommercialStatement);
    List<ClientCommercialStatement> getAll();
    ClientCommercialStatement getOne(String id);

// some thing

}
