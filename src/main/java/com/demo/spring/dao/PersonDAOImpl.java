package com.demo.spring.dao;

import java.util.List;
import com.demo.model.PersonMapper;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Person;

@Component
public class PersonDAOImpl implements PersonDAO{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PERSON = "select * from people where id = ?";
	private final String SQL_DELETE_PERSON = "delete from people where id = ?";
	private final String SQL_UPDATE_PERSON = "update people set first_name = ?, last_name = ?, age = ? where id = ?";
	private final String SQL_GET_ALL = "select * from people";
	private final String SQL_INSERT_PERSON = "insert into people(id, first_name, last_name, age) values(?,?,?,?)";
	
	
	
	@Autowired
	public PersonDAOImpl(DataSource dataSource) {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public boolean createPerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(), person.getAge()) > 0;
	}


	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
	}

	@Override
	public boolean deletePerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_PERSON, person.getId()) > 0;
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getId(), person.getFirstName(), person.getLastName(), person.getAge()) > 0;
	}

	
	

}
