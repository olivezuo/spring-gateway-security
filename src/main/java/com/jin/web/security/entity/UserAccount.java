package com.jin.web.security.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.jin.web.security.entity.siteminder.LoginResponse;

@Component
public class UserAccount implements Serializable{
	
	private static final long serialVersionUID = -5022480050101026322L;
	private String username;
	private String password;
	private LoginResponse loginResponse;
	private boolean isValid = false;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginResponse getLoginResponse() {
		return loginResponse;
	}

	public void setLoginResponse(LoginResponse loginResponse) {
		this.loginResponse = loginResponse;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
}
