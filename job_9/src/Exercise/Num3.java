package Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Num3 extends JFrame{
	private JButton b;
	private JTextField text1;
	private JTextField text2;
	private JLabel h;
	double mile;
	double km;
	listen l = new listen();
	
	private class listen implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b||e.getSource()==text1) {
			String name = text1.getText();
			mile = Double.parseDouble(name);
			text2.setText(""+mile*1.609344);
			text1.requestFocus();
		}
		
		
	}
	}
	public Num3() {
		setLayout(new GridLayout(2,1));
		setTitle("Mile->Km");
		setSize(400,200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel =new panel();
		JPanel bt = new bt();
		
		
		
		
		add(panel);
		add(bt);
		
	}
//=====================================================	
	class panel extends JPanel{
		public panel() {
		JLabel p=new JLabel("마일을 입력");
		text1 =new JTextField(10);
		text1.addActionListener(l);
		h = new JLabel("->");
		text2= new JTextField(10);
		text2.setEditable(false);
		add(p);
		add(text1);
		add(h);
		add(text2);
		}
		}
//========================================================	
	class bt extends JPanel{
		public bt() {
			b = new JButton("변환");
			add(b);
		}
	}
//================================================================	
	
	
	
	public static void main(String[] args) {
		Num3 f =new Num3();
		// TODO Auto-generated method stub

	}

}
