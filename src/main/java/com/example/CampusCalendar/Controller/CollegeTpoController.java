package com.example.CampusCalendar.Controller;

import com.example.CampusCalendar.Entities.CollegeTPO;
import com.example.CampusCalendar.Services.CollegeTpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class CollegeTpoController {
    @Autowired
    private CollegeTpoService myTpoService;
    //Create a collegeTpo
    @PostMapping("/insertCollegeData")   //frontend me add CollegeData
    public ResponseEntity<CollegeTPO> insertCollData( @RequestBody CollegeTPO collegeTPO){

        return ResponseEntity.ok(myTpoService.insertFunction(collegeTPO));
   }
   //read the collegesTpo
   @GetMapping("/viewData")
    public List<CollegeTPO> viewData(){
        return myTpoService.findData();
   }
    @GetMapping("/viewData/{collegeId}")
    public CollegeTPO getCollegeTPOById(@PathVariable int collegeId) {
        return myTpoService.getCollegeTPOById(collegeId);

    }
    //Update CollegeTpo
    @PutMapping("/updateData/{collegeId}")
    public CollegeTPO updateCollegeTPO(@PathVariable int collegeId, @RequestBody CollegeTPO collegeTPO) {
        return myTpoService.updateCollegeTPO(collegeId, collegeTPO);
    }
    //update by all fields
    //delete the CollegeTpo
    @DeleteMapping("/deleteData/{collegeId}")
    public void deleteCollegeTPO(@PathVariable int collegeId) {
        myTpoService.deleteCollegeTPO(collegeId);
    }

}
