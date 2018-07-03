package com.mySeizureTracker.Controller;

import com.mySeizureTracker.Entity.Medication;
import com.mySeizureTracker.Service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Medication> getAllMedications(){
        return medicationService.getAllMedications();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Medication getMedicationById(@PathVariable("id") int id){
        return medicationService.getMedicationById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deleteMedication(@PathVariable("id") int id){
        medicationService.deleteMedication(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateMedication(@RequestBody Medication medication){
        medicationService.updateMedication(medication);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMedication(@RequestBody Medication medication){
        medicationService.insertMedication(medication);
    }
}
