package job_8;

import java.awt.*;
import javax.swing.*;

public class MyFrame8 extends JFrame{
	public MyFrame8() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);

		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.yellow);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.green);
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
	setSize(300,150);
	setVisible(true);
	
	}

	public static void main(String argv[]) {
		MyFrame8 f = new MyFrame8();
		// TODO Auto-generated method stub

	}

}
