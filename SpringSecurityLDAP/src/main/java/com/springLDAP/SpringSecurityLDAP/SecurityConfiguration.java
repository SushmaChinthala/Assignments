package com.springLDAP.SpringSecurityLDAP;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//User Information
		auth.ldapAuthentication()
		.userDnPatterns("uid={0},ou=people")
		.groupSearchBase("ou=groups")//organisation unit 
		.contextSource()
		.url("ldap://localhost:8389/dc=springframework,dc=org")
		.and()
		.passwordCompare()
		.passwordEncoder(new LdapShaPasswordEncoder())
		.passwordAttribute("userPassword");
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin();
	}
	

}
