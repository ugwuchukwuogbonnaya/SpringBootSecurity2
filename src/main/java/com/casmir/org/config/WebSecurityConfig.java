package com.casmir.org.config;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
			http.authorizeRequests()
			.antMatchers("/user/**").permitAll()
			.antMatchers("/admin/**").authenticated()
			.and()
			//.formLogin();
			//.and()
			.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("ogb").password("ogb123").authorities("admin")
		.and()
		.withUser("ugwu").password("ugwu123").authorities("user")
		.and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
		
	}
	   	
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder () {
		return NoOpPasswordEncoder.getInstance();
	}
		
	}


