package exer01_02;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	
	//コンテナ及び部品を格納するための定義
	Container cntnr;
	JLabel userLbl;
	JLabel passLbl;
	JTextField userTxt;
	JTextField passTxt;
	JButton loginBtn;
	JButton cancelBtn;
	
	//コンストラクタ
	public LoginView(String title) {
		//タイトルの設定
		super(title);
		
		
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(300,200);
		//表示位置の指定
		setLocation(200,200);
		//まとめて記入したい場合
		//setBouns(a,b,c,d);
		
		
		//コンテナの設定
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		
		//部品の生成
		userLbl = new JLabel("ユーザ名");
		passLbl = new JLabel("パワード");
		userTxt = new JTextField();
		passTxt = new JTextField();
		loginBtn = new JButton("ログイン");
		cancelBtn = new JButton("キャンセル");
		
		
		//部品の設定(x座標,y座標,幅,高さ)
		userLbl.setBounds(20,30,80,20);
		passLbl.setBounds(20,60,80,20);
		userTxt.setBounds(100,30,150,20);
		passTxt.setBounds(100,60,150,20);
		loginBtn.setBounds(30,100,100,30);
		cancelBtn.setBounds(140,100,100,30);
		
		
		//部品をコンテナに追加する
		cntnr.add(userLbl);
		cntnr.add(passLbl);
		cntnr.add(userTxt);
		cntnr.add(passTxt);
		cntnr.add(loginBtn);
		cntnr.add(cancelBtn);
		
		
		//ボタンの押下を検知してthis(ここ)に通知
		loginBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

		
	}
		
	public static void main(String[] args) {
		//フレーム(JFrame)のインスタンス生成
		LoginView login = new LoginView("ログイン画面");
		//フレームを可視状態にする
		login.setVisible(true);
		
	}
	
	//ボタンが押されたときに行う動作の関数を格納したクラス
	public void actionPerformed(ActionEvent e) {
		//各ボタンを押した際の条件分岐
		if(e.getSource() == loginBtn) {
			//ユーザ名パスワードがS2A232、0603の場合
			if(userTxt.getText().equals("S2A232") && passTxt.getText().equals("0603")) {
				JOptionPane.showMessageDialog(this,"ログイン成功");
			}else {
				JOptionPane.showMessageDialog(this,"ログイン失敗");
			}
		}else if(e.getSource() == cancelBtn) {
			System.exit(0);
			
		}
		
	}
	
}
