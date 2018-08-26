package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ProductDAO;
import com.internousdev.ecsite.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAllAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;

	private ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();

	private ProductDAO dao = new ProductDAO();

	public String execute() throws SQLException{


//		if(!session.containsKey("productList")) {
			productList = dao.getProductInfo();
			session.put("productList", productList);
//		}

		String result = SUCCESS;
		return result;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ProductDTO> getProductList() {
		return this.productList;
		}




}
