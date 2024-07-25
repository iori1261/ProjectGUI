package exer03_04;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteView extends JFrame {
	
	Container cntnr;
	JLabel nameLbl;
	JTextField nameTxt;
	
	public DeleteView(String title,Controller cntr) {
		super (title);
		setLocation(200,200);
		setSize(300,200);
		
		cntnr = getContentPane();
		cntnr.setLayout(null);
		
		nameLbl = new JLabel("氏名");
		nameTxt = new JTextField();
		
		nameLbl.setBounds(20,30,80,20);
		nameTxt.setBounds(100,30,150,20);
		
		cntnr.add(nameLbl);
		cntnr.add(nameTxt);
	}
	
}
