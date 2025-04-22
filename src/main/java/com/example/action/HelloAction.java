package com.example.action;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloAction {
	public String performAction(String message) {
		log.info("User Values -> message: {}", message);
		if (message != null && message.trim().length() > 0) {
			log.info("Processing for HELLO PAGE");
			return "helloMessagePage"; // Navigation outcome
		} else {
			log.info("Processing for HELLO Message PAGE: {}", message);
			return "helloPage"; // Navigation outcome
		}
	}
}
