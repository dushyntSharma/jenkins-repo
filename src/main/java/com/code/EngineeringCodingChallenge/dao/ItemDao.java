package com.code.EngineeringCodingChallenge.dao;

import java.util.List;

import com.code.EngineeringCodingChallenge.exceptions.ConnectionFailedException;
import com.code.EngineeringCodingChallenge.model.Item;

public interface ItemDao {

	List<Item> displayShopDetails();

	String addShopdetails(List<Item> item) throws ConnectionFailedException;

}
