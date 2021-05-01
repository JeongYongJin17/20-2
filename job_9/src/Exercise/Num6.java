package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Num6 extends JFrame{
	JButton[] b = new JButton[9];
	public Num6() {
		setTitle("puzzle");
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dial c = new dial();
		reset r = new reset();
		add(c,BorderLayout.CENTER);
		add(r,BorderLayout.SOUTH);
	
	}
	
class dial extends JPanel implements ActionListener{
	public dial() {
		setLayout(new GridLayout(3,3));
		
		for(int i=0; i<=8; i ++) {
			if(i==0)
				b[i]=new JButton(" ");
			else
				b[i]=new JButton(""+i);
		}
		for(int i =0; i <=8; i++) {
			b[i].addActionListener(this);
		}
		
		for(int i = 1; i<=8;i++) {
		add(b[i]);
		}
		add(b[0]);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b1= (JButton)e.getSource();
		JButton b2=(JButton)e.getSource();
		int pick = Integer.parseInt(""+b1.getText().charAt(0));
		int chg = Integer.parseInt(""+b2.getText().charAt(0));
		
		b[pick]= new JButton(""+chg);
		b[chg]=new JButton(""+pick);
		
		
	}




}


class reset extends JPanel{
	public reset() {
		setLayout(new GridLayout(0,1));
		JButton rb=new JButton("reset");
		add(rb);
	}
}


	public static void main(String[] args) {
		Num6 f = new Num6();
		// TODO Auto-generated method stub

	}


	
	

}
