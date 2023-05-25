package org.generation;

public class OperacionesTest {

	public static void main(String[] args) {
		System.out.println("Java 07 Funciones");
		
		OperacionesMath operaciones;
		operaciones = new OperacionesMath();
		
		operaciones.sumaEnterosSinRetorno(35, 5); // 40
		operaciones.sumaEnterosSinRetorno(3, 3); // 6
		
		// Esta llamada a la funcion de instancia la estamos guardando en una variable
		// de tipo int para imprimir el resultado posteriormente.
		int resultado = operaciones.sumaEnteros(10, 9); // 19
		System.out.println(resultado);
		
		System.out.println(operaciones.sumaFlotantes(4.5, 5.5));
		System.out.println(operaciones.sumaFlotantes(4.01, 5.02));
		
		System.out.println(operaciones.suma(3.5, 3.4));
		System.out.println(operaciones.suma(3.5, 3.4, true));
		System.out.println(operaciones.suma(3, 3));
		
		System.out.println(operaciones.raizCuadrada(15.0));
		System.out.println(operaciones.raizCuadrada(15));
		
		// Usar metodo estatico
		// Estos se deben llamar desde la Clase, no desde las instancias de la Clase (objetos)
		// Desde la clase solo podemos usar los métodos estaticos, no se pueden acceder  
		// a los métodos o funciones de instancia
		System.out.println(OperacionesMath.valorPi());
		System.out.println(OperacionesMath.piPorNumero(3));
	}

}
