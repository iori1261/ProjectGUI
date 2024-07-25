package exer02_03;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class QuestView extends JFrame implements ActionListener {

	public QuestView(String title) {
		//タイトルの設定
		super(title);
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(300,400);
		//表示位置の指定
		setLocation(200,200);
		//まとめて表示したい場合
	    //setBouns(a,b,c,d);
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		
		//部品の生成
		nameLbl = new JLabel("氏名");
		genderLbl = new JLabel("性別");
		hobbyLbl = new JLabel("趣味");
		nameTxt = new JTextField();
		maleRadio = new JRadioButton("男");
		femaleRadio = new JRadioButton("女");
		fishingCheck = new JCheckBox("釣り");
		gameCheck = new JCheckBox("ゲーム");
		walkCehck = new JCheckBox("散歩");
		resultBtn = new JButton("結果");
				
		
		//部品の設定(x座標,y座標,幅,高さ)
		nameLbl.setBounds(20,20,80,20);
		nameTxt.setBounds(50,20,80,20);
		genderLbl.setBounds(20,50,80,20);
		hobbyLbl.setBounds(20,80,80,20);
		nameTxt.setBounds(80,20,150,20);
		maleRadio.setBounds(80,50,50,20);
		femaleRadio.setBounds(140,50,50,20);
		fishingCheck.setBounds(80,80,50,20);
		gameCheck.setBounds(140,80,65,20);
		walkCehck.setBounds(210,80,50,20);
		resultBtn.setBounds(90,120,100,30);
		label1.setBounds(90,160,100,200);
		
		
		//部品をコンテナに追加する
		cntnr.add(nameLbl);
		cntnr.add(nameTxt);
		cntnr.add(genderLbl);
		cntnr.add(hobbyLbl);
		cntnr.add(maleRadio);
		cntnr.add(femaleRadio);
		cntnr.add(fishingCheck);
		cntnr.add(gameCheck);
		cntnr.add(walkCehck);
		cntnr.add(resultBtn);
		cntnr.add(label1);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(maleRadio);
		bgroup.add(femaleRadio);
		
		resultBtn.addActionListener(this);
		nameTxt.addActionListener(this);
	}
	
	
	Container cntnr;
	JLabel nameLbl;
	JTextField nameTxt;
	JLabel hobbyLbl;
	JLabel genderLbl;
	JRadioButton maleRadio = new JRadioButton("男");
	JRadioButton femaleRadio = new JRadioButton("女");
	JCheckBox fishingCheck;
	JCheckBox gameCheck;
	JCheckBox walkCehck;
	JButton resultBtn;
	
	ImageIcon Image = new ImageIcon("./src/exer02_02/image.png");
	JLabel label1 = new JLabel(Image);

	
	
	//ボタンが押されたときに行う動作の関数を格納したクラス
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resultBtn) {
			String msg = "氏名：" + nameTxt.getText() + "\n性別：";
			
			if(maleRadio.isSelected() == true) {
				msg += "男"+"\n";
			}else if(femaleRadio.isSelected() == true)
				msg += "女"+ "\n";
			msg += "趣味：";
			
			if(fishingCheck.isSelected() == true){
				msg += "釣り"+" ";
			}
			if(gameCheck.isSelected() == true) {
				msg += "ゲーム"+" ";
			}
			if(walkCehck.isSelected() == true) {
				msg += "散歩";
			}
			JOptionPane.showMessageDialog(this,msg);
		}
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		QuestView login = new QuestView("ログイン画面");
		//フレームを可視状態にする
		login.setVisible(true);
		
		
	}
	
}

