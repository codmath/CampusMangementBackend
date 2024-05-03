package com.example.CampusCalendar.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.exec.internal.AbstractJdbcOperationQueryInsert;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assignment {
    @Id
    @GeneratedValue
    private int assignmentId;
    @Column
    private String assignmentName;
    @Column
    private String assignmentDate;
    @Column
    private String assignmentScore;
    @Column
    private String assignmentStatus;
    @Column
    private byte[] assignmentFile;
    @Column
    private int talentId;


}
