package exer03_03;

import java.util.ArrayList;
import java.util.Iterator;


public class Model {
	private ArrayList<CustomerData>list;
	
	public Model() {
		list = new ArrayList<CustomerData>();
		
	}
	public CustomerData getData(String name) {
		Iterator<CustomerData>itr = list.iterator();
		CustomerData data;
		
		while(itr.hasNext()) {
			data = itr.next();
			if(name.equals(data.getName())) {
				return data;
			}
		}
		return null;
	}
	public void setCustomer(CustomerData data) {
		list.add(data);
	}
	
	
}
