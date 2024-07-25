package exer03_02;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DispView extends JFrame{

	Container cntnr;
	JLabel nameLbl;
	JLabel namersltLbl;
	JLabel addressLbl;
	JLabel addressrsltLbl;
	JLabel ageLbl;
	JLabel agersltLbl;
	JButton returnBtn;
	
	public DispView(String title,Controller ctrl) {
		//タイトルの設定
		super(title);
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(300,200);
		//表示位置の指定
		setLocation(300,200);
		//まとめて表示したい場合
		//setBouns(a,b,c,d);
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		nameLbl = new JLabel("氏名");
		namersltLbl = new JLabel();
		
		addressLbl = new JLabel("住所");
		addressrsltLbl = new JLabel();
		
		ageLbl = new JLabel("年齢");
		agersltLbl = new JLabel();
		
		returnBtn = new JButton("戻る");
		
		nameLbl.setBounds(20,20,80,20);
		namersltLbl.setBounds(60,20,80,20);
		addressLbl.setBounds(20,50,80,20);
		addressrsltLbl.setBounds(60,50,80,20);
		ageLbl.setBounds(20,80,80,20);
		agersltLbl.setBounds(60,80,80,20);
		returnBtn.setBounds(130,120,100,30);
		
		cntnr.add(nameLbl);
		cntnr.add(namersltLbl);
		cntnr.add(addressLbl);
		cntnr.add(addressrsltLbl);
		cntnr.add(ageLbl);
		cntnr.add(agersltLbl);
		cntnr.add(returnBtn);
		
		returnBtn.addActionListener(ctrl);
		returnBtn.setActionCommand(ctrl.REGISGER_PREVIOUS);
		
	}
	public void setOutputData(CustomerData data) {
		namersltLbl.setText(data.getName());
		addressrsltLbl.setText(data.getAddress());
		agersltLbl.setText(Integer.toString(data.getAge()));
	}
	public String getInputName() {
		return namersltLbl.getText();
	}
	
	public void setVisible(boolean b) {
		if(b == false) {
			namersltLbl.setText("");
			addressrsltLbl.setText("");
			agersltLbl.setText("");
		}
		
		super.setVisible(b);
	}
	
}