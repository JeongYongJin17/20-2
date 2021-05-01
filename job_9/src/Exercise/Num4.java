package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Num4 extends JFrame{
	JButton b1=new JButton();
	JButton b2=new JButton();
	int x=100;
	int y=15;
	
	public Num4() {
		
		setLayout(new GridLayout(2,0));
		
		setSize(400,200);
		setTitle("원 움직이기");

		add(new up());
		add(new down());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel up = new up();
		//JPanel doun = new down();
	
	}
//=================================================================================	
	class up extends JPanel{
		public up() {
			setBackground(Color.YELLOW);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 50, 50);
		}
		
	}
//=================================================================	
	class down extends JPanel{
		
		
		public down() {
			
			b1=new JButton("왼쪽으로 이동");
			b2=new JButton("오른쪽으로 이동");
			b1.addActionListener(new move());
			b2.addActionListener(new move());
			add(b1);
			add(b2);
			
		}
	}
//====================================================================
	class move implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource()==b2) {
		x +=10;
		
		System.out.println(x);
	}
	if(e.getSource()==b1) {
		x -=10;;
		
		System.out.println(x);
	}
	 repaint();
}
	}
	//===============================================
	public static void main(String[] args) {
		new Num4();
	}

}
