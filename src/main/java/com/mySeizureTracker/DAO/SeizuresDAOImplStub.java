///**
// * purpose of this file is to store data in memory to test the app
// * DAO is a Data Access Object
// * It provides an interface to a database for use with the app
// */



//package com.mySeizureTracker.DAO;
//
//import com.mySeizureTracker.Entity.Seizures;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//
//@Repository             //this lets spring know that this class is the storage
//@Qualifier("fakedata")            //give this DAO an id for the service to call
//public class SeizuresDAOImplStub implements SeizuresDAO {
//
//    private static Map<Integer, Seizures> seizures;
//
//    static {
//        seizures = new HashMap<Integer, Seizures>() {
//            {
//                put(1, new Seizures(1, "Tonic Clonic", "2016-09-20", "Afternoon", "Unknown",
//                        "Normal day in work. The following is pieced together from colleagues and witnesses to the incident as I have no recollection of the event." +
//                                "" +
//                                "I left my desk at 1:15 colleagues say I was pale and quiet as I left my desk. " +
//                                "" +
//                                "I walked downstairs towards the office bathroom. My two colleagues were walking ahead of me but did not notice anything strange. They said they thought I was going towards the bathroom but walked passed it so they thought I was heading to the seating area in our office block." +
//                                "" +
//                                "A witness from another company said she saw me stopped in the corridor. I was on my phone and acting strangely. She thought I was joking with another person as she said I was motioning to someone and making strange faces." +
//                                "The witness said I then let out a loud noise and put my hands over my stomach chest." +
//                                "When she looked over I collapsed, hitting my head on the side of a door as I fell." +
//                                "When I hit the ground I was having a seizure. My body was stiff, and my legs were shaking. I was banging my head off the ground." +
//
//                                "My two colleagues who were walking ahead of me were returning and spotted what was happening. One tried to help me by talking to me while the other called an ambulance." +
//                                "At this time another colleague of mine was in the corridor and put their hand under my head to stop my head hitting off the ground." +
//                                "" +
//                                "Once the seizure began to calm my colleague was able to place me in the recovery position and I’m told I began to relax." +
//                                "I came through in the ambulance. I was very confused. I had no recollection of leaving my desk. To me I was at my desk one moment and in the ambulance the next. I was told what had happened and I was brought to St James hospital.", "No"));
//
//                put(2, new Seizures(2, "Tonic Clonic", "2016-12-01", "Afternoon", "Unkownn", "Same location as first seizure, passerby heard me make the exhale sound and recognised what had happened. Was able to catch me before I hit the ground. Ambulance called. No injuries. " +
//                        "Taken to james hospital were I was observed for a few hours. Sent home in early hours of the morning.", "False"));
//
//            }
//        };
//    }
//
//    /**
//     * Java Collection is a framework that allows you to store and manipulate a group of objects
//     * Allows you to perform functions such as search, sort, insert, delete among others
//     */
//
//    //return all seizures
//    @Override
//    public Collection<Seizures> getAllSeizures(){
//        return this.seizures.values();
//    }
//
//    //return a seizure by passing in its id
//    @Override
//    public Seizures getSeizureById(int id){
//        return this.seizures.get(id);
//    }
//
//
//    @Override
//    public void deleteSeizureById(int id) {
//        this.seizures.remove(id);
//    }
//
//    @Override
//    public void updateSeizure(Seizures seizure){
//
//        Seizures s = seizures.get(seizure.getId());
//        s.setId(seizure.getId());
//        s.setSeizureType(seizure.getSeizureType());
//        s.setSeizureDate(seizure.getSeizureDate());
//        s.setTimeOfDay(seizure.getTimeOfDay());
//        s.setTrigger(seizure.getTrigger());
//        s.setDescription(seizure.getDescription());
//        seizures.put(seizure.getId(),seizure);
//    }
//
//    @Override
//    public void insertSeizure(Seizures seizures) {
//        this.seizures.put(seizures.getId(), seizures);
//    }
//}
//
//
//
//
