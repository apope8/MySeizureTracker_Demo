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

@Repository("mysql")
public class MedicationSQLDao implements MedicationDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class MedicationRowMapper implements RowMapper<Medication>{

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
    }

    @Override
    public Collection<Medication> getAllMedications() {
        final String sql = "SELECT Medication_Id, Medication_Name, Medication_Dosage, Start_Date, End_Date FROM Medication";
        List<Medication> medicationsql = jdbcTemplate.query(sql,new MedicationRowMapper());
        return medicationsql;
    }

    @Override
    public Medication getMedicationById(int id) {
        final String sql = "SELECT Medication_Id, Medication_Name, Medication_Dosage, Start_Date, End_Date FROM Medication WHERE Medication_Id = ?";
        final Medication medicationsql = jdbcTemplate.queryForObject(sql, new MedicationRowMapper(), id);
        return medicationsql;
    }

    @Override
    public void deleteMedication(int id) {
        final String sql = "DELETE FROM Medication WHERE Medication_Id = ?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public void updateMedication(Medication medication) {
        final String sql = "UPDATE Medication SET Medication_Name = ?, Medication_Dosage = ?, Start_Date = ?, End_Date = ? WHERE Medication_Id = ?";
        final int Medication_Id = medication.getId();
        final String Medication_Name = medication.getMedicationName();
        final String Medication_Dosage = medication.getDosage();
        final String Start_Date = medication.getStartDate();
        final String End_Date = medication.getEndDate();
        jdbcTemplate.update(sql, new Object[]{Medication_Name, Medication_Dosage, Start_Date, End_Date, Medication_Id});

    }

    @Override
    public void insertMedication(Medication medication) {
        final String sql = "INSERT INTO Medication (Medication_Name, Medication_Dosage, Start_Date, End_Date) VALUES (?,?,?,?)";
        final String Medication_Name = medication.getMedicationName();
        final String Medication_Dosage = medication.getDosage();
        final String Start_Date = medication.getStartDate();
        final String End_Date = medication.getEndDate();
        jdbcTemplate.update(sql, new Object[]{Medication_Name, Medication_Dosage, Start_Date, End_Date});


    }
}
