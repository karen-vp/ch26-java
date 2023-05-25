package org.generation;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CajeroAutomatico {

	public static void main(String[] args) {

		/*
		 * Fecha de entrega: Miercoles 24 de mayo 22 hrs Entrega: link de replit
		 * 
		 * 
		 * Hacer un menú de un cajero automatico:
		 * 
		 * Condiciones iniciales: La persona va a empezar con una cantidad de $10,000
		 * pesos
		 * 
		 * Opciones del cajero: 1) Retirar dinero - Mostrar cantidad dispobible a
		 * retirar - No se puede retirar mas de $6,000 pesos - Solo retirar multiplos de
		 * $50 - Preguntar si desea donar $200 para los Gatetes 2) Hacer depositos -
		 * Mostrar un menu con las opciones 1> Cuenta de cheques (sumar al saldo
		 * disponible) (Solo multiplos de $50) 2> Deposito a tarjeta de credito
		 * (Restaral saldo disponible) (se pueden incluir decimales (2 decimales)) 3)
		 * Consultar saldo - Indicar el saldo disponible 4) Quejas
		 * -"No disponible por el momento" 5) Ver ultimo movimiento - El ultimo
		 * movimiento (depositos o retiros) (mostrar en formato de fecha, ej. YYYY / MM
		 * / DD hh:mm Retiro de $500) (YYYY / MM / DD hh:mm Deposito a TC de $300.12 9)
		 * Salir del cajero - Se despide y se sale del sistema
		 * 
		 * Nota: -Si se pulsa una opcion invalida (ej. 6, 7 u 8), debe mostrar el
		 * siguiente mensaje "Opcion invalida, vuelve a intentarlo"
		 * 
		 * - Si por 3 veces consecutivas se pulsa una opcion invalida se despide y se
		 * debe salir del sistema - En caso de que se pulso una opcion invalida y luego
		 * se pulsa una opcion valida, esto no debería contar como parte de las veces
		 * consecutivas
		 */
		Scanner myScan = new Scanner(System.in);
		int option;
		int saldo = 10_000;
		double cuentaDeCredito = 0.00;
		String ultimoMovimiento = "";
		int intentos = 0;
		
		do {

			System.out
					.print("Elige una opción: \n 1) Retirar dinero \n " + "2) Hacer deposito \n 3) Consultar saldo \n "
							+ "4) Quejas \n 5) Ver último movimiento \n " + "9) Salir del cajero");

			option = myScan.nextInt();

			switch (option) {
			case 1:

				System.out.println("Tu saldo es de: " + saldo);
				System.out.print("¿Cuanto dinero quiere retirar? \n " + "(Puedes retirar hasta $6000.00 pesos ");
				int cantidadARetirar = myScan.nextInt();
				if ((cantidadARetirar % 50 == 0) && (cantidadARetirar < 6000)) {
					saldo -= cantidadARetirar;
					System.out.print("¿Deseas donar $200 pesos a los Gatetes (s/n)");
					char donacion = myScan.next().toLowerCase().charAt(0);
					if (donacion != 's') {
						System.out.println("Has retirado " + "$" + cantidadARetirar + " Tu nuevo saldo es: " + saldo);
						ultimoMovimiento = "Retiro de $" + cantidadARetirar;
						continue;
					} else {
						saldo -= 200;
						System.out.println("Has retirado " + "$" + cantidadARetirar + " y has donado $200 a los Gatetes"
								+ " Tu nuevo saldo es: " + saldo);
						ultimoMovimiento = "Retiro de $" + cantidadARetirar;
					}
				} else {
					System.out.println("No es posible retirar esa cantidad");
				}
				break;
			case 2:
				System.out.print(
						"Elige una opcion: \n " + "1) Cuenta de cheques \n" + "2) Depósito a tarjeta de crédito");
				int opcionDeposito = myScan.nextInt();
				int cantidadADepositar;

				switch (opcionDeposito) {
				case 1:
					System.out.print("¿Cuanto desea depositar?");
					cantidadADepositar = myScan.nextInt();
					if (cantidadADepositar > saldo) {
						System.out.println("No hay fondos suficientes");
					} else if (cantidadADepositar % 50 == 0) {
						saldo += cantidadADepositar;
						System.out.println("Tu nuevo saldo es: " + saldo);
						ultimoMovimiento = "Deposito de $" + cantidadADepositar;
					}
					break;
				case 2:
					System.out.print("¿Cuanto desea depositar?");
					cantidadADepositar = myScan.nextInt();
					if (cantidadADepositar > saldo) {
						System.out.println("No hay fondos suficientes");
					} else {
						cuentaDeCredito += cantidadADepositar;
						saldo -= cantidadADepositar;
						System.out.println("Tu nuevo saldo de cuenta de cheques es: " + saldo);
						System.out.println("El saldo en tu tarjeta de crédito es: " + cuentaDeCredito);
						ultimoMovimiento = "Deposito de a TC $" + cantidadADepositar;
					}
					break;
				default:
					System.out.println("Esta opción no es válida");
					break;
				}
				break;
			case 3:
				System.out.println("Tu saldo actual es: " + saldo);
				break;
			case 4:
				System.out.println("No disponible por el momento");

				break;
			case 5:
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
				dateFormat.format(date);
				System.out.println(date + " " + ultimoMovimiento);
				break;
			case 6, 7, 8:
				System.out.println("Opcion invalida, vuelve a intentarlo");
				intentos++;
				break;
			case 9:
				System.out.println("Muchas gracias por usar nuestros servicios, hasta pronto");
				break;
			}
			
		} while (option != 9 && intentos < 3 );
		intentos = 0;
		System.out.println("Fin del programa");

		myScan.close();
	}

}
