package com.mySeizureTracker.Controller;

import com.mySeizureTracker.Entity.Seizures;
import com.mySeizureTracker.Service.SeizureService;

import java.util.Collection;

/**
 * purpose of the Controller is to receive a request from the user. Retrieve the data from the database and serve the data back to the user
 */

public class SeizureController {

    private SeizureService seizureService;

    public Collection<Seizures> getAllSeizures(){
        return seizureService.getAllSeizures();
    }


}
