package com.cnk.travel.operation.clientpaymentadvice.controller;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;
import com.cnk.travel.operation.clientpaymentadvice.service.ClientPaymentAdviceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequestMapping("/clientPaymentAdvices")
@RestController
public class ClientPaymentAdviceController {
    private static Logger logger= LogManager.getLogger();
    @Autowired
    private ClientPaymentAdviceService clientPaymentAdviceService;

    @GetMapping("/")
    public HttpEntity<List<ClientPaymentAdvice>> getAll() {
        return new ResponseEntity<>(clientPaymentAdviceService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/")
    public HttpEntity<ClientPaymentAdvice> create(@RequestBody ClientPaymentAdvice clientPaymentAdvice) {
         clientPaymentAdvice = new ClientPaymentAdvice();
        clientPaymentAdvice.setPaidAmount(new BigDecimal(8000));
        clientPaymentAdvice.setBalanceAmountPayable(new BigDecimal(8000));
        clientPaymentAdvice.setTotalAmountPayable(new BigDecimal(16000));
        clientPaymentAdvice.setPaymentGenerationDate(ZonedDateTime.now());
        clientPaymentAdvice.setStatements(getStatements());
        clientPaymentAdviceService.create(clientPaymentAdvice);
        return new ResponseEntity<>(clientPaymentAdviceService.create(clientPaymentAdvice), HttpStatus.CREATED);
    }
    private Set<ClientCommercialStatement> getStatements() {
        Set<ClientCommercialStatement> clientCommercialStatements = new HashSet<>();
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-10", "EZR-123"));
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-11", "EZR-124"));
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-12", "EZR-125"));
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-13", "EZR-126"));
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-14", "EZR-127"));
        clientCommercialStatements.add(new ClientCommercialStatement(new BigDecimal(1000), "Acco-15", "EZR-128"));


        return clientCommercialStatements;

    }

    @GetMapping("/{id}")
    public HttpEntity<ClientPaymentAdvice> getOne(@PathVariable String id) {
        return new ResponseEntity<>(clientPaymentAdviceService.getOne(id), HttpStatus.OK);
    }

    @GetMapping("/ping")
    public void ping(){
        String s;


        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
