package com.mj.hospitalapp.controller.address;
import com.mj.hospitalapp.dto.Address;
import com.mj.hospitalapp.serivce.AddressService;

public class SaveAddress {
	public static void main(String[] args) {
		AddressService service = new AddressService();
		Address address = new Address();
		address.setStreet("fake st.");
		address.setCountry("India");
		address.setState("kerala");
		address.setPin(679579);
		service.SaveAddress(3, address);
	}

}
