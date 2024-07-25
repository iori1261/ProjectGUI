package task_final03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller implements ActionListener {

    final String VENDING_01 = "一番目のドリンクを購入";
    final String VENDING_02 = "二番目のドリンクを購入";
    final String VENDING_03 = "三番目のドリンクを購入";
    final String MANAGE_INVENTORY = "品揃え管理";
    final String UPDATE_DRINKS = "UPDATE_DRINKS";
    final String BACK_TO_VENDING = "BACK_TO_VENDING";
    final String ADD_DRINK = "ADD_DRINK";
    final String DELETE_DRINK = "DELETE_DRINK";

    VendingView view;
    VendingManagerView managerView;
    Model model;

    public Controller() {
        model = new Model();
        model.loadDrinksFromDatabase();
    }

    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();
        int drinkIndex = -1;

        if (ac.equals(VENDING_01)) {
            drinkIndex = 0;
        } else if (ac.equals(VENDING_02)) {
            drinkIndex = 1;
        } else if (ac.equals(VENDING_03)) {
            drinkIndex = 2;
        } else if (ac.equals(MANAGE_INVENTORY)) {
            openManagerView();
        } else if (ac.equals(UPDATE_DRINKS)) {
            updateDrinks();
        } else if (ac.equals(BACK_TO_VENDING)) {
            returnToVendingView();
        } else if (ac.equals(ADD_DRINK)) {
            addDrink();
        } else if (ac.equals(DELETE_DRINK)) {
            deleteDrink();
        }

        if (drinkIndex != -1) {
            DrinkData selectedDrink = model.getDrinkList().get(drinkIndex);
            int inputAmount = Integer.parseInt(view.getInputAmount());

            if (selectedDrink.getQuantity() <= 0) {
                showMessage("売り切れています");
            } else if (inputAmount >= selectedDrink.getPrice()) {
                showMessage("購入しました");
                selectedDrink.setQuantity(selectedDrink.getQuantity() - 1);
                model.updateQuantity(selectedDrink.getId(), selectedDrink.getQuantity());
                view.updateDrinks(model.getDrinkList());
            } else {
                showMessage("金額が不足しています");
            }
        }
    }

    public void showMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(view, message);
    }

    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.run();
    }

    public void run() {
        List<DrinkData> drinks = model.getDrinkList();
        view = new VendingView("商品選択画面", this, drinks);
        view.setVisible(true);
    }

    public void openManagerView() {
        List<DrinkData> drinks = model.getDrinkList();
        managerView = new VendingManagerView("品揃え管理", this, drinks);
        view.setVisible(false);
        managerView.setVisible(true);
    }

    public void updateDrinks() {
        List<DrinkData> updatedDrinks = managerView.getUpdatedDrinks();
        for (DrinkData drink : updatedDrinks) {
            model.updateDrinkData(drink);
        }
        showMessage("データが更新されました");
    }

    public void returnToVendingView() {
        List<DrinkData> drinks = model.getDrinkList();
        view.updateDrinks(drinks);
        managerView.setVisible(false);
        view.setVisible(true);
    }

    public void addDrink() {
        DrinkData newDrink = managerView.getNewDrinkData();
        if (newDrink != null) {
            model.addDrinkData(newDrink);
            showMessage("新しい飲料が追加されました");
        }
    }

    public void deleteDrink() {
        int drinkId = managerView.getSelectedDrinkId();
        if (drinkId != -1) {
            model.removeDrinkData(drinkId);
            showMessage("飲料が削除されました");
        }
    }
}
