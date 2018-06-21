package com.mySeizureTracker.Controller;

import com.mySeizureTracker.Entity.Seizures;
import com.mySeizureTracker.Service.SeizureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * purpose of the Controller is to receive a request from the user. Retrieve the data from the database and serve the data back to the user
 */

@RestController                                 //lets spring know that this class is a  rest controller. Adds @Controller and @ResponseBody Annotations
@RequestMapping("/seizures")                    //tells spring what url to look for this class at
public class SeizureController {

    @Autowired                                  //instantiates the instance below so you do not need to add "= new InstanceName"
    private SeizureService seizureService;

    @RequestMapping(method = RequestMethod.GET)     //tells spring that we will be using a get method to run this function
    public Collection<Seizures> getAllSeizures(){
        return seizureService.getAllSeizures();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seizures getSeizureById(@PathVariable("id") int id){     //path variable retrieves the id entered into the url and assigns it to the int id variable
        return seizureService.getSeizureById(id);
    }


}
