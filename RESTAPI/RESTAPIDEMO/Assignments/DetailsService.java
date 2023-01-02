package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.example.RESTAPI.RESTAPIDEMO.user.User;
@Component
public class DetailsService
{
	private static List<Details> info=new ArrayList<>();
	static
	{
		info.add(new Details(345678,"Andhra Pradesh","Vijayawada","INDIA"));
		info.add(new Details(345679,"Telangana","Hyderabad","INDIA"));
		info.add(new Details(345675,"Karnataka","Bangalore","INDIA"));
	}
	public Details findOne(int code)
	{
		Predicate<? super Details> predicate=u->u.getZipcode().equals(code);
		return info.stream().filter(predicate).findFirst().orElse(null);
		}
	

}
