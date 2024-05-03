package com.example.CampusCalendar.Repo;

import com.example.CampusCalendar.Entities.Assignment;
import com.example.CampusCalendar.Entities.CollegeTPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AssignmentRepo  extends JpaRepository<Assignment, Integer> {
}

