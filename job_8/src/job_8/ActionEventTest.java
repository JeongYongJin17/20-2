package job_8;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���Ƚ��ϴ�.");
	}
}


class action extends JFrame{
	private JButton button;
	public action() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
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
