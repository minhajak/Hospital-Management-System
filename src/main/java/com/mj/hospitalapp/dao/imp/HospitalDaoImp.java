package com.mj.hospitalapp.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mj.hospitalapp.dao.HospitalDao;
import com.mj.hospitalapp.dto.Hospital;

public class HospitalDaoImp implements HospitalDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Hospital saveHospital(Hospital hospital) {
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		
		return hospital;
	}
	
	@Override
	public Hospital getHospitalById(int hid) {
		
		Hospital hospital = entityManager.find(Hospital.class, hid);
		return hospital;
	}

	@Override
	public boolean deleteHospitalById(int hid) {
		Hospital hospital = entityManager.find(Hospital.class, hid);
		
		if (hospital != null) {
			
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			
			return true;
		} else {
			
			return false;
		}
	}

	@Override
	public Hospital updateHospitalById(int hid, Hospital hospital) {
		Hospital hospital1 = entityManager.find(Hospital.class, hid);
		
		if(hospital1!=null) {
			
			hospital1.setName(hospital.getName());
			hospital1.setWebisite(hospital.getWebisite());
			
			entityTransaction.begin();
			entityManager.merge(hospital1);
			entityTransaction.commit();
			
			return hospital1;
		}
		else {
			return null;
		}
		
	}
	

}
