package task_final01;

public class DrinkData {
	//変数をいきなり変更させないためのprivate
	private int id;
	private String name;
	private int price;

	//コンストラクタ
	public DrinkData() {
		id = 0;
		name = "";
		price = 0;
	}
	//使わないけどとりあえず
	public void setId(int id) {
		this.id = id;

	}
	public int getId() {
		return this.id;

	}
	public void setName(String name) {
		this.name = name;

	}
	public String getName() {
		return this.name;

	}
	public void setPrice(int price) {
		this.price = price;

	}
	public int getPrice() {
		return this.price;

	}

}