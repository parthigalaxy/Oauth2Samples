package com.oauth.resource.sample.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2ResourceController {
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal user){
		return user;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String tools(){
		return "toolsboard";
	}

}
