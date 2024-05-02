package com.example.CampusCalendar.Repo;

import com.example.CampusCalendar.Entities.CollegeTPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface CollegeTPORepo extends JpaRepository<CollegeTPO, Integer> {

}
