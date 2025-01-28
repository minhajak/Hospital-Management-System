package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.EncounterDao;
import com.mj.hospitalapp.dao.imp.EncounterDaoImp;
import com.mj.hospitalapp.dto.Encounter;

public class EncounterService {
	EncounterDao daoImp = new EncounterDaoImp();

	public void SaveEncounter(int bid, Encounter encounter) {
		Encounter encounter1 = daoImp.saveEncounter(bid, encounter);
		if (encounter1 != null) {
			System.out.println("encounter details saved successfully");
		} else {
			System.out.println("failed to save encounter details");
		}

	}

	public void deleteEncounter(int eid) {
		boolean flag = daoImp.deleteEncounterById(eid);
		if (flag) {
			System.out.println("encounter details deleted successfully");
		} else {
			System.out.println("failed to delete encounter details");
		}
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		Encounter encounter1 = daoImp.updateEncounterById(eid, encounter);
		if (encounter1 != null) {
			System.out.println("encounter details updated successfully");
			return encounter1;
		} else {
			System.out.println("failed to update encounter details");
			return null;
		}
	}

	public Encounter getEncounterById(int eid) {
		Encounter encounter = daoImp.getEncounterById(eid);
		if (encounter != null) {
			return encounter;
		} else {
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		List<Encounter> encounters = daoImp.getAllEncounters();
		if (encounters != null) {
			return encounters;
		} else {
			return null;
		}
	}

}
