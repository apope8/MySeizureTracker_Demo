package com.mySeizureTracker.DAO;

import com.mySeizureTracker.Entity.Seizures;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository                 //Tell spring that this class is a repository
@Qualifier("mongoData")     //give this DAO an id for the service to call
public class MongoSeizureDAOImpl implements SeizuresDAO{



    @Override
    public Collection<Seizures> getAllSeizures() {
        return null;
    }

    @Override
    public Seizures getSeizureById(int id) {
        return null;
    }

    @Override
    public void deleteSeizureById(int id) {

    }

    @Override
    public void updateSeizure(Seizures seizure) {

    }

    @Override
    public void insertSeizure(Seizures seizures) {

    }
}
