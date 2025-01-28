package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.BranchDao;
import com.mj.hospitalapp.dao.imp.BranchDaoImp;
import com.mj.hospitalapp.dto.Branch;

public class BranchService {
	BranchDao daoImp = new BranchDaoImp();

	public void SaveBranch(int hid, Branch branch) {
		Branch branch2 = daoImp.saveBranch(hid, branch);
		if (branch2 != null) {
			System.out.println("branch data saved successfully");
		} else {
			System.out.println("failed to save branch data");
		}

	}

	public void deleteBranch(int bid) {
		boolean flag = daoImp.deleteBranchById(bid);
		if (flag) {
			System.out.println("branch data deleted successfully");
		} else {
			System.out.println("failed to delete branch data");
		}
	}

	public Branch updateBranch(int bid, Branch branch) {
		Branch branch2 = daoImp.updateBranchById(bid, branch);
		if (branch2 != null) {
			System.out.println("branch data updated successfully");
			return branch2;
		} else {
			System.out.println("failed to update branch data");
			return null;
		}
	}

	public Branch getBranchById(int bid) {
		Branch branch = daoImp.getBranchById(bid);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}
	}

	public List<Branch> getAllBranchs() {
		List<Branch> branchs = daoImp.getAllBranches();
		if (branchs != null) {
			return branchs;
		} else {
			return null;
		}
	}

}
