package job_9;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;


public class myframe extends JFrame{
	
	private JButton button;
	private JLabel label;
	int counter=0;
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("현재의 카운터값 :  "+counter);
		}
	}
	
	
	public myframe() {
		setSize(400,150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label =new JLabel("현재의 카운터값 : "+counter);
		
		button.addActionListener(new MyListener());
		add(label, "Center");
		add(button, "East");
		setVisible(true);
		}

	public static void main(String[] args) {
		myframe t = new myframe();

	}

}
