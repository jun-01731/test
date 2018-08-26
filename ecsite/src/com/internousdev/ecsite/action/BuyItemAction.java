package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private int count;
	private String pay;

	public String execute() {
		String result = ERROR;
		session.put("count", count);
		//int n = Integer.parseInt(①);👈文字列①を数字に変換
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price", intCount * intPrice);
		String payment;
		if(pay.equals("1")) {
			payment = "現金払い";
			session.put("pay", payment);
		}else {
			payment = "クレジットカード";
			session.put("pay", payment);
		}
		result = SUCCESS;
		return result;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
