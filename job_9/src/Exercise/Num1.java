package Exercise;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Num1 extends JFrame{
	JButton button=new JButton();
	
	
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			button.setText("마침내 버튼이 눌렸습니다.");
		}
			
		}
		
		public Num1() {
			setSize(400,300);
			setTitle("이벤트 예제");
			setLayout(new FlowLayout());
			button = new JButton("버튼을 누르시오.");
			
			add(button);
			button.addActionListener(new Listener());
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	

	public static void main(String[] args) {
		Num1 f=new Num1();
	}

}
