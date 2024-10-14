package com.hotel.management.system.demo.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalReponseHandler {
	
	
	
	public static ResponseEntity<Object> createReponse(String str, Object payload,HttpStatus httpStatus){
		
		Map<String,Object> response = new HashMap<>();
		
		response.put("data",payload);
		response.put("message",str);
		
		return new ResponseEntity<Object>(response,httpStatus);
		
	}
	
public static ResponseEntity<Object> createReponse(Object payload,HttpStatus httpStatus){
		
		Map<String,Object> response = new HashMap<>();
		response.put("message","delete Hotel");
		
		return new ResponseEntity<Object>(response,httpStatus);
		
	}
	

//public static ResponseEntity<Object> createReponse(String str,HttpStatus httpStatus){
//	
//	Map<String,Object> response = new HashMap<>();
//	response.put("message",str);
//	
//	return new ResponseEntity<Object>(response,httpStatus);
//	
//}
//
//public static ResponseEntity<Object> createReponse(Object deleteHotel, HttpStatus ok) {
//	// TODO Auto-generated method stub
//	return null;
//}




}
