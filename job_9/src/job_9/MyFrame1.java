package job_9;
import javax.swing.*;
import java.awt.event.*;


public class MyFrame1 extends JFrame{
	private JButton button;
	private JLabel label;
	int counter=0;
	
	public MyFrame1(){
		this.setSize(400,150);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		
		button = new JButton("����");
		label = new JLabel("������ ī���Ͱ�: "+counter);
		button.addActionListener(e->{
			counter++;
			label.setText("������ ī���Ͱ�: "+counter);
			
		});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame1 t= new MyFrame1();
		// TODO Auto-generated method stub

	}

}
