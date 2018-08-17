package com.cnk.travel.operation.clientpaymentadvice.service.impl;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.repository.ClientCommercialStatementRepository;
import com.cnk.travel.operation.clientpaymentadvice.service.ClientCommercialStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientCommercialStatementServiceImpl implements ClientCommercialStatementService{
    @Autowired
    private ClientCommercialStatementRepository clientCommercialStatementRepository;
    @Override
    public ClientCommercialStatement create(ClientCommercialStatement clientCommercialStatement) {
        return clientCommercialStatementRepository.create(clientCommercialStatement);
    }

    @Override
    public List<ClientCommercialStatement> getAll() {
        return clientCommercialStatementRepository.findAll();
    }

    @Override
    public ClientCommercialStatement getOne(String id) {
        return clientCommercialStatementRepository.getOne(id);
    }
}
