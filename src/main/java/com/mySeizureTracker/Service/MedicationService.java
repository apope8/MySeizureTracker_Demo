package com.mySeizureTracker.Service;

/**
 * purpose of the service is to retrieve the data from the database using the SeizureSQLDAO
 */

import com.mySeizureTracker.DAO.MedicationDAO;
import com.mySeizureTracker.Entity.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service             //tells spring that this class is a service
public class MedicationService {

    @Autowired                  //create instance of SeizuresDAO
    @Qualifier("mmysql")        //For testing purposes, tell spring which DAO to use
    private MedicationDAO  medicationDAO;

    //Retrieve all the below data
    public Collection<Medication> getAllMedications() {
        return this.medicationDAO.getAllMedications();
    }


    public Medication getMedicationById(int id) {
        return this.medicationDAO.getMedicationById(id);
    }

    public void deleteMedication(int id) {
        this.medicationDAO.deleteMedication(id);
    }

    public void updateMedication(Medication medication) {
        this.medicationDAO.updateMedication(medication);
    }

    public void insertMedication(Medication medication) {
        medicationDAO.insertMedication(medication);
    }

}
