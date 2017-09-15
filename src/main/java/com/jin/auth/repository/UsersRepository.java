package com.jin.auth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jin.auth.domain.Users;

public interface UsersRepository extends PagingAndSortingRepository<Users, Integer> {

}
