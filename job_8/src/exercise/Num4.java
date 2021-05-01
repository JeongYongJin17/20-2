package exercise;
import javax.swing.*;
import java.awt.*;



public class Num4 extends JFrame{
	public Num4() {
		Container c=getContentPane();
		
		
		
		//JLabel[] lb=new JLabel[30];
		JLabel lb=new JLabel();
		String conv;
		setLayout(null);
		//���� �߻���Ű��.
		for(int i=0;i<30;i++) {
			double rm =Math.random();
		int irm= (int)(rm*100);
		
		
		
		conv = Integer.toString(irm);
		
		lb=new JLabel(conv);
		lb.setBounds(i*irm,i*irm%50,50,50);
		c.add(lb);
		
		
		}
		setSize(400,200);
		setTitle("MY Frame");
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}

	public static void main(String[] args) {
		new Num4();
	}

}
