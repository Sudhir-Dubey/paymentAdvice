package com.cnk.travel.operation.clientpaymentadvice.repository.impl;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;
import com.cnk.travel.operation.clientpaymentadvice.repository.ClientPaymentAdviceRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class ClientPaymentAdviceRepositoryImpl extends SimpleJpaRepository<ClientPaymentAdvice, String> implements ClientPaymentAdviceRepository {
    private EntityManager entityManager;

    public ClientPaymentAdviceRepositoryImpl( EntityManager em) {
        super(ClientPaymentAdvice.class, em);
        this.entityManager = em;
    }

    @Override
    public ClientPaymentAdvice getOne(String s) {
        return findById(s).get();
    }

    @Override
    public List<ClientPaymentAdvice> findAll() {
        return super.findAll();
    }

    public ClientPaymentAdvice create(ClientPaymentAdvice clientPaymentAdvice) {
        return this.save(clientPaymentAdvice);
    }
}
