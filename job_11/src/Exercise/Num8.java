package Exercise;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.util.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;

class MyPanel8 extends JPanel implements ActionListener{
	private final int WIDTH =500;
	private final int HEIGHT = 300;
	private final int START_X =0;
	private final int START_Y=250;
	private BufferedImage image;
	private Timer timer;
	private int x, y;
	
	public MyPanel8() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setDoubleBuffered(true);
		
		File input = new File("D:\\javajpg\\car.jpg");
		try {
			image = ImageIO.read(input);
		}catch (IOException e) {
			e.printStackTrace();
		}
		x=START_X;
		y=START_Y;
		
		timer =new Timer(20,this);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, x, y, this);
	}
	
	public void actionPerformed(ActionEvent e) {
		x+=1;
		y-=1;
		
		if(x>WIDTH) {
			x=START_X;
			y=START_Y;
		}
		repaint();
	}
}

public class Num8 extends JFrame{
	public Num8() {
	add(new MyPanel8());
	
	setSize(500, 300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	Num8 f= new Num8();
	
	}

}
