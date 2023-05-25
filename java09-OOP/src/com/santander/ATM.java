package com.santander;

public class ATM {
	
	// Atributos de instancia (non-static fields)
	String serialNumber; // null
	double balance; // 0.0
	
	// Atributos de clase (static fields)
	static String bankName; 
	static int counterATM;
	
	/* Estos Bloques de inicializacion no son muy comunes en desarrolladores
	 * Se ejecuta cuando se crea la instancia
	 * Bloque de inicializacion de atributos de instancia
	 * Si no se inicializa el valor de un atributo, se le asignaran valores por defecto
	 * String = null
	 * double = 0.0
	 * boolean = false, etc..
	 */
	{
		serialNumber = "";
		balance = 100_000.00;
	}
	
	/* Estos Bloques de inicializacion no son muy comunes en desarrolladores
	 * Bloque de inicializacion de atributos de clase
	 */
	static {
		bankName = "Santander S.A de C.V";
		counterATM = 1;
	}
	
	/*
	 * Sobrecarga de Constructor
	 * 
	 */
	ATM(double balance){
		this.balance = balance;
		this.serialNumber = Integer.toString(counterATM++);
	}
	
	/* Constructores
	 * Los constructores pueden tener el mismo nombre de la Clase
	 * NO llevan RETORNO
	 * Entre parentesis van los argumentos que seran iguales a los atributos de instancia
	 * para ello se utiliza la palabra reservada this, la cual se refiere al atributo de instancia
	 * Se recomienda llamar los argumentos de la misma manera que los atributos de instancia
	 */
	ATM(String serialNumber, double balance){
		// this.serialNumber = serialNumber;
		//this.balance = balance;
		// No se quitan los argumentos en el constructor para 
		// evitar errores con instancias ya creadas.
		// Para llamar a otro constructor, para ello se usa this()
		// Reglas para invocar al constructor:
		//  -Tiene que ser la primera linea
		// ATM(), la variable balance se le pasa
		// como argumento al otro constructor
		// Aquí se esta invocando a otro constructor, en pocas palabras,
		// y se le va a pasar como argumento el balance.
		// NOTA IMPORTANTE: El constructor que vayamos a utilizar se 
		// identifica por medio de los argumentos que pida ese constructor
		this(balance); 
		
	}
	
	// Métodos de instancia
	double getBalance() {
		return this.balance;
	}
	
	/* Métodos de clase
	 * Hay que ponerle la palabra reservada static, 
	 * para indicar que es un método de clase
	*/
	static String getBankName() {
		return "Bank: " + bankName;
	}
	
	
}
