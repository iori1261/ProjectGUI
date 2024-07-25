package task_final02;

public class DrinkData {
	private int id;
	private String name;
	private int price;
	private int quantity;

	public DrinkData() {
		id = 0;
		name = "";
		price = 0;
		quantity = 0;
	}

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

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}
}
