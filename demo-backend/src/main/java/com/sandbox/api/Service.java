/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2016.
 */

package com.sandbox.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Value("${message:World}")
	private String msg;

	public String message() {
		return this.msg;
	}

}
