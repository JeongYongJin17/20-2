package job_11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame2 extends JFrame{
	int x, y;
	class MyPanel extends JPanel{
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillRect(x,y,100,100);
		}
		
	}
	
	public MyFrame2() {
		setTitle("Basic painting");
		setSize(600,200);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame2 f =new MyFrame2();
	}

}
