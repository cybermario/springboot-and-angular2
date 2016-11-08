/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package com.sandbox.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Endpoint {

	private final Service service;

	public Endpoint(Service service) {
		this.service = service;
	}

	@GET
	public String message() {
		return "Hello " + this.service.message();
	}

}
