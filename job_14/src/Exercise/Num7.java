package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Num7 extends JFrame{
	int count=0;
	int x,y,w,h;
	class Mythread extends Thread{
		
	/*public Mythread(){
		add(new Mypanel());
	}*/
	
	
		public void run() {
			while(true) {
				switch(count) {
				case 0: x=100; y=50; w=200; h=150;
					repaint();
				System.out.println(""+count);
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				count=1;
				case 1:x=300; y=125;w=100; h=75;
					repaint();
					System.out.println(""+count);
					count = 0;
				}
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		/*protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
		}*/

	}
	
	class Mypanel extends JPanel{
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				//x=50;y=50;w=50;h=50;
				g.setColor(Color.red);
				g.fillRect(x,y,w,h);
				//g.fillRect(50,50,50,50);
		}
	}

	
	public Num7() {
		setTitle("plma");
		setSize(400,200);
		setLayout(new GridLayout(1,1));
		//setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		add(new Mypanel());
		(new Mythread()).start();

		
	}
	public static void main(String[] args) {
		Num7 f =new Num7();

	}

}
