package com.mj.hospitalapp.controller.hospital;

import com.mj.hospitalapp.dto.Hospital;
import com.mj.hospitalapp.serivce.HospitalService;

public class UpdateHospital {
	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		Hospital hospital = new Hospital();
		hospital.setName("royal medicines");
		hospital.setWebisite("www.royal.com");

		Hospital hospital2 = service.updateHospital(2, hospital);
		
		System.out.println(hospital2);

	}
}