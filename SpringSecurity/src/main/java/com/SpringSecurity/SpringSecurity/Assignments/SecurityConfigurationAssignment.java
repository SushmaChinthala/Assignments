package com.SpringSecurity.SpringSecurity.Assignments;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfigurationAssignment  extends WebSecurityConfigurerAdapter
{
	@Autowired 
	DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//auth.inMemoryAuthentication()
		auth.jdbcAuthentication()
		.dataSource(datasource);
		/*
		 * .withUser("sushma1") .password("sushma1") .roles("ADMIN") .and()
		 * .withUser("srimanya1") .password("srimanya1") .roles("USER");
		 */
	}
	@Bean
public PasswordEncoder passwordEncoder()
{
	return NoOpPasswordEncoder.getInstance();	
}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/admin1").hasRole("ADMIN")
		.antMatchers("/user1").hasAnyRole("ADMIN","USER")
		.antMatchers("/hello1").permitAll()
		.and()
		.formLogin();
		//.rememberMe().userDetailsService(this.userDetailsService());
	}
}
