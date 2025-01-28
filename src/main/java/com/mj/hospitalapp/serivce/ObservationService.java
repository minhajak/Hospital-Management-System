package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.ObservationDao;
import com.mj.hospitalapp.dao.imp.ObservationDaoImp;
import com.mj.hospitalapp.dto.Observation;

public class ObservationService {
	ObservationDao daoImp = new ObservationDaoImp();
	
	public void SaveObservation(int eid,Observation observation) {
		Observation observation1 = daoImp.saveObservation(eid, observation);
		if(observation1!=null) {
			System.out.println("observation details saved successfully");
		}
		else {
			System.out.println("failed to save observation details");
		}
		
	}
	public void deleteObservation(int oid) {
		boolean flag = daoImp.deleteObservationById(oid);
		if (flag) {
			System.out.println("observation details deleted succcessfully");
		} else {
			System.out.println("failed to delete observation details");
		}
	}
	public Observation updateObservation(int oid,Observation observation) {
		Observation observation1 = daoImp.updateObservationById(oid, observation);
		if (observation1 != null) {
			System.out.println("observation details updated successfully");
			return observation1;
		} else {
			System.out.println("failed to update observation details");
			return null;
		}
		
	}
	public Observation getObservationById(int oid) {
		Observation observation = daoImp.getObservationById(oid);
		if(observation!=null) {
			return observation;
		}
		else {
			return null;
		}
	}
	public List<Observation> getAllObservation(){
		List<Observation> observations = daoImp.getAllObservations();
		if(observations!=null) {
			return observations;
		}
		else {
			return null;
		}
	}
	public List<Observation> getObservationByDoctorName(String doctorName){
		List<Observation> observations = daoImp.getObservationByDoctorName(doctorName);
		if(observations!=null) {
			return observations;
		}
		else {
			return null;
		}
	}

}
