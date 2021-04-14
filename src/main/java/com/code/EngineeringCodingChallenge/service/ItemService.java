package com.code.EngineeringCodingChallenge.service;

import java.util.List;

import com.code.EngineeringCodingChallenge.model.Item;

public interface ItemService {

	List<Item> displayShopDetails();

	String addShopDetails(List<Item> item);

}
