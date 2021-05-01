package job_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnowManFace extends JFrame {
	class MyPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.YELLOW);
			g.fillOval(20,30,200,200);
			g.setColor(Color.yellow);
			g.fillOval(20,30,200,200);
			g.setColor(Color.BLACK);
			g.drawArc(60,80,50,50,180,-180);
			g.drawArc(150,80,50,50,180,-180);
			g.drawArc(70,130,100,70,180,180);
			
			
		}
	}

	
	public SnowManFace() {
		setSize(300,300);
		setTitle("SNOWMAN");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	public static void main(String[] args) {
		SnowManFace s = new SnowManFace();

	}

}
