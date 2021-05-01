package job_11;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	
	class MyPanel extends JPanel{
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.drawOval(60,50,60,60);
			g.drawRect(120,50,60,60);
			g.setColor(Color.BLUE);
			g.fillOval(180,50,60,60);
			g.fillRect(240,50,60,60);
		}
	}

	public MyFrame() {
		setTitle("Basic Painting");
		setSize(600,200);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
