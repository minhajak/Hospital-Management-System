package com.mj.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.EncounterDao;
import com.mj.hospitalapp.dto.Address;
import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.dto.Encounter;

public class EncounterDaoImp implements EncounterDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	@Override
	public Encounter saveEncounter(int bid, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, bid);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		} else {
			return null;
		}
	}
	@Override
	public boolean deleteEncounterById(int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	@Override
	public Encounter updateEncounterById(int eid, Encounter encounter) {
		Encounter encounter1 = entityManager.find(Encounter.class, eid);
		if (encounter1 != null) {
			encounter1.setDischarge(encounter.isDischarge());
			encounter1.setReason(encounter.getReason());
			encounter1.setDateOfJoining(encounter.getDateOfJoining());

			entityTransaction.begin();
			entityManager.merge(encounter1);
			entityTransaction.commit();

			return encounter1;

		} else {
			return null;
		}

	}
	@Override
	public Encounter getEncounterById(int eid) {
		Encounter encounter = entityManager.find(Encounter.class, eid);
		return encounter;
	}
	@Override
	public List<Encounter> getAllEncounters() {
		Query query = entityManager.createQuery("select s from Encounter s");
		List<Encounter> encounters = query.getResultList();
		return encounters;
	}

}
