package job_11;
import javax.swing.*;
import java.awt.*;


public class DrawImageFrame extends JFrame{
	Image img;
	
	public DrawImageFrame() {
		ImageIcon icon = new ImageIcon("D:\\javajpg\\car.jpg");
		img = icon.getImage();
		setSize(500,200);
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);;
			g.drawImage(img, 0, 0, this);
		}
	}

	public static void main(String[] args) {
		DrawImageFrame f =new DrawImageFrame();
		// TODO Auto-generated method stub

	}

}
