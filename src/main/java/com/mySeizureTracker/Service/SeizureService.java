package com.mySeizureTracker.Service;

import com.mySeizureTracker.DAO.SeizuresDAO;
import com.mySeizureTracker.Entity.Seizures;

import java.util.Collection;

/**
 * purpose of the service is to retrieve the data from the database
 */

public class SeizureService {

    //create instance of SeizuresDAO
    private SeizuresDAO seizuresDAO;

    // call an instance of SeizureDAO and return the values returned by getAllSeizures
    public Collection<Seizures> getAllSeizures(){
        return seizuresDAO.getAllSeizures();
    }


}
