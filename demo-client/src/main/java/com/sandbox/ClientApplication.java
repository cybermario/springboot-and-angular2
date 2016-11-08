package com.sandbox;

import com.sandbox.connector.BackendSender;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class ClientApplication extends SpringBootServletInitializer {

    @Bean
    public BackendSender mySender() {
        return new BackendSender();
    }

    public static void main(String[] args) {
        new ClientApplication()
                .configure(new SpringApplicationBuilder(ClientApplication.class))
                .run(args);
    }
}
