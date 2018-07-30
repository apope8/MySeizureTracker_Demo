package com.mySeizureTracker.Controller;

/**
 * This class acts as the bridge between the Client Side application and the model of the server side application
 */

import com.mySeizureTracker.Entity.Medication;
import com.mySeizureTracker.Service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController                         //Tells spring that this class will be the REST controller
@RequestMapping("/medications")         //Sets the url address where the data will be retrieved from
@CrossOrigin("*")                       //Allows data to be communicated across different systems. Wildcard used for testing different URLS
public class MedicationController {

    @Autowired
    private MedicationService medicationService;        //Inject the medicaton service

    @RequestMapping(method = RequestMethod.GET)         //Tells spring that this data can be retrieved via a GET request
    public Collection<Medication> getAllMedications(){
        return medicationService.getAllMedications();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)        //Tells spring that this data can be retrieved via a GET request and requests an additional parameter for id
    public Medication getMedicationById(@PathVariable("id") int id){
        return medicationService.getMedicationById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)     //Tells spring that this data can be removed via a Delete request and requests an additional parameter for id
        public void deleteMedication(@PathVariable("id") int id){
        medicationService.deleteMedication(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)    //Tells spring that this data can be updated via a PUT request
    public void updateMedication(@RequestBody Medication medication){
        medicationService.updateMedication(medication);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)      //Tells spring that this data can be created via a POST request
    public void insertMedication(@RequestBody Medication medication){
        medicationService.insertMedication(medication);
    }
}
