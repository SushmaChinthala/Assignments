package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserService 
{
private static	List<loginCheck> users=new ArrayList<>();
	static
	{
		users.add(new loginCheck("Sushma","sushma"));
		
	
	}
	public List<loginCheck> printAll()
	{
		return users;
	}
	public loginCheck saving(loginCheck login) 
	{
		users.add(login);
		return login;
	}
}
