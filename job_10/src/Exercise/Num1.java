package Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Num1 extends JFrame{
	private JPanel panel;
	private JLabel label1, label2,label3;

	public Num1() {
		setTitle("레이블 테스트");
		setSize(600,200);
		
		panel=new JPanel();
		label1=new JLabel("");
		label2=new JLabel("");
		label3=new JLabel("");
		
		ImageIcon icon1 = new ImageIcon("D:\\javajpg\\bird.jpg");
		ImageIcon icon2 = new ImageIcon("D:\\javajpg\\cat.jpg");
		ImageIcon icon3 = new ImageIcon("D:\\javajpg\\car.jpg");
		label1.setIcon(icon1);
		label2.setIcon(icon2);
		label3.setIcon(icon3);
		
		panel.setLayout(new GridLayout(0,3,2,2));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		add(panel);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		Num1 f= new Num1();
		
	}

}
