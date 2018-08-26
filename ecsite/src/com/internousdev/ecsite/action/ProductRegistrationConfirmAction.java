package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ProductRegistrationConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int stock;
	private int itemId;
	public Map<String, Object> session;


	public String execute() {
		if(!(itemName.equals(""))
				&&!(itemPrice ==0)
				&&!(stock == 0) ){
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);
			session.put("stock", stock);
			session.put("itemId", itemId);}

		return SUCCESS;
	}


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
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}





}

