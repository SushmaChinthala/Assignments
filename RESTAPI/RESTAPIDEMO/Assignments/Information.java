package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Information 
{
private DetailsService s;

public Information(DetailsService s) {
	
	this.s = s;
}
@GetMapping("/information/{zipcode}")
public Details search(@PathVariable int zipcode)
{
	
	return s.findOne(zipcode);
		
}

}
