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
        return this.medicationDAO.getAllMedications();
    }


    public Medication getMedicationById(int id){
        return this.medicationDAO.getMedicationById(id);
    }

    public void deleteMedication(int id) {
        this.medicationDAO.deleteMedication(id);
    }

    public void updateMedication(Medication medication){
        this.medicationDAO.updateMedication(medication);
    }
}
