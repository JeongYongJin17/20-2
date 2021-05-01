package Exercise;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class Num7 extends JFrame {
	private JTextField t;
	private JButton bt[] = new JButton[15];
	public Num7() {
		setSize(400,300);
		setTitle("java calculator");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display d=new display();
		dial l = new dial();
		add(d,BorderLayout.NORTH);
		add(l,BorderLayout.CENTER);
		
	}
	
	class display extends JPanel{
		public display() {
		ButtonListener listener = new ButtonListener();
		setLayout(new GridLayout(0,1));
		t = new JTextField(15);
		t.addActionListener(listener);
		add(t);
	}
}
	
	class dial extends JPanel{
		public dial() {
			setLayout(new GridLayout(4,4));
			ButtonListener listener = new ButtonListener();
			for(int i=0;i<9;i++) {
				bt[i]= new JButton(""+(i+1));
			}
			bt[9]=new JButton("+");
			bt[10]=new JButton("-");
			bt[11]=new JButton("*");
			bt[12]=new JButton("/");
			bt[13]=new JButton("c");
			bt[14]=new JButton("=");
			
			for( int i = 0 ; i <15;i++) {
				add(bt[i]);
			bt[i].addActionListener(listener);
				
			}
		}
	}
	
	
private class ButtonListener implements ActionListener{
public void actionPerformed(ActionEvent e) {
	JButton b = (JButton)e.getSource();
	// com의 값을받은 후
	 int number1=0,number2=0,com=0;
	 int result=0;

	 
	/*for(int i=0; i<9;i++) {
	if(b==bt[i]) {
		while(true) {
		int in=Integer.parseInt(b.getText());//버튼의 글자를 이벽받는다.
	t.setText(""+in);
	number1=(Integer.parseInt(t.getText()));
		}
		}
}
*/
	
	
	for(int i=0; i<9;i++) {
	if(b==bt[i]) {
		while(true) {
		int in=Integer.parseInt(b.getText());//버튼의 글자를 이벽받는다.
	t.setText(""+in);
 
for(int a=9;a<15;a++) {
	if(b==bt[a]) {
	number2=(Integer.parseInt(t.getText()));
	com=(a-9);
	break;
	}
}
}
	}
}
	
	switch(com) {
	case 0: result = number1+number2;
	case 1: result = number1-number2;
	case 2: result = number1 *number2;
	case 3: result = number1/number2;
	case 4: number1=0; number2=0;
	case 5: t.setText(""+result);
	}
}
}

	public static void main(String[] args) {
		Num7 f = new Num7();
		// TODO Auto-generated method stub

	}

}
