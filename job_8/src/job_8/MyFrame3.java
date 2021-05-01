package job_8;

import java.awt.*;
import javax.swing.*;


public class MyFrame3 extends JFrame{
	public MyFrame3() {
		setTitle("BoarderLayoutTest");
		setSize(300, 150);
		setLayout(new BorderLayout());
		
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("south");
		JButton b3 = new JButton("east");
		JButton b4 = new JButton("west");
		JButton b5 = new JButton("center");	
	
	add(b1, BorderLayout.NORTH);
	add(b2, BorderLayout.SOUTH);
	add(b3, BorderLayout.EAST);
	add(b4, BorderLayout.WEST);
	add(b5, BorderLayout.CENTER);
	
	}

}
