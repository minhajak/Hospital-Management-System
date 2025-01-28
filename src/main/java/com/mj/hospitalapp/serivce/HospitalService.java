package com.mj.hospitalapp.serivce;

import com.mj.hospitalapp.dao.HospitalDao;
import com.mj.hospitalapp.dao.imp.HospitalDaoImp;
import com.mj.hospitalapp.dto.Hospital;

public class HospitalService {
	HospitalDao daoImp = new HospitalDaoImp();
	public void SaveHospital(Hospital hospital) {
		Hospital hospital1 = daoImp.saveHospital(hospital);
		if (hospital1 != null) {
			System.out.println("Hospital details saved successfully");
		} else {
			System.out.println("failed details to save hospital");
		}

	}

	public void deleteHospital(int hid) {
		boolean flag = daoImp.deleteHospitalById(hid);
		if (flag) {
			System.out.println("hospital details deleted successfully");
		} else {
			System.out.println("failed to delete hospital details");
		}
	}

	public Hospital updateHospital(int hid, Hospital hospital) {
		Hospital hospital2 = daoImp.updateHospitalById(hid, hospital);
		if (hospital2 != null) {
			System.out.println("hospital details updated successfully");
			return hospital2;
		} else {
			System.out.println("failed to update hospital details");
			return null;
		}
	}
	public Hospital getHospitalById(int hid) {
		Hospital hospital =  daoImp.getHospitalById(hid);
		if(hospital!=null) {
			return hospital;
		}
		else {
			return null;
		}
	}
	
	

}
