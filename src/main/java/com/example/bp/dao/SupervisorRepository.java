package com.example.bp.dao;

import com.example.bp.entities.Student;
import com.example.bp.entities.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SupervisorRepository extends JpaRepository<Student, Long> {

}
