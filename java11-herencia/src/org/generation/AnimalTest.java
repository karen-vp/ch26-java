package org.generation;

import java.util.ArrayList;

//con * importamos todas las clases que se estén utilizando de ese paquete
import com.mundoanimal.*;

public class AnimalTest {

	public static void main(String[] args) {

		// No se puede instanciar una clase abstracta
		// Animal myAnimal = new Animal();

		// No se puede instanciar una clase abstracta
		// Canine myCanine = new Canine("Canine anonymus");

		// Esta variable de tipo Dog, solo puede contener perros
		// Dog solovino = new Dog("Solovino");

		// Esta variable de tipo Animal, puede contener cualquier tipo de animal
		Animal solovino = new Dog("Solovino");

		// Aquí se esta aplicando el polimorfismo
		System.out.println(solovino.eat("Croquetas"));

		// Para que solovino pueda visualizar el método sobrecargado eat,
		// se tiene que hacer un downcasteo de Animal a Dog

		System.out.println(((Dog) solovino).eat("Croquetas", .300));

		/*
		 * Hacer una clase chihuahua, y una clase malinois que van a heredar(extends) de
		 * la clase Dog. Sobreescribir (override) el método makeNoise() en esas clases
		 * hijas para que ladre como el tipo de perro
		 */

		Animal hercules = new Chihuahua("hercules");
		Animal benancio = new Malinois("benancio");
		Animal colmillo = new Wolf("Colmillo", "Alfa");
		Animal jacob = new Wolf("Jacob", "Beta");

		// Creamos un ArrayList de tipo animal
		ArrayList<Animal> shelter = new ArrayList<>();
		// Agregamos los animales al ArrayList
		shelter.add(solovino);
		shelter.add(hercules);
		shelter.add(colmillo);
		shelter.add(jacob);
		
		// For each en el ArrayList para ejecutar la funcion makeNoiseCanine 
		// para cada animal
		shelter.forEach(animal -> makeNoiseCanine(animal));
		
		System.out.println(((Chihuahua)hercules).trick());
		System.out.println(((Chihuahua)hercules).greeting());
		System.out.println(hercules);
		System.out.println(shelter);
	}
	/**
	 * Método para que los caninos hagan ruido
	 * @param canine objeto de tipo Dog que es hijo de Animal
	 */

	public static void makeNoiseCanine(Animal canine) {
		if (canine instanceof Canine) {
			System.out.println(canine.getName() + " hace el ruido: " + ((Canine) canine).makeNoise());
		}else {
			System.out.println("Esto no es un canino");
		}
	}

}
