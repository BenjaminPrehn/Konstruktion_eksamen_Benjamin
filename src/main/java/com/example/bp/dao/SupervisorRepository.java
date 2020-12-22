package com.example.bp.dao;

import com.example.bp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupervisorRepository extends JpaRepository<Student, Long> {

}
