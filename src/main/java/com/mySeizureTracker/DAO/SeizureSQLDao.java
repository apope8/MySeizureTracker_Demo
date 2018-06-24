package com.mySeizureTracker.DAO;

import com.mySeizureTracker.DAO.SeizuresDAO;
import com.mySeizureTracker.Entity.Seizures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * This class holds the sql statements that will query / amend our database for the users requests
 */


@Repository("mysql")                                    //Give this repository an id
public class SeizureSQLDao implements SeizuresDAO {

    @Autowired                                          //instantiate the class by injection
    private JdbcTemplate jdbcTemplate;

    //Create class to hold Row mapper parameters to avoid duplicating code
    private static class SeizureRowMapper implements RowMapper<Seizures>{

        @Override
        public Seizures mapRow(ResultSet resultSet, int i) throws SQLException {
            Seizures seizures = new Seizures();
            seizures.setId(resultSet.getInt("id"));
            seizures.setSeizureType(resultSet.getString("seizureType"));
            seizures.setSeizureDate(resultSet.getString("seizureDate"));
            seizures.setTimeOfDay(resultSet.getString("timeOfDay"));
            seizures.setTrigger(resultSet.getString("seizureTrigger"));
            seizures.setDescription(resultSet.getString("description"));
            return seizures;
        }
    }


    @Override
    public Collection<Seizures> getAllSeizures() {      //Get all records from the database
        final String sql = "SELECT id, seizureType, seizureDate, timeOfDay, seizureTrigger, description FROM  seizures;";
        List<Seizures> seizure = jdbcTemplate.query(sql, new SeizureRowMapper());
        return seizure;
    }

    @Override
    public Seizures getSeizureById(int id) {
        final String sql = "SELECT id, seizureType, seizureDate, timeOfDay, seizureTrigger, description FROM seizures WHERE id = ?";
        Seizures seizure = jdbcTemplate.queryForObject(sql, new SeizureRowMapper(), id);

        return seizure;
    }

    @Override
    public void deleteSeizureById(int id) {
        final String sql = "DELETE FROM seizures WHERE  Id = ?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public void updateSeizure(Seizures seizure) {
        final String sql = "UPDATE seizures SET seizureType = ?, seizureDate = ?, timeOfDay = ?, seizureTrigger = ?, description = ? WHERE id = ?";
        final int id = seizure.getId();
        final String seizureType = seizure.getSeizureType();
        final String seizureDate = seizure.getSeizureDate();
        final String timeOfDay = seizure.getTimeOfDay();
        final String seizureTrigger = seizure.getTrigger();
        final String description = seizure.getDescription();
        jdbcTemplate.update(sql, new Object[]{seizureType, seizureDate, timeOfDay, seizureTrigger, description,id});
    }

    @Override
    public void insertSeizure(Seizures seizures) {
        final String sql = "INSERT INTO seizures (seizureType, seizureDate, timeOfDay, seizureTrigger, description) VALUES(?,?,?,?,?)";
        final String seizureType = seizures.getSeizureType();
        final String seizureDate = seizures.getSeizureDate();
        final String timeOfDay = seizures.getTimeOfDay();
        final String seizureTrigger = seizures.getTrigger();
        final String description = seizures.getDescription();
        jdbcTemplate.update(sql, new Object[]{seizureType, seizureDate, timeOfDay, seizureTrigger, description});
    }
}
