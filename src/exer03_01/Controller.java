package exer03_01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller implements ActionListener {
	
	final String MENU_REGISTER = "MENU_REGISTER";
	final String REGISTER_REGISTER = "REGISTER_REGISTER";
	final String REGISGER_PREVIOUS = "REGISGER_PREVIOUS";
	
	MenuView menu;
	RegisterView register;
	
	Controller(){
		menu = new MenuView("メニュー画面",this);
		register = new RegisterView("登録画面",this);
	}
	
	public void actionPerformed(ActionEvent e) {
		//インスタンス格納用の変数を宣言
		String ac = e.getActionCommand();
		
		if(ac.equals(MENU_REGISTER) == true){
			//メニュー画面の登録ボタンが押された
			//①メニュー画面を非表示
			menu.setVisible(false);
			//②登録画面を表示
			register.setVisible(true);
			
		}else if(ac.equals(REGISGER_PREVIOUS) == true) {
			//登録画面の戻るボタンが押された
			//①登録画面を非表示
			register.setVisible(false);
			//②メニュー画面を表示
			menu.setVisible(true);
		
		}else if(ac.equals(REGISTER_REGISTER) == true) {
			JOptionPane.showMessageDialog(register, "登録しました。");
		}
	}
	

	public static void main(String[] args) {
		Controller ctrl = new Controller();
		ctrl.run();
	}
	
	public void run() {
		menu.setVisible(true);
	}

}
