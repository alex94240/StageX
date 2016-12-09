package com.stagex.bean;

import com.stagex.annotation.*;

@Entity("webuser")
public class WebUser {
	@Id("userId")
	private int userId;
	
	@Id("userName")
	private String userName;
	
	@Column("password")
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
