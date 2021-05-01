package job_9;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
	int img_x=150, img_y=150;
	public MyFrame2() {
		setSize(1200,600);
		JButton button=new JButton("");
		ImageIcon icon = new ImageIcon("D:\\javajpg\\car.jpg");
		
		button.setIcon(icon);;
		button.setLocation(img_x,img_y);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP:	img_y-=10; break;
				case KeyEvent.VK_DOWN: img_y+=10; break;
				case KeyEvent.VK_LEFT: img_x-=10; break;
				case KeyEvent.VK_RIGHT: img_x+=10; break;
				}
				button.setLocation(img_x,img_y);
			}
			public void keyReleased(KeyEvent arg0) {
			}
		public void kdyTyped(KeyEvent arg0) { }
		});
		add(panel);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
		// TODO Auto-generated method stub

	}

}
