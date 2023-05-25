package org.generation;

import java.util.Date;

public class OperacionesMath {
	
	// Atributos
	// Atributos de instancia (non-static fields)
	// Atributos de clase (static fields)
	
	// Si tiene la palabra static es funcion de clase y si no lo tiene es funcion de instancia
	// funcion de instancia sin retorno
	// void indica que mi funcion no va a tener retorno
	void sumaEnterosSinRetorno(int a, int b){
		// instanciando un objeto de tipo Date y se tiene que importar para poder usarlo
		Date date = new Date();
		// %tT con este indico la fecha
		// %d con este indico decimales
		// %n con este indico saltos de linea
		System.out.printf("%tT %d + %d = %d %n",date, a, b, a+b);	
	}
	
	// funcion de instancia con retorno, le tenemos que indicar de que tipo es el retorno
	// en este caso int y se coloca antes del nombre de la funcion
	int sumaEnteros(int a, int b) {
		return a + b;
	}
	
	double sumaFlotantes (double a, double b) {
		return a + b;
	}
	
	// Sobrecarga de métodos (overload)
	// Esto es, funciones con el mismo nombre pero con diferentes parámetros,
	// es decir los parametros de entrada deben ser diferentes (de diferente tipo, aquí
	// no importa el nombre de los parametros, lo que importa es el tipo de dato)
	int suma(int a, int b) {
		return a + b;
	}
	
	int suma(short a, short b) {
		return a + b;
	}
	
	double suma(double dataA, double dataB) {
		return dataA + dataB;
	}
	
	double suma(int a, double b) {
		return a + b;
	}
	
	// incluso si cambias el orden de los parametros (su tipo de dato) es un metodo sobrecargado
	double suma(double a, int b) {
		return a + b;
	}
	// Podemos incluir hasta un tercer parametro
	double suma(double dataA, double dataB, boolean redondear) {
		if(redondear)
			return Math.round(dataA + dataB);
		return dataA + dataB;
	}
	
	// Sobrecarga de un método que realice la raiz cuadrada de un valor.
	// Un método lo retorna como int,
	// Otro método lo retorna como double
	double raizCuadrada(double numero) {
		return Math.sqrt(numero);
	}
	
	// Comentando funciones
	/**
	 * Obtener la raiz cuadrada de un numero
	 * @param numero valor a obtener la raiz
	 * @return raiz cuadrada redondeada
	 */
	int raizCuadrada(int numero) {
		// con Math.round redondeamos el resultado de la raiz cuadrada
		// con (int) truncamos el resultado y estamos haciendo un casteo del valor a un tipo int
		return (int) (Math.round(Math.sqrt(numero)));
	}
	
	// Métodos estaticos (static methods)
	/*
	 * Los métodos estáticos se asocian a la clase en lugar de la instancia.
	 * Se pueden invocar sin tener que instanciar un objeto.
	 * 
	 * Los métodos estaticos solo pueden invocar otros métodos estaticos dentro
	 * de la clase
	 * 
	 */
	
	static double valorPi() {
		return Math.PI;
	}
	
	static double piPorNumero(int numero) {
		return numero * valorPi();
	}
	
	
}
