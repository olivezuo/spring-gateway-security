package com.jin.gateway.security.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter;

public class WebRequestHeaderAuthenticationFilter extends RequestHeaderAuthenticationFilter {
	/*
	 * We did not use this class. We leave it here to show how we can handle the Request Header 
	 */
	private boolean allowPreAuthenticatedPrincipals = true;
	
	public WebRequestHeaderAuthenticationFilter () {
		super();
		this.setPrincipalRequestHeader("SM_USER");
		this.setExceptionIfHeaderMissing(false);
	}

	@Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        String userName = (String) (super.getPreAuthenticatedPrincipal(request));
        if (userName == null || userName.trim().equals("")) {
            return userName;
        }

        return userName;
    }

    public boolean isAllowPreAuthenticatedPrincipals() {
        return allowPreAuthenticatedPrincipals;
    }

}
