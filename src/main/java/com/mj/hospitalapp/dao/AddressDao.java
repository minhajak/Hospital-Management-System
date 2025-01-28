package com.mj.hospitalapp.dao;

import java.util.List;


import com.mj.hospitalapp.dto.Address;


public interface AddressDao {
	
	Address saveAdrAddress(int bid, Address address);

	Address updateAddressById(int aid, Address address);

	boolean deleteAddressById(int aid);

	List<Address> getAllAddresses();

	Address getAddressById(int aid);

}
