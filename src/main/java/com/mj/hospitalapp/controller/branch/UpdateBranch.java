package com.mj.hospitalapp.controller.branch;

import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.serivce.BranchService;

public class UpdateBranch {
	public static void main(String[] args) {
		BranchService service = new BranchService();
		Branch branch = new Branch();
		branch.setEmail("www.renaipala.com");
		branch.setName("renaipala");
		branch.setPhone(987654323456l);

		Branch branch2 = service.updateBranch(3, branch);
		System.out.println(branch2);

	}

}
