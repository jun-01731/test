package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserInfoDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoAllAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private UserInfoDAO dao = new UserInfoDAO();
	private ArrayList<LoginDTO> userList = new ArrayList<LoginDTO>();

	private String loginId;
	private String loginPassword;
	private String userName;




	public String execute() throws SQLException{

//		if(!session.containsKey("userList")) {
			userList = dao.getUserInfo();
			session.put("userList", userList);
//		}
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<LoginDTO> getUserList(){
		return userList;
	}
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPass() {
		return loginPassword;
	}

	public void setLoginPass(String loginPass) {
		this.loginPassword = loginPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
