package com.hotel.management.system.demo.bean;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hotel.management.system.demo.exception.EntityNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({EntityNotFound.class})
	public static ResponseEntity<Object> exceptionHandler(Exception ex) {
		
		return GlobalReponseHandler.createReponse(ex.getMessage(), HttpStatus.NOT_FOUND);
		
	}
	
	

}
