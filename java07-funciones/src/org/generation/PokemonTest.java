package org.generation;

public class PokemonTest {

	public static void main(String[] args) {
		
		// Aqui estamos accediendo a un atributo estatico de la clase Pokemon
		System.out.println("Los pokemones son: " + Pokemon.nacimiento);
		
		Pokemon pikachu = new Pokemon("Pikachu", 41, 10);
		Pokemon squirtle = new Pokemon("Squirtle", 45, 20);
	
		
		System.out.println(pikachu.nombre);
		System.out.println(squirtle.nombre);

	}

}
