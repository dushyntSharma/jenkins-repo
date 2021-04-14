package com.code.EngineeringCodingChallenge.service;

import java.util.List;

import com.code.EngineeringCodingChallenge.model.Item;



public class ItemServiceImpl implements ItemService {
	static ItemDao dao = new ItemDaoImpl();

	public List<Item> displayShopDetails() {
		// TODO Auto-generated method stub
		List<Item> shop = dao.displayShopDetails();
		return shop;
	}


	public String addShopDetails(List<Item> item) {
		String s = null;
		try {
			s = dao.addShopdetails(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}



	public String addShopDetails(List<Item> item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
