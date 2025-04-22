package com.example.bean;

import com.example.action.HelloAction;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class HelloBean {
	
	private String name;
	private String message;
	private String points;
	private HelloAction helloAction = new HelloAction();
	
	public String performAction() {
		
		String outcome = helloAction.performAction(this.message);
		
		if("helloPage".equalsIgnoreCase(outcome)) {
			this.message = "Action performed successfully - Points will be encashed!";
		}
		
		return outcome;
	}

	public HelloBean() {
		log.info("HelloBean constructor called");
	}
}
