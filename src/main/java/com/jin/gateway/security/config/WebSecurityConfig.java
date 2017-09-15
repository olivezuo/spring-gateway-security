package com.jin.gateway.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.jin.gateway.security.core.WebAuthenticationProvider;
import com.jin.gateway.security.core.WebRequestHeaderAuthenticationFilter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	WebAuthenticationProvider webAuthenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		//.addFilterBefore(webRequestHeaderAuthenticationFilter(), RequestHeaderAuthenticationFilter.class)
        .antMatcher("/**")
        .authorizeRequests()
        	.antMatchers("/beans").permitAll()
            .anyRequest().authenticated()
            .and()
        .csrf()
        	.disable();

	}

	@Bean
	public WebRequestHeaderAuthenticationFilter webRequestHeaderAuthenticationFilter() throws Exception {
		WebRequestHeaderAuthenticationFilter filter = new WebRequestHeaderAuthenticationFilter();
		filter.setAuthenticationManager(authenticationManager());
		return filter;
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(webAuthenticationProvider);
	}
}
