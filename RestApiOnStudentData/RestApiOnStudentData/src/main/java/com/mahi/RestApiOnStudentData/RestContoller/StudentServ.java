package com.mahi.RestApiOnStudentData.RestContoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.RestApiOnStudentData.Repo.StudentService;
import com.mahi.RestApiOnStudentData.model.Student;

@RestController
public class StudentServ {
	
	@Autowired
	private StudentService serv;
	
	@GetMapping("/Students/list")
	public List<Student> ListAll() {
	
		return serv.findAll();
	}
	
	@PostMapping("/Students/save")
	public String save(@RequestBody Student student) {
		Student saved=serv.save(student);
		return saved.getStudentId();
	}
	
	@GetMapping("/Students/delete/{id}")
	public void delete(@PathVariable String id) {
		serv.deleteById(id);
	}
}
