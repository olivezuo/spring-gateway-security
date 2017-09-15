package com.jin.auth.service;

import com.jin.auth.entity.UserDomainAcl;

public interface UserDomainAclService {

	public UserDomainAcl getUserDomainAcl(String userName, String domainClass);
}
