package com.example.RESTAPI.RESTAPIDEMO.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource
{
	private UserDaoService service;
	public UserResource(UserDaoService service)
	{
		this.service=service;
	}
//Get/users
	@GetMapping("/users")
	public List<User> retrieveAllUsers()
	{
		return service.findAll();
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		
		service.deleteById(id);
			
	}
	@PostMapping("/users")
	
		public ResponseEntity<User> createUser(@Valid @RequestBody User user)
		{
		    
			//service.save(user); for saving the user
		User savedUser=service.save(user);
			//location-/users/4
			
			URI location=ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedUser.getId())
					.toUri();
			return ResponseEntity.created(location).build();
			
		}

		/*
		 * @GetMapping("/users/{id}") public void search(@PathVariable int id) {
		 * 
		 * service.findOne(id);
		 * 
		 * }
		 */	@GetMapping("/users/{id}")
	public EntityModel<User> retrieve(@PathVariable int id)
	{
		User user=service.findOne(id);
		if(user==null)
			throw new UserNotFoundException("id"+id);
		EntityModel<User> entitymodel=EntityModel.of(user);
		WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).retrieveAllUsers());
		 entitymodel.add(link.withRel("all-users"));
				 return entitymodel;
		
	}

	
	}


