package com.generation.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.generation.app.entity.Customer;

/*
 * Dentro de CrupRepository o JpaRepository le tenemos que indicar
 *  la Entidad, y el tipo del id en formato wrapper porque no 
 *  acepta datos primitivos
 * 
 */

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	// Aqui definimos métodos que no esten en JpaRepository
	List<Customer> findAllCustomerByActive(boolean stateActive);
}
