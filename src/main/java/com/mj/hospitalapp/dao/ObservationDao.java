package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.Observation;

public interface ObservationDao {

	Observation saveObservation(int eid, Observation rObservation);

	boolean deleteObservationById(int oid);

	Observation updateObservationById(int oid, Observation rObservation);

	Observation getObservationById(int oid);

	List<Observation> getAllObservations();

	List<Observation> getObservationByDoctorName(String doctorName);

}
