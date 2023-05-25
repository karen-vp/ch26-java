package condicionales;

import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) {
		
		/*
		 * Java 05
		 * Sintaxis de la condicional if
		 * Si la condicional es verdadera, se ejecuta la instruccion del if
		 * 
		 * if(condicional) sentencias;
		 * 
		 * if(condicional){
		 * 		sentencias;
		 * }
		 * 
		 * if(condicional)
		 * 		sentencia;
		 * else
		 * 		sentencia_si_condicional_es_falsa;
		 * -------------------------------------------------
		 * if(condicional)
		 * 		sentencia;
		 * else if(nueva condicional)
		 * 		sentencia;
		 * 
		 * else if(n_condicion)
		 * 		sentencia:
		 * else
		 * 		sentencia;
		 * 
		 * El retorno debe ser un valor booleano
		 */
		
		
		boolean condicion = true;
		if(condicion)
			System.out.println("La condicion es verdadera");
		else
			System.out.println("La condicion es falsa");
		
		int edad=17;
		if(edad>=18)
			System.out.println("La persona es mayor de edad");
		else
			System.out.println("La persona es menor de edad");
		
		//---------------------------------------------------------------
		/*
		 * De una variable tipo int, evaluar si esta en el rango de 1 a 10,
		 * si es así desplegar en consola "La seleccion esta en el rango"
		 * En caso contrario "La seleccion está fuera de rango"
		 * 
		 */
		
		int rango = 5;
		
		if(rango>=1 && rango <=10) 
			System.out.println("La selección esta en el rango");
			else
				System.out.println("La seleccion está fuera de rango");
		
		//------------------------------------------------------------
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis:
		 * 	 	expresión ? respuesta si es true : respuesta si es false
		 * 
		 */
		String mensaje = (rango >= 1 && rango <=10) ?  "La selección esta en el rango" :  "La seleccion está fuera de rango";
		System.out.println(mensaje);
		

		// --------------  Clase Scanner ------------------------------------------
		Scanner myScan;
		myScan = new Scanner( System.in  );
//		System.out.print("Escribe tu nombre: ");
//		//String myName = myScan.nextLine(); // leer toda la linea hasta /n "
//		String myName = myScan.next();
		
//		System.out.println("Tu nombre es: " + myName);
//		String myLastname = myScan.next();
//		System.out.println("Tu apellido es: " + myLastname);
//		myScan.nextLine(); // consumimos el resto de caracteres (\n) del buffer
		
//		System.out.print("Escribe tu edad: ");
//		String ageTxt = myScan.nextLine();
//		int age = Integer.parseInt(ageTxt);
//		int age = myScan.nextInt(); // Leer un número entero;
//		System.out.println("Tu edad es: " + age);
//		System.out.println("Pronto cumpliras: " + (age + 1));
//		myScan.nextLine(); // consumimos el resto de caracteres (\n) del buffer
		
		System.out.print("Escribe tu edad: ");
		// String ageTxt = myScan.nextLine();
		// int age = Integer.parseInt(ageTxt);
		
		if ( myScan.hasNextInt() ) {
			int age = myScan.nextInt(); // Leer un número entero		
			myScan.nextLine();
			
			System.out.println("Tu edad es: " + age);
			System.out.println("Pronto cumpliras: " + (age+1) );			
		}
		else {
			System.out.println("Lo siento, no escribiste un número");
		}		
		
//		myScan.close();
		
		/**
         * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
         * El usuario proporcionará un valor entre 0 y 10 (usando Scanner). 
         * Si está entre 9 y 10: imprimir una A 
         * Si está entre 8 y menor a 9: imprimir una B 
         * Si está entre 7 y menor a 8: imprimir una C 
         * Si está entre 6 y menor a 7: imprimir una D 
         * Si está entre 0 y menor a 6: imprimir una F 
         * Cualquier otro valor debe imprimir: Valor desconocido.
         */
		Scanner myScan;
		myScan = new Scanner( System.in  );
		
		
		
	}
	
}
