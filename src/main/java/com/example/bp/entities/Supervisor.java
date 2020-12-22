package com.example.bp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supervisorId;

    private String firstname;
    private String lastname;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supervisor")
    private List<Student> students;


    public Supervisor() {
    }

    public Supervisor(String firstname, String lastname, String email) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public long getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(long supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
