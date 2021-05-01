package exercise;
import javax.swing.*;
import java.awt.*;



public class Num6 extends JFrame {
	public Num6() {
		setTitle("dial");
		setSize(400,300);
		setLayout(new BorderLayout());
		North n = new North();
		add(n,BorderLayout.NORTH);
		
		Center c = new Center();
		add(c,BorderLayout.CENTER);
		
		East e=new East();
		add(e,BorderLayout.EAST);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class North extends JPanel{
		public North() {
			setLayout(new BorderLayout());
		add(new JTextField(" "),BorderLayout.NORTH);
		
		}
	}
	
	class Center extends JPanel{
		public Center() {
			setLayout(new GridLayout(5,3,1,1));
			JButton bt[]=new JButton[15];
			bt[0]=new JButton("1");
			bt[1]=new JButton("2");
			bt[2]=new JButton("3");
			bt[3]=new JButton("4");
			bt[4]=new JButton("5");
			bt[5]=new JButton("6");
			bt[6]=new JButton("7");
			bt[7]=new JButton("8");
			bt[8]=new JButton("9");
			bt[9]=new JButton("*");
			bt[10]=new JButton("0");
			bt[11]=new JButton("#");
			bt[12]=new JButton("send");
			bt[13]=new JButton(" ");
			bt[14]=new JButton("end");
			
			for(int i=0; i<15;i++)
				add(bt[i]);	
		}
}
	

	class East extends JPanel{
		public East() {
			setLayout(new BorderLayout());
			
			JButton b=new JButton("clear");
			add(b,BorderLayout.EAST);
		}
	}
	
	public static void main(String[] args) {
		Num6 f = new Num6();
	}
	}

