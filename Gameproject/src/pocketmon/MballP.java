package pocketmon;
import javax.swing.*;
import java.awt.*;

public class MballP extends JPanel {
Image img;
	/**
	 * Create the panel.
	 */
	public MballP() {
		ImageIcon icon = new ImageIcon("D:\\javajpg\\mball.jpg");
		img = icon.getImage();

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,159,133,this);
	}

}
