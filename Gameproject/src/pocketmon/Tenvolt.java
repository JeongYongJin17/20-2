package pocketmon;

import javax.swing.*;
import java.awt.*; 

public class Tenvolt extends JPanel {

	Image img;
	/**
	 * Create the panel.
	 */
	public Tenvolt() {	ImageIcon icon = new ImageIcon("D:\\javajpg\\10v.jpg");
	img = icon.getImage();

}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,159,133,this);
	}

}
