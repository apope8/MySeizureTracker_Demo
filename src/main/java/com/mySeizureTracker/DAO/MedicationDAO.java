package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Medication;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MedicationDAO {

    private static Map<Integer, Medication> medication;

    static {

        medication = new HashMap<Integer, Medication>(){
            {
                put(1, new Medication(1, "Keppra", "50mg", "01-12-2016", "01-02-2017"));
                put(2, new Medication(2, "Keppra", "75mg", "02-02-2017", "02-08-2017"));
            }
        };
    }

    public Collection<Medication> getAllMedications(){
        return this.medication.values();
    }

}
