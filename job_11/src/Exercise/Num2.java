package Exercise;
import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{
	public MyPanel() {
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("홍길동", 150, 40);
		g.drawString("프로젝트 메니저", 150, 60);
		g.drawString("자바주식회사",150,80);
		g.setColor(Color.red);
		g.fillOval(20, 20, 80, 80);
	}
	

}

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(600,180);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
}
public class Num2{
	public static void main(String[] args) {
		MyFrame f = new MyFrame();

		}
}