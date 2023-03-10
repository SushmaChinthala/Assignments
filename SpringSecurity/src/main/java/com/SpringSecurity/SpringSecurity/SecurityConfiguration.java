/*
 * package com.SpringSecurity.SpringSecurity;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableWebSecurity public class SecurityConfiguration extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override//for authentication protected void
 * configure(AuthenticationManagerBuilder auth) throws Exception { // Set your
 * configuration on the auth object auth.inMemoryAuthentication()
 * .withUser("srimanya") .password("srimanya@123") .roles("USER") .and()
 * .withUser("sushma") .password("sushma") .roles("ADMIN");
 * 
 * 
 * }
 * 
 * @Bean public PasswordEncoder getPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * @Override//for autherization protected void configure(HttpSecurity http)
 * throws Exception { http.authorizeRequests()
 * .antMatchers("/admin").hasRole("ADMIN")
 * .antMatchers("/user").hasAnyRole("USER","ADMIN")
 * .antMatchers("/hello").permitAll() .and().formLogin();
 * 
 * }
 * 
 * }
 */