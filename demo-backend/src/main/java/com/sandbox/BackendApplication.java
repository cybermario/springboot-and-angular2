package com.sandbox;

import com.sandbox.connector.ClientSender;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BackendApplication extends SpringBootServletInitializer {

    //@Bean
    public ClientSender mySender() {
        return new ClientSender();
    }

    public static void main(String[] args) {
        new BackendApplication()
                .configure(new SpringApplicationBuilder(BackendApplication.class))
                .run(args);
    }
}