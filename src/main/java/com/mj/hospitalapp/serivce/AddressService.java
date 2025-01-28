package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.AddressDao;
import com.mj.hospitalapp.dao.imp.AddressDaoImp;
import com.mj.hospitalapp.dto.Address;

public class AddressService {
	AddressDao daoImp = new AddressDaoImp();
	public void SaveAddress(int bid, Address address) {
		
		Address address1 = daoImp.saveAdrAddress(bid, address);
		if (address1 != null) {
			System.out.println("address details saved successfully");
		} else {
			System.out.println("unfortunatly, address details not saved");
		}

	}

	public void deleteAddress(int aid) {
		boolean flag = daoImp.deleteAddressById(aid);
		if (flag) {
			System.out.println("address details deleted successfully");
		} else {
			System.out.println("failed to delete the address details");
		}
	}

	public Address updateAddress(int aid, Address address) {
		Address address1 = daoImp.updateAddressById(aid, address);
		if (address1 != null) {
			System.out.println("address details updated successfully");
			return address1;
		} else {
			System.out.println("failed to update address details");
			return null;
		}
	}

	public Address getAddressById(int aid) {
		Address address = daoImp.getAddressById(aid);
		if (address != null) {
			return address;
		} else {
			return null;
		}
	}

	public List<Address> getAllAddresses() {
		List<Address> addresses = daoImp.getAllAddresses();
		if (addresses != null) {
			return addresses;
		} else {
			return null;
		}
	}

}
