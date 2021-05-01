package pocketmon;

import javax.swing.*;
import java.awt.*;


public class PikachuP extends JPanel {
	Image img;
	
	/**
	 * Create the panel.
	 */
	public PikachuP() {
		ImageIcon icon = new ImageIcon("D:\\javajpg\\pi.png");
		img = icon.getImage();

	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,148,150,this);
	}

}
