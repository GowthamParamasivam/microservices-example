package com.gowtham.toystoreservice.config; 
/* gowthamparamasivam created on 5/10/21 1:36 PM inside 
the package - com.gowtham.toystoreservice.config */

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@RequiredArgsConstructor
@Configuration
public class JmsConfig {
    public static final String MANUFACTURING_REQUEST_QUEUE = "manufacturing-request";
    public static final String NEW_INVENTORY_QUEUE = "new-inventory";
    public static final String VALIDATE_ORDER_QUEUE = "validate-order";
    public static final String VALIDATE_RESPONSE_QUEUE = "validate-order-result";

    private final ObjectMapper objectMapper;

    @Bean
    public MessageConverter jacksonJmsMessageConverter(ObjectMapper objectMapper){
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        converter.setObjectMapper(objectMapper);
        return converter;
    }
}
