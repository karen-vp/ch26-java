package org.generation;
import java.util.HashMap;
public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una relación clave(key): valor (value)
		 * que forma una tabla de datos
		 * 
		 * Se puede usar cualquier tipo de dato para las keys
		 * ES UNA COLECCION NO ORDENADA
		 * NO SE PERMITEN ELEMENTOS DUPLICADOS, PERO:
		 * Se pueden duplicar valores, pero no las llaves
		 * 
		 * HashMap tiene metodos diferentes porque viene de distinta interfaz
		 */
		
		// Definimos una colección HashMap
		// <key, value>
		HashMap<Integer, String> students =  new HashMap<>();
		
		// Agregamos valores a la colección, 
		// es con el método put()
		students.put(1234, "Pedro");
		students.put(3777, "Isabel");
		students.put(2324, "Andrea");
		students.put(2453, "Santiago");
		
		System.out.println(students);
		
		// Remplazar un elemento
		// Si colocamos la misma llave (key), lo que hacemos
		// es remplazar un valor
		students.put(2324, "Sofia"); // reemplazar valor
		students.put(1112, "Sofia"); // Agregar un elemento duplicado
		
		System.out.println(students);
		
		// Mostramos un elemento en particular, 
		// usando el método get y como argumento su llave (key)
		System.out.println("Tiene auto supersonico: " + students.get(1234));
		
		// Removiendo un elemento, usando el método remove(key)
		
		System.out.println("Removiendo: " + students.remove(2324));
		System.out.println(students);
		
		// Iterar la colección con sus llaves (keys)
		// el método keySet() me devuelve todas las keys de la coleccion
		for(int matricula : students.keySet()) {
			System.out.println(matricula + "-" + students.get(matricula));
		}
		
		// Iterar la colección con sus values
		// el método values() me devuelve todos los values de la colección
		for(String student : students.values()) {
			System.out.println("Estudiante: " + student);
		}
		
		// Iterar con forEach y función Lambda
		students.forEach((key,value) -> System.out.println(key + "->" + value));
		
		
		

	}

}
