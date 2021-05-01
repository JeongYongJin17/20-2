package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class seoungmin extends JFrame {
	int x = 160, y = 60;
	JButton b1 = new JButton("¿ÞÂÊ");
	JButton b2 = new JButton("¿À¸¥ÂÊ");
	
	public seoungmin() {
		add(new panel());
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class panel extends JPanel {
		public panel() {
			add(b1);
			add(b2);
			b1.addActionListener(new move());
			b2.addActionListener(new move());
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 60, 60);
		}
	}
	
	class move implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
				x += 10;
				System.out.println(x);
			}
			if(e.getSource() == b2) {
				x -= 10;
				System.out.println(x);
			}
			repaint();
		}
	}
	
	public static void main(String[] args) {
		seoungmin s = new seoungmin();
	}

}
