package job_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame4 extends JFrame implements MouseListener{
	public MyFrame4() {
		addMouseListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g= getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX()-30,e.getY()-30,60,60);
		}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		MyFrame4 f=new MyFrame4();
		// TODO Auto-generated method stub

	}

}
