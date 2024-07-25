package exer03_01;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class RegisterView extends JFrame{
	
	Container cntnr;
	JLabel nameLbl;
	JTextField nameTxt;
	JLabel addressLbl;
	JTextField addressTxt;
	JLabel ageLbl;
	JTextField ageTxt;
	JButton tourokuBtn;
	JButton returnBtn;

	public RegisterView(String title, Controller ctrl) {
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
		nameTxt = new JTextField();
		addressLbl = new JLabel("住所");
		addressTxt = new JTextField();
		ageLbl = new JLabel("年齢");
		ageTxt = new JTextField();
		tourokuBtn = new JButton("登録");
		returnBtn = new JButton("戻る");
		
		nameLbl.setBounds(20,20,80,20);
		nameTxt.setBounds(100,20,130,20);
		addressLbl.setBounds(20,50,80,20);
		addressTxt.setBounds(100,50,130,20);
		ageLbl.setBounds(20,80,80,20);
		ageTxt.setBounds(100,80,130,20);
		tourokuBtn.setBounds(20,120,100,30);
		returnBtn.setBounds(130,120,100,30);
		
		cntnr.add(nameLbl);
		cntnr.add(nameTxt);
		cntnr.add(addressLbl);
		cntnr.add(addressTxt);
		cntnr.add(ageLbl);
		cntnr.add(ageTxt);
		cntnr.add(tourokuBtn);
		cntnr.add(returnBtn);
		
		tourokuBtn.addActionListener(ctrl);
		tourokuBtn.setActionCommand(ctrl.REGISTER_REGISTER);
		returnBtn.addActionListener(ctrl);
		returnBtn.setActionCommand(ctrl.REGISGER_PREVIOUS);
		
	}
	

}
