package com.isaias.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaias.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// Criando um endpoint
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "Isaias", "isaias#gmail.com", "7777777", "12345");
		return ResponseEntity.ok().body(u);
		
		// Controlador Rest que responde no caminho "/users"
	}

}
