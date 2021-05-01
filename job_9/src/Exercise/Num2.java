package Exercise;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Num2 extends JFrame{
	JButton bt1=new JButton();
	JButton bt2 = new JButton();
	Container c =new Container();
	
	public Num2() {
		setSize(400,300);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		
		bt1=new JButton("노란색");
		bt2=new JButton("핑크색");
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.YELLOW);
			}
		});
	
		bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			getContentPane().setBackground(Color.pink);
			}
			
		});
		getContentPane().setBackground(Color.yellow);
		add(bt1);
		add(bt2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Num2 f =new Num2();
	}

}
