package com.springboot.projects.springbootswaggerexample.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.projects.springbootswaggerexample.resource.User;


@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	@GetMapping
	public List<User> getUsers(){
		return Arrays.asList(
			new User("Phani",1989L),
			new User("Brenda",1990L)
			);
		}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName ) {
		return new User("Salas",1990L);
	}
	
	}


