package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.ItemDao;
import com.mj.hospitalapp.dao.imp.ItemDaoImp;
import com.mj.hospitalapp.dto.Item;

public class ItemService {
	ItemDao daoImp = new ItemDaoImp();
	public void saveItem(int mid,Item item) {
		Item item1 = daoImp.saveItem(mid, item);
		if (item1 != null) {
			System.out.println("item saved successfully");
		} else {
			System.out.println("failed to save item");
		}
		
	}
	public void deleteItem(int iid) {
		boolean flag = daoImp.deleteItemById(iid);
		if (flag) {
			System.out.println("item details deleted successfully");
		} else {
			System.out.println("failed to delete item details");
		}
	}
	public Item updateItem(int iid,Item item) {
		Item item1 = daoImp.updateItemById(iid, item);
		if (item1 != null) {
			System.out.println("item details updated successfully");
			return item1;
		} else {
			System.out.println("failed to update item details");
			return null;
		}
	}
	public Item getItemById(int iid) {
		Item item = daoImp.getItemById(iid);
		if(item!=null) {
			return item;
		}
		else {
			return null;
		}
	}
	public List<Item> getAllItem() {
		List<Item> items = daoImp.getAllItems();
		if(items!=null) {
			return items;
		}
		else {
			return null;
		}
	}
	

}
