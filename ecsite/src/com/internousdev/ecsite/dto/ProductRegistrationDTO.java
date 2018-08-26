package com.internousdev.ecsite.dto;

public class ProductRegistrationDTO {

	private String itemName;
	private int itemPrice;
	private int stock;


	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int price) {
		this.itemPrice = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
