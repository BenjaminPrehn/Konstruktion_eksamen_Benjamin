package com.example.bp.services;

import com.example.bp.dao.SupervisorRepository;
import com.example.bp.entities.Supervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorService {

    @Autowired
    SupervisorRepository supervisorRepository;

}
