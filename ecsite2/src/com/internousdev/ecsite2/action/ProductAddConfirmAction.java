package com.internousdev.ecsite2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAddConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String stock;
	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		if(!(itemName.equals(""))
				&&!(itemPrice.equals(""))
				&&!(stock.equals(""))) {
			session.put("itemName", itemName);
			session.put("itemPrice", itemPrice);
			session.put("stock", stock);
		}
		return result;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice  = itemPrice;
	}

	public String stock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
