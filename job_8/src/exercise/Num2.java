package exercise;
import javax.swing.*;
import java.awt.*;


public class Num2 extends JFrame{
	public Num2() {
		setLayout(new FlowLayout());
		setSize(400,100);
		setTitle("My Frame");
		JLabel lb= new JLabel("카운터값");
		JTextField jt= new JTextField("0                   ");
		JButton bt=new JButton("증가");
		
	  this.add(lb);
	  this.add(jt);
	  this.add(bt);
	  setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Num2 f = new Num2();
		// TODO Auto-generated method stub

	}

}
