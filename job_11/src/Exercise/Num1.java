package Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;

class MyPanel1 extends JPanel{
	public MyPanel1() {
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.BLACK);
		g2.draw(new Rectangle2D.Float(50,50,200,140));
		g2.draw(new Rectangle2D.Float(150,80,50,100));
		g2.draw(new Rectangle2D.Float(75,75,20,20));
		g2.draw(new Line2D.Float(150,20,50,50));
		g2.draw(new Line2D.Float(150,20,250,50));
	}
}

class MyFrame1 extends JFrame{
	public MyFrame1() {
		setSize(600,250);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel1 H=new MyPanel1();
		H.setBounds(0,0,300,300);
		add(H);
		setVisible(true);
	}
}

public class Num1{
	public static void main(String[] args) {
		MyFrame1 F = new MyFrame1();
		}
}







