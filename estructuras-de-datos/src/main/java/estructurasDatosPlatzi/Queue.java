package estructurasDatosPlatzi;

public class Queue {

	 private static final int SIZE = 5;
	 private static int[] values = new int[SIZE];
	 private static int front = -1;
	 private static int rear = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Para crear una Queue debemos seguir los siguientes pasos:

			1- Crear un pointer para saber que hay en front y rear
			2- Colocar estos valores en -1 al inicializar
			3- Incrementar en 1 el valor de “rear” cuando agregamos un elemento
			4- Retornar el valor de front al quitar un elemento e incrementar
			 en 1 el valor de front a usar dequeue.
			5- Antes de agregar un elemento revisar si hay espacios
			6- Antes de remover un elemento revisamos que existan elementos
			7- Asegurarnos de que al remover todos los elementos reseteemos
			nuestro front y rear a -1.
			8- Agregar el valor de 0 a front al hacer nuestro primer enqueue
			
			F = Front (valor proximo a salir)
			R = Rear (valor más lejano a la salida)
		 */

		// Insertamos valores a la cola
			enQueue(1);
			enQueue(2);
			enQueue(3);
			enQueue(4);
			enQueue(5);
//			deQueue();//			deQueue();//			deQueue();
//			deQueue();
			deQueue();
			enQueue(10);
			printQueue(values);
		
	}
	/**
	 * Función para agregar un valor a la cola
	 * @param value valor a ingresar a la cola
	 */
	public static void enQueue(int value) {
		if ((rear == SIZE - 1 && front == 0) || rear + 1 == front) {
            System.out.println("Nuestra Queue (cola) está llena");
        } else {
        	 if (rear == SIZE - 1 && front != 0) {
                 rear = 0;
        	 }else {
        		 if (front == -1) {
                     front = 0;
                 }
                 rear++;
        	 }
            
            values[rear] = value;
            System.out.printf("Se insertó el valor %d correctamente\n", value);
        }
	}
	
	/**
	 * Función para sacar un elemento de la cola (FIFO- First In First Out)
	 * 
	 */
	public static void deQueue() {
		 if (front == -1) {
	            System.out.println("Nuestra Queue (cola) está vacía");
	        } else {
	            System.out.printf("Se eliminó el valor %d\n", values[front]);
	            if (front >= rear) {
	                front = -1;
	                rear = -1;
	            } else {
	                front++;
	            }
	        }
	}
	
	public static void printQueue(int[] values) {
		 if (front == -1) {
	            System.out.println("Nuestra Queue (cola) está vacía");
	        } else {
	            System.out.print("Contenido de la cola: ");
	            for (int i = 0; i < values.length; i++) {
	                System.out.print(values[i] + " ");
	            }
	            System.out.println();
	        }
	}

}
