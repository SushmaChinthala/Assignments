package com.example.RESTAPI.RESTAPIDEMO.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController 
{
	private MessageSource messageSource;
	public HelloWorldController(MessageSource messagesource)
	{
		this.messageSource=messagesource;
	}
// /hello-world
	//"Hello World"
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloworld()
	{
		return "Hello World";
	}
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean hello()
	{
		return new HelloWorldBean("hello world");
	}
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	
	{
		return new HelloWorldBean(String.format("Hello World ,%s",name));
	}
	@GetMapping(path="/hello-world-internationalized")
	public String helloworldInternationnalized()
	{
		Locale locale=LocaleContextHolder.getLocale();
		 return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
		//return "Hello World v2";
	}


}
