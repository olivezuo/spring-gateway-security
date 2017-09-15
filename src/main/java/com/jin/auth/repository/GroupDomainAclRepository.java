package com.jin.auth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jin.auth.domain.GroupDomainAcl;

public interface GroupDomainAclRepository extends PagingAndSortingRepository<GroupDomainAcl, Long> {

}
