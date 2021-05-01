package exercise;
import javax.swing.*;
import java.awt.*;


public class Num5 extends JFrame{
	int i;
	
	public Num5() {
		setTitle("frame");
		setSize(400,300);
		
		
		setLayout(new GridLayout(5,4));
		JButton bt[]=new JButton[20];
		
		bt[0]=new JButton("0");
		bt[1]=new JButton("1");
		bt[2]=new JButton("2");
		bt[3]=new JButton("3");
		bt[4]=new JButton("4");
		bt[5]=new JButton("5");
		bt[6]=new JButton("6");
		bt[7]=new JButton("7");
		bt[8]=new JButton("8");
		bt[9]=new JButton("9");
		bt[10]=new JButton("10");
		bt[11]=new JButton("11");
		bt[12]=new JButton("12");
		bt[13]=new JButton("13");
		bt[14]=new JButton("14");
		bt[15]=new JButton("15");
		bt[16]=new JButton("16");
		bt[17]=new JButton("17");
		bt[18]=new JButton("18");
		bt[19]=new JButton("19");
		
		
		for(int i=0;i<20;i++) {
		int R= (int)(Math.random()*256);
		int G =(int)(Math.random()*256);
		int B=(int)(Math.random()*256);
		Color color = new Color(R,G,B);
		
		bt[i].setBackground(color);
		add(bt[i]);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}

	public static void main(String[] args) {
		Num5 f = new Num5();
	}

}
