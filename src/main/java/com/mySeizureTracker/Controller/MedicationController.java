package com.mySeizureTracker.Controller;

import com.mySeizureTracker.Entity.Medication;
import com.mySeizureTracker.Service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
