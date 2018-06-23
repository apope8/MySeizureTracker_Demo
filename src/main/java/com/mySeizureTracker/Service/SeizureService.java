package com.mySeizureTracker.Service;

import com.mySeizureTracker.DAO.SeizuresDAO;
import com.mySeizureTracker.Entity.Seizures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * purpose of the service is to retrieve the data from the database
 */

@Service        //tells spring that this class is a service
public class SeizureService {

    @Autowired                  //create instance of SeizuresDAO
    @Qualifier("mysql")      //Bean to Pick which DAO for spring to use
    private SeizuresDAO seizuresDAO;

    // call an instance of SeizureDAO and return the values returned by getAllSeizures
    public Collection<Seizures> getAllSeizures(){
        return this.seizuresDAO.getAllSeizures();
    }

    public Seizures getSeizureById(int id){
        return this.seizuresDAO.getSeizureById(id);
    }


    public void deleteSeizureById(int id) {
        this.seizuresDAO.deleteSeizureById(id);
    }

    public void updateSeizure(Seizures seizures){
        this.seizuresDAO.updateSeizure(seizures);
    }


    public void insertSeizure(Seizures seizures) {
        seizuresDAO.insertSeizure(seizures);
    }
}
