package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserAddConfirmAction extends ActionSupport implements SessionAware{
	private String loginId;
	private String loginPass;
	private String userName;
	public Map<String, Object> session;


	public String execute() {
		if(!(loginId.equals(""))
				&&!(loginPass.equals(""))
				&&!(userName.equals(""))) {
			session.put("loginId", loginId);
			session.put("loginPass", loginPass);
			session.put("userName", userName);
		}
		return SUCCESS;

	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
