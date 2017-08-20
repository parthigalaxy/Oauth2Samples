//package com.oauth.sample.ui.config;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//@Configuration
//@ComponentScan("com.oauth")
//@EnableZuulProxy
//@EnableOAuth2Sso
//public class OAuth2UiConfig extends WebSecurityConfigurerAdapter {
//	
//	@Override
//	public void configure(HttpSecurity http) throws Exception{
//		http
//		.logout().and()
//		.authorizeRequests()
//			.antMatchers("/index.html", "/home.html", "/", "/login").permitAll()
//			.anyRequest().authenticated()
//			.and()
//		.csrf()
//			.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//	}
//	
//}
