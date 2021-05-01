package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Num5 extends JFrame{
	private JButton b;
	private JTextField t1,t2;
	private JTextField t3;
	
	
	public Num5() {
		ButtonListener listener=new ButtonListener();
		setLayout(new FlowLayout());
		setTitle("이자 계산기");
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		JLabel l1= new JLabel("원금을 입력하시오");
		t1 = new JTextField(15);
		add(l1);
		add(t1);
		
		JLabel l2 = new JLabel("이율을 입력하시오");
		t2=new JTextField(15);
		add(l2);
		add(t2);
		
		b=new JButton("변환");
		b.addActionListener(listener);;
		t3=new JTextField(15);
		t3.setEditable(false);
		
		add(b);
		add(t3);
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b) {
				int og;
				double gain;
				String Sot1 = t1.getText();
				og=Integer.parseInt(Sot1);
				t1.setFocusable(true);
				
				String Sot2=t2.getText();
				gain=Double.parseDouble(Sot2);
				
				int result = (int)(og*(gain/100));
				
				t3.setText("이자는 연 "+result+"만원 입니다.");
				
			}
		}
		
	}

	public static void main(String[] args) {
		Num5 f=new Num5();
		// TODO Auto-generated method stub

	}

}
