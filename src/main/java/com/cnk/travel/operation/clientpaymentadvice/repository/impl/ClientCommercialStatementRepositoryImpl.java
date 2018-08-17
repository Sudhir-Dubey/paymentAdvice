package com.cnk.travel.operation.clientpaymentadvice.repository.impl;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.repository.ClientCommercialStatementRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClientCommercialStatementRepositoryImpl extends SimpleJpaRepository<ClientCommercialStatement, String> implements ClientCommercialStatementRepository {
    private EntityManager entityManager;

    public ClientCommercialStatementRepositoryImpl( EntityManager em) {
        super(ClientCommercialStatement.class, em);
        this.entityManager = em;
    }

    @Override
    public ClientCommercialStatement getOne(String s) {
        return super.getOne(s);
    }
    @Override
    public ClientCommercialStatement create(ClientCommercialStatement clientCommercialStatement) {
        return this.save(clientCommercialStatement);
    }
    @Override
    public List<ClientCommercialStatement> findAll() {
        return this.findAll();
    }
}
