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

    public Professional(String email, String firstName, String lastName, USAState usaState, LocalDate dateCreated, boolean approvedByAdmin, String careerTitle, String careerDescription, String educationDescription, String jobBestDescription, String jobWorstDescription, String pastChangeDesc, String futureChangeDesc, AccountType accountType, String company, String university, boolean gameHelpInd, boolean gameFundingInd, boolean socialMediaInd, boolean volunteerInd) {
        super(email, firstName, lastName, usaState, dateCreated);
        this.approvedByAdmin = approvedByAdmin;
        this.careerTitle = careerTitle;
        this.careerDescription = careerDescription;
        this.educationDescription = educationDescription;
        this.jobBestDescription = jobBestDescription;
        this.jobWorstDescription = jobWorstDescription;
        this.pastChangeDesc = pastChangeDesc;
        this.futureChangeDesc = futureChangeDesc;
        this.accountType = accountType;
        this.company = company;
        this.university = university;
        this.gameHelpInd = gameHelpInd;
        this.gameFundingInd = gameFundingInd;
        this.socialMediaInd = socialMediaInd;
        this.volunteerInd = volunteerInd;
    }


    public boolean isApprovedByAdmin() {
        return approvedByAdmin;
    }

    public String getCareerTitle() {
        return careerTitle;
    }

    public String getCareerDescription() {
        return careerDescription;
    }

    public String getEducationDescription() {
        return educationDescription;
    }

    public String getJobBestDescription() {
        return jobBestDescription;
    }

    public String getJobWorstDescription() {
        return jobWorstDescription;
    }

    public String getPastChangeDesc() {
        return pastChangeDesc;
    }

    public String getFutureChangeDesc() {
        return futureChangeDesc;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getCompany() {
        return company;
    }

    public String getUniversity() {
        return university;
    }

    public boolean isGameHelpInd() {
        return gameHelpInd;
    }

    public boolean isGameFundingInd() {
        return gameFundingInd;
    }

    public boolean isSocialMediaInd() {
        return socialMediaInd;
    }

    public boolean isVolunteerInd() {
        return volunteerInd;
    }
}
