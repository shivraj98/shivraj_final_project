package com.hotel.management.system.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.management.system.demo.entity.Hotel;
import com.hotel.management.system.demo.exception.EntityNotFound;
import com.hotel.management.system.demo.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	HotelRepository hotelRepository;

	public Hotel createHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	public Hotel updateHotel(Hotel hotel, int id) throws EntityNotFound {
		Optional<Hotel> hotelFromDB = hotelRepository.findById(id);

		if (hotelFromDB.isPresent()) {
			Hotel hotelUpdate = hotelFromDB.get();
			hotelUpdate.setCity(hotel.getCity());
			hotelUpdate.setDescription(hotel.getDescription());
			hotelUpdate.setEmail(hotel.getEmail());
			hotelUpdate.setGym(hotel.getGym());
			hotelUpdate.setImageUrl(hotel.getImageUrl());
			hotelUpdate.setName(hotel.getName());
			hotelUpdate.setPool(hotel.getPool());
			hotelUpdate.setRating(hotel.getRating());
			hotelUpdate.setRoomPrice(hotel.getRoomPrice());
			hotelUpdate.setWifi(hotel.getWifi());

			return hotelRepository.save(hotelUpdate);

		} else {
			throw new EntityNotFound("Hotel not found");
		}
	}

	public void deleteHotel(int id) throws EntityNotFound {
		Optional<Hotel> hotelFromDB = hotelRepository.findById(id);
		if (hotelFromDB.isPresent()) {
			hotelFromDB.get();
			hotelRepository.delete(hotelFromDB.get());

		} else {
			throw new EntityNotFound("Hotel not found");
		}
	}

	public List<Hotel> index() throws EntityNotFound {

		List<Hotel> hotels = hotelRepository.findAll();
		if (!hotels.isEmpty()) {
			return hotels;
		} else {
			throw new EntityNotFound("Hotels not found");
		}

	}

}
