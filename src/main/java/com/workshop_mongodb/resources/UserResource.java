package com.workshop_mongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_mongodb.domais.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User rafael = new User("1", "Rafael", "rafael@gmail.com");
		User maria = new User("2", "maria", "maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(rafael, maria));
		return ResponseEntity.ok().body(list);
	}
}
