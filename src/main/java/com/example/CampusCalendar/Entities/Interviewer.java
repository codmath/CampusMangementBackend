package com.example.CampusCalendar.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Interviewer_details")
public class Interviewer {
    @Id
    private  String employeeId;
    @Column
    private String email;
    @Column
    private  String interviewerName;
    @Column
    private String region;
    @Column
    private  String location;
    @Column
    private String grade;
    @Column
    private String interviewDate;
    @Column
    private int candidateId;
//    @JsonIgnore
//    @OneToMany(mappedBy = "interviewerData")
//    private List<CollegeTPO> collData;


}
