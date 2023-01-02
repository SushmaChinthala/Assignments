package com.example.RESTAPI.RESTAPIDEMO.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


import java.net.URI;
import java.util.List;
import java.util.Optional;

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
public class UserJpaResource
{
	
	private UserRepository repository;
	private PostRepository postrepository;
	public UserJpaResource(UserRepository repository,PostRepository postrepository)
	{
		this.repository=repository;
		this.postrepository=postrepository;
		
	}
//Get/users
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers()
	{
		return repository.findAll();
	}
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		
		repository.deleteById(id);
			
	}
	@PostMapping("/jpa/users")
	
		public ResponseEntity<User> createUse(@RequestBody User user)
		{
		    
			//service.save(user); for saving the user
		User savedUser=repository.save(user);
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
		 */	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieve(@PathVariable int id)
	{
		Optional<User> user=repository.findById(id);
		if(user.isEmpty())
			throw new UserNotFoundException("id"+id);
		EntityModel<User> entitymodel=EntityModel.of(user.get());
		WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).retrieveAllUsers());
		 entitymodel.add(link.withRel("all-users"));
				 return entitymodel;
		
	}
		 @GetMapping("/jpa/users/{id}/posts")
			public List<Post> retrievePostsForUser(@PathVariable int id)
			{
				
			 Optional<User> user=repository.findById(id);
				if(user.isEmpty())
					throw new UserNotFoundException("id"+id);
				 return user.get().getPosts();
					
			}
		 @PostMapping("/jpa/users/{id}/posts")
			public ResponseEntity<Object> createPostsForUser(@PathVariable int id,@RequestBody Post post)
			{
				
			 Optional<User> user=repository.findById(id);
				if(user.isEmpty())
					throw new UserNotFoundException("id"+id);
				
				 post.setUser(user.get());
				 Post savedPost=postrepository.save(post);
				 URI location=ServletUriComponentsBuilder.fromCurrentRequest()
						 .path("/{id}")
						 .buildAndExpand(savedPost.getId())
						 .toUri();
				 
				
				 return ResponseEntity.created(location).build();
				 
					
			}

	
	}


