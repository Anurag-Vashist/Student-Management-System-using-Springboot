package com.anurag.Student.Management.Service;
import java.util.List;
import com.anurag.Student.Management.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	
	public Student saveStudent(Student student);

	public Student getById(int id);
	
	public void deleteById(int id);
}
