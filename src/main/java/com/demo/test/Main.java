package com.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Person;
import com.demo.spring.config.AppConfig;
import com.demo.spring.dao.PersonDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);
//		System.out.println("\nCreating person: ");
//		Person person = new Person(2L, 40, "Bleck", "Trwe");
//		boolean flag = personDAO.createPerson(person);
//		if (flag) {
//			System.out.println(person);
//		} else {
//		System.out.println("Error with query");
//		}

		
		  System.out.println("List of person is:");
		  
		  for (Person p : personDAO.getAllPersons()) { System.out.println(p); }
		 

		
//		  System.out.println("\nGet person with ID 6");
//		  
//		  Person personById = personDAO.getPersonById(6l);
//		  System.out.println(personById);
		 

		

		System.out.println("\nUpdate person with ID 4");

		Person pperson = personDAO.getPersonById(4l);

		pperson.setLastName("Black");
		personDAO.updatePerson(pperson);

		System.out.println("\nList of person is:");
		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

		
//		  System.out.println("\nDeleting person with ID 6"); if
//		  (personDAO.deletePerson(personDAO.getPersonById(6l))) {
//		  System.out.println("record deleted successfully"); }
		 

	}

}
