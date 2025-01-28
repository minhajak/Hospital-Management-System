package com.mj.hospitalapp.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mj.hospitalapp.dao.AddressDao;
import com.mj.hospitalapp.dto.Address;
import com.mj.hospitalapp.dto.Branch;

public class AddressDaoImp implements AddressDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("minhaj");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Address saveAdrAddress(int bid, Address address) {
		Branch branch = entityManager.find(Branch.class, bid);

		if (branch != null) {
			address.setBranch(branch);
			branch.setAddress(address);
			entityTransaction.begin();
			entityManager.persist(address);
			entityManager.merge(branch);
			entityTransaction.commit();
			return address;
		} else {
			return null;
		}
	}

	@Override
	public Address updateAddressById(int aid, Address address) {
		Address address1 = entityManager.find(Address.class, aid);
		if (address1 != null) {
			address1.setStreet(address.getStreet());
			address1.setCountry(address.getCountry());
			address1.setState(address.getState());
			address1.setPin(address.getPin());

			entityTransaction.begin();
			entityManager.merge(address1);
			entityTransaction.commit();
			return address1;

		} else {
			return null;
		}
	}

	@Override
	public boolean deleteAddressById(int aid) {
		Address address = entityManager.find(Address.class, aid);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Address> getAllAddresses() {
		Query query = entityManager.createQuery("select e from Address e");
		List<Address> addresses = query.getResultList();
		return addresses;
	}

	@Override
	public Address getAddressById(int aid) {
		Address address = entityManager.find(Address.class, aid);
		return address;
	}

}
