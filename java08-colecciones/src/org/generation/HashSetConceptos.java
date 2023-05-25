package org.generation;
import java.util.HashSet;


public class HashSetConceptos {

	public static void main(String[] args) {
		
		/*
		 *  Una colección de tipo SET es una coleccion NO ORDENADA
		 *  NO se permite elementos DUPLICADOS
		 *  Cualquier elemento duplicado no se insertará en la colección.
		 *  
		 *  Sintaxis
		 *  HashSet<Object> varName;
		 * 
		 */
		
		// Definimos una colección HashSet
		HashSet<String> paises = new HashSet<>();
		
		// Agregar valores con add()
		paises.add("México");
		paises.add("Alemania");
		paises.add("Genovia");
		paises.add("Wakanda");
		
		System.out.println(paises);
		paises.add("Genovia"); // Agregando duplicado
		System.out.println(paises);
		
		// Desplegamos el tamaño de la colección,
		// con el método size()
		System.out.println("Elementos: " + paises.size());
		
		// Verificando si existe un elemento, con el método contains()
		System.out.println("Existe USA: " + paises.contains("USA"));
		System.out.println("Existe USA: " + paises.contains("Alemania"));
		
		// Removemos un elemento, con el método remove(),
		// Si lo elimina te va a devolver true
		System.out.println("Existe USA: " + paises.remove("México"));
		System.out.println(paises);
		
		// Iteramos la colección
		// Usando un for each loop
		
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		// Iterando la colección Usando forEach y Lambda expressions
		paises.forEach(pais -> System.out.println("->" + pais));

	}

}
