package com.jin.gateway.security.core;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;
import org.springframework.stereotype.Component;

@Component
public class WebAuthenticationProvider extends PreAuthenticatedAuthenticationProvider {
	
	@Autowired
	WebUserDetailsService webUserDetailsService;


	@PostConstruct
	public void init() {
		this.setPreAuthenticatedUserDetailsService(webUserDetailsService);
	}
}
