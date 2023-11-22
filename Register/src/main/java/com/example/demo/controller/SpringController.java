package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.Work;

import com.example.demo.entity.Details;

@RestController
public class SpringController {
	@Autowired
	private Work dt ;
	@PostMapping("/addstudent")
	
public Details addstudent(@RequestBody Details stud) {
	try {
		dt.save(stud);
		return stud;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
	@GetMapping("/getstudent")
	
	public List<Details> getstudent() {
		try {
			return dt.findAll();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PutMapping("/updatestudent")
	
	public Details updatestudent(@RequestBody Details stud) {
		try {
			dt.save(stud);
			return stud;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
@DeleteMapping("/deletestudent/{Id}")
	
	public String deletestudent(@PathVariable int Id) {
		try {
			Details stud = dt.getOne(Id);
			dt.delete(stud);
			return "studentdeleted";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
