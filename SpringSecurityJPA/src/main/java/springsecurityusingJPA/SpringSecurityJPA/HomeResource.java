package springsecurityusingJPA.SpringSecurityJPA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeResource 
{
	@GetMapping("/hello")

	public String sayHello()
	{
		return  ("<h1>Hello World</h1>");
	}
	@GetMapping("/user")
	public String userLevel()
	{
		return ("<h1> Hello user</h1>");
	}
	@GetMapping("/admin")
	public  String adminLevel() 
	{
		return ("<h1>Hello Admin</h1>");
	}

}
