package Exercise;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class Num9 extends JPanel implements ActionListener{
JTextField a,b,c;
double A,B,C;

public Num9() {
	a=new JTextField("1.0",10);
	b=new JTextField("-5.0",10);
	c=new JTextField("6.0",10);
	
	add(a);
	add(b);
	add(c);
	JButton button = new JButton("DRAW");
	add(button);
	button.addActionListener(this);
}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(0, 100, 400, 100);
		g2.drawLine(200, 0, 200, 200);
		g2.setPaint(Color.red);
		for(int i= -20; i< 20; i++) {
			int x =i;
			int y =(int)(A * x * x - B * x + C);
			g2.fillOval(200+x-2, 100-(y-2), 4, 4);
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		A = Double.parseDouble(a.getText());
		B = Double.parseDouble(b.getText());
		C = Double.parseDouble(c.getText());
		repaint();
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Num9());
		f.setSize(600,200);
		f.setVisible(true);
	}
}
