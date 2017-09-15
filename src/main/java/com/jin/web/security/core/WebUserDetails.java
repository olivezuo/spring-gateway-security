package com.jin.web.security.core;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.jin.web.security.entity.UserAccount;

public class WebUserDetails extends User {
	
	private static final long serialVersionUID = -8987796455416435526L;
	private UserAccount userAccount;
		
	public WebUserDetails (UserAccount userAccount, List<GrantedAuthority> auth) {
		super(userAccount.getUsername(), userAccount.getPassword(), true, true, true, true, auth);
		this.userAccount = userAccount;		
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}
