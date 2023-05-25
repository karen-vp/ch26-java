package com.santander;

public class ATMTest {

	public static void main(String[] args) {
		/*
		 * Para utilizar los atributos/métodos de Clase no se requiere una instancia, 
		 * se usa directamente de la Clase
		 */
		String firstBankName = ATM.bankName; // atributo
		String bankName = ATM.getBankName(); // método
		System.out.println(bankName);
		System.out.println(firstBankName);
		
		
		// Instancias un objeto de la clase
		ATM cajeroA = new ATM("A1", 50_000.00);
		ATM cajeroB = new ATM("A2", 75_000.00);
		ATM cajeroC = new ATM(60_000.00);
		ATM cajeroD = new ATM(65_000.00);
		ATM cajeroE = new ATM(70_000.00);
		
		System.out.println(cajeroA.serialNumber + " $" + cajeroA.getBalance());
		System.out.println(cajeroB.serialNumber + " $" + cajeroB.getBalance());
		System.out.println(cajeroC.serialNumber + " $" + cajeroC.getBalance());
		System.out.println(cajeroD.serialNumber + " $" + cajeroB.getBalance());
		System.out.println(cajeroE.serialNumber + " $" + cajeroC.getBalance());
	}

}
