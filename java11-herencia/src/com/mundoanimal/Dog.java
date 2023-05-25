package com.mundoanimal;

public class Dog extends Canine {

	public Dog(String name) {
		// hace referencia a la clase Canine
		// El super hace referencia a la clase padre en este caso Canine
		super(name); 
		
	}
	
	/*
	 * Aquí ya tenemos que hacer la implementacion del método abstracto
	 * de la clase super (Canine) porque esta clase es una clase concreta
	 * y no abstracta.
	 * Hacemos un override del método para hacer su implementación
	 */
	@Override
	public String showPicture() {
		
		return "http://" + super.getName() + ".com";
	}
	// Aquí estamos haciendo un override del método eat, 
	// para que el método imprima algo diferente, en este caso
	// el tipo de animal
	@Override
	public String eat(String food) {
		return "El perro " + super.getName() + " come " + food;
	}

	
}
