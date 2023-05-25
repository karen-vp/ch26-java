package com.mundoanimal;

/*
 * Con implements se le indica que implemente una interfas,
 * en este caso Pet
 */
import com.pet.Pet;

public final class Chihuahua extends Dog implements Pet {

	private String ownerName;
	// final indica que esto es una constante y no cambia el valor
	// y se pone en mayusculas y en los espacios un guion bajo
	static final String COUNTRY_OF_ORIGIN = "México";
	
	public Chihuahua(String name) {
		super(name);
	}

	// método sobrecargado (override), que se lo heredo la clase Canine
	@Override
	public String makeNoise() {
		return "wau wau wau ... wau wau wau";
	}

	/*
	 * Metodos abstractos de la interfaz Pet, estos nos piden que los implementemos
	 * en esta clase, porque estamos usando la interfaz Pet
	 */
	@Override
	public String trick() {
		
		return "muevo la colita como helicoptero";
	}

	@Override
	public void setOwnerName(String name) {
		this.ownerName = name;

	}

	@Override
	public String getOwnerName() {
		
		return this.ownerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\tChihuahua [ownerName=");
		builder.append(ownerName);
		builder.append("]\n");
		return builder.toString();
	}
	

}
