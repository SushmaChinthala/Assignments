package com.SpringSecurity.SpringSecurity.Assignments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{
@GetMapping("/hello1")
public String sayHello()
{
	return "Hello World";
}
@GetMapping("/admin1")
public String sayHelloAdmin()
{
	return "Hello Admin";
}
@GetMapping("/user1")
public String sayHelloUser()
{
	return "Hello user";
}
}
