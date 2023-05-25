package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		
		/*
		 *  Una coleccion List o Array List es una coleccion ORDENADA,
		 *  en la que se permiten elementos duplicados.
		 *  
		 *  Se basa en un array redimensionable que crece su tamaño,
		 *  según crece la colección de elementos.
		 *  Nos permite agregar y quitar elementos, es decir permite aumentar y disminuir
		 *  su tamaño.
		 *  
		 *  Esta colección es la que mejor rendimiento tiene.
		 * 
		 *  Sintaxis:
		 *  ArrayList <object> varName;
		 *  
		 *  Las colecciones solo pueden almacenar OBJETOS
		 * 
		 *  ArrayList es una clase con metodos y propiedades
		 */
		
		
		int edad = 17; // dato primitivo tipo int
		Integer age = 17; // objeto tipo Integer
		
		// ArrayList<int> calificaciones; Esto no se puede realizar
		// Hay que realizar una importación para poder usar ArrayList
		
		// Definir una colección de datos numéricos.
		ArrayList<Integer> calificaciones;
		
		// Definir una colección de Strings.
		ArrayList<String> nombreLibros;
		nombreLibros = new ArrayList<>();
		
		// Agregar datos al ArrayList con el método add()
		// El primer elemento es el indice 0
		nombreLibros.add("Caperucita Roja");
		nombreLibros.add("Harry Potter");
		nombreLibros.add("Hansel y Gretel");
		nombreLibros.add("Libro Vaquero");
		nombreLibros.add("El Hobbit");
		// se permiten elementos duplicados y respeta el orden de inserción 
		nombreLibros.add("Libro Vaquero");
		
		// Obtener el tamaño de la colección, se utiliza el metodo size();
		int sizeArrayList = nombreLibros.size();
		System.out.println("Número de elementos: " + sizeArrayList);
		
		// Se puede imprimir la coleccion ArrayList con un println
		System.out.println(nombreLibros);
		
		// Para mostrar un elemento en particular,
		// indicamos el número de índice, usando el método get()
		
		System.out.println("David recomienda: " + nombreLibros.get(3));
		
		// Para remover un elemento de la colección,
		// indicamos el indice, usando el método remove()
		// este método te remueve y te regresa el elemento
		System.out.println("Elemento removido: " + nombreLibros.remove(0));
		System.out.println(nombreLibros);
		
		// Para ver si un elemento está dentro del ArrayList
		// es con el método contains()
		System.out.println("Está Harry Potter: " + nombreLibros.contains("Harry Potter"));
		System.out.println("Está Quiúbole con...: " + nombreLibros.contains("Quiúbole con..."));
		
		// Iteramos una colección ArrayList
		// usando for loop
		for(int i=0; i<nombreLibros.size(); i++) {
			System.out.println("Libro: " + nombreLibros.get(i));
		}
		
		// Iteramos una colección ArrayList
		// usando for each loop
		
		for (String libro : nombreLibros) {
			System.out.println("Libro a leer: " + libro);
		}
		
		// Iterando la coleccion usando for each de la colección
		// se pasa la referencia dentro del argumento del metodo forEach
		// y esa referencia es una función lambda que es parecida a 
		// la función flecha de javascript, pero en este caso se 
		// declara con (->) 
		// y aquí no es necesario indicarle el tipo de dato a la variable
		// libro porque implicitamente esta tomando el tipo de la colección
		nombreLibros.forEach(libro -> System.out.println(libro));
		
		// Si se usa el método set() en un índice existente, lo reemplaza
		nombreLibros.set(1, "Clean code");
		System.out.println(nombreLibros);
		
		// Aquí estoy pasando la referencia de nombreLibros a books,
		ArrayList<String> books = nombreLibros;
		// si queremos separarlo hay que clonar la colección, para ello,
		// se usa el método clone(), para que sean colecciones independientes
		
		
		
	}

}
