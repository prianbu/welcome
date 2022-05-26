package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Student_Service {
	@Autowired
	Student_Dao stdao;

	public String saveDetail(Student s) {
		return stdao.saveDetail(s);
	}

	public Student getDetail(int id) {
		return stdao.getDetail(id);
	}

	public String updateInfo(Student s) {
		return stdao.updateInfo(s);
	}

	public String deleteInfo(Integer id) {
		return stdao.deleteInfo(id);
	}
	public List<Student>getDetails() {
		return stdao.getDetails();
	}
	public String saveAll(List<Student>s) {
		return stdao.saveAll(s);
	}
}
