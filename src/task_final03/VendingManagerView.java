package task_final03;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VendingManagerView extends JFrame {

    Container cntnr;
    JTextField name1Txt, name2Txt, name3Txt;
    JTextField price1Txt, price2Txt, price3Txt;
    JTextField quantity1Txt, quantity2Txt, quantity3Txt;
    JTextField newNameTxt, newPriceTxt, newQuantityTxt;
    JButton updateBtn, backToVendingBtn, addBtn, deleteBtn;
    List<DrinkData> drinks;

    public VendingManagerView(String title, ActionListener ctrl, List<DrinkData> drinks) {
        super(title);
        this.drinks = drinks;
        setSize(600, 500);
        setLocation(200, 200);
        cntnr = getContentPane();
        cntnr.setLayout(null);

        JLabel name1Lbl = new JLabel("飲料名1:");
        JLabel name2Lbl = new JLabel("飲料名2:");
        JLabel name3Lbl = new JLabel("飲料名3:");

        JLabel price1Lbl = new JLabel("価格1:");
        JLabel price2Lbl = new JLabel("価格2:");
        JLabel price3Lbl = new JLabel("価格3:");

        JLabel quantity1Lbl = new JLabel("数量1:");
        JLabel quantity2Lbl = new JLabel("数量2:");
        JLabel quantity3Lbl = new JLabel("数量3:");

        name1Txt = new JTextField(drinks.get(0).getName());
        name2Txt = new JTextField(drinks.get(1).getName());
        name3Txt = new JTextField(drinks.get(2).getName());

        price1Txt = new JTextField(String.valueOf(drinks.get(0).getPrice()));
        price2Txt = new JTextField(String.valueOf(drinks.get(1).getPrice()));
        price3Txt = new JTextField(String.valueOf(drinks.get(2).getPrice()));

        quantity1Txt = new JTextField(String.valueOf(drinks.get(0).getQuantity()));
        quantity2Txt = new JTextField(String.valueOf(drinks.get(1).getQuantity()));
        quantity3Txt = new JTextField(String.valueOf(drinks.get(2).getQuantity()));

        JLabel newNameLbl = new JLabel("新飲料名:");
        JLabel newPriceLbl = new JLabel("新価格:");
        JLabel newQuantityLbl = new JLabel("新数量:");

        newNameTxt = new JTextField();
        newPriceTxt = new JTextField();
        newQuantityTxt = new JTextField();

        updateBtn = new JButton("更新");
        backToVendingBtn = new JButton("戻る");
        addBtn = new JButton("追加");
        deleteBtn = new JButton("削除");

        int lblWidth = 80;
        int lblHeight = 20;
        int txtWidth = 150;
        int txtHeight = 20;
        int btnWidth = 100;
        int btnHeight = 30;
        int yGap = 40;

        name1Lbl.setBounds(30, 30, lblWidth, lblHeight);
        name1Txt.setBounds(120, 30, txtWidth, txtHeight);

        name2Lbl.setBounds(30, 30 + yGap, lblWidth, lblHeight);
        name2Txt.setBounds(120, 30 + yGap, txtWidth, txtHeight);

        name3Lbl.setBounds(30, 30 + 2 * yGap, lblWidth, lblHeight);
        name3Txt.setBounds(120, 30 + 2 * yGap, txtWidth, txtHeight);

        price1Lbl.setBounds(30, 30 + 3 * yGap, lblWidth, lblHeight);
        price1Txt.setBounds(120, 30 + 3 * yGap, txtWidth, txtHeight);

        price2Lbl.setBounds(30, 30 + 4 * yGap, lblWidth, lblHeight);
        price2Txt.setBounds(120, 30 + 4 * yGap, txtWidth, txtHeight);

        price3Lbl.setBounds(30, 30 + 5 * yGap, lblWidth, lblHeight);
        price3Txt.setBounds(120, 30 + 5 * yGap, txtWidth, txtHeight);

        quantity1Lbl.setBounds(30, 30 + 6 * yGap, lblWidth, lblHeight);
        quantity1Txt.setBounds(120, 30 + 6 * yGap, txtWidth, txtHeight);

        quantity2Lbl.setBounds(30, 30 + 7 * yGap, lblWidth, lblHeight);
        quantity2Txt.setBounds(120, 30 + 7 * yGap, txtWidth, txtHeight);

        quantity3Lbl.setBounds(30, 30 + 8 * yGap, lblWidth, lblHeight);
        quantity3Txt.setBounds(120, 30 + 8 * yGap, txtWidth, txtHeight);

        newNameLbl.setBounds(300, 30, lblWidth, lblHeight);
        newNameTxt.setBounds(400, 30, txtWidth, txtHeight);

        newPriceLbl.setBounds(300, 30 + yGap, lblWidth, lblHeight);
        newPriceTxt.setBounds(400, 30 + yGap, txtWidth, txtHeight);

        newQuantityLbl.setBounds(300, 30 + 2 * yGap, lblWidth, lblHeight);
        newQuantityTxt.setBounds(400, 30 + 2 * yGap, txtWidth, txtHeight);

        updateBtn.setBounds(300, 30 + 3 * yGap, btnWidth, btnHeight);
        backToVendingBtn.setBounds(300, 30 + 4 * yGap, btnWidth, btnHeight);
        addBtn.setBounds(300, 30 + 5 * yGap, btnWidth, btnHeight);
        deleteBtn.setBounds(300, 30 + 6 * yGap, btnWidth, btnHeight);

        cntnr.add(name1Lbl);
        cntnr.add(name1Txt);
        cntnr.add(name2Lbl);
        cntnr.add(name2Txt);
        cntnr.add(name3Lbl);
        cntnr.add(name3Txt);
        cntnr.add(price1Lbl);
        cntnr.add(price1Txt);
        cntnr.add(price2Lbl);
        cntnr.add(price2Txt);
        cntnr.add(price3Lbl);
        cntnr.add(price3Txt);
        cntnr.add(quantity1Lbl);
        cntnr.add(quantity1Txt);
        cntnr.add(quantity2Lbl);
        cntnr.add(quantity2Txt);
        cntnr.add(quantity3Lbl);
        cntnr.add(quantity3Txt);
        cntnr.add(newNameLbl);
        cntnr.add(newNameTxt);
        cntnr.add(newPriceLbl);
        cntnr.add(newPriceTxt);
        cntnr.add(newQuantityLbl);
        cntnr.add(newQuantityTxt);
        cntnr.add(updateBtn);
        cntnr.add(backToVendingBtn);
        cntnr.add(addBtn);
        cntnr.add(deleteBtn);

        updateBtn.setActionCommand("UPDATE_DRINKS");
        updateBtn.addActionListener(ctrl);
        backToVendingBtn.setActionCommand("BACK_TO_VENDING");
        backToVendingBtn.addActionListener(ctrl);
        addBtn.setActionCommand("ADD_DRINK");
        addBtn.addActionListener(ctrl);
        deleteBtn.setActionCommand("DELETE_DRINK");
        deleteBtn.addActionListener(ctrl);
    }

    public List<DrinkData> getUpdatedDrinks() {
        List<DrinkData> updatedDrinks = List.of(
                new DrinkData(drinks.get(0).getId(), name1Txt.getText(), Integer.parseInt(price1Txt.getText()), Integer.parseInt(quantity1Txt.getText())),
                new DrinkData(drinks.get(1).getId(), name2Txt.getText(), Integer.parseInt(price2Txt.getText()), Integer.parseInt(quantity2Txt.getText())),
                new DrinkData(drinks.get(2).getId(), name3Txt.getText(), Integer.parseInt(price3Txt.getText()), Integer.parseInt(quantity3Txt.getText()))
        );
        return updatedDrinks;
    }

    public DrinkData getNewDrinkData() {
        try {
            String name = newNameTxt.getText();
            int price = Integer.parseInt(newPriceTxt.getText());
            int quantity = Integer.parseInt(newQuantityTxt.getText());
            return new DrinkData(drinks.size() + 1, name, price, quantity);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "正しい数値を入力してください");
            return null;
        }
    }

    public int getSelectedDrinkId() {
        return 1; 
    }
}
