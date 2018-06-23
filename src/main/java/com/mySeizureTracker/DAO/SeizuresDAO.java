package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Seizures;

import java.util.Collection;

public interface SeizuresDAO {

    //return all seizures
    Collection<Seizures> getAllSeizures();

    //return a seizure by passing in its id
    Seizures getSeizureById(int id);

    void deleteSeizureById(int id);

    void updateSeizure(Seizures seizure);

    void insertSeizure(Seizures seizures);
}
