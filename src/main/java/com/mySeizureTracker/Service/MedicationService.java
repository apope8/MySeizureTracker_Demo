package com.mySeizureTracker.Service;

import com.mySeizureTracker.DAO.MedicationDAO;
import com.mySeizureTracker.Entity.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MedicationService {

    @Autowired
    private MedicationDAO medicationDAO;

    public Collection<Medication> getAllMedications(){
        return medicationDAO.getAllMedications();
    }

}
