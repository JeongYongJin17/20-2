package job_8;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("마침내 버튼이 누렸습니다.");
	}
}


class action extends JFrame{
	private JButton button;
	public action() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("이벤트 예제");
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
		
		
		
	}
	
}


public class ActionEventTest {
	public static void main(String[] args) {
		action t = new action();
	}

}
