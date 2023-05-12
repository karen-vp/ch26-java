package org.generation;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reglas para el nombre de las variables
		 * - Se distingue entre minusculas y mayusculas
		 * - La longitud del nombre es ilimitada
		 * - Puedes utilizar cualquier caracter Unicode
		 * - La variable puede comenzar con:
		 * 		> una letra, ej. miVariable
		 * 		PERO NO SE RECOMIENDA CON LOS SIGUIENTES:
		 * 		> signo de dolar $, ej. $miVariable
		 * 		> caracter de subrayado _, _miVariable
		 * 
		 */
		
		int $myVar; // es valido, pero no se recomienda
		int _myVar; // es valido, pero no se recomienda
		//int #myVar; // no es valido
		int myVarEspañol; // es valido, pero no se recomienda, de preferencia nombres en ingles
		//int 5comentarios;// no es valido, no se puede comenzar con un numero
		int sinC0m3nt4r10s; // es válido
		
		/*
		 *  En Java tendremos los siguientes tipo de variables:
		 *  Variables de instancia (Non static fields): atributos de los objetos
		 *  Variables de clase (Static Fields): atributos de la clase.
		 *  Variables locales (local variables): variable dentro de las funciones (métodos)
		 *  Parámetros (parameters): Entrada de las funciones.
		 * 
		 */
		
		/*
		 * Tipos de datos en Java
		 * - Objetos
		 * - Datos primitivos
		 * 		Tenemos 8 datos primitivos:
		 * 			> byte
		 * 			> short
		 * 			> int
		 * 			> long
		 * 			> float
		 * 			> double
		 * 			> boolean
		 * 			> char
		 */
		
		// Datos primitivos que solo guardan numeros enteros
		
		// El tipo byte equivale a 8 bits, y almacena datos numericos enteros
		// 2^8 = 256, se pueden almacenar 256 digitos en byte (max 127 y min -127)
			byte myVarByte = 12;
			System.out.println("byte: " + myVarByte);
		// Obtener el valor maximo y minimo del tipo byte,  
		// usando su wrapper (Clase envolvente) Byte
			System.out.println("Byte, Max value: " + Byte.MAX_VALUE);
			System.out.println("Byte, Max value: " + Byte.MIN_VALUE);
		// el tipo Byte solo puede almacenar maximo hasta el numero 127 y minimo al numero -128
		// Si intentamos almacenar un numero mayor (por ej. 500), nos dara un error
			myVarByte = 10;
			
		// El tipo short equivale a 16 bits, almacena datos numericos enteros
		// 2^16 = 65536, puede almacenar hasta 65536 digitos 
		// Max value 32767, y Min value -32768 (que sumados dan 65536)
			short myVarShort = 500;
			System.out.println(myVarShort);
			System.out.println("Short, Max Value: " + Short.MAX_VALUE);
			System.out.println("Short, Min Value: " + Short.MIN_VALUE);
		
		// El tipo int equivale a 32 bits, almacena datos numericos enteros
		//2^32= 4,294,967,296, puede almacenar hasta 4,294,967,296 digitos
		int myVarInt = 1000;
		System.out.println(myVarInt);
		// El wrapper para int es Integer
		System.out.println("Int, Max Value: " + Integer.MAX_VALUE);
		System.out.println("Int, Min Value: " + Integer.MIN_VALUE);
		
		// El tipo long es de 64 bits, almacena datos numericos enteros
		//2^64 almacena 2^64 digitos
		long myVarLong =1500;
		System.out.println(myVarLong);
		System.out.println("Long, Max Value: " + Long.MAX_VALUE);
		System.out.println("Long, Min Value: " + Long.MIN_VALUE);
		
		// IMPORTANT: Las literales numericas enteras son de tipo int por default
		// ejemplo de literal numerica (123434) 
		// Para indicar una literal numerica de tipo long, hay que indicar
		// la literal con la letra l o L al final.
			long myLiteralLong = 2147483648L;
			System.out.println("Long: " + myLiteralLong);
			
		// ------------------------------------------------------------
		// Datos primitivos que solo guardan numeros de punto flotante
		
		// El tipo float equivale a 32 bits, almacena datos numericos de punto flotante (real)
		// 2^32
		// IMPORTANT: Las literales numericas de punto flotante son de tipo double por default
		// Para indicar una literal numerica de tipo float, hay que indicar
		// la literal con la letra f o F
		float myVarFloat = 1500.6523F;
		System.out.println(myVarFloat);
		System.out.println("Float, Max Value: " + Float.MAX_VALUE);
		System.out.println("Float, Min Value: " + Float.MIN_VALUE);
			
		// El tipo double equivale a 64 bits, almacena datos de punto flotante
		// 2^64  
		double myVarDouble = 1500.6523;
		System.out.println(myVarDouble);
		System.out.println("Double, Max Value: " + Double.MAX_VALUE);
		System.out.println("Double, Min Value: " + Double.MIN_VALUE);
		
		// --------------------------------------------------------
		// El tipo boolean solo almacena valores true o false
		 boolean myVarBoolean = true;
		 System.out.println("Valor Boolean: " + myVarBoolean);
		// El tipo char solo almacena un caracter, se debe definir la literal
		// entre apostrofes simples ej. 'a' no dobles "" (los dobles "" son para String).
		// Solo almacena caracteres de la tabla unicode (16 bits)
		// puede almacenar del 0 al 65535 digitos.
		 char losPandillerosDeLaTarde = 'I';
		 System.out.println("char: " + losPandillerosDeLaTarde);
		// Podemos definir un char por su código UNICODE o su valor numerico
		 char letraL = '\u004C'; // Esta es la forma de definir un caracter UNICODE
		 System.out.println("La letra L: " + letraL);
		 	
		 char letraM = 77; // Esta es la forma de definir un caracter con su valor numerico
		 System.out.println("La letra M: " + letraM);
		 	
		 // ----------------------------------------------------------
		 // Formas de representar un numero
		 // Representación decimal
		 System.out.println("Representacion decimal: " + 26);
		 // Representacion hexadecimal
		 System.out.println("Representacion hexadecimal: " + 0x1a);
		 // Representacion binaria
		 System.out.println("Representacion binaria: " + 0b11010);
		 // Para las literales numericas se puede usar el guion bajo (_) para separar numeros y
		 // esto es para distinguir decenas, centenas, etc.
		 // Pero no se puede poner _ al inicio o al final del numero o literal
		 // No se puede escribir _ junto a un punto decimal
		 // No se puede escribir _ antes de la F o L de (float y long)
		 
		 int numeroSeparados = 12_345; // es valido
		 float numerosFloatSeparados = 12_345.456_346F; // es valido
		 
	}

}
