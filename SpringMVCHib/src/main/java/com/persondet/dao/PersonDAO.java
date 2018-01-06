package com.persondet.dao;

import java.util.List;

import com.persondet.model.Person;

public interface PersonDAO {
	
	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPerson(int id);
	public void removePerson(int id);
	

}
