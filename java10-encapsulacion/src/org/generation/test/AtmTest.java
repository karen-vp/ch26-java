package org.generation.test;

import com.citibanamex.Atm;

public class AtmTest {

	public static void main(String[] args) {
//		System.out.println(Atm.counterAtm);
//
//		Atm cajeroA = new Atm(10_000);
//		// Al usar el constructor por default, se agregue
//		// 100_000 al atributo balance
//		Atm cajeroB = new Atm();
////		cajeroA.balance = 10_000;
//		System.out.println("Cajero A: "+ "No. Serie: " + cajeroA.serialNumber 
//				+ " Balance: " + cajeroA.balance);
//		System.out.println("Cajero B: "+ "No. Serie: " +  cajeroB.serialNumber +
//				" Balance: " +cajeroB.balance);

		System.out.println("Counter Atm: " + Atm.getCounterAtm());

		Atm cajeroA = new Atm(9_000);
		Atm cajeroB = new Atm();
		Atm cajeroC = new Atm("777000");
		
		/*
		 * Se implementa el try-catch para manejar las excepciones
		 * que puedan ocurrir al hacer uso de los métodos.
		 */

		try {
			cajeroA.deposit(4_000);
			System.out.println(cajeroA.displayInfo());
			cajeroA.withdraw(2_500);
			System.out.println(cajeroA.displayInfo());
			cajeroA.withdraw(1_000);
			cajeroA.withdraw(500);
			System.out.println(cajeroA.displayInfo());

			// Nos imprime todos los elementos realizados
			System.out.println(cajeroA.getLog());
			
			// Estas dos operaciones son las que causan las excepciones
			// cajeroA.withdraw(-300);
			// cajeroA.withdraw(300_000);
			/* Con Exception se puede consumir cualquier tipo de excepcion,
			 * pero siempre devuelve la primera excepcion.
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

		// nos imprime todos los elementos realizados que le indiquemos
		System.out.println(cajeroA.getLog(2));

	}

}
