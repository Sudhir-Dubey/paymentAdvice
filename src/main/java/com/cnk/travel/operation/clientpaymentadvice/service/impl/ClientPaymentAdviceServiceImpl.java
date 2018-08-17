package com.cnk.travel.operation.clientpaymentadvice.service.impl;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;
import com.cnk.travel.operation.clientpaymentadvice.repository.ClientPaymentAdviceRepository;
import com.cnk.travel.operation.clientpaymentadvice.service.ClientPaymentAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ClientPaymentAdviceServiceImpl implements ClientPaymentAdviceService{
    @Autowired
    private ClientPaymentAdviceRepository clientPaymentAdviceRepository;
    @Override
    @Transactional
    public ClientPaymentAdvice create(ClientPaymentAdvice clientPaymentAdvice) {
        return clientPaymentAdviceRepository.create(clientPaymentAdvice);
    }

    @Override
    public List<ClientPaymentAdvice> getAll() {
        return clientPaymentAdviceRepository.findAll();
    }

    @Override
  //  @Transactional
    public ClientPaymentAdvice getOne(String id) {
        ClientPaymentAdvice clientPaymentAdvice = clientPaymentAdviceRepository.getOne(id);
        System.out.println("sachin");



        /*for(ClientCommercialStatement clientCommercialStatement:clientPaymentAdvice.getStatements()){
           if( clientCommercialStatement.getBookId().startsWith("EZR")){
               clientCommercialStatement.setBookId("EZR-127-changed");
            }
        }
        clientPaymentAdviceRepository.create(clientPaymentAdvice);*/
        return clientPaymentAdvice;

    }
}
