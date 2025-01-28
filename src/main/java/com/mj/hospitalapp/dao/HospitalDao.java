package com.mj.hospitalapp.dao;

import com.mj.hospitalapp.dto.Hospital;

public interface HospitalDao {
	
	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int hid);

	boolean deleteHospitalById(int hid);

	Hospital updateHospitalById(int hid, Hospital hospital);

}
