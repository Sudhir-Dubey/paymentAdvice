package com.cnk.travel.operation.clientpaymentadvice;

import com.cnk.travel.operation.clientpaymentadvice.model.ClientCommercialStatement;
import com.cnk.travel.operation.clientpaymentadvice.model.ClientPaymentAdvice;
import com.cnk.travel.operation.clientpaymentadvice.service.ClientPaymentAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
public class ClientPaymentAdviceApplication {
    @Autowired
    private ClientPaymentAdviceService clientPaymentAdviceService;
    @Autowired
    private ApplicationContext applicationContext;

    public void displayBeansName() {
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientPaymentAdviceApplication.class, args);
        System.out.println("sudhir");
        System.out.println("sudhir");


    }

}
