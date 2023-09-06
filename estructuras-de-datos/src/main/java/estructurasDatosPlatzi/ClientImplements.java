package estructurasDatosPlatzi;

public class ClientImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client();
		
		client1.setName("Camilo Valencia");
		client1.setId("0000000001");
		client1.setCredit(1000000);
		client1.setAddress("Calle 1, Carrera 1, Ciudad Bolivar");
	
		System.out.println("The client name is: " + client1.getName());
		System.out.println("The client id is: " + client1.getId());
		System.out.println("The client credit is: " + client1.getCredit());
		System.out.println("The client address is: " + client1.getAddress());
	}

}
