package com.demo.model;

public class Person {
	private Long id;
	private Integer age;
	private String firstName;
	private String lastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long id, Integer age, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
