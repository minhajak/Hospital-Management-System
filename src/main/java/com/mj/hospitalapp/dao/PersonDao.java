package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.Person;

public interface PersonDao {

	public Person savePerson(int eid,Person person);

	Person updatePersonById(int pid,Person person);

	boolean deletePersonById(int pid);

	Person getPersonById(int pid);

	List<Person> getAllPersons();

	List<Person> getPersonByGender(String gender);

	List<Person> getPersonByAge(int age);

	List<Person> getPersonByPhone(long phno);

}
