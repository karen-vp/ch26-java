package com.mundoanimal;

public class Wolf extends Canine {

	//Atributo de instancia
	private String rol; 
	
	// Constructor
	public Wolf(String name, String rol) {
		super(name);
		this.rol = rol;
	}
	
	// Setters y Getters 
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}

	// El método showPicture se tiene que implementar porque es un
	// método abstracto y porque hereda de la clase padre Canine
	@Override
	public String showPicture() {
		
		return "https://es.wikipedia.org/wiki/Canis_lupus\r\n";
	}
	
	// método sobrecargado (override), que se lo heredo la clase Canine
		@Override
		public String makeNoise() {
			return "AAAaauuuuu AAAaauuuuu AAAaauuuuu";
		}
	
	
	
	

}
