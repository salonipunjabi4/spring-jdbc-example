package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person>{
	//rowmapper is a functional interface 
	
	public Person mapRow(ResultSet resultSet, int i) throws SQLException {
		Person person = new Person();
		person.setId(resultSet.getLong("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setAge(resultSet.getInt("age"));
		return person;
	}

}
