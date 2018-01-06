package com.persondet.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persondet.dao.PersonDAO;
import com.persondet.model.Person;

@Service	
public class PersonServiceImpl implements PersonService{

	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	@Transactional
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
		
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		personDAO.updatePerson(p);
		
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return personDAO.listPersons();
		
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		
		return personDAO.getPerson(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		personDAO.removePerson(id);
		
	}

}
