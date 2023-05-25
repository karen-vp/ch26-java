package com.mundoanimal;

/*
 * TODAS LAS CLASES POR DEFAULT HEREDAN DE LA CLASE OBJECT
 * 
 * Las clases abstractas son clases que no se pueden instanciar
 * Estas clases se utilizan como modelos (plantillas) para
 * crear subclases concretas que se puedan instanciar.
 * 
 * Una clase abstracta se declara en la firma de la clase
 * con la palabra 'abstract'.
 * 
 * La clase abstracta puede contener métodos abstractos y
 * métodos concretos.(los métodos concretos son los que ya hemos utilizado)
 * 
 * Un método abstracto se declara sin implementación y se definen en las
 * subclases.
 * 
 * Las clases abstractas se recomienda utilizar para clases que estén
 * estrechamente relacionadas (is-A).
 * 
 * @author TuX3
 * 
 */

// Cuando la clase es abstracta no se puede instanciar objetos de esa clase
public abstract class Animal{

	private String name ="----";
	private String type ="----";
	private double sizeMts;
	private double weightKg;
	private boolean alive;
	
	
	// Constructores
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	/* 
	 * Un método abstracto no tiene cuerpo,
	 * solo la definicion del método.
	 * 
	 * Termina en punto y coma (;)
	 * 
	 * La clase heredada es quién implementará el comportamiento.
	 * 
	 * Si existe un método abstracto, la clase también debe ser
	 * abstracta, no puedes tener métodos abstractos en clases
	 * concretas
	 */
	
	abstract public String showPicture();
	
	
	// Métodos concretos
	
	public String eat(String food) {
		return this.name + " esta comiendo" + food;
	}
	
	public String sleep(int minutes) {
		return this.name + " duerme " + minutes + " minutos";
	}
	
	// getters y setters

	final public String getName() {
		return name;
	}

	// Al agregarle final vamos a evitar que las clases que 
	// hereden de esta clase sobreescriban este método (override)
	final public void setName(String name) {
		this.name = name;
	}

	final public String getType() {
		return type;
	}

	final public void setType(String type) {
		this.type = type;
	}

	final public double getSizeMts() {
		return sizeMts;
	}

	final public void setSizeMts(double sizeMts) {
		this.sizeMts = sizeMts;
	}

	final public double getWeightKg() {
		return weightKg;
	}

	final public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}

	final public boolean isAlive() {
		return alive;
	}

	final public void setAlive(boolean alive) {
		this.alive = alive;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", sizeMts=");
		builder.append(sizeMts);
		builder.append(", weightKg=");
		builder.append(weightKg);
		builder.append(", alive=");
		builder.append(alive);
		builder.append("]\n");
		return builder.toString();
	}

}
