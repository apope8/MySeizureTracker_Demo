package com.mySeizureTracker.DAO;


import com.mySeizureTracker.Entity.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository("mmysql")
public class MedicationSQLDao implements MedicationDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Collection<Medication> getAllMedications() {
        final String sql = "SELECT Medication_Id, Medication_Name, Medication_Dosage, Start_Date, End_Date FROM Medication";
        List<Medication> medicationsql = jdbcTemplate.query(sql, new RowMapper<Medication>() {

            @Override
            public Medication mapRow(ResultSet resultSet, int i) throws SQLException {
                Medication medication = new Medication();
                medication.setId(resultSet.getInt("Medication_Id"));
                medication.setMedicationName(resultSet.getString("Medication_Name"));
                medication.setDosage(resultSet.getString("Medication_Dosage"));
                medication.setStartDate(resultSet.getString("Start_Date"));
                medication.setEndDate(resultSet.getString("End_Date"));
                return medication;
            }
        });
        return medicationsql;
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
