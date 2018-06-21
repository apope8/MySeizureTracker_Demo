package com.mySeizureTracker.Entity;

/**
 * Creating the seizure entity.
 * This holds the datamemebers for the seizure class
 * This also holds the constructor and an empty constructor for use with Spring Boot to create a new instance of the seizure class without parameters
 * This also holds the getters and setters that will be used to enter and retrieve data
 */

import java.util.Date;

public class Seizures {

    private int id;
    private String seizureType;
    private String seizureDate;
    private String timeOfDay;
    private String trigger;
    private String description;
    private String wereYouAlone;

    public Seizures(int id) {}

    //As there are no initial values for these datamembers we are just setting them to themselves using the "this" keyword


    public Seizures(int id, String seizureType, String seizureDate, String timeOfDay, String trigger, String description,  String wereYouAlone) {
        this.id = id;
        this.seizureType = seizureType;
        this.seizureDate = seizureDate;
        this.timeOfDay = timeOfDay;
        this.trigger = trigger;
        this.description = description;
        this.wereYouAlone = wereYouAlone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeizureType() {
        return seizureType;
    }

    public void setSeizureType(String seizureType) {
        this.seizureType = seizureType;
    }

    public String getSeizureDate() {
        return seizureDate;
    }

    public void setSeizureDate(String seizureDate) {
        this.seizureDate = seizureDate;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String isWereYouAlone() {
        return wereYouAlone;
    }

    public void setWereYouAlone(String wereYouAlone) {
        this.wereYouAlone = wereYouAlone;
    }
}
