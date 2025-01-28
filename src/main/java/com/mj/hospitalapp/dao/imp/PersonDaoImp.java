package com.mj.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.PersonDao;
import com.mj.hospitalapp.dto.Encounter;
import com.mj.hospitalapp.dto.Person;

public class PersonDaoImp implements PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Person savePerson(int eid, Person person) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		} else {
			return null;
		}
	}

	@Override
	public Person updatePersonById(int pid, Person person) {
		Person person1 = entityManager.find(Person.class, pid);
		if (person1 != null) {

			person1.setName(person.getName());
			person1.setAge(person.getAge());
			person1.setGender(person.getGender());
			person1.setEmail(person.getEmail());
			person1.setPhno(person.getPhno());
			person1.setAddress(person.getAddress());
			person1.setDateOfBirth(person.getDateOfBirth());

			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		return null;
	}

	@Override
	public boolean deletePersonById(int pid) {
		Person person = entityManager.find(Person.class, pid);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();

			return true;
		}
		return false;
	}

	@Override
	public Person getPersonById(int pid) {
		Person person = entityManager.find(Person.class, pid);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		Query query = entityManager.createQuery("select s from Person s");
		List<Person> persons = query.getResultList();
		return persons;

	}

	@Override
	public List<Person> getPersonByGender(String gender) {
		Query query = entityManager.createQuery("select s from Person s where s.gender=?1");
		query.setParameter(1, gender);
		List<Person> persons = query.getResultList();
		return persons;
	}

	@Override
	public List<Person> getPersonByAge(int age) {
		Query query = entityManager.createQuery("select s from Person s where s.age=?1");
		query.setParameter(1, age);
		List<Person> persons = query.getResultList();
		return persons;
	}

	@Override
	public List<Person> getPersonByPhone(long phno) {
		Query query = entityManager.createQuery("select s from Person s where s.phno=?1");
		query.setParameter(1, phno);
		List<Person> persons = query.getResultList();
		return persons;
	}

}
