package com.jin.gateway.security.core;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.jin.auth.entity.UserDomainAcl;
import com.jin.auth.service.UserDomainAclService;

@Component
public class DomainPermissionEvaluator implements PermissionEvaluator {

	@Autowired
	private ApplicationContext context;

	//@Autowired
	//UserDomainAclServiceImpl userDomainAclService;
	
	@Override
	public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
		if ((authentication == null) || (targetDomainObject == null) || !(permission instanceof String)){
            return false;
        }
		
		String domainClass = targetDomainObject.getClass().getSimpleName().toLowerCase();

		return hasPrivilege(authentication, domainClass, permission.toString().toLowerCase());
	}

	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType,
			Object permission) {
		if ((authentication == null) || (targetType == null) || !(permission instanceof String)){
            return false;
        }
	
		return hasPrivilege(authentication, targetType.toLowerCase(), permission.toString().toLowerCase());
	}
	
	private boolean hasPrivilege(Authentication authentication, String domainClass, String permission) {
		String userName = authentication.getName();
		
		UserDomainAclService userDomainAclService = context.getBean(UserDomainAclService.class);
		UserDomainAcl userDomainAcl =  userDomainAclService.getUserDomainAcl(userName, domainClass);
		
		switch (permission) {
		case "read":
			if (userDomainAcl.isAllowRead()) return true;
			break;
		case "create":
			if(userDomainAcl.isAllowCreate()) return true;
			break;
		case "update":
			if (userDomainAcl.isAllowUpdate()) return true;
			break;
		case "delete":
			if (userDomainAcl.isAllowDelete()) return true;
		default:
			break;
		} 
			
	    return false;

	//return true;	
	}

}
