package com.mj.hospitalapp.controller.branch;

import java.util.List;

import com.mj.hospitalapp.dto.Branch;
import com.mj.hospitalapp.serivce.BranchService;

public class GetAllBranch {
	public static void main(String[] args) {
		BranchService service = new BranchService();
		
		List<Branch> branchs =	service.getAllBranchs();
		System.out.println("________________________________________________________");
		for (Branch branch : branchs) {
			System.out.println("id :"+branch.getBid());
			System.out.println("name :"+branch.getName());
			System.out.println("phone :"+branch.getPhone());
			System.out.println("hospital name :"+branch.getHospital().getName());
			System.out.println("address :"+branch.getAddress());
			System.out.println("email :"+branch.getEmail());
			System.out.println("________________________________________________________");
		}
	}

}
