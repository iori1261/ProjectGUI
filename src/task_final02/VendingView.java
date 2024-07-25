package task_final02;

import java.awt.Container;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VendingView extends JFrame {

	Container cntnr;
	JLabel name1Lbl;
	JLabel name2Lbl;
	JLabel name3Lbl;
	JLabel price1Lbl;
	JLabel price2Lbl;
	JLabel price3Lbl;
	JButton buy1Btn;
	JButton buy2Btn;
	JButton buy3Btn;
	ImageIcon Image;
	JLabel label1;
	JLabel insertLbl;
	JTextField insertTxt;
	List<DrinkData> drinks;

	public VendingView(String title, Controller ctrl, List<DrinkData> drinks) {
		super(title);
		this.drinks = drinks;
		setSize(465,400);
		setLocation(200,200);
		cntnr = getContentPane();
		cntnr.setLayout(null);

		name1Lbl = new JLabel(drinks.get(0).getName());
		name2Lbl = new JLabel(drinks.get(1).getName());
		name3Lbl = new JLabel(drinks.get(2).getName());

		price1Lbl = new JLabel(String.valueOf(drinks.get(0).getPrice()));
		price2Lbl = new JLabel(String.valueOf(drinks.get(1).getPrice()));
		price3Lbl = new JLabel(String.valueOf(drinks.get(2).getPrice()));

		insertLbl = new JLabel("投入金額");
		insertTxt = new JTextField();

		buy1Btn = new JButton("購入");
		buy2Btn = new JButton("購入");
		buy3Btn = new JButton("購入");

		Image = new ImageIcon("src/task_final02/image.jpg");
		label1 = new JLabel(Image);

		name1Lbl.setBounds(40,270,80,20);
		name2Lbl.setBounds(200,270,80,20);
		name3Lbl.setBounds(365,270,80,20);

		price1Lbl.setBounds(50,290,80,20);
		price2Lbl.setBounds(210,290,80,20);
		price3Lbl.setBounds(375,290,80,20);

		buy1Btn.setBounds(40,310,80,20);
		buy2Btn.setBounds(200,310,80,20);
		buy3Btn.setBounds(365,310,80,20);

		label1.setBounds(0,0,450,300);

		insertLbl.setBounds(140,340,80,20);
		insertTxt.setBounds(200,340,80,20);

		cntnr.add(name1Lbl);
		cntnr.add(name2Lbl);
		cntnr.add(name3Lbl);
		cntnr.add(price1Lbl);
		cntnr.add(price2Lbl);
		cntnr.add(price3Lbl);
		cntnr.add(insertLbl);
		cntnr.add(insertTxt);
		cntnr.add(buy1Btn);
		cntnr.add(buy2Btn);
		cntnr.add(buy3Btn);
		cntnr.add(label1);

		buy1Btn.setActionCommand(ctrl.VENDING_01);
		buy1Btn.addActionListener(ctrl);
		buy2Btn.setActionCommand(ctrl.VENDING_02);
		buy2Btn.addActionListener(ctrl);
		buy3Btn.setActionCommand(ctrl.VENDING_03);
		buy3Btn.addActionListener(ctrl);
	}

	public String getInputAmount() {
		return insertTxt.getText();
	}
}
