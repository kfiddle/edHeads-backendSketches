package com.example.demo.models;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Professional extends User {

    private boolean approvedByAdmin;
    private String careerTitle;
    private String careerDescription;
    private String educationDescription;
    private String jobBestDescription;
    private String jobWorstDescription;
    private String pastChangeDesc;
    private String futureChangeDesc;
    private AccountType accountType;
    private String company;
    private String university;

    private boolean gameHelpInd;
    private boolean gameFundingInd;
    private boolean socialMediaInd;
    private boolean volunteerInd;



    public Professional() {
    }

    public Professional(String email, String firstName, String lastName, USAState usaState, GradeRange gradeRange, LocalDate dateCreated) {
        super(email, firstName, lastName, usaState, dateCreated);
    }


}
