package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Medication;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MedicationDAO {

    private static Map<Integer, Medication> medications;

    static {

        medications = new HashMap<Integer, Medication>(){
            {
                put(1, new Medication(1, "Keppra", "50mg", "01-12-2016", "01-02-2017"));
                put(2, new Medication(2, "Keppra", "75mg", "02-02-2017", "02-08-2017"));
            }
        };
    }

    public Collection<Medication> getAllMedications(){
        return this.medications.values();
    }

    public Medication getMedicationById(int id){
        return this.medications.get(id);
    }

    public void deleteMedication(int id) {
        this.medications.remove(id);
    }

    public void updateMedication(Medication medication){
        Medication m = medications.get(medication.getId());
        m.setMedicationName(medication.getMedicationName());
        m.setDosage(medication.getDosage());
        m.setStartDate(medication.getStartDate());
        m.setEndDate(medication.getEndDate());
        medications.put(medication.getId(), medication);
    }
}
