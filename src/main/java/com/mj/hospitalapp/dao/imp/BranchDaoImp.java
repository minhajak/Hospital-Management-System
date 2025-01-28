package com.mj.hospitalapp.dao.imp;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.BranchDao;
import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.dto.Hospital;

public class BranchDaoImp implements BranchDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Branch saveBranch(int hid,Branch branch) {
		
		Hospital hospital = entityManager.find(Hospital.class, hid);

		if (hospital != null) {
			branch.setHospital(hospital);
			List<Branch> branchs=  hospital.getBranches();
			branchs.add(branch);
			entityTransaction.begin();
			entityManager.persist(branch);
			entityManager.merge(hospital);
			entityTransaction.commit();
			
			return branch;
		} else {
			return null;
		}

	}

	@Override
	public boolean deleteBranchById(int bid) {
		
		Branch branch = entityManager.find(Branch.class, bid);
		
		if (branch != null) {
			
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			
			return true;
		}
		return false;
	}

	@Override
	public Branch getBranchById(int bid) {
		Branch branch = entityManager.find(Branch.class, bid);
		if(branch!=null) {
			return branch;
		}
		else {
			return null;
		}
	}

	@Override
	public Branch updateBranchById(int bid, Branch branch) {
		Branch branch1 = entityManager.find(Branch.class, bid);
		if (branch1 != null) {
			branch1.setEmail(branch.getEmail());
			branch1.setName(branch.getName());
			branch1.setPhone(branch.getPhone());

			entityTransaction.begin();
			entityManager.merge(branch1);
			entityTransaction.commit();

			return branch1;

		} else {
			return null;
		}

	}

	@Override
	public List<Branch> getAllBranches() {
		
		Query query = entityManager.createQuery("select e from Branch e");
		List<Branch> branchs = query.getResultList();
		
		return branchs;
	}

}
