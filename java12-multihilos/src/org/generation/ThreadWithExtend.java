package org.generation;


// Si hay muchas clases en un solo archivo, SOLO una clase
// puede ser public, las otras clases no deben tener ningun
// modificador.
class Iteration{
	
	String name;
	
	Iteration(String name){
		this.name = name;
	}

	public void numberOfIteration(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("Obj: "+ this.name+", Iteration: " + i);
		}
	}
}
// Esta clase hereda de la clase Thread de JAVA
class MyThread extends Thread{
	
	/* constructor de la clase
	*  aquí estamos pidiendo el name y se lo pasamos al
	*  constructor de la clase padre con super(name)
	*/
	public MyThread(String name) {
		super(name);
	}
	
	/*
	 * Método que sera concurrente (asíncrono),
	 * estamos sobreescribiendo el método run de la
	 * clase Thread,
	 * 
	 * Lo que queramos que sea concurrente hay que
	 * ponerlo en el método run() sobreescribiendolo
	 */
	@Override
	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); //suspendemos el hilo en 1 segundo
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("IdThread: "+ super.getId() +"Obj: "+ 
					super.getName()+ ", Iteration: " + i);
			
		}
	}
	
}


// La clase public es la que va a tener el nombre del archivo
public class ThreadWithExtend {
	public static void main(String[] args) {
		Iteration it01 = new Iteration("it01");
		Iteration it02 = new Iteration("it02");
		Iteration it03 = new Iteration("it03");
		
		it01.numberOfIteration(2);
		it02.numberOfIteration(2);
		it03.numberOfIteration(2);
		
		// -- Realizar concurrencia --
		// Realizar multiples tareas simultaneamente
		
		MyThread hilo01 = new MyThread("hilo01");
		MyThread hilo02 = new MyThread("hilo02");
		MyThread hilo03 = new MyThread("hilo03");
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
	}
}
