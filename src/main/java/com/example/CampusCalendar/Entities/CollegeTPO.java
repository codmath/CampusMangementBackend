package com.example.CampusCalendar.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "College_TPO")
public class CollegeTPO {
    @Id
    @GeneratedValue
    private int collegeId;
    @Column
    private String collegeName;
    @Column
    private String tpoName;
    @Column
    private String primaryEmail;
    @Column
    private String phoneNumber;
    @Column
    private  String addressLine1;
    @Column
    private String addressLine2;
    @Column
    private  String location;
    @Column
    private String region;
    @Column
    private String collegeOwner;
    @Column
    private String primaryContact;
    @Column
    private String secondaryContact;
    @Column
    private String tier;
    @Column
    private  String pinCode;
    @Column
    private String state;
    @Column
    private double compensation;
    @Column
    private String Hr;

//    @ManyToOne
//    @JoinColumn(name = "employeeId")
//    private Interviewer interviewerData;



}
