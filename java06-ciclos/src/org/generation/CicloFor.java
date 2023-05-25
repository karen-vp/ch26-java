package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sintaxis:
		 * 
		 * for(expresion_inicial; comparación; expresion final){
		 * 		instrucciones;
		 * }
		 * 
		 */
		
		//Imprimir 5 veces "Hola"
		
		//for(int i=1; i<=5; i++){
		//	System.out.println("Hola " + i);
		//}
		
		// imprimir la tabla de multiplicar del 1 al 3
		
		//for(int i= 1; i<=3; i++) {
		//	for(int j= 1; j<=10; j++) {
				//System.out.println(i + "x" + j + "=" + i * j);
				
				// Esta es otra forma de imprimir en consola sin concatenar
				// con %d se pone para especificar que va a ir un numero decimal ahí
				// el 2 antes del %d le decimos que reserve 2 espacios para los decimales
				// de 2 dígitos
				// el 0 antes de %2 es para colocarle un 0 antes al numero que solo
				// sea de 1 digito
				// con %n se pone un salto de linea
				// la desventaja de printf es su tiempo de ejecucion por que le da formato
				//System.out.printf("Tabla %2d * %2d = %02d%n", i,j,i*j);
			//}
			//System.out.println("---------------");
		//}
		
//		int iteraciones = 1; // mi variable de inicio
//		for( ; ; ) {
//			if(iteraciones > 5)break; // condicion
//			System.out.println("Iteración: " + iteraciones++); //mi incremento
//		}
		
		// outerLoop es un label oara hacer referencia al ciclo externo
//		outerLoop:
//			for(int i = 0; i <5; i++) {
//				for(int j = 0; j < 5; j++) {
//					System.out.println(i + " " + j);
//					if(i==2 && j==2)break outerLoop;
//				}
//			}
//		
		// Imprimir los números impares del 1 al 20 
		// 1
		// 3
		// 5
		// 7
		
		for(int i = 1; i <= 20; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println("------------");
		//Usando continue
		for(int i = 1; i <= 20; i++) {
			if(i%2==0)continue; //continue nos dice que continuemos con la siguiente
			//instrucción
				System.out.println(i);
		}
		
		
		
		
	}

}
