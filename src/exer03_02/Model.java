package exer03_02;

public class Model{
	//モデル≒データベース
	//customerDataは個々の情報、Modelはセット単位
	private CustomerData customer;
	
	//コンストラクタ
	Model(){
		customer = new CustomerData();
	}
	
	//customerのsetter
	public void setCustomer(CustomerData customer) {
		this.customer = customer;
	}
	
	public CustomerData getCustomer() {
		return this.customer;
	}
}
