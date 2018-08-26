package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	public String execute() {
		String result = "login";
		//ログイン済み判定（すでにログインしている場合はログイン認証画面に遷移させないで、商品画面へ遷移させる）
			//sessionに"id"というkeyが含まれていたら👈このidってなに？？？？
		if(session.containsKey("id")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			//DBから取得した商品情報をセッションに格納
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	//Mapのgetメソッドでkeyから値を取り出します
	//if()をするため？？
	public Map<String, Object> getSession(){
		return this.session;
	}

}
