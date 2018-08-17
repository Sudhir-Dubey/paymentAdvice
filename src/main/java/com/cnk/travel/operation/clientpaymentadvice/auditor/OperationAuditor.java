package com.cnk.travel.operation.clientpaymentadvice.auditor;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class OperationAuditor implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Sudhir");
    }
}


