package com.anurag.Student.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anurag.Student.Management.entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {

}
