package com.generation.test;

// Importamos la api de junit 5 y los métodos de ese paquete
import org.junit.jupiter.api.*;
// Importamos los métodos de junit 5 en ese paquete especifico
import static org.junit.jupiter.api.Assertions.*;


// Importamos la clase Math que creamos
import com.generation.utils.Math;
public class MathTest {
	
	Math math = new Math();
	
	/*
	 * Para hacer una prueba unitaria, le debemos colocar,
	 * el identificador @Test.
	 * 
	 * @DisplayName es para mostrar una pequeña descripcion de
	 * la prueba unitaria
	 */
	@Test
	@DisplayName("Sumatoria de números enteros")
	void sumaTest() {
		// se utiliza el método assertEquals para hacer la prueba unitaria
		// con junit 5
		assertEquals(9, math.suma(8, 1), "Suma de 1 unidad");
		assertEquals(54, math.suma(44, 10), "Suma de decenas");
		assertEquals(1400, math.suma(800, 600), "Suma de centenas");
		assertEquals(100_000, math.suma(90_000, 10_000), "Suma de millares");
		
		assertEquals(-7, math.suma(8, -15), "Suma de 1 unidad negativa");
		assertEquals(-34, math.suma(-44, 10), "Suma de decenas");
		assertEquals(200, math.suma(800, -600), "Suma de centenas");
		assertEquals(-80_000, math.suma(-90_000, 10_000), "Suma de millares");
	}
	
	@Test
	@DisplayName("Sumatoria de numeros de punto flotante")
	void sumaDoubleTest() {
		/* Una forma de resolver los problemas con los decimales es
		 * de la siguiente manera en el método suma sobrecargado:
		 * return (a*1000 + b*1000)/1000;
		 * 
		 * Otra forma es con un delta con valor de 0.001, el cual
		 * va a sumar y restar decimales segun corresponda (algo así)
		 * 
		 */
		double delta = 0.001;
		assertEquals(10.02 , math.suma(10.01, 0.01), delta,  "Suma de 1 centésima");
		assertEquals(10.04 , math.suma(10.02, 0.02), delta, "Suma de 2 centésima");
		assertEquals(10.06 , math.suma(10.03, 0.03), delta, "Suma de 3 centésima");
		assertEquals(10.08 , math.suma(10.04, 0.04), delta, "Suma de 4 centésima");
		assertEquals(10.10 , math.suma(10.05, 0.05), delta, "Suma de 5 centésima");
		assertEquals(10.12 , math.suma(10.06, 0.06), delta, "Suma de 6 centésima");
		assertEquals(10.14 , math.suma(10.07, 0.07), delta, "Suma de 7 centésima");
		assertEquals(10.16 , math.suma(10.08, 0.08), delta, "Suma de 8 centésima");
	}
}