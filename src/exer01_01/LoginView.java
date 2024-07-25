package exer01_01;

import javax.swing.JFrame;

public class LoginView extends JFrame {
	//コンストラクタ
	public LoginView(String title) {
		//タイトルの設定
		super(title);
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(300,200);
		//表示位置の指定
		setLocation(200,200);
		//まとめて表示したい場合
	    //setBouns(a,b,c,d);

	}
	
	public static void main(String[] args) {
		//フレーム(JFrame)のインスタンス生成
		LoginView login = new LoginView("ログイン画面");
		//フレームを可視状態にする
		login.setVisible(true);
		
	}

}
