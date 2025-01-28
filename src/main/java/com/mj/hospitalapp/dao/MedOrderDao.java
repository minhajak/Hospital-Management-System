package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.MedOrder;

public interface MedOrderDao {

	MedOrder saveMedOrder(int eid, MedOrder medOrder);

	boolean deleteMedOrderById(int mid);

	MedOrder updateMedOrderById(int mid, MedOrder medOrder);

	MedOrder getMedOrderById(int mid);

	List<MedOrder> getAllMedOrders();

	List<MedOrder> getMedOrderByDocorName(String doctorName);

	List<MedOrder> getMedOrderByOrderDate(String orderDate);

}
