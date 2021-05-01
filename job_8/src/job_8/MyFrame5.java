package job_8;

import java.awt.*;
import javax.swing.*;

public class MyFrame5 extends JFrame{
	public MyFrame5() {
		setTitle("GridLayoutTest");
		setSize(300, 150);
		setLayout(new GridLayout(0, 3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("5"));
		setVisible(true);
		
	}

	public static void main(String argv[]) {
		MyFrame5 f= new MyFrame5();
		// TODO Auto-generated method stub

	}

}
