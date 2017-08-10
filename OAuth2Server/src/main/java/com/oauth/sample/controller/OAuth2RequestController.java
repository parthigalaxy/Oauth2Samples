package com.oauth.sample.controller;

import java.security.Principal;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableResourceServer
public class OAuth2RequestController {
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal user){
		return user;
	}
	
	@RequestMapping("/")
	public String tools(){
		return "toolsboard";
	}

}
