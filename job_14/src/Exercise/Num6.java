package Exercise;
import java.awt.*;
import javax.swing.*;

public class Num6 extends JFrame{
	
	public Num6() {
		initUI();
		
	}
	
	private void initUI() {
		add(new Board());
		
		setResizable(false);
		pack();
		
		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JFrame ex = new Num6();
		ex.setVisible(true);
	}
}


class Board extends JPanel implements Runnable {
	private final int B_WIDTH =600;
	private final int B_HEIGHT =350;
	private final int INITIAL_X = -40;
	private final int INITIAL_Y =-40;
	private final int DELAY = 25;
	
	private Image star;
	private Thread animator;
	private int x, y;
	
	public Board() {
		initBoard();
	}
	
	private void loadImage() {
		ImageIcon ii= new ImageIcon("D:\\javajpg\\dog.jpg");
		star =ii.getImage();
	}
	
	private void initBoard() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);
		
		loadImage();
		
		x = INITIAL_X;
		y= INITIAL_Y;
	}
	public void addNotify() {
		super.addNotify();
		
		animator = new Thread(this);
		animator.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawStar(g);
	}
	
	private void drawStar(Graphics g) {
		g.drawImage(star, x, y, this);
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void cycle() {
		x+= 1;
		y+= 1;
		if(y>B_HEIGHT) {
			y=INITIAL_Y;
			x= INITIAL_X;
		}
	}
	public void run() {
		long beforeTime, timeDiff, sleep;
		beforeTime = System.currentTimeMillis();
		
		while (true) {
			cycle();
			repaint();
			
			timeDiff = System.currentTimeMillis()-beforeTime;
			sleep = DELAY - timeDiff;
			
			if(sleep<0) {
				sleep = 2;
			}
			try {
				Thread.sleep(sleep);
			}catch (InterruptedException e) {
				System.out.println("Interrupted: "+ e.getMessage());
			}
			beforeTime = System.currentTimeMillis();
		}
	}
}