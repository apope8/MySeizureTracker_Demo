package com.mySeizureTracker.Service;

import com.mySeizureTracker.DAO.SeizureSQLDao;
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
    private SeizureSQLDao sqlDao;

    // call an instance of SeizureDAO and return the values returned by getAllSeizures
    public Collection<Seizures> getAllSeizures(){
        return this.sqlDao.getAllSeizures();
    }

    public Seizures getSeizureById(int id){
        return this.sqlDao.getSeizureById(id);
    }


    public void deleteSeizureById(int id) {
        this.sqlDao.deleteSeizureById(id);
    }

    public void updateSeizure(Seizures seizures){
        this.sqlDao.updateSeizure(seizures);
    }


    public void insertSeizure(Seizures seizures) {
        sqlDao.insertSeizure(seizures);
    }
}
