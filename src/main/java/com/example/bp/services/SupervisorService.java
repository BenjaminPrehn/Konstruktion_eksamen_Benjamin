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

    public Supervisor save(Supervisor supervisor){
        return supervisorRepository.save(supervisor);
    }

    public List<Supervisor> getAll(){
        return supervisorRepository.findAll();
    }

    public Supervisor findBySupervisorId(long theId){
        return supervisorRepository.findBySupervisorId(theId);
    }

    public void delete(Supervisor theSupervisor){
        supervisorRepository.delete(theSupervisor);
    }

}
