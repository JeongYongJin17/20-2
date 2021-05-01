package job_8;

import java.awt.*;
import javax.swing.*;


public class MyFrame4 extends JFrame{
	public MyFrame4() {
	setTitle("FlowLayoutTest");
	setSize(300, 150);
	setLayout(new FlowLayout());
	
	add(new JButton("Button1"));
	add(new JButton("Button2"));
	add(new JButton("Button3"));
	add(new JButton("Button4"));
	add(new JButton("Button5"));
	setVisible(true);
	
	
	}
public static void main (String argv[]) {
	MyFrame4 f =new MyFrame4();
}
}
