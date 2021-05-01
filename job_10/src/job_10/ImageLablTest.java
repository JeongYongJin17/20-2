package job_10;

import java.awt.*;
import javax.swing.*;


public class ImageLablTest extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLablTest() {
		setTitle("레이블 테스트");
		setSize(400,300);
		
		panel=new JPanel();
		label = new JLabel("Dog");
		label.setFont(new Font("Arial",Font.ITALIC,30));
		label.setForeground(Color.ORANGE);
		
		ImageIcon icon =new ImageIcon("D:\\javajpg\\dog.jpg");
		label.setIcon(icon);
		
		button=new JButton("자세한 정보를 보려면 클릭하세요!");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}


	public static void main(String[] args) {
		ImageLablTest t =new ImageLablTest();
		// TODO Auto-generated method stub

	}

}
