package com.mySeizureTracker.Entity;

import java.util.Date;

public class Seizures {

    private int id;
    private String seizureType;
    private Date seizureDate = new Date();
    private String timeOfDay;
    private String trigger;
    private String description;
    private String dayOrNight;
    private boolean wereYouAlone;

    public Seizures(int id) {}

    public Seizures(int id, String seizureType, Date seizureDate, String timeOfDay, String trigger, String description, String dayOrNight, boolean wereYouAlone) {
        this.id = id;
        this.seizureType = seizureType;
        this.seizureDate = seizureDate;
        this.timeOfDay = timeOfDay;
        this.trigger = trigger;
        this.description = description;
        this.dayOrNight = dayOrNight;
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

    public Date getSeizureDate() {
        return seizureDate;
    }

    public void setSeizureDate(Date seizureDate) {
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

    public String getDayOrNight() {
        return dayOrNight;
    }

    public void setDayOrNight(String dayOrNight) {
        this.dayOrNight = dayOrNight;
    }

    public boolean isWereYouAlone() {
        return wereYouAlone;
    }

    public void setWereYouAlone(boolean wereYouAlone) {
        this.wereYouAlone = wereYouAlone;
    }
}
