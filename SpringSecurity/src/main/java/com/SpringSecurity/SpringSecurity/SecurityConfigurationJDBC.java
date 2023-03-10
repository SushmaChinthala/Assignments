/*
 * package com.SpringSecurity.SpringSecurity;
 * 
 * import javax.sql.DataSource;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableWebSecurity public class SecurityConfigurationJDBC extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired DataSource datasource;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.jdbcAuthentication() .dataSource(datasource);
 * .usersByUsernameQuery("select username,password,enabled"+"from users"
 * +"where username= ?")
 * .authoritiesByUsernameQuery("select username,authority"+"from users"
 * +"where username= ?");
 * 
 * .withDefaultSchema() .withUser( User.withUsername("srimanya")
 * .password("srimanya") .roles("USER") ) .withUser( User.withUsername("sushma")
 * .password("sushma") .roles("ADMIN") );
 * 
 * }
 * 
 * @Bean public PasswordEncoder getPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * @Override//for autherization protected void configure(HttpSecurity http)
 * throws Exception { http.authorizeRequests()
 * .antMatchers("/admin").hasRole("ADMIN")
 * .antMatchers("/user").hasAnyRole("ADMIN","USER")
 * .antMatchers("/hello").permitAll() .and().formLogin();
 * 
 * }
 * 
 * }
 */