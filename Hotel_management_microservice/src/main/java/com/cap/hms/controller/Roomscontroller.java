package com.cap.hms.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cap.hms.repository.*;
import com.cap.hms.entity.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/roomapi")
@CrossOrigin
@Controller

public class Roomscontroller {
	
	@Autowired
	private Roomrepository repository;
	
	@PostMapping("/newRoom")
	public String addRoom(@RequestBody Rooms room)
	{
		repository.save(room);
		return "New Room Successfully Added";
	}
	
	@GetMapping("/findAllRooms")
	public List<Rooms> getRooms()
	{
		return repository.findAll();
	}
	@GetMapping("/findRoom/{roomNum}")
	public Rooms getRoom(@PathVariable int roomNum)
	{
		return repository.findById(roomNum).orElse(null);
	}
	
	@PutMapping("/updateRoom/{roomNum}")
	public Rooms updateRoom(@RequestBody Rooms updatedRoom)
	{
		repository.save(updatedRoom);
		return updatedRoom;
	}
	@DeleteMapping("/deleteRoom/{roomNum}")
	public String deleteGuest(@PathVariable int roomNum)
	{
		repository.deleteById(roomNum);
		return "Room Deleted with Room Number :: " + roomNum;
	}
	

	

}
