package com.example.bp.services;

import com.example.bp.dao.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorService {

    @Autowired
    SupervisorRepository supervisorRepository;

}
