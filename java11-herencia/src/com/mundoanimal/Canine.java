package com.mundoanimal;

/**
 * Para aplicar la herencia, en la definicion de la clase 
 * agregamos la palabra 'extend' e indicamos la clase superior.
 * 
 * Para conocer si estamos aplicando adecuadamente la herencia,
 * podriamos preguntarnos con "is-A" (¿es un?) 
 * Ejemplo:
 * 	a Canine is a Animal? Si.
 * 
 * @author Karen
 */

// Esta clase es abstracta y hereda de la clase Animal
public abstract class Canine extends Animal {
	
	public Canine(String name) {
		// inicializando el constructor de mi clase super (clase padre)
		super(name);
	}

	/* El @Override es para identificar y verificar una
	* sobreescripcion de un método abstracto, es decir, 
	* indica que el método esta sobreescribiendo el comportamiento de un 
	* método de la clase heredada. Su proposito es hacer una verificación en 
	* tiempo de compilación para asegurarse que la subclase está sobreescribiendo 
	* correctamente y coincide con la firma del método de la clase superior.
	* 
	* Estamos sobreescribiendo (Overriding) el método de nuestra clase superior.
	* 
	* La sobreescritura debe tener la misma firma del método de la clase superior.
	* 
	* La sobreescritura permite que una subclase proporcione una implementación
	* diferente a un método que está definido en la clase superior. es decir,
	* permite personalizar el comportamiento heredado.
	*/
	
	// se utiliza super para hacer referencia que este método es de la clase padre
	@Override
	public String eat(String food) {
		return "El canino " + super.getName() + " come " + food;
	}
	// Sobrecarga (Overload)
	public String eat(String food, double kg) {
		return "El canino " + super.getName() 
		 + " come " + kg + " kg. de " + food ;		
	}
	
	public String makeNoise() {
		return "grrr";
	}
	

	/*
	 * Al ser la clase Canine abstracta, no tiene la obligación de 
	 * realizar la implementacion en el método abstracto 'showPicture'.
	 */
}
