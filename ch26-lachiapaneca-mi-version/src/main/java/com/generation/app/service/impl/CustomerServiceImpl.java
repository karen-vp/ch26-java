package com.generation.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;
import com.generation.app.mapper.CustomerMapper;
import com.generation.app.repository.CustomerRepository;
import com.generation.app.service.CustomerService;

import lombok.AllArgsConstructor;
/*
 * En esta clase vamos a definir que van a hacer los métodos
 * que creamos en la interfaz CustomerService,
 * para ello utilizamos la notación @Override para 
 * sobreescribir los métodos con la funcionalidad que
 * le indiquemos
 */

/*
 * @Service indica que la clase es un componente de servicio.
 * SpringBoot registra la clase en el contexto de la aplicacion 
 * como un bean de servicio. Esto significa también que la clase
 * puede ser utilizada en otras clases mediante inyección de
 * dependencias.
 * 
 * Los servicios suelen encapsular la lógica del negocio de la
 * aplicacion y se utilizan para realizar operaciones más
 * complejas. Interactuan ..
 */
@AllArgsConstructor // Para realizar el constructor y se realice la inyección de dependencias, esta es otra forma de
// hacer inyeccion de dependencias
@Service
public class CustomerServiceImpl implements CustomerService{
	
	/*
	 * @Autowired es para hacer la inyeccion de dependencias
	 * y con ayuda de @Service podemos hacer este proceso
	 */
	@Autowired
	CustomerRepository customerRepository;
	
	CustomerMapper customerMapper;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		// Estamos usando el metodo que brinda JpaRepository "findAll"
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public List<CustomerDto> getAllActiveCustomers() {
		// TODO Auto-generated method stub
		/* Estamos usando el metodo personalizado de CustomerRepository que creamos
		* "findAllCustomerByActive"
		*/
		List<Customer> customers = customerRepository.findAllCustomerByActive(true);
		// Convertir el listado tipo Customer a un listado CustomerDto
		List<CustomerDto> customersDto = new ArrayList<>();
		customers.forEach(customer ->{
			customersDto.add(customerMapper.mapToCustomerDto(customer));
		});
		return customersDto;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
