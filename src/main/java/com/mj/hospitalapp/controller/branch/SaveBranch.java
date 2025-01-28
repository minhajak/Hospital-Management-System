package com.mj.hospitalapp.controller.branch;

import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.serivce.BranchService;

public class SaveBranch {
	public static void main(String[] args) {

		BranchService service = new BranchService();
		Branch branch = new Branch();
		branch.setEmail("renaipalarivattom@gmail.com");
		branch.setName("renai-palarivattom");
		branch.setPhone(9876534567l);

		
		service.SaveBranch(1, branch);
	}

}
