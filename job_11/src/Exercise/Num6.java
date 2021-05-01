package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

class DoubleDice extends JPanel implements MouseListener{
	int die1 =4;
	int die2=3;
	
	public DoubleDice() {
		super();
		addMouseListener(this);
		setBackground(new Color(200,200,255));
	}
	
	public void paintComponent(Graphics g) {
		drawDie(g, die1, 100,50);
		drawDie(g, die2, 200, 50);
	}
	void drawDie(Graphics g, int val,int x,int y) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 35, 35);
		g.setColor(Color.black);
		g.drawRect(x, y, 34, 34);
		if(val > 1)
			g.fillOval(x+3, y+3, 9, 9);
		if(val > 3)
			g.fillOval(x+23, y+3, 9, 9);
		if(val ==6)
			g.fillOval(x+3, y+13, 9, 9);
		if(val %2==1)
			g.fillOval(x+13, y+13, 9, 9);
		if(val ==6)
			g.fillOval(x+23, y+13, 9, 9);
		if(val > 3)
			g.fillOval(x+3, y+23, 9, 9);
		if(val > 1)
			g.fillOval(x+23, y+23, 9, 9);
	}
	
	void roll() {
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		roll();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}
	
}

public class Num6 extends JFrame{
	public Num6() {
		setSize(600,200);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new DoubleDice());
		setVisible(true);
	}

	public static void main(String[] args) {
	Num6 f = new Num6();
	}

}
