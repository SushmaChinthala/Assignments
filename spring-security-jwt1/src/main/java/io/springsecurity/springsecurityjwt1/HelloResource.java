package io.springsecurity.springsecurityjwt1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springsecurity.springsecurityjwt1.models.AuthenticationRequest;
import io.springsecurity.springsecurityjwt1.models.AuthenticationResponse;
import io.springsecurity.springsecurityjwt1.services.MyUserDetailsService;
import io.springsecurity.springsecurityjwt1.util.JwtUtil;

@RestController
public class HelloResource 
{
	@Autowired 
	private AuthenticationManager authenticationManager;
	@Autowired
	private MyUserDetailsService userDetailsService;
	@Autowired
	private JwtUtil jwtTokenUtil;
@GetMapping("/hello")
public String hello()
{
	return "Hello world";
}
@PostMapping("/authenticate")
public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception
{
	try {
		
	
	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
}catch(BadCredentialsException e)
	{
	throw new Exception("incorrect username and password",e);
	}
	final UserDetails userDetails=userDetailsService
			.loadUserByUsername(authenticationRequest.getUsername());
    final String jwt=jwtTokenUtil.generateToken(userDetails);
    return ResponseEntity.ok(new AuthenticationResponse(jwt));
}
}
