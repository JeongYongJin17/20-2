package job_11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class BouncingBall extends JFrame implements ActionListener{
	int x,y;
	private int xspeed =3, yspeed=3;
	private static final int WIDTH=600;
	private static final int HEIGHT=200;
	private static final int PERIOD=10;
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, 40, 40);
		}
	}
	
	public void update() {
		x+=xspeed;
		y+=yspeed;
		if(x>WIDTH -40||x<0) {
			xspeed=-xspeed;
		}
		if(y>HEIGHT -40||y<0) {
			yspeed=-yspeed;
		}
		
	}
	
	public BouncingBall() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		Timer timer =new Timer(PERIOD,this);
		timer.start();
	}

	
	@Override
	public void actionPerformed(ActionEvent evt) {
		update();
		repaint();
	}
	
	public static void main(String[] args) {
		BouncingBall f=new BouncingBall();


	}

}
