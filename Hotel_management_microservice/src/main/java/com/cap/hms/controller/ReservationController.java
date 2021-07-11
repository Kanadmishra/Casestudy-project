package com.cap.hms.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.hms.entity.Reservation;
import com.cap.hms.repository.ReservationRepository;

@RestController
@CrossOrigin

public class ReservationController {
	@Autowired
	private ReservationRepository repository;
	
	@PostMapping("/addbooking")
	public String saveReservation(@RequestBody Reservation reservation) {
		repository.save(reservation);
		return "Reservation Done with id : " + reservation.getId();
		}
	
	@GetMapping("/findallbookings")
	public List<Reservation> getReservations(){
		return repository.findAll();
	}
	
	@GetMapping("/findbooking/{id}")
	public Optional<Reservation> getReservation(@PathVariable int id){
		return repository.findById(id);
	}
	@PutMapping("/updatebooking/{id}")
	public Reservation updateBooking(@RequestBody Reservation updatedbooking)
	{
		repository.save(updatedbooking);
		return updatedbooking;
	}
	
	@DeleteMapping("/deletebooking/{id}")
	public String deleteReservation(@PathVariable int id) {
		repository.deleteById(id);
		return "Reservation deleted with id : " +id;
	}

}
