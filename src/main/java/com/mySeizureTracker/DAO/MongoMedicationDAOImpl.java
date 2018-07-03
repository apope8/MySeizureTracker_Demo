package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Medication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;


@Repository
@Qualifier("MongoDB")
public class MongoMedicationDAOImpl implements MedicationDAO{


    @Override
    public Collection<Medication> getAllMedications() {
        return new ArrayList<Medication>(){
            {
                add(new Medication(4, "Tablet", "125mg", "05-04-2018", "06-06-2018"));
            }
        };
    }

    @Override
    public Medication getMedicationById(int id) {
        return null;
    }

    @Override
    public void deleteMedication(int id) {

    }

    @Override
    public void updateMedication(Medication medication) {

    }

    @Override
    public void insertMedication(Medication medication) {

    }
}
