package com.pet;

/**
 * Una interfaz es una declaración formal de un contrato, en la cuál los métodos
 * no contienen implementaciones. Es similar a los métodos abstractos.
 * 
 * Las interfaces sirven para implementar funcionalidades a las clases
 * 
 * Una clase puede implementar varias interfaces.
 * 
 * Las clases son adecuadas para proporcionar funcionalidad a clases que no
 * están relacionadas entre sí.
 * 
 * Las interfaces se suelen utilizar para PATRONES DE DISEÑO.
 */
public interface Pet {

	/*
	 * Los atributos en interfaces son de tipo final (es decir, son constantes)
	 * estas se definen en mayuscula, aquí no es necesario ponerle final, porque por
	 * defecto ya es final. Es decir los atributos de las interfaces son estaticos y
	 * de tipo final, y de tipo publico
	 */
	boolean PET = true;
	
	/*
	 * Los métodos son de tipo public, y abstract por default 
	 */
	
	String trick();

	void setOwnerName(String name);
	
	String getOwnerName();
	
	/* Lo más comun es que los métodos de de interfaces no tengan cuerpo,
	 * pero,
	 * A partir de la versión 8 de java, se permite, tener métodos default
	 * que tengan una implementacion dentro de las interfaces.
	 * 
	 * Se le tiene que agregar default para que permite agregar 
	 * funcionalidad
	 */
	default String greeting() {
		return "Soy una mascota";
	}
	
	
	
}
