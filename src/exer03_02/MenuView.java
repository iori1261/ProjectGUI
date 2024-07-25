package exer03_02;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame{
	
	Container cntnr;
	JLabel nameLbl;
	JButton tourokuBtn;
	JButton dispBtn;
	
	public MenuView(String title,Controller ctrl) {
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
		
		
		//部品の生成
		nameLbl = new JLabel("顧客データ管理");
		tourokuBtn = new JButton("登録");
		dispBtn = new JButton("表示");
				
		
		//部品の設定(x座標,y座標,幅,高さ)
		nameLbl.setBounds(95,40,100,30);
		tourokuBtn.setBounds(90,70,100,30);
		dispBtn.setBounds(90,100,100,30);
		
		//部品をコンテナに追加する
		cntnr.add(nameLbl);
		cntnr.add(tourokuBtn);
		cntnr.add(dispBtn);

		tourokuBtn.addActionListener(ctrl);
		tourokuBtn.setActionCommand(ctrl.MENU_REGISTER);
		dispBtn.addActionListener(ctrl);
		dispBtn.setActionCommand(ctrl.MENU_DISP);
	}
	
}
