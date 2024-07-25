package exer03_02;

public class CustomerData {
	//変数にいきなり変更をできないようにするためのprivate
	private String name;
	private String address;
	private int age;
	
	//コンストラクタ
	public CustomerData() {
		//データ初期化
		name = "";
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
