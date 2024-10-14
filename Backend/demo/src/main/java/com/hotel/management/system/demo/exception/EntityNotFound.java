package com.hotel.management.system.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class EntityNotFound extends Exception{
	
	
	
	private static final long serialVersionUID = 1L;

	public EntityNotFound(String message) {
		super(message);
	}

}
