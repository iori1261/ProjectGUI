package exer03_04;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DispView extends JFrame{
	
	Container cntnr;
	JTextField nameTxt;
	JLabel nameLbl;
	JLabel namersltLbl;
	JLabel addressLbl;
	JLabel addressrsltLbl;
	JLabel ageLbl;
	JLabel agersltLbl;
	JButton	SearchBtn;
	JButton returnBtn;
	
	public DispView(String title,Controller cntr) {
		super (title);
		setLocation(200,200);
		setSize(300,200);
		
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		nameLbl = new JLabel("氏名");
		namersltLbl = new JLabel();
		addressLbl = new JLabel("住所");
		addressrsltLbl = new JLabel();
		ageLbl = new JLabel("年齢");
		agersltLbl = new JLabel();
		SearchBtn = new JButton("検索");
		returnBtn = new JButton("戻る");
		nameTxt = new JTextField();
		
		nameLbl.setBounds(20,30,80,20);
		nameTxt.setBounds(100,30,150,20);
		namersltLbl.setBounds(60,30,80,20);
		addressLbl.setBounds(20,60,80,20);
		addressrsltLbl.setBounds(60,60,80,20);
		ageLbl.setBounds(20,90,80,20);
		agersltLbl.setBounds(60,90,80,20);
		SearchBtn.setBounds(20,120,100,30);
		returnBtn.setBounds(160,120,100,30);
		
		cntnr.add(nameLbl);
		cntnr.add(nameTxt);
		cntnr.add(namersltLbl);
		cntnr.add(addressLbl);
		cntnr.add(addressrsltLbl);
		cntnr.add(ageLbl);
		cntnr.add(agersltLbl);
		cntnr.add(SearchBtn);
		cntnr.add(returnBtn);
		
		returnBtn.setActionCommand(cntr.DISP_RETURN);
		returnBtn.addActionListener(cntr);
		SearchBtn.setActionCommand(cntr.DISP_SEARCH);
		SearchBtn.addActionListener(cntr);
	}
	
	public void setOutputData(CustomerData customer) {
		
		namersltLbl.setText(customer.getName());
		addressrsltLbl.setText(customer.getAddress());
		agersltLbl.setText(Integer.toString(customer.getAge()));
		
	}
	public String getInputName() {
		return nameTxt.getText();
	}
	@Override
	public void setVisible(boolean b) {
		
				nameTxt.setText("");
				addressrsltLbl.setText("");
				agersltLbl.setText("");
		
			
			super.setVisible(b);
		}
	
	
	public void Txtout() {
		nameTxt.setVisible(false);
	}
	public void Txton() {
		nameTxt.setVisible(true);
	}
}
