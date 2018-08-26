package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ProductDAO;
import com.internousdev.ecsite.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAllDeleteAction extends ActionSupport implements SessionAware{
	// ここにDAOとかListとか
	private ProductDAO dao = new ProductDAO();
	private ArrayList<ProductDTO> productList = new ArrayList<ProductDTO>();
	private String message;

	private Map<String, Object> session;

	public String execute() throws SQLException {
		System.out.println("delete");

		int res = dao.productDelete();
		if(res>0) {
			setProductList(null);
			setMessage("商品情報を削除しました");
		}else if(res == 0) {
			setMessage("商品情報の削除に失敗しました");
		}
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<ProductDTO> productList) {
		this.productList = productList;
	}

}
