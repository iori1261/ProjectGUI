package exer03_03;

public class CustomerData {

	private String name;
	private String address;
	private int age;
	
	public CustomerData() {
		name ="";
		address = "";
		age = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
