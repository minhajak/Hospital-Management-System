package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.PersonDao;
import com.mj.hospitalapp.dao.imp.PersonDaoImp;
import com.mj.hospitalapp.dto.Person;

public class PersonService {
	PersonDao daoImp = new PersonDaoImp();
	public void savePerson(int eid,Person person) {
		Person person1 = daoImp.savePerson(eid, person);
		if (person1 != null) {
			System.out.println("person details saved successfully");
		} else {
			System.out.println("failed to save person details");
		}
	}
	public void deletePerson(int pid) {
		boolean flag = daoImp.deletePersonById(pid);
		if (flag) {
			System.out.println("person details deleted successfully");
		} else {
			System.out.println("failed to delete person details");
		}
	}
	public Person updatePerson(int pid,Person person) {
		Person person1 = daoImp.updatePersonById(pid, person);
		if (person1 != null) {
			System.out.println("person details updated successfully");
			return person1;
		} else {
			System.out.println("failed to update person details");
			return null;
		}
	}
	public Person getUserById(int pid) {
		Person person = daoImp.getPersonById(pid);
		if(person!=null) {
			return person;
		}
		else {
			return null;
		}
	}
	public List<Person> getAllPerson(){
		List<Person> persons = daoImp.getAllPersons();
		if(persons!=null) {
			return persons;
		}
		else {
			return null;
		}
	}
	public List<Person> getPersonByGender(String gender){
		List<Person> persons = daoImp.getPersonByGender(gender);
		if(persons!=null) {
			return persons;
		}
		else {
			return null;
		}
	}
	public List<Person> getPersonByAge(int age){
		List<Person> persons = daoImp.getPersonByAge(age);
		if(persons!=null) {
			return persons;
		}
		else {
			return null;
		}
	}
	public List<Person> getPersonByPhone(long phno){
		List<Person> persons = daoImp.getPersonByPhone(phno);
		if(persons!=null) {
			return persons;
		}
		else {
			return null;
		}
	}

}
