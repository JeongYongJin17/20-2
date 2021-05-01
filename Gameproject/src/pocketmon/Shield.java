package pocketmon;

import java.awt.*;
import javax.swing.*;

public class Shield extends JPanel {
	Image img;
	/**
	 * Create the panel.
	 */
	public Shield() {	ImageIcon icon = new ImageIcon("D:\\javajpg\\shield.png");
	img = icon.getImage();

}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,159,133,this);
	}

}
