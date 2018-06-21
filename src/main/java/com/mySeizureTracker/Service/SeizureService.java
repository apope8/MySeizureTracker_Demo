package com.mySeizureTracker.Service;

import com.mySeizureTracker.DAO.SeizuresDAO;
import com.mySeizureTracker.Entity.Seizures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * purpose of the service is to retrieve the data from the database
 */

@Service        //tells spring that this class is a service
public class SeizureService {

    //create instance of SeizuresDAO
    @Autowired
    private SeizuresDAO seizuresDAO;

    // call an instance of SeizureDAO and return the values returned by getAllSeizures
    public Collection<Seizures> getAllSeizures(){
        return this.seizuresDAO.getAllSeizures();
    }

    public Seizures getSeizureById(int id){
        return this.seizuresDAO.getStudentById(id);
    }


}