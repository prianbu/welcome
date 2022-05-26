package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Student_Dao {
	@Autowired
	Student_Repo strepo;
	public String saveDetail(Student s) {
		strepo.save(s);
		return "Successfully saved";
	}
	public Student getDetail(int id) {
		return strepo.findById(id).get();
	}
	public String updateInfo(Student s) {
		strepo.save(s).getId();
		return "data updated";
	}
	public String deleteInfo(Integer id) {
		strepo.deleteById(id);;
		return "data has been deleted";
	}
	public List<Student>getDetails() {
		return strepo.findAll();
	}
	public String saveAll(List<Student>s) {
		for(Student t:s) {
			strepo.save(t);
			
		}
		return "saved successfully";
	}

}
