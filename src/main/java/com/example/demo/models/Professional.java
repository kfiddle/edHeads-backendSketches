package com.example.demo.models;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Professional extends User {


    public Professional() {
    }

    public Professional(String email, String firstName, String lastName, USAState usaState, GradeRange gradeRange, LocalDate dateCreated) {
        super(email, firstName, lastName, usaState, dateCreated);
    }


}
