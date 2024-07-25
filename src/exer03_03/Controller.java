package exer03_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller implements ActionListener{

	MenuView menu;
	RegisterView register;
	DispView disp;
	Controller cntr;
	Model model;
	
	final String MENU_REGISTER = "メニュー登録";
	final String MENU_DISPLAY = "メニュー表示";
	final String REGISTER_REGISTER = "登録画面登録";
	final String REGISTER_RETURN = "登録画面戻る";
	final String DISP_RETURN = "表示画面戻る";
	final String DISP_SEARCH = "表示画面検索";
	
	public Controller() {
		menu = new MenuView("メニュー画面",this);
		register = new RegisterView("登録画面",this);
		disp = new DispView("表示画面",this);
		model = new Model();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		
		if(ac.equals(MENU_REGISTER)) {
			menu.setVisible(false);
			register.setVisible(true);
		}else if(ac.equals(MENU_DISPLAY)) {
			
			menu.setVisible(false);
			disp.setVisible(true);
		}else if(ac.equals(REGISTER_RETURN)) {
			register.setVisible(false);
			menu.setVisible(true);
		}else if(ac.equals(REGISTER_REGISTER)) {
			model.setCustomer(register.getCustomerData());
			JOptionPane.showMessageDialog(register, "登録しました",ac,JOptionPane.INFORMATION_MESSAGE);
			register.TxtVisible(true);
		}else if(ac.equals(DISP_RETURN)) {
			disp.setVisible(false);
			menu.setVisible(true);
		}else if (ac.equals(DISP_SEARCH)) {
			CustomerData data = model.getData(disp.getInputName());
			disp.setOutputData(data);
			}else {
				disp.Txtout();
				disp.setOutputData(model.getData(disp.getInputName()));
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Controller ctrl = new Controller();
		ctrl.run();
	}
	public void run() {
		menu.setVisible(true);
	}
	
}
