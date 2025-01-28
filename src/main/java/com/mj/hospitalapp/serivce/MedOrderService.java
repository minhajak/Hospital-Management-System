package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.MedOrderDao;
import com.mj.hospitalapp.dao.imp.MedOrderDaoImp;
import com.mj.hospitalapp.dto.MedOrder;

public class MedOrderService {
	MedOrderDao daoImp = new MedOrderDaoImp();

	public void saveMedOrder(int eid, MedOrder medOrder) {
		MedOrder medOrder1 = daoImp.saveMedOrder(eid, medOrder);
		if (medOrder1 != null) {
			System.out.println("MedOrder details saved successfully");
		} else {
			System.out.println("failed to save MedOrder details");
		}

	}

	public void deleteMedOrder(int mid) {
		boolean flag = daoImp.deleteMedOrderById(mid);
		if (flag) {
			System.out.println("MedOrder details deleted successfully");
		} else {
			System.out.println("failed to delete MedOrder details");
		}
	}

	public MedOrder updateMedOrder(int oid, MedOrder medOrder) {
		MedOrder medOrder1 = daoImp.updateMedOrderById(oid, medOrder);
		if (medOrder1 != null) {
			System.out.println("MedOrder details updated successfully");
			return medOrder1;
		} else {
			System.out.println("failed to update MedOrder details");
			return null;
		}

	}

	public MedOrder getMedOrderById(int mid) {
		MedOrder medOrder = daoImp.getMedOrderById(mid);
		if(medOrder!=null) {
			return medOrder;
		}
		else {
			return null;
		}
	}

	public List<MedOrder> getMedOrderByDoctorName(String doctorName) {
		List<MedOrder> medOrders = daoImp.getMedOrderByDocorName(doctorName);
		if(medOrders!=null) {
			return medOrders;
		}
		else {
			return null;
		}
	}
	public List<MedOrder> getMedOrderByOrderDate(String orderDate){
		List<MedOrder> medOrders = daoImp.getMedOrderByOrderDate(orderDate);
		if(medOrders!=null) {
			return medOrders;
		}
		else {
			return null;
		}
	}
	public List<MedOrder> getAllMedOrder(){
		List<MedOrder> medOrders = daoImp.getAllMedOrders();
		if(medOrders!=null) {
			return medOrders;
		}
		else {
			return null;
		}
	}

}
