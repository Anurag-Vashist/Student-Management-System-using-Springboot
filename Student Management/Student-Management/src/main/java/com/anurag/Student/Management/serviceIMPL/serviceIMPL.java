package com.anurag.Student.Management.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.Student.Management.Service.StudentService;
import com.anurag.Student.Management.entity.Student;

@Service
public class serviceIMPL implements StudentService {

	
	@Autowired
	com.anurag.Student.Management.repository.Studentrepository Studentrepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		return Studentrepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return Studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return Studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		Studentrepository.deleteById(id);
		
	}

	
}
