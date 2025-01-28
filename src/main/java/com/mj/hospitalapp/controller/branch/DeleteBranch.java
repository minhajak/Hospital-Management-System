package com.mj.hospitalapp.controller.branch;

import com.mj.hospitalapp.serivce.BranchService;

public class DeleteBranch {

	public static void main(String[] args) {
		BranchService service = new BranchService();
		service.deleteBranch(2);
	}
}
