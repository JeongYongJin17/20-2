package job_8;
import java.awt.*;
import javax.swing.*;

public class MyFrame7 extends JFrame{
	public MyFrame7() {
		setTitle("My Piano");
		setSize(610, 300);
		setLayout(null);
		
		for(int i=0;i<10;i++){
			JButton button = new JButton("c" +i);
			button.setLocation(i*60,100);
			button.setSize(50,150);
			add(button);
		}
		setVisible(true);
	}

	public static void main(String argv[]) {
		MyFrame7 f = new MyFrame7();
		// TODO Auto-generated method stub

	}

}
