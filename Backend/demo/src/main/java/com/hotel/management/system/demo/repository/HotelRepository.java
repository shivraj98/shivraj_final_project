package com.hotel.management.system.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.management.system.demo.entity.Hotel;

public interface HotelRepository  extends JpaRepository<Hotel, Integer>{
	
	

}
