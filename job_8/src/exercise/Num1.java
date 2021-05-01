package exercise;

import javax.swing.*;
import java.awt.*;

public class Num1 extends JFrame{
	public Num1() {
		setSize(300,150);
		setLocation(200,300);
		setTitle("My Frame");
		setLayout(new FlowLayout());
		JButton bt1=new JButton("yes");
		JButton bt2=new JButton("no");
		JLabel lb=new JLabel("자바가 재미있나요?");
		
		this.add(lb);
		this.add(bt1);
		this.add(bt2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

	public static void main(String[] args) {
		Num1 f =new Num1();
		// TODO Auto-generated method stub

	}

}
