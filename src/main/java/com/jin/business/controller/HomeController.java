package com.jin.business.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@PreAuthorize("hasPermission(#id, 'com.jin.user', 'read')")
	@RequestMapping("/api/testsuccess")
	public String testSuccess() {
		return "good";
	}

	@PreAuthorize("hasPermission(#id, 'com.jin.user', 'write')")
	@RequestMapping("/api/testfail")
	public String testFail() {
		
		return "NO good";
	}

}
