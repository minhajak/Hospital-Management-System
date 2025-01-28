package com.mj.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.ObservationDao;
import com.mj.hospitalapp.dto.Encounter;
import com.mj.hospitalapp.dto.Observation;

public class ObservationDaoImp implements ObservationDao{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	@Override
	public Observation saveObservation(int eid, Observation observation) {
		Encounter encounter= entityManager.find(Encounter.class, eid);

		if (encounter != null) {
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteObservationById(int oid) {
		Observation observation = entityManager.find(Observation.class, oid);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public Observation updateObservationById(int oid, Observation observation) {
		Observation observation1 = entityManager.find(Observation.class, oid);
		if (observation1 != null) {
			observation1.setDoctorName(observation.getDoctorName());
			observation1.setRobservation(observation.getRobservation());

			entityTransaction.begin();
			entityManager.merge(observation1);
			entityTransaction.commit();

			return observation1;

		} else {
			return null;
		}
	}

	@Override
	public Observation getObservationById(int oid) {
		Observation observation = entityManager.find(Observation.class,oid);
		return observation;
	}

	@Override
	public List<Observation> getAllObservations() {
		Query query = entityManager.createQuery("select o from  Observation o ");
		List<Observation> observations = query.getResultList();
		return observations;
	}

	@Override
	public List<Observation> getObservationByDoctorName(String doctorName) {
		Query query = entityManager.createQuery("select o from Observation where o.doctorName=?1");
		query.setParameter(1, doctorName);
		List<Observation> observations = query.getResultList();
		return observations;
	}

}
