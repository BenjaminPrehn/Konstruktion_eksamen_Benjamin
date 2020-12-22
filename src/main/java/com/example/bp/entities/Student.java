package com.example.bp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String firstname;
    private String lastname;
    private String email;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;

    public Student() {
    }

    public Student(String firstname, String lastname, String email, Supervisor supervisor) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.supervisor = supervisor;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public long getSupervisorId(){
        return supervisor.getSupervisorId();
    }


}
