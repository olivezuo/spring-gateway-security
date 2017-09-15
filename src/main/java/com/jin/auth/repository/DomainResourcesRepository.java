package com.jin.auth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jin.auth.domain.DomainResources;

public interface DomainResourcesRepository extends PagingAndSortingRepository<DomainResources, Long> {

}
