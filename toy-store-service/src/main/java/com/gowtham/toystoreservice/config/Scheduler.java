package com.gowtham.toystoreservice.config; 
/* gowthamparamasivam created on 5/10/21 1:46 PM inside 
the package - com.gowtham.toystoreservice.config */

import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Scheduler {

    private final JmsTemplate jmsTemplate;

//    @Scheduled(fixedRate = 10)
//    public void sendMsg(){
//        System.out.println("Trying to send the message");
//        jmsTemplate.convertAndSend(JmsConfig.MANUFACTURING_REQUEST_QUEUE, "Hello");
//    }
}
