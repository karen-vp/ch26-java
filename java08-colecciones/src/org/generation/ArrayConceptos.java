package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		
		/*
		 * Los arreglos se definen con corchetes []
		 * Los corchetes pueden ir antes o después de la variable
		 * 
		 * Ejemplos: 
		 * 		int[] myArray;
		 * 		int myArray[];
		 * 
		 * Para los arreglos se debe asignar la cantidad de elementos que contendrá
		 * Una vez definido, el arreglo no puede cambiar su tamaño
		 */
		
		// Definimos un arreglo de 3 elementos tipo int.
		// Instanciando un objeto de tipo Array, con 4 elementos
		int[] codigoColores = new int[4]; 
		String nombreColores[] = new String[4];
		
		// Para agregar elementos en un arreglo, se indica dentro del corchete el indice
		// El primer elemento es el indice 0
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x00_00_FF; // Representación hexadecimal (RGB 0,0,255)
		// Agregar color amarillo, negro
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xfcba03;
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x000000;
		
		// Iterar elementos en un arreglo
		// usando for loop
		
		for(int i= 0; i<nombreColores.length; i++) {
			String texto = String.format("El color %s tiene el codigo RGB 0x%06X", 
					nombreColores[i], codigoColores[i]);
			System.out.println(texto);
		}
		
		// Iterar elementos de un arreglo
		// usando for each loop
		// Es más recomendable utilizar el for each, porque puedes cometer menos
		// errores al escribir las condiciones como se hace en el ciclo for
		// String nombreColor es la variable en singular que va a recorrer el arreglo
		// y se le define el tipo que es String
		// nombreColores es el arreglo a recorrer
		for(String nombreColor : nombreColores) {
			System.out.println("El color " + nombreColor);
		}
		
		// Agregar un elemento al indice 5
		// Se crea una excepcion que está fuera de los limites, 
		// porque nuestro arreglo es de 4 elementos y no existe un 5 elemento
		// nombreColores[5] = "Morado";
		
		
		// Inicializar un arreglo {} al asignarlo a la variable
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Instanciar un arreglo de 2 dimensiones.
		// String[filas][columnas] 
		// Para recordar el orden podemos pensar en la palabra
		// Feliz Cumpleaños
		// Filas Columnas
		String[][] participantes = new String[3][5];
		
	}

}
