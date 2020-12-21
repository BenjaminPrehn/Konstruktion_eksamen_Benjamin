package com.example.bp.dao;

import com.example.bp.entities.Supervisor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SupervisorRepository extends PagingAndSortingRepository<Supervisor, Long> {

    @Override
    public List<Supervisor> findAll();

    public Supervisor findByEmail(String value);

    public Supervisor findBySupervisorId(long theId);

}
