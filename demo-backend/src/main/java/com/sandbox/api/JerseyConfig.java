/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package com.sandbox.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Endpoint.class);
        register(ReverseEndpoint.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

}
