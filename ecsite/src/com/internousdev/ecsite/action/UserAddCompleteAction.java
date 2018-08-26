package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserAddCompleteAction extends ActionSupport implements SessionAware{

	private String loginId;
	private String loginPass;
	private String userName;
	public Map<String, Object> session;
	private UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

	public String execute() throws SQLException{
		dao.createUser(session.get("loginId").toString(),
				session.get("loginPass").toString(),
				session.get("userName").toString());
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
