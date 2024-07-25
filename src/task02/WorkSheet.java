package task02;

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

public class WorkSheet extends JFrame implements ActionListener {
	
	Container cntnr;
	
	JLabel nameLbl;
	JTextField nameTxt;
	
	JLabel genderLbl;
	JRadioButton maleRadio = new JRadioButton("男");
	JRadioButton femaleRadio = new JRadioButton("女");
	
	JLabel ageLbl;
	JRadioButton age10 = new JRadioButton("～10代");
	JRadioButton age20 = new JRadioButton("20代");
	JRadioButton age30 = new JRadioButton("30代");
	JRadioButton age40 = new JRadioButton("40代");
	JRadioButton age50 = new JRadioButton("50代");
	JRadioButton age60 = new JRadioButton("60代～");
	
	JLabel hobbyLbl;
	JCheckBox fishingCheck;
	JCheckBox gameCheck;
	JCheckBox walkCehck;
	JCheckBox reading;
	JCheckBox swimming;
	JCheckBox karaoke;
	
	JButton sousinBtn;
	
	ImageIcon Image = new ImageIcon("./src/task02/image.png");
	JLabel label1 = new JLabel(Image);
	
	
	public WorkSheet(String title) {
		//タイトルの設定
		super(title);
		//(画面上のどこに)表示(するかの)サイズ指定
		setSize(500,300);
		//表示位置の指定
		setLocation(200,200);
		//まとめて表示したい場合
	    //setBouns(a,b,c,d);
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		
		//部品の生成
		nameLbl = new JLabel("氏名");
		nameTxt = new JTextField();
		
		genderLbl = new JLabel("性別");
		maleRadio = new JRadioButton("男");
		femaleRadio = new JRadioButton("女");
		
		ageLbl = new JLabel("年齢");
		age10 = new JRadioButton("～10代");
		age20 = new JRadioButton("20代");
		age30 = new JRadioButton("30代");
		age40 = new JRadioButton("40代");
		age50 = new JRadioButton("50代");
		age60 = new JRadioButton("60代～");
		
		hobbyLbl = new JLabel("趣味");
		fishingCheck = new JCheckBox("釣り");
		gameCheck = new JCheckBox("ゲーム");
		walkCehck = new JCheckBox("散歩");
		reading = new JCheckBox("読書");
		swimming = new JCheckBox("水泳");
		karaoke = new JCheckBox("カラオケ");
		
		sousinBtn = new JButton("アンケート回答");
				
		
		//部品の設定(x座標,y座標,幅,高さ)
		nameLbl.setBounds(150,20,80,20);
		nameTxt.setBounds(210,20,140,20);
		
		genderLbl.setBounds(150,50,80,20);
		maleRadio.setBounds(210,50,50,20);
		femaleRadio.setBounds(270,50,50,20);
		
		ageLbl.setBounds(150,80,80,20);
		age10.setBounds(210,80,65,20);
		age20.setBounds(290,80,65,20);
		age30.setBounds(360,80,65,20);
		age40.setBounds(210,110,65,20);
		age50.setBounds(290,110,65,20);
		age60.setBounds(360,110,65,20);
		
		hobbyLbl.setBounds(150,140,50,20);
		fishingCheck.setBounds(210,140,50,20);
		gameCheck.setBounds(290,140,65,20);
		walkCehck.setBounds(360,140,65,20);
		reading.setBounds(210,170,65,20);
		swimming.setBounds(290,170,65,20);
		karaoke.setBounds(360,170,100,20);
		
		sousinBtn.setBounds(210,200,150,30);
		label1.setBounds(30,0,100,200);
		
		
		//部品をコンテナに追加する
		cntnr.add(nameLbl);
		cntnr.add(nameTxt);
		
		cntnr.add(genderLbl);
		cntnr.add(maleRadio);
		cntnr.add(femaleRadio);
		
		cntnr.add(ageLbl);
		cntnr.add(age10);
		cntnr.add(age20);
		cntnr.add(age30);
		cntnr.add(age40);
		cntnr.add(age50);
		cntnr.add(age60);
		
		cntnr.add(hobbyLbl);
		cntnr.add(fishingCheck);
		cntnr.add(gameCheck);
		cntnr.add(walkCehck);
		cntnr.add(reading);
		cntnr.add(swimming);
		cntnr.add(karaoke);
		
		cntnr.add(sousinBtn);
		cntnr.add(label1);
		
		ButtonGroup gender = new ButtonGroup();
		gender.add(maleRadio);
		gender.add(femaleRadio);
		
		ButtonGroup age = new ButtonGroup();
		age.add(age10);
		age.add(age20);
		age.add(age30);
		age.add(age40);
		age.add(age50);
		age.add(age60);
		
		sousinBtn.addActionListener(this);
		nameTxt.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sousinBtn) {
			String msg = "氏名：" + nameTxt.getText() + "\n性別：";
			
			if(maleRadio.isSelected() == true) {
				msg += "男" + "\n";
			}else if(femaleRadio.isSelected() == true)
				msg += "女" + "\n";
			msg += "年齢：";
			
			if(age10.isSelected() == true) {
				msg += "～10代" + "\n";
			}else if(age20.isSelected() == true) {
				msg += "20代" + "\n";
			}else if(age30.isSelected() == true) {
				msg += "30代" + "\n";
			}else if(age40.isSelected() == true) {
				msg += "40代" + "\n";
			}else if(age50.isSelected() == true) {
				msg += "50代" + "\n";
			}else if(age60.isSelected() == true) {
				msg += "60代～" + "\n";
			}
			msg += "趣味：";
			
			if(fishingCheck.isSelected() == true){
				msg += "釣り"+" ";
			}
			if(gameCheck.isSelected() == true) {
				msg += "ゲーム"+" ";
			}
			if(walkCehck.isSelected() == true) {
				msg += "散歩"+" ";
			}
			if(reading.isSelected() == true) {
				msg += "読書"+" ";
			}
			if(swimming.isSelected() == true) {
				msg += "水泳"+" ";
			}
			if(karaoke.isSelected() == true) {
				msg += "カラオケ"+" ";
			}
			JOptionPane.showMessageDialog(this,msg);
			
		}
		
	}
	
	public static void main(String[] args) {
		WorkSheet login = new WorkSheet("ログイン画面");
		//フレームを可視状態にする
		login.setVisible(true);

	}

}
