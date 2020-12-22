package com.example.bp.dao;

import com.example.bp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findAll();

    public Student findByStudentId(long theId);



}
