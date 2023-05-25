package com.mundoanimal;

public class Malinois extends Dog{

	public Malinois(String name) {
		super(name);
	}
	
	// método sobrecargado (override), que se lo heredo la clase Canine
	@Override
	public String makeNoise() {
		return "guaf guaf guaf";
	}

}
