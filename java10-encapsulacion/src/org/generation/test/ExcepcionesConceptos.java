package org.generation.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExcepcionesConceptos {

	public static void main(String[] args) {
		
		/*
		 * Una excepción es una situación no esperada 
		 * durante la ejecución de un programa.
		 * 
		 * Existen dos tipos de excepciones.
		 * 
		 * A) Checked Exceptions: son excepciones que se heredan,
		 * de la clase Exceptions. 
		 *  - Se tiene que declarar la excepción
		 *    en la firma del método o bien manejar la excepción con 
		 *    el bloque try-catch. 
		 *  - (Estas estan obligadas a procesarlas)
		 * 
		 * B) Uncheked Exceptions: son excepciones que se heredan,
		 * de la clase RuntimeException. 
		 *  - No se está obligado a procesarlas, 
		 *  - Es opcional el uso de try-catch o declarar 
		 * 	  en la firma del método
		 * 
		 * C) Las excepciones de Error, son arrojadas por ja Java Virtual Machine,
		 * son errores de los que no se pueden recuperar.
		 * 
		 * Manejo de excepciones con el bloque try-catch
		 * 
		 * 	Sintaxis:
		 * 		try{
		 * 
		 * 		}
		 * 		catch(exception e){
		 * 
		 * 		}
		 * 
		 * try: bloque que contendrá sentencias que pudieran generar una excepción.
		 * catch: se ejecutará si ocurre una excepción en try
		 * finally: se ejecutará después de try o catch. (Este no es obligatorio colocarlo)
		 * 
		 * D) El stacktrace de una excepción es el conjunto de mensajes desde el origen
		 * de la excepción, hasta la ultima clase que recibe la excepción.
		 * 
		 */
		
	
		System.out.println("Inicio del programa");
		double division;
		int[] myArray = {4,5};
		
		
		
		try {
			division = 5/0; // Arithmetic exception, no se puede dividir sobre 0
			myArray[5] = 10; // Excepcion, fuera del rango del arreglo
			readFile();
		// Estas excepciones solo consumen la primera excepción,
		// si es que existen varías.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		//} catch (ArrayIndexOutOfBoundsException e) {
		//e.printStackTrace();		
		// Con Exception se puede consumir cualquier tipo de excepcion
		}catch (Exception e) { 
			e.printStackTrace();
		}
		
		System.out.println("Fin del programa");

	}
	// Checked exception
	static void readFile() throws FileNotFoundException {
		File file = new File("myfile.txt");
		Scanner myReader = new Scanner(file);
	}

}
