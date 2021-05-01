package pocketmon;

import javax.swing.*;
import java.awt.*;

public class Readyform extends JPanel {
Image img;
	/**
	 * Create the panel.
	 */
	public Readyform() {	ImageIcon icon = new ImageIcon("D:\\javajpg\\ready.jpg");
	img = icon.getImage();

}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img, 0, 0,159,133,this);
}

	

}
