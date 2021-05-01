package Exercise;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class MyPanel4 extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0,0,0);
	
	public MyPanel4() {
		setLayout(new BorderLayout());
		button=new JButton("색상 변경");
		button.addActionListener(this);
		add(button,BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 580, 190);
	}
	
	public void actionPerformed (ActionEvent e) {
		color=new Color((int) (Math.random() * 255.0),
				(int)(Math.random()*255.0),(int)(Math.random()*255.0));
		repaint();
	}
}

public class Num4 extends JFrame{
	public Num4() {
		setSize(600,200);
		setTitle("Color Test");
		setVisible(true);
		JPanel panel = new MyPanel4();
		add(panel);
	}

	public static void main(String[] args) {
		Num4 s = new Num4();

	}

}
