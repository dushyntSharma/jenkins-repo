package com.code.EngineeringCodingChallenge.model;

public class Item {

	private int id;
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", purchase=" + purchase + ", sell=" + sell + "]";
	}

	private String name;
	private double purchase;
	private double sell;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double purchase, double sell) {
		super();
		this.id = id;
		this.name = name;
		this.purchase = purchase;
		this.sell = sell;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}

}
