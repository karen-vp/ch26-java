package com.generation.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.service.CustomerService;

@RestController
// le definimos el endpoint http://localhost:8080/api/customers
@RequestMapping("api/customers")
public class CustomerController {

	// Objeto inyectado para llamar a los metodos de mi interfaz CustomerService
	@Autowired
	CustomerService customerService;
	
	// le definimos el endpoint http://localhost:8080/api/customers
	@GetMapping
	public List<Customer> getAllCustomers(){
		//Estamos utilizando el objeto customerService inyectado y usando su metodo getAllCustomers
		List<Customer> customers = customerService.getAllCustomers();
		return customers;
	}
	// le definimos el endpoint http://localhost:8080/api/customers/active
	@GetMapping("active") 
	public List<CustomerDto> getAllActiveCustomers(){
		//Estamos utilizando el objeto customerService inyectado y usando su metodo getAllActiveCustomers
		List<CustomerDto> customers = customerService.getAllActiveCustomers();
		return customers;
	}
}
