package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.Item;

public interface ItemDao {

	Item saveItem(int mid, Item item);

	boolean deleteItemById(int iid);

	Item updateItemById(int iid,Item item);

	Item getItemById(int iid);

	List<Item> getAllItems();
}
