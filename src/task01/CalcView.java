package task01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcView extends JFrame implements ActionListener  {
	
	//インスタンス用のフィールド変数
	Container cntnr;
	JLabel num1Lbl;
	JTextField num1Txt;
	JLabel num2Lbl;
	JTextField num2Txt;
	JLabel resultLbl;
	JLabel resultrsltLbl;
	//ボタン各種
	JButton plusBtn;
	JButton minusBtn;
	JButton multiplicationBtn;
	JButton divisionBtn;
	JButton clearBtn;
	
	
	public CalcView(String title) {
		//タイトルの設定
		super(title);
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(300,200);
		//表示位置の指定
		setLocation(200,200);
		//まとめて表示したい場合
	    //setBouns(a,b,c,d);
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		
		//部品の生成
		num1Lbl = new JLabel("値1");
		num1Txt = new JTextField();
		num2Lbl = new JLabel("値2");
		num2Txt = new JTextField();
		resultLbl = new JLabel("結果");
		resultrsltLbl = new JLabel();
		//ボタン各種
		plusBtn = new JButton("＋");
		minusBtn = new JButton("－");
		multiplicationBtn = new JButton("×");
		divisionBtn = new JButton("÷");
		clearBtn = new JButton("C");
		
		
		//部品の設定(x座標,y座標,幅,高さ)
		num1Lbl.setBounds(20,20,80,20);
		num1Txt.setBounds(100,20,150,20);
		num2Lbl.setBounds(20,50,80,20);
		num2Txt.setBounds(100,50,150,20);
		resultLbl.setBounds(20,80,80,20);
		resultrsltLbl.setBounds(100,80,80,20);
		//ボタン各種
		plusBtn.setBounds(20,110,50,30);
		minusBtn.setBounds(70,110,50,30);
		multiplicationBtn.setBounds(120,110,50,30);
		divisionBtn.setBounds(170,110,50,30);
		clearBtn.setBounds(220,110,50,30);
		
		
		//部品をコンテナに追加する
		cntnr.add(num1Lbl);
		cntnr.add(num1Txt);
		cntnr.add(num2Lbl);
		cntnr.add(num2Txt);
		cntnr.add(resultLbl);
		cntnr.add(resultrsltLbl);
		//ボタン各種
		cntnr.add(plusBtn);
		cntnr.add(minusBtn);
		cntnr.add(multiplicationBtn);
		cntnr.add(divisionBtn);
		cntnr.add(clearBtn);
		
		
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiplicationBtn.addActionListener(this);
		divisionBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		//ボタンごとの条件分岐
		if(e.getSource() == plusBtn) {
			int rslt = Integer.parseInt(num1Txt.getText()) + Integer.parseInt(num2Txt.getText());
			String strrslt = String.valueOf(rslt);
			resultrsltLbl.setText(strrslt);
			
		}else if(e.getSource() == minusBtn) {
			int rslt = Integer.parseInt(num1Txt.getText()) - Integer.parseInt(num2Txt.getText());
			String strrslt = String.valueOf(rslt);
			resultrsltLbl.setText(strrslt);
			
		}else if(e.getSource() == multiplicationBtn) {
			int rslt = Integer.parseInt(num1Txt.getText()) * Integer.parseInt(num2Txt.getText());
			String strrslt = String.valueOf(rslt);
			resultrsltLbl.setText(strrslt);
			
		}else if(e.getSource() == divisionBtn) {
			int rslt = Integer.parseInt(num1Txt.getText()) / Integer.parseInt(num2Txt.getText());
			String strrslt = String.valueOf(rslt);
			resultrsltLbl.setText(strrslt);
			
		}else if(e.getSource() == clearBtn) {
			num1Txt.setText("");
			num2Txt.setText("");
			resultrsltLbl.setText("");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		CalcView calc = new CalcView("電卓");
		//フレームを可視状態にする
		calc.setVisible(true);
		
	}

}
