package com.example.RESTAPI.RESTAPIDEMO.security;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration 
{
@Bean
public SecurityFilterChain filterchain(HttpSecurity http) throws Exception
{
http.authorizeHttpRequests(auth->auth.anyRequest().authenticated());//All requests should be authenticated
http.httpBasic(withDefaults());//If arequest not authenticated ,a web page is shown
http.csrf().disable();//csrf->POST,PUT
return http.build();
}

}
