package com.mj.hospitalapp.controller.hospital;

import com.mj.hospitalapp.serivce.HospitalService;

public class DeleteHospital {
	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		service.deleteHospital(3);
	}

}
