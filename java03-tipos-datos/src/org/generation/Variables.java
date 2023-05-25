package org.generation;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Reglas para el nombre de las variables - Se distingue entre minusculas y
		 * mayusculas - La longitud del nombre es ilimitada - Puedes utilizar cualquier
		 * caracter Unicode - La variable puede comenzar con: > una letra, ej.
		 * miVariable PERO NO SE RECOMIENDA CON LOS SIGUIENTES: > signo de dolar $, ej.
		 * $miVariable > caracter de subrayado _, _miVariable
		 * 
		 */

		int $myVar; // es valido, pero no se recomienda
		int _myVar; // es valido, pero no se recomienda
		// int #myVar; // no es valido
		int myVarEspañol; // es valido, pero no se recomienda, de preferencia nombres en ingles
		// int 5comentarios;// no es valido, no se puede comenzar con un numero
		int sinC0m3nt4r10s; // es válido

		/*
		 * En Java tendremos los siguientes tipo de variables: Variables de instancia
		 * (Non static fields): atributos de los objetos Variables de clase (Static
		 * Fields): atributos de la clase. Variables locales (local variables): variable
		 * dentro de las funciones (métodos) Parámetros (parameters): Entrada de las
		 * funciones.
		 * 
		 */

		/*
		 * Tipos de datos en Java - Objetos - Datos primitivos Tenemos 8 datos
		 * primitivos: > byte > short > int > long > float > double > boolean > char
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
		// el tipo Byte solo puede almacenar maximo hasta el numero 127 y minimo al
		// numero -128
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
		// 2^32= 4,294,967,296, puede almacenar hasta 4,294,967,296 digitos
		int myVarInt = 1000;
		System.out.println(myVarInt);
		// El wrapper para int es Integer
		System.out.println("Int, Max Value: " + Integer.MAX_VALUE);
		System.out.println("Int, Min Value: " + Integer.MIN_VALUE);

		// El tipo long es de 64 bits, almacena datos numericos enteros
		// 2^64 almacena 2^64 digitos
		long myVarLong = 1500;
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

		// El tipo float equivale a 32 bits, almacena datos numericos de punto flotante
		// (real)
		// 2^32
		// IMPORTANT: Las literales numericas de punto flotante son de tipo double por
		// default
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
		// entre apostrofes simples ej. 'a' no dobles "" (los dobles "" son para
		// String).
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
		// Para las literales numericas se puede usar el guion bajo (_) para separar
		// numeros y
		// esto es para distinguir decenas, centenas, etc.
		// Pero no se puede poner _ al inicio o al final del numero o literal
		// No se puede escribir _ junto a un punto decimal
		// No se puede escribir _ antes de la F o L de (float y long)

		int numeroSeparados = 12_345; // es valido
		float numerosFloatSeparados = 12_345.456_346F; // es valido

		// ------------------------------------------------
		// Conversion de tipos de datos
		byte coquita600ml = 60;
		// upcasting, esto quiere decir que, vamos a guardar el dato de esta variable
		// (byte)
		// a otra variable con un tipo superior en este caso de tipo short
		short coquita2000ml = coquita600ml;

		// downcasting, aquí en este ejemplo convierte del tipo short al tipo byte
		// se toman los bits correspondientes del tipo de variable al que se convierta,
		// short equivale a 16 y byte a 8, por lo tanto cuando se convierte el
		// tipo de dato de short a byte, ahora en lugar de tener 16 bits,
		// ahora tenemos 8 bits.
		short pozoleGrande1L = 10;
		byte pozoleBurbuja = (byte) pozoleGrande1L; // downcasting
		System.out.println("Pozole burbuja " + pozoleBurbuja);

		// -------------------------------------------------
		// Objetos de tipo String
		// Se definen dentro de comillas dobles ""
		String myVarString = "Holi Crayoli";
		System.out.println("Mensaje string: " + myVarString);
		// Si deseas imprimir comillas dobles en el mensaje, se usa el caracter
		// de escape \
		String mySecondString = "Holi \"Crayoli\"";
		System.out.println("Mensaje string: " + mySecondString);

		// Comodines para los strings
		// \b (backspace), \t (tab), \n (line feed), \f (form feed),
		// \r (carriage return), \" (double quote), \' (single quote),
		// and \\ (backslash).

		// Convertir de string a numeros
		// Aquí estamos convirtiendo un string a tipo byte
		byte edadMascota = Byte.parseByte("10");
		double edadPlaneta = Double.parseDouble("456.8956");
		System.out.println(edadMascota + ", " + edadPlaneta);
		// Convertir numeros a String
		String edadString = String.valueOf(4568);
		// Obteniendo la longitud de un String
		System.out.println("El numero de digitos en edadString = " + edadString.length());
		// Obteniendo el primer caracter de un string
		System.out.println("El segundo caracter de " + edadString + "es: " + edadString.charAt(1));

		// ----------------------------------------
		// Operadores numéricos
		int opA = 5;
		int opB = 6;
		int suma = opA + opB;
		int resta = opA - opB;
		double multiplicaDouble = opA * opB * 1.01;
		// se hace un cast de toda la operacion porque la estamos multiplicando
		// por un tipo double 1.01, porque los enteros no pueden guardar
		// valores de punto flotante
		int multiplica = (int) (opA * opB * 1.01);
		int division = opA / opB;
		// se hace un cast de opA, porque tanto opA como opB son enteros
		// y se requiere que el resultado sea de tipo double
		double divisionDouble = (double) (opA) / opB;
		// esto nos devuelve un double porque al multiplicar opA de tipo int
		// por 1.0 que es double, el resultado sera double.
		double divisionDouble2 = 1.0 * opA / opB;
		int residuo = opA % 2;

		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplica);
		// Esto es para obtener precision en mis decimales
		System.out.println((0.1 * 1000 + 0.2 * 1000) / 1000);
		System.out.println(division);
		System.out.println(divisionDouble);
		System.out.println(divisionDouble2);
		System.out.println("Residuo de 5%2 = " + residuo);

		// --------------------------------
		// Preincremento y Postincremento
		int valorInicial = 10;
		System.out.println("Preincremento: " + ++valorInicial);// 11
		System.out.println("Postincremento: " + valorInicial++);// 11
		System.out.println("Valor final: " + valorInicial);// 12
		valorInicial = 33;
		System.out.println("Predecremento: " + --valorInicial);// 32
		System.out.println("Postdecremento: " + valorInicial--);// 32
		System.out.println("Predecremento: " + valorInicial);// 31

		// Operaciones con valores enteros
		byte edadGato = 10;
		// Las literales numericas por ejemplo: 2, son de tipo int, por eso
		// es importante hacer un cast de esos datos para poder almacenarlo
		// en el tipo correspondiente (en este caso short)
		short dobleDeEdad = (short) (edadGato * 2);

		// Para evitar todo esto, es mejor trabajar con tipo int desde que
		// declaramos las variables, porque si vamos a hacer una operacion
		// como multiplicar, no es necesario declararlo con tipos de datos menores
		// porque a fin de cuentas se hace un cast de datos.

		int edadGato2 = 10;
		int dobleDeEdad2 = edadGato2 * 2;

		// -------------------------------------------------------------
		// Operadores comparativos
		// El resultado es boolean
		// <, <=, >, >=, ==, !=
		int numEmpleados = 1000;
		System.out.println("Empleados > 1000: " + (numEmpleados > 1000));
		System.out.println("Empleados >= 1000: " + (numEmpleados >= 1000));
		System.out.println("Empleados == 1000: " + (numEmpleados == 1000));
		System.out.println("Empleados != 1000: " + (numEmpleados != 1000));

		// -------------------------------------------------------------
		// Operadores lógicos
		// && (AND) retorna true si ambos operadores son true
		// || (OR) retorna true si cualquiera de los operandos es true
		// ! (NOT) invierte el resultado booleano

		System.out.println("Empleados > 0 && Empleados < 2000 es " + (numEmpleados > 0 && numEmpleados < 2000));

		boolean a = true;
		boolean b = false;
		boolean c = true;
		System.out.println((a && b) || (a && c)); // true
		System.out.println(a || b || c && a); // true
		System.out.println(!(a || b) && (!a && c)); // false
		System.out.println(a || b && c || a && b);// true

		// ------------------------------------------------
		// En Java ocurre una excepcion cuando se intenta dividir un numero sobre cero
		// int divicionPorCero = 45/0; 
		// System.out.println(divicionPorCero);
		
	}

}
