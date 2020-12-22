package com.example.bp.services;

import com.example.bp.dao.StudentRepository;
import com.example.bp.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student findByStudentId(long theId){
        return studentRepository.findByStudentId(theId);
    }

    public void delete(Student theStudent){
        studentRepository.delete(theStudent);
    }




}
