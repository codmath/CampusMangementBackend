package com.example.CampusCalendar.Controller;

import com.example.CampusCalendar.Entities.Interviewer;
import com.example.CampusCalendar.Services.InterviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewerController {
    @Autowired
    private InterviewerService interviewerService;
    @PostMapping("/insertInterviewerData")
    public ResponseEntity<Interviewer> InsertInterviewerData(@RequestBody Interviewer interviewer){
        return ResponseEntity.ok(this.interviewerService.insertInterviewData(interviewer));
    }
}
