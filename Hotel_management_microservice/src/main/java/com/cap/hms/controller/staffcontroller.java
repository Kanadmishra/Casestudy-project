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
import com.cap.hms.*;
import com.cap.hms.entity.staff;
import com.cap.hms.repository.*;
import com.cap.hms.*;


@SuppressWarnings("unused")
@RestController
@RequestMapping("/staffapi")
@CrossOrigin
@Controller
public class staffcontroller {
	

	@Autowired
	private staffrepository repository;
	
	@PostMapping("/newstaff")
	public String addstaff(@RequestBody staff member)
	{
		repository.save(member);
		return "New member Successfully Added";
	}
	
	@GetMapping("/findAllstaff")
	public List<staff> getstaff()
	{
		return repository.findAll();
	}
	@GetMapping("/findStaff/{code}")
	public staff getRoom(@PathVariable int code)
	{
		return repository.findById(code).orElse(null);
	}
	
	@PutMapping("/updateStaff/{code}")
	public staff updatestaff(@RequestBody staff updatedstaff)
	{
		repository.save(updatedstaff);
		return updatedstaff;
	}
	@DeleteMapping("/deleteStaff/{code}")
	public String deletestaff(@PathVariable int code)
	{
		repository.deleteById(code);
		return "Employee Deleted with Room Number :: " + code;
	}
	

}
