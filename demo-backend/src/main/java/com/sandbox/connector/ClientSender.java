/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package com.sandbox.connector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class ClientSender {

    // @Autowired
    // private RabbitTemplate rabbitTemplate;

    private RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedDelay = 1000L)
    public void send() {
        //this.rabbitTemplate.convertAndSend("foo", "hello");

        System.out.println("Sending something to client...");

        try {

            @SuppressWarnings("rawtypes")
            ResponseEntity<String> entity = this.restTemplate.getForEntity("http://localhost:10000/reverse?input=ollah", String.class);

            if (!entity.getStatusCode().equals(HttpStatus.OK)) {
                System.out.println("Problem when sending something to client...");
            } else {
                System.out.println("Successfully sent something to client...");
            }
        } catch (Exception e) {
            System.out.println("Error when sending something to client...");
        }
    }

}
