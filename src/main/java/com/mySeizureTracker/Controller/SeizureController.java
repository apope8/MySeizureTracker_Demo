package com.mySeizureTracker.Controller;

import com.mySeizureTracker.Entity.Seizures;
import com.mySeizureTracker.Service.SeizureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * purpose of the Controller is to receive a request from the user. Retrieve the data from the database and serve the data back to the user
 */

@RestController                                 //lets spring know that this class is a  rest controller. Adds @Controller and @ResponseBody Annotations
@CrossOrigin("*")
public class SeizureController {

    @Autowired                                  //instantiates the instance below so you do not need to add "= new InstanceName"
    private SeizureService seizureService;

    @GetMapping(value = "/seizures")            //Tells spring that this data can be retrieved via a GET request and requests an additional parameter for id
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

    @GetMapping(value = "/seizures/{id}")               //Tells spring that this data can be retrieved via a GET request and requests an additional parameter for id
    public Seizures getSeizureById(@PathVariable("id") int id) {
        return seizureService.getSeizureById(id);
    }

    @PostMapping(value = "/seizures")                   //Tells spring that this data can be created via a POST request
    public void insertSeizure(@RequestBody Seizures seizures){
        seizureService.insertSeizure(seizures);
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)        //Tells spring that this data can be updated via a PUT request
    public void updateSeizure(@RequestBody Seizures seizures){
        seizureService.updateSeizure(seizures);
    }



    @DeleteMapping(value = "/seizures/{id}")            //Tells spring that this data can be removed via a Delete request and requests an additional parameter for id
    public void deleteSeizureById(@PathVariable("id") int id){
        seizureService.deleteSeizureById(id);
    }








}
