package com.example.CampusCalendar.Services;

import com.example.CampusCalendar.Entities.Interviewer;
import com.example.CampusCalendar.Repo.InterviewerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InterviewerService {
    @Autowired
    private InterviewerRepo interviewerRepo;


    public Interviewer insertInterviewData(Interviewer interviewer) {
        return this.interviewerRepo.save(interviewer);
    }
}
