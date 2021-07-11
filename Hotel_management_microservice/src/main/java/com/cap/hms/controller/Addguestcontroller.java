package com.cap.hms.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.hms.entity.Addguest;
import com.cap.hms.repository.AddguestRepository;




@RestController
@RequestMapping("/guest/api")
@CrossOrigin

public class Addguestcontroller {
	
	
	@Autowired
	private AddguestRepository repository;
	
	@PostMapping("/newGuest")
	public String addRoom(@RequestBody Addguest addguest)
	{
		repository.save(addguest);
		return "New guest Successfully Added";
	}
	
	@GetMapping("/findAllguests")
	public List<Addguest> getAddguests()
	{
		return repository.findAll();
	}
	@GetMapping("/findguest/{code}")
	public Addguest getAddguest(@PathVariable int code)
	{
		return repository.findById(code).orElse(null);
	}
	
	
	@PutMapping("/updateguest/{code}")
	public Addguest updateguest(@RequestBody Addguest updatedguest)
	{
		repository.save(updatedguest);
		return updatedguest;
	}
	@DeleteMapping("/deleteguest/{code}")
	public String deleteGuest(@PathVariable int code)
	{
		repository.deleteById(code);
		return "Room Deleted with Room Number :: " + code;
	}


}
