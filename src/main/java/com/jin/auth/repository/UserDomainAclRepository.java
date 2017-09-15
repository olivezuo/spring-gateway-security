package com.jin.auth.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.jin.auth.entity.UserDomainAcl;
import com.jin.data.datasource.TargetDataSource;

@Component
public class UserDomainAclRepository  {
	
	@PersistenceContext
    private EntityManager em;

	@TargetDataSource(value="master")
	public List<UserDomainAcl> getUserDomainAcl(String userName, String domainClass){
		List<UserDomainAcl> uoas = em.createNamedQuery("UserAcl.findByUserIdAndDomainClassName").setParameter("userName", userName).setParameter("domainClass", domainClass).getResultList();
		return uoas;
	}


}
