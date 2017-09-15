package com.jin.auth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jin.auth.domain.Groups;

public interface GroupsRepository extends PagingAndSortingRepository<Groups, Long> {

}
