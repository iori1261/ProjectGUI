package exer03_04;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame{
	
	Container cntnr;
	JLabel customerLbl;
	JButton registerBtn;
	JButton displayBtn;
	
	public MenuView(String title,Controller cntr) {
		super(title);
		setLocation(200,300);
		setSize(300,200);

		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		customerLbl = new JLabel("顧客データ管理");
		registerBtn = new JButton("登録");
		displayBtn = new JButton("表示");
		
		customerLbl.setBounds(90,30,100,20);
		registerBtn.setBounds(85,80,100,25);
		displayBtn.setBounds(85,110,100,25);

		cntnr.add(customerLbl);
		cntnr.add(registerBtn);
		cntnr.add(displayBtn);
		
		registerBtn.addActionListener(cntr);
		registerBtn.setActionCommand(cntr.MENU_REGISTER);
		displayBtn.addActionListener(cntr);
		displayBtn.setActionCommand(cntr.MENU_DISPLAY);
	}
}
