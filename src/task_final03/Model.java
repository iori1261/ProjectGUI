package task_final03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<DrinkData> drinkList;
    private DbConnector db;

    public Model() {
        drinkList = new ArrayList<>();
        db = new DbConnector();
    }

    public void loadDrinksFromDatabase() {
        ResultSet rs = db.exeSelect("SELECT * FROM drink_tbl");
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int quantity;
                try {
                    quantity = rs.getInt("quantity");
                } catch (SQLException e) {
                    quantity = 0; // デフォルト値
                }
                drinkList.add(new DrinkData(id, name, price, quantity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<DrinkData> getDrinkList() {
        return drinkList;
    }

    public void updateDrinkData(DrinkData drink) {
        for (DrinkData d : drinkList) {
            if (d.getId() == drink.getId()) {
                d.setName(drink.getName());
                d.setPrice(drink.getPrice());
                d.setQuantity(drink.getQuantity());
                db.exeUpdate("UPDATE drink_tbl SET name='" + drink.getName() + "', price=" + drink.getPrice() + ", quantity=" + drink.getQuantity() + " WHERE id=" + drink.getId());
                break;
            }
        }
    }

    public void updateQuantity(int id, int newQuantity) {
        for (DrinkData d : drinkList) {
            if (d.getId() == id) {
                d.setQuantity(newQuantity);
                db.exeUpdate("UPDATE drink_tbl SET quantity=" + newQuantity + " WHERE id=" + id);
                break;
            }
        }
    }

    public void addDrinkData(DrinkData drink) {
        drinkList.add(drink);
        db.exeUpdate("INSERT INTO drink_tbl (id, name, price, quantity) VALUES (" + drink.getId() + ", '" + drink.getName() + "', " + drink.getPrice() + ", " + drink.getQuantity() + ")");
    }

    public void removeDrinkData(int id) {
        drinkList.removeIf(d -> d.getId() == id);
        db.exeUpdate("DELETE FROM drink_tbl WHERE id=" + id);
    }
}
