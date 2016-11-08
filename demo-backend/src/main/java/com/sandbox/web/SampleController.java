/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package com.sandbox.web;

import com.sandbox.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public String helloWorld() {
        return this.helloWorldService.getHelloMessage();
    }

    @GetMapping("/async")
    public Callable<String> helloWorldAsync() {
        return new Callable<String>() {

            @Override
            public String call() throws Exception {

                Thread.sleep(3000);

                return "async: "
                        + SampleController.this.helloWorldService.getHelloMessage();
            }

        };

    }

}
