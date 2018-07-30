package com.mySeizureTracker.Entity;

/**
 * Creating the Medication entity.
 * This holds the datamemebers for the medication class
 * This also holds the constructor and an empty constructor for use with Spring Boot to create a new instance of the medication class without parameters
 * This also holds the getters and setters that will be used to enter and retrieve data
 */

public class Medication {

    private int id;
    private String medicationName;
    private String dosage;
    private String startDate;
    private String endDate;

    public Medication() {
    }

    public Medication(String medicationName, String dosage, String startDate, String endDate) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Medication(int id, String medicationName, String dosage, String startDate, String endDate) {
        this.id = id;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
