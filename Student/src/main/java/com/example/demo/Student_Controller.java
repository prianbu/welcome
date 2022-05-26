package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Student_Controller {
	@Autowired
	Student_Service stser;
	@PostMapping(value="/add")
	public String saveDetail(@RequestBody Student s) {
		return stser.saveDetail(s);
	}
	@GetMapping(value="/show/{id}")
   public Student getDetail(@PathVariable int id) {
		return stser.getDetail(id);
	}
	@PutMapping(value="/update")
	public String updateInfo(@RequestBody Student s) {
		return stser.updateInfo(s);
		}
	@DeleteMapping(value="/delete/{id}")
	public String deleteInfo(@PathVariable Integer id) {
		return stser.deleteInfo(id);
	}
	@GetMapping(value="/show1")
	public List<Student>getDetails() {
		return stser.getDetails();	
		}
	@PostMapping(value="/saveAll") 
	public String saveAll(@RequestBody List<Student>s) {
		return stser.saveAll(s);
	}

	}

