package com.mahi.RestApiOnStudentData.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahi.RestApiOnStudentData.model.Student;

@Repository
public interface StudentService extends JpaRepository<Student,String>{

	public Optional<Student> findById(String id); 
}
