package task_final01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model {

	DbConnector db;
	//private ArrayList<DrinkData> drinkList;

	public Model() {
		db = new DbConnector();
		//drinkList = new ArrayList<>();
		//loadDrinksFromDb();
	}

	private ArrayList<DrinkData> loadDrinksFromDb() {

		ArrayList<DrinkData> drinkList = new ArrayList<>();

		String sql = "SELECT * FROM drink_tbl;";
		ResultSet res = db.exeSelect(sql);

		try {
			while (res.next()) {
				DrinkData drink = new DrinkData();
				drink.setId(res.getInt("id"));
				drink.setName(res.getString("name"));
				drink.setPrice(res.getInt("price"));
				drinkList.add(drink);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return drinkList;
	}

	public ArrayList<DrinkData> getDrinkList() {
		return loadDrinksFromDb();
	}
}
