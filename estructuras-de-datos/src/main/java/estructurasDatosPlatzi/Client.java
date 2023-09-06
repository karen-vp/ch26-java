package estructurasDatosPlatzi;

public class Client {
	
	private String name;
	private String id;
	private float credit;
	private String address;
	
	Client(){}
	
	Client(String name, String id, float credit, String address) {
		this.name=name;
		this.id=id;
		this.credit=credit;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
