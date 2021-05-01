package Exercise;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

class Car{
	int x,y;
	public Car(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void drawCar(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, 100, 30);
		g.setColor(Color.RED);
		g.fillOval(x+15, y+20, 30, 30);
		g.fillOval(x+60, y+20, 30, 30);
		g.fillOval(x+15, y-20, 60, 20);
	}
	
	public void move() {
		if(x >=600) {
			x=0;
		}else {
			x+= Math.random()*10;
			
		}
	}
}

public class Num7 extends JPanel{
	private static final int D_W=600;
	private static final int D_H=200;
	
	ArrayList<Car> list;
	
	public Num7() {
		list = new ArrayList<>();
		list.add(new Car(100,10));
		list.add(new Car(100,80));
		list.add(new Car(100,130));
		
		Timer timer = new Timer(50, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				for(Car car : list) {
					car.move();
				}
				repaint();
			}
		});
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Car car :list) {
			car.drawCar(g);
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new Num7());
		frame.setSize(600,200);
		frame.setVisible(true);

	}

}
