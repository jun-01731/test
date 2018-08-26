package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ProductRegistrationDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ProductRegistrationCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int stock;
	public Map<String, Object> session;

	private ProductRegistrationDAO dao = new ProductRegistrationDAO();

	public String execute() throws SQLException{
		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(stock);
		//sessionに詰めたものはobject型なのでtoStringする
		String name = session.get("itemName").toString();
		//integerはString型でないと使えない
		int intPrice = Integer.parseInt(session.get("itemPrice").toString());
		int intStock = Integer.parseInt(session.get("stock").toString());

		boolean result = dao.productRegist(name, intPrice, intStock);
		//resultにはtrueかfalseが入ってる
		if (result) {
			return SUCCESS;
		}else {
			return ERROR;
		}
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
