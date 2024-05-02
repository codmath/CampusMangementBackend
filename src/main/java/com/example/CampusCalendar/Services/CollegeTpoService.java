package com.example.CampusCalendar.Services;

import com.example.CampusCalendar.Entities.CollegeTPO;
import com.example.CampusCalendar.Repo.CollegeTPORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeTpoService {
    @Autowired
    private CollegeTPORepo myTPORepo;
    public CollegeTPO insertFunction(CollegeTPO collegeTPO) {
        return this.myTPORepo.save(collegeTPO);
    }

    public List<CollegeTPO> findData() {
        return this.myTPORepo.findAll();
    }

    public CollegeTPO getCollegeTPOById(int collegeId) {
        return myTPORepo.findById(collegeId).orElse(null);
    }

    public CollegeTPO updateCollegeTPO(int collegeId, CollegeTPO collegeTPO) {
        if (myTPORepo.existsById(collegeId)) {
            collegeTPO.setCollegeId(collegeId);
            return myTPORepo.save(collegeTPO);
        }
        return null;
    }

    public void deleteCollegeTPO(int collegeId) {
        myTPORepo.deleteById(collegeId);

    }
}
