package com.hotel.management.system.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.management.system.demo.bean.GlobalReponseHandler;
import com.hotel.management.system.demo.entity.Hotel;
import com.hotel.management.system.demo.exception.EntityNotFound;
import com.hotel.management.system.demo.service.HotelService;

@RestController
@RequestMapping("/api/hotel")
@CrossOrigin
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@GetMapping("")
	public ResponseEntity<Object> index() throws EntityNotFound{
		return GlobalReponseHandler.createReponse("All hotels are fetched",hotelService.index(),HttpStatus.OK);
	}

	
	@PostMapping("")
	public ResponseEntity<Object> createHotel(@RequestBody Hotel hotel) throws EntityNotFound{
		return GlobalReponseHandler.createReponse("All hotels are fetched",hotelService.createHotel(hotel),HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateHotel(@RequestBody Hotel hotel,@PathVariable int id) throws EntityNotFound{
		return GlobalReponseHandler.createReponse("All hotels are fetched",hotelService.updateHotel(hotel,id),HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteHotel(int id) throws EntityNotFound{
		 hotelService.deleteHotel(id);
	}
}
