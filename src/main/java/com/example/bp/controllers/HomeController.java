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

        return "index";
    }

}
