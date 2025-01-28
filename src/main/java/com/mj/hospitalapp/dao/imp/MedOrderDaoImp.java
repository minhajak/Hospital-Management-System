package com.mj.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.MedOrderDao;
import com.mj.hospitalapp.dto.Encounter;
import com.mj.hospitalapp.dto.MedOrder;

public class MedOrderDaoImp implements MedOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public MedOrder saveMedOrder(int eid, MedOrder medOrder) {
		
		Encounter encounter = entityManager.find(Encounter.class, eid);
		
		if (encounter != null) {
			
			entityTransaction.begin();
			entityManager.persist(medOrder);
			entityTransaction.commit();

			return medOrder;
		}
		return null;
	}

	@Override
	public boolean deleteMedOrderById(int mid) {
		
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		
		if (medOrder != null) {
																																																																																																																																																																																																																																																																										
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();

			return true;
		} else {
			return false;
		}
	}

	@Override
	public MedOrder updateMedOrderById(int mid, MedOrder medOrder) {
		MedOrder medOrder1 = entityManager.find(MedOrder.class, mid);
		if(medOrder1!=null) {
			
			medOrder1.setDoctorName(medOrder.getDoctorName());
			medOrder1.setOrderDate(medOrder.getOrderDate());
			
			entityTransaction.begin();
			entityManager.merge(medOrder1);
			entityTransaction.commit();
			
			return medOrder1;
		}
		else {
			return null;
		}
	}

	@Override
	public MedOrder getMedOrderById(int mid) {
		MedOrder medOrder = entityManager.find(MedOrder.class, mid);
		return medOrder;
	}

	@Override
	public List<MedOrder> getAllMedOrders() {
		Query query = entityManager.createQuery("select s from MedOrder s");
		List<MedOrder> medOrders = query.getResultList();
		return medOrders;
	}

	@Override
	public List<MedOrder> getMedOrderByDocorName(String doctorName) {
		Query query = entityManager.createQuery("select s from MedOrder s where s.doctorName=?1");
		query.setParameter(1, doctorName);
		List<MedOrder> medOrders = query.getResultList();
		return medOrders;
	}

	@Override
	public List<MedOrder> getMedOrderByOrderDate(String orderDate) {
		Query query = entityManager.createQuery("select s from MedOrder s where s.orderDate=?1");
		query.setParameter(1, orderDate);
		List<MedOrder> medOrders = query.getResultList();
		return medOrders;
	}

}
