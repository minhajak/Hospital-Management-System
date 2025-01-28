package com.mj.hospitalapp.controller.hospital;

import com.mj.hospitalapp.dto.Hospital;
import com.mj.hospitalapp.serivce.HospitalService;

public class SaveHospital {

	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		Hospital hospital = new Hospital();
		hospital.setName("gmc");
		hospital.setWebisite("www.gmc.com");
		service.SaveHospital(hospital);
	}
}
