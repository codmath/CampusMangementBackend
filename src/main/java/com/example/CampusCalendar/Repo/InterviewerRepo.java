package com.example.CampusCalendar.Repo;

import com.example.CampusCalendar.Entities.Interviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewerRepo extends JpaRepository<Interviewer, String> {


}
