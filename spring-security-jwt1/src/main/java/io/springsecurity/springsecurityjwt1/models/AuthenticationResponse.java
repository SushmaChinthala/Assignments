package io.springsecurity.springsecurityjwt1.models;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable//output structure
{
private final String jwt;

public String getJwt() 
{
	return jwt;
}
	

public AuthenticationResponse(String jwt) {
	
	this.jwt = jwt;
}


}
