package com.jin.auth.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import com.jin.data.jpa.JPAConfig;

@Configuration
public class AuthJpaConfig extends JPAConfig {

	@Override
	@PostConstruct
	public void init() {
		this.entityPackages = new String[]{"com.jin.auth.domain","com.jin.auth.entity"};

	}

}
