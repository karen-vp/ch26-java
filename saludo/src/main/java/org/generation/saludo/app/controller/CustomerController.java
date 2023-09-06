package org.generation.saludo.app.controller;

import java.util.*;

import org.generation.saludo.app.entity.Customer;
import org.springframework.web.bind.annotation.*;

/*
 * Por convención el nombre de los endpoints deben ser sustantivos
 * en plural, i.e (customers)
 */

@RestController
@RequestMapping("api/customers") // http://localhost:8080/api/customers
public class CustomerController {
	
	@GetMapping // http://localhost:8080/api/customers
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(1,"Pato", "Donald"));
		customers.add(new Customer(2,"Michaell", "Sirius"));
		customers.add(new Customer(1,"Angelica", "Vazques"));
	
		return customers;
}
	/* @GetMapping con Path Variable
	*  @PathVariable vincula un valor de una variable de la URL a un parámetro del 
	*  método.
	*  Permite capturar valores dinámicos en la URL y utilizarlos en el método
	*/
	// http://localhost:8080/api/customers/1/Pato/Donald
	@GetMapping("{id}/{first_name}/{last_name}") 
	public Customer customerPathVariable(
			@PathVariable int id, // este no se mapeo, porque tiene el mismo nombre que el PathVariable
			@PathVariable("first_name") String firstName, 
			@PathVariable("last_name") String lastName
			) {
		
		return new Customer(id, firstName, lastName);
	}
	/*
	 * @RequestParam, vincula los parametros de una solicitud HTTP con los parámetros del
	 * método. 
	 * Permite extraer los valores de los parámetros de consulta (query parameters)
	 * 
	 * Si no se proporcionan los valores se genera la excepción 
	 * MissingServletRequestParameterException
	 * 
	 */
	// http://localhost:8080/api/customers/query?id=1&first_name=pato&last_name=Donald
	@GetMapping("query") 
	public Customer customerRequestVariable(
			@RequestParam int id, 
			@RequestParam(value="first_name", required=false) String firstName, 
			@RequestParam(value="last_name", defaultValue="Stranger") String lastName) {
		return new Customer(id, firstName, lastName);
	}
}
