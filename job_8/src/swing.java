//package job_8;

import javax.swing.*;
import java.awt.FlowLayout;


public class swing extends JFrame{
	public swing() {
		setSize(300, 200);
		setTitle("swing");
		
		
		
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		add(button);
		setVisible(true);
	}

	public static void main (String[] args) {
		swing f = new swing();
	}
}
