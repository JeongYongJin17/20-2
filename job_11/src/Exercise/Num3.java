package Exercise;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;


public class Num3 {

	public static void main(String[] args) {
		JFrame f = new JFrame("그해픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel3());
		
		f.setSize(600,200);
		f.setVisible(true);
	}

}

class MyPanel3 extends JPanel{
	private int squareX = 50;
	private int squareY=50;
	private int squareW =60;
	private int squareH=60;
	
	public MyPanel3() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				moveSquare(e.getX(),e.getY());
			}
		}
	);
		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(),e.getY());
			}
		}
	);
	}
	
	private void moveSquare(int x, int y) {
		int OFFSET = 1;
		if((squareX != x)||(squareY != y)) {
			repaint (squareX, squareY, squareW + OFFSET, squareH +OFFSET);
			squareX=x;
			squareY=y;
			repaint(squareX, squareY, squareW+OFFSET,squareH+OFFSET);
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("마우스를 클릭하면 사각형이 그려집니다.", 10, 20);
		g.setColor(Color.RED);
		g.fillRect(squareX, squareY, squareW, squareH);
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
}
