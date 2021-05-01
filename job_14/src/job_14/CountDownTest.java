package job_14;
import java.awt.Font;

import javax.swing.*;


public class CountDownTest extends JFrame{
	private JLabel label;
	
	class MyThread extends Thread{
		public void run() {
			for(int i = 10;i>=0; i--) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i +"");
			}
		}
	}
	
	public CountDownTest() {
		setTitle("카운트 다운");
		setSize(400,150);
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		setVisible(true);
		(new MyThread()).start();
	}
	
	
	public static void main(String[] args) {
		CountDownTest t = new CountDownTest();
		
	}

}
