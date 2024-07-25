package task_final02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller implements ActionListener {

	final String VENDING_01 = "一番目のドリンクを購入";
	final String VENDING_02 = "二番目のドリンクを購入";
	final String VENDING_03 = "三番目のドリンクを購入";

	VendingView view;
	Model model;

	public Controller() {
		model = new Model();
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

}
