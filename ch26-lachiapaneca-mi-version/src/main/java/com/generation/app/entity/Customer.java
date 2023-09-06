package com.generation.app.entity;

import java.sql.Timestamp;

import com.generation.app.config.CustomerParameters;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Entity sirve para marcar una clase como una entidad que se mapea a una
 * tabla de una base de datos. Se indica a JPA que la clase representa
 * una tabla en la DB y que sus atributos se mapearán a columnas
 * en esa tabla. Es importante tener un constructor sin argumentos
 * 
 * @NoArgsConstructor le indica a Lombok que cree un constructor sin 
 * argumentos
 * 
 * @Data le indica a Lombok que genere automaticamente los métodos 
 * comunes como toString(), equals(), hashCode(), Setters y Getters
 * para todos los atributos.
 * 
 * @Id indicamos que este campo será nuestra llave primaria
 * 
 * @GeneratedValue indica como se generará automaticamente el valor de las
 * claves primarias.
 */

@NoArgsConstructor
@Data
@Entity
public class Customer implements CustomerParameters{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	/* Aqui estamos utilizando un atributo estatico definido en la
	* interfaz CustomerParameters, para definir la longitud minima
	* y maxima de este parametro como una constante y que pueda ser
	* reutilizable.
	*/
	@Column(name="first_name", nullable=false, length = FIRSTNAME_MAX_LENGTH)
	private String firstName;
	@Column(name="last_name", length = LASTNAME_MAX_LENGTH )
	private String lastName;
	@Column(name="address", length = ADDRESS_MAX_LENGTH)
	private String address;
	@Column(name="email", nullable = false, unique = true, length = EMAIL_MAX_LENGTH)
	private String email;
	@Column(name="password", nullable = false, length = PASSWORD_MAX_LENGTH)
	private String password;
	@Column(name="active"  )
	private boolean active;
	/* insertable, updatable: la columna se incluye en las operaciones de inserción
	 * y actualizacion
	 * columnDefinition: definicion personalizada para la columna(tipo especifico de
	 * dato, o restricciones)
	 */
	@Column(name="create_at", insertable = false, updatable = false,
			columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	private Timestamp create_at;
	


	
}
