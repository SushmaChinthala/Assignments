package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTAPI.RESTAPIDEMO.user.User;
import com.example.RESTAPI.RESTAPIDEMO.user.UserDaoService;

@RestController
public class userController {
	private UserService check;

	public userController(UserService check) {
		this.check = check;
	}

	@GetMapping("/logins")

	public List<loginCheck> retrieveAll() {
		return check.printAll();
	}
	@GetMapping("/logins/{loginname}/{loginpassword}")
	
	public String validate(@PathVariable String  loginname,@PathVariable String loginpassword)
	{
		
		  if(loginname.equals("Sushma")&&loginpassword.equals("sushma"))
		{
			return "success";
			
		}
		else
		{
			return "error";
		}
	}

	

	/* @PostMapping("/logins") */
/*public loginCheck enterlogin( @RequestBody loginCheck login)
{
	
	
	return check.saving(login);
	
	 * if(loginname.equals("Sushma")&& loginpassword.equals("sushma")) { return
	 * " success"; } else { return "error"; }
	 
	
	
}*/
/*
 * @PostMapping("/users") public String enterlogin( @RequestBody loginCheck
 * loginname,@RequestBody loginCheck loginpassword) {
 * 
 * 
 * 
 * 
 * if(loginname.equals("Sushma")&& loginpassword.equals("sushma")) { return
 * " success"; } else { return "error"; }
 * 
 * 
 * 
 * }
 */}
