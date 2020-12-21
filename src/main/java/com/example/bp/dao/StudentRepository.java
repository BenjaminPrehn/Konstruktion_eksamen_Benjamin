package com.example.bp.dao;

import com.example.bp.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    @Override
    public List<Student> findAll();

    public Student findByStudentId(long theId);

}
