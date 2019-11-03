package com.isaias.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaias.course.entities.Order;
import com.isaias.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	// Criando um endpoint
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		
		//Order u = new Order (1L, "Isaias", "isaias#gmail.com", "7777777", "12345");
		 List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
		
		// Controlador Rest que responde no caminho "/users"
	}
	//  Aqui outro end point
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		// Para pegar o Id da url usamos @PathVariable
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
