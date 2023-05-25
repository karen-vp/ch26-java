package org.generation;
import java.util.Scanner;

public class CicloWhileDoWhile {

	public static void main(String[] args) {
		/*
		 * Ciclo While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 * 
		 *   while(condicion) instruccion;
		 *   
		 *   while(condicion){
		 *   	instrucciones
		 *   }
		 *   
		 * 
		 * 
		 */
		// Forma explicita para declarar variables
		//Scanner myScan = new Scanner(System.in);
		// Forma implicita para declarar variables
		// Cuando le asignamos un valor de cualquier tipo, automaticamente
		// esa variable va a tomar ese tipo (por ejemplo, 18 va a ser de tipo int)
		// se infiere el tipo de dato a la variable declarada con var, y se va a 
		// quedar con ese tipo (esto solo se puede hacer con las variables locales,
		// es decir, debe estar dentro de funcion o metodo, y solo desde Java 10)
		var myScan = new Scanner(System.in);;
		System.out.println(myScan);
		
		boolean active = false;
		
		while(active) {
			System.out.println("Bienvenido Alexis");
			System.out.println("Quieres seguir activo (s/n)?");
			// nextLine() leemos la linea completa
			// toLowerCase() convertimos en minusculas
			// charAt(0) devuelve el primer caracter
			char response = myScan.nextLine().toLowerCase().charAt(0);
			if(response != 's') active = false; // también sirve con un break;
			
		}
		
		
		do {
			System.out.println("Bienvenido Patito");
			System.out.println("Quieres seguir activa (s/n)?");
			char response = myScan.nextLine().toLowerCase().charAt(0);
			if(response == 's') active = true; 
			else active = false;
		}while(active);
		
		System.out.println("Gracias por tu visita");
		
		// Aqui se va a ejecutar el ciclo hasta que pongamos algo que no tenga s (no)
		// No va a imprimir nada solo se ejecuta hasta que pongamos algo que no tenga
		// la letra s, como tiene ; esto pasa, pero si no tubiera se imprimiria Adios
		// en su lugar
		while(myScan.nextLine().toLowerCase().charAt(0) == 's');
			System.out.println("Adiós");
		
		myScan.close();
	}

}
