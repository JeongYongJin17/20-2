package job_9;

import javax.swing.*;
import java.awt.event.*;


//이게 this아닐까???
public class eventprocframe1 extends JFrame implements ActionListener{

	
	private JButton button;
	private JLabel label;
	int counter=0;
	
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("현재의 카운트값: "+ counter);
		
	}
	public eventprocframe1() {
		
		this.setSize(40,150);
		this.setTitle("이벤트 예제");
		
		JPanel panel =new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운트값: "+ counter);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		eventprocframe1 t = new eventprocframe1();
	}


}



