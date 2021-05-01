package pocketmon;
import javax.swing.*;
import java.awt.*;


public class ArceusP extends JPanel {
Image img;
	/**
	 * Create the panel.
	 */
	public ArceusP() {
		ImageIcon icon = new ImageIcon("D:\\javajpg\\ar.png");
		img = icon.getImage();

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,159,133,this);
	}


}
