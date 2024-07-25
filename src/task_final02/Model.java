package task_final02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model {

    DbConnector db;

    public Model() {
        db = new DbConnector();
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
                drink.setQuantity(res.getInt("quantity"));
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

    public void updateQuantity(int id, int newQuantity) {
        String sql = "UPDATE drink_tbl SET quantity = " + newQuantity + " WHERE id = " + id + ";";
        db.exeUpdate(sql);
    }
}
