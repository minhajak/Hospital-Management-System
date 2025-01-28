package com.mj.hospitalapp.controller.hospital;

import com.mj.hospitalapp.dto.Hospital;
import com.mj.hospitalapp.serivce.HospitalService;

public class GetHospital {
	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		Hospital hospital =  service.getHospitalById(1);
		System.out.println("id :"+hospital.getHid());
		System.out.println("hospital name :"+hospital.getName());
		System.out.println("website :"+hospital.getWebisite());
	}

}
