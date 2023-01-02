package com.SpringSecurity.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootApplicationTests
{
@GetMapping("/hello")

public String sayHello()
{
	return  "Hello World";
}
@GetMapping("/user")
public String userLevel()
{
	return "Hello user";
}
@GetMapping("/admin")
public  String adminLevel() 
{
	return "Hello Admin";
}

}
