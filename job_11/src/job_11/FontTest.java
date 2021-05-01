package job_11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class FontTest extends JFrame{
	Font f;
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(f);
			g.drawString("Dialog 20 points BOLD + ITALIC",10,30);
			
		}
	}

	public FontTest() {
		f=new Font("Dialog", Font.BOLD|Font.ITALIC,20);
		setSize(600,100);
		setTitle("Font Test");
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FontTest s = new FontTest();
		

	}

}
