package com.generation.app.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.generation.app.dto.CustomerDto;
import com.generation.app.entity.Customer;


public class CustomerMapper {

	CustomerDto customerDto;

	Customer customer;
	
	/**
	 * Convierte 
	 * @param customer
	 * @return
	 */
	public static CustomerDto mapToCustomerDto(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(customer.getId());
		customerDto.setFirstName(customer.getFirstName());
		customerDto.setLastName(customer.getLastName());
		customerDto.setAddress(customer.getAddress());
		customerDto.setEmail(customer.getEmail());
		customerDto.setPassword("***");
		return customerDto;
	}
	
	public static Customer mapToCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setId(customerDto.getId());
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setAddress(customerDto.getAddress());
		customer.setEmail(customerDto.getEmail());
		customer.setPassword(customerDto.getPassword());
		customer.setActive(true);
		return customer;
	}
}
