package exer03_04;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterView extends JFrame{
	
	Container cntnr;
	JLabel nameLbl;
	JLabel addressLbl;
	JLabel ageLbl;
	JTextField nameTxt;
	JTextField addressTxt;
	JTextField ageTxt;
	JButton registerBtn;
	JButton returnBtn;
	
	public RegisterView(String title,Controller cntr) {
		super(title);
		setLocation(200,200);
		setSize(300,200);
		
		
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		
		nameLbl = new JLabel("氏名");
		addressLbl = new JLabel("住所");
		ageLbl = new JLabel("年齢");
		nameTxt = new JTextField();
		addressTxt = new JTextField();
		ageTxt = new JTextField();
		registerBtn = new JButton("登録");
		returnBtn = new JButton("戻る");
		
		
		nameLbl.setBounds(20,30,80,20);
		addressLbl.setBounds(20,60,80,20);
		ageLbl.setBounds(20,90,80,20);
		nameTxt.setBounds(100,30,150,20);
		addressTxt.setBounds(100,60,150,20);
		ageTxt.setBounds(100,90,150,20);
		registerBtn.setBounds(30,120,100,30);
		returnBtn.setBounds(140,120,100,30);
		
		
		cntnr.add(nameLbl);
		cntnr.add(addressLbl);
		cntnr.add(ageLbl);
		cntnr.add(nameTxt);
		cntnr.add(addressTxt);
		cntnr.add(ageTxt);
		cntnr.add(registerBtn);
		cntnr.add(returnBtn);
		
		
		registerBtn.setActionCommand(cntr.REGISTER_REGISTER);
		registerBtn.addActionListener(cntr);
		returnBtn.setActionCommand(cntr.REGISTER_RETURN);
		returnBtn.addActionListener(cntr);
		
	}
	public CustomerData getCustomerData() {
		CustomerData data = new CustomerData();
		
		data.getName();
		data.getAddress();
		data.getAge();
		
		data.setName(nameTxt.getText());
		data.setAddress(addressTxt.getText());
		data.setAge(Integer.parseInt(ageTxt.getText()));
		
		return data;
	}
	@Override
	public void setVisible(boolean b) {
		nameTxt.setText("");
		addressTxt.setText("");
		ageTxt.setText("");
		
		super.setVisible(b);
	}
	public void TxtVisible(boolean b) {
		nameTxt.setText("");
		addressTxt.setText("");
		ageTxt.setText("");
	}
}
