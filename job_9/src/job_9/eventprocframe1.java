package job_9;

import javax.swing.*;
import java.awt.event.*;


//�̰� this�ƴұ�???
public class eventprocframe1 extends JFrame implements ActionListener{

	
	private JButton button;
	private JLabel label;
	int counter=0;
	
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("������ ī��Ʈ��: "+ counter);
		
	}
	public eventprocframe1() {
		
		this.setSize(40,150);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel =new JPanel();
		button = new JButton("����");
		label = new JLabel("������ ī��Ʈ��: "+ counter);
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



