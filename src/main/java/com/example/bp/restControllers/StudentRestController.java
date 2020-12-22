package com.example.bp.restControllers;

import com.example.bp.entities.Student;
import com.example.bp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    // Get all Students trough REST
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getAll();
    }


    // Get Students by id trough REST
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        Student theStudent = studentService.findByStudentId(studentId);

        if (theStudent == null){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudent;
    }

    // Create Students With REST
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent){

        theStudent.setStudentId(0);

        studentService.save(theStudent);

        return theStudent;

    }

    // Update students with Rest
        @PutMapping("/students")
        public Student updateStudent(@RequestBody Student theStudent){

           studentService.save(theStudent);
           return theStudent;
       }


    // Delete students with Rest
        @DeleteMapping("/students/{id}")
        void deleteStudent(@PathVariable Long id){

        studentService.delete(id);

        }

    }




