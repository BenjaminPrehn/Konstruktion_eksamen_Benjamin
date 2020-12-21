package com.example.bp.controllers;

import com.example.bp.dao.SupervisorRepository;
import com.example.bp.entities.Student;
import com.example.bp.entities.Supervisor;
import com.example.bp.services.StudentService;
import com.example.bp.services.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SupervisorService supervisorService;

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String showHome(Model model){

        // Show All Supervisors
        List<Supervisor> supervisors = supervisorService.getAll();
        model.addAttribute("supervisors", supervisors);

        // Show All Students
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/new-student")
    public String showStudentForm(Model model){
        Student newStudent = new Student();
        List<Supervisor> supervisors = supervisorService.getAll();
        model.addAttribute("students", newStudent);
        model.addAttribute("supervisors", supervisors);

        return "new-student";
    }

    @PostMapping("/save-new-student")
    public String saveStudent(Model model, Student student){
        studentService.save(student);

        return"redirect:/";
    }

    @GetMapping("/update-student")
    public String updateStudent(@RequestParam("id") long theId, Model model){
        Student theStudent = studentService.findByStudentId(theId);
        List<Supervisor> supervisors = supervisorService.getAll();
        model.addAttribute("students", theStudent);
        model.addAttribute("supervisors", supervisors);

        return "update-student";
    }

    @GetMapping("/delete-student")
    public String deleteStudent(@RequestParam("id") long theId, Model model){
        Student theStudent = studentService.findByStudentId(theId);
        studentService.delete(theStudent);
        return "redirect:/";
    }




}
