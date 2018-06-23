package com.mySeizureTracker;

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

    }

    @Override
    public void updateSeizure(Seizures seizure) {

    }

    @Override
    public void insertSeizure(Seizures seizures) {

    }
}
