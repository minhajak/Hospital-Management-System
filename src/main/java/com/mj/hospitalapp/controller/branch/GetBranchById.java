package com.mj.hospitalapp.controller.branch;

import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.serivce.BranchService;

public class GetBranchById {
	public static void main(String[] args) {
		BranchService service = new BranchService();
		Branch branch= service.getBranchById(3);
		System.out.println("id :"+branch.getBid());
		System.out.println("name :"+branch.getName());
		System.out.println("phone :"+branch.getPhone());
		System.out.println("hospital name :"+branch.getHospital());
		System.out.println("address :"+branch.getAddress());
		System.out.println("email :"+branch.getEmail());
		
	}

}
