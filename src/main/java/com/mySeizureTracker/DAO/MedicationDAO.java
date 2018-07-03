package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Medication;

import java.util.Collection;

public interface MedicationDAO {
    Collection<Medication> getAllMedications();

    Medication getMedicationById(int id);

    void deleteMedication(int id);

    void updateMedication(Medication medication);

    void insertMedication(Medication medication);
}
