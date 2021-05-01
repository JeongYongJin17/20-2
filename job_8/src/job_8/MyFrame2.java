package job_8;

import java.awt.*;
import javax.swing.*;


public class MyFrame2 extends JFrame{

	public MyFrame2() {
		setSize(300, 150);
		setLocation(200, 300);
		
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		
		getContentPane().setBackground(Color.yellow);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		this.add(button1);
		this.add(button2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
		
}
