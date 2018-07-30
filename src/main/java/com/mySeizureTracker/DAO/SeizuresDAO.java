package com.mySeizureTracker.DAO;

/**
 * This file acts as a reference that will be extended upon in SeizureSQLDAO
 */

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
