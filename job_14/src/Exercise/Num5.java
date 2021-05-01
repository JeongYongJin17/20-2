package Exercise;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class Num5 extends JFrame implements Runnable{
	Thread runner;
	Font clockFont;
	
	public Num5() {
		setSize(350,100);
		setVisible(true);
		setResizable(false);
		
		clockFont = new Font("Serif", Font.BOLD, 40);
		
		Container contentArea = getContentPane();
		ClockPanel timeDisplay = new ClockPanel();
		
		contentArea.add(timeDisplay);
		setContentPane(contentArea);
		start();
	}
	
	class ClockPanel extends JPanel{
		public void paintComponent(Graphics painter) {
			painter.setFont(clockFont);
			painter.setColor(Color.black);
			painter.drawString(timeNow(), 60, 40);
		}
	}
	
	public String timeNow() {
		Calendar now = Calendar.getInstance();
		int hrs = now.get(Calendar.HOUR_OF_DAY);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		String time = hrs+":"+ min +":"+sec;
		
		return time;
	}

	public void start() {
		if(runner == null) runner = new Thread(this);
		runner.start();
	}
	
	public void run() {
		while (runner == Thread.currentThread()) {
			repaint();
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Thread failed");
			}
		}
	}
	
	public static void main(String[] args) {
		Num5 eg = new Num5();

	}

}
