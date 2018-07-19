package com.mySeizureTracker.Controller;

import com.mySeizureTracker.DAO.SeizureSQLDao;
import com.mySeizureTracker.Entity.Seizures;
import com.mySeizureTracker.Service.SeizureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

/**
 * purpose of the Controller is to receive a request from the user. Retrieve the data from the database and serve the data back to the user
 */

@RestController                                 //lets spring know that this class is a  rest controller. Adds @Controller and @ResponseBody Annotations
@CrossOrigin("*")
public class SeizureController {

    @Autowired                                  //instantiates the instance below so you do not need to add "= new InstanceName"
    private SeizureService seizureService;

    @GetMapping(value = "/seizures")
    public Collection<Seizures> getAllSeizures(){
        return seizureService.getAllSeizures();
    }

    @GetMapping(value = "/seizures/type")
    public Collection<Seizures> groupByType(){
        return seizureService.groupByType();
    }

    @GetMapping(value = "/seizures/tod")
    public Collection<Seizures> groupByTimeOfDay(){
        return seizureService.groupByTimeOfDay();
    }

    @GetMapping(value = "/seizures/trigger")
    public Collection<Seizures> groupByTrigger(){
        return seizureService.groupByTrigger();
    }

    @GetMapping(value = "/seizures/{id}")
    public Seizures getSeizureById(@PathVariable("id") int id) {
        return seizureService.getSeizureById(id);
    }

    @PostMapping(value = "/seizures")
    public void insertSeizure(@RequestBody Seizures seizures){
        seizureService.insertSeizure(seizures);
    }

//    @PutMapping(value = "/seizures/id")
//    public void updateSeizure(@RequestBody Seizures seizures) {
//        seizureService.updateSeizure(seizures);
//    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateSeizure(@RequestBody Seizures seizures){
        seizureService.updateSeizure(seizures);
    }



    @DeleteMapping(value = "/seizures/{id}")
    public void deleteSeizureById(@PathVariable("id") int id){
        seizureService.deleteSeizureById(id);
    }








}
