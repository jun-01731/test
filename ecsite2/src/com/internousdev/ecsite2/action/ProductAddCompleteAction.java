package com.internousdev.ecsite2.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.ProductAddCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAddCompleteAction extends ActionSupport implements SessionAware{
	private String itemName;
	private int itemPrice;
	private int stock;
	private Map<String, Object> session;

	public String execute() throws SQLException{
		ProductAddCompleteDAO dao = new ProductAddCompleteDAO();
		dao.productAdd(itemName, itemPrice, stock);
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
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
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
