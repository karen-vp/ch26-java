package org.generation.saludo.app.entity;

import java.io.Serializable;

public class Customer implements Serializable {
	
	/**
	 *  La interfaz Serializable indica que la clase puede ser 
	 *  serializada.
	 *  
	 *  Al implementar la interfaz, una clase puede convertirse
	 *  en una secuencia de bytes que puede ser guardada en un
	 *  archivo o ser transmitida a través de la red.
	 *  
	 *  @RestController hace en automatico el serializado, por
	 *  eso no es común implementar la interfaz Serializable
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
