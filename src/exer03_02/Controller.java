package exer03_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller implements ActionListener{
	
	//ActionCommand(合言葉)の準備
	final String MENU_REGISTER = "メニュー画面登録";
	final String MENU_DISP = "メニュー画面表示";
	final String REGISTER_REGISTER = "登録画面登録ボタン";
	final String REGISGER_PREVIOUS = "登録画面戻る";
	final String DISP_PREVIOUS = "表示画面戻る";
	
	//インスタンス用のフィールド変数を準備
	Controller ctrl;
	MenuView menu;
	RegisterView register;
	DispView disp;
	Model model;
	
	//コンストラクタ
	public Controller() {
		//各画面とModelのインスタンス生成
		menu = new MenuView("メニュー画面",this);
		register = new RegisterView("登録画面",this);
		disp = new DispView("表示画面",this);
		model = new Model();
	}
	
	public void actionPerformed(ActionEvent e) {
		e.getActionCommand();
		String ac = e.getActionCommand();
		if(ac.equals(MENU_REGISTER)) {
			//メニュー画面の登録ボタン
			menu.setVisible(false);
			register.setVisible(true);
		}else if(ac.equals(MENU_DISP)) {
			// Modelから顧客データを貰う
			CustomerData customer = model.getCustomer();
			// DispViewに顧客データを渡す(画面上にデータを表示)
			disp.setOutputData(customer);
			//メニュー画面の表示ボタン
			menu.setVisible(false);
			disp.setVisible(true);
		}else if(ac.equals(REGISTER_REGISTER)) {
			//登録画面の登録ボタン
			model.setCustomer(register.getCustomerData());
			JOptionPane.showMessageDialog(register, "登録しました。",ac,JOptionPane.INFORMATION_MESSAGE);
			disp.setVisible(false);
			register.setVisible(false);
			menu.setVisible(true);
		}else if(ac.equals(REGISGER_PREVIOUS)) {
			register.setVisible(false);
			menu.setVisible(true);
		}
		
	
	}
	//メインメソッド(実行t字最初に動くメソッド)
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		ctrl.run();
	}
	public void run() {
		menu.setVisible(true);
	}

}
