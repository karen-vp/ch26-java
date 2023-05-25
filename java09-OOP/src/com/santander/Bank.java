package com.santander;
import java.util.ArrayList;

public class Bank {
	
	// Atributos de instancia
	String address;
	int sucursalNumber;
	ArrayList<ATM> ATMs;
	
	// Bloque de inicializacion
	{
		// Estamos instanciando un objeto de tipo ArrayList
		ATMs = new ArrayList<>();
	}
	
	// Atributo de clase
	static int counterBank = 1;
	
	// Constructor default
	// El constructor por default es el que no tiene parametros de entrada
	Bank(){
		sucursalNumber = counterBank++;
	}
	
	Bank(String address ){
		this(); // invoca al constructor por default
		this.address = address;
	}
	
	String getATMs() {
		String text = "";
		for (ATM Atm : ATMs) {
			text += Atm.serialNumber + " $" + Atm.balance + "\n";
		}
		return text;
	}
	
}
