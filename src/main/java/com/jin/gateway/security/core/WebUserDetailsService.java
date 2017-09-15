package com.jin.gateway.security.core;

import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class WebUserDetailsService implements AuthenticationUserDetailsService<PreAuthenticatedAuthenticationToken> {

	
	@Override
	public UserDetails loadUserDetails(PreAuthenticatedAuthenticationToken authentication) throws UsernameNotFoundException {
		/*
		 * This is a special case. We are not doing Authentication in Gateway layer. Gateway will use the 
		 * x-auth-token header to look for the session from the redis session server. Which is shared with the Web Layer.
		 */
		throw new UsernameNotFoundException("User not allowed");
		
	}


}
