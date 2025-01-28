package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.Encounter;

public interface EncounterDao {
	
	Encounter saveEncounter(int bid, Encounter encounter);

	boolean deleteEncounterById(int eid);

	Encounter updateEncounterById(int eid,Encounter encounter);

	Encounter getEncounterById(int eid);

	List<Encounter> getAllEncounters();

}
